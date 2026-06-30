package com.google.android.gms.gcm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzf extends android.os.Handler {
    private final /* synthetic */ com.google.android.gms.gcm.GoogleCloudMessaging zzai;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(com.google.android.gms.gcm.GoogleCloudMessaging googleCloudMessaging, android.os.Looper looper) {
        super(looper);
        this.zzai = googleCloudMessaging;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        boolean zzd;
        android.content.Context context;
        android.content.Context context2;
        java.util.concurrent.BlockingQueue blockingQueue;
        if (message != null) {
            boolean z17 = message.obj instanceof android.content.Intent;
        }
        android.content.Intent intent = (android.content.Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            blockingQueue = this.zzai.zzag;
            blockingQueue.add(intent);
            return;
        }
        zzd = this.zzai.zzd(intent);
        if (zzd) {
            return;
        }
        context = this.zzai.zzk;
        intent.setPackage(context.getPackageName());
        context2 = this.zzai.zzk;
        context2.sendBroadcast(intent);
    }
}
