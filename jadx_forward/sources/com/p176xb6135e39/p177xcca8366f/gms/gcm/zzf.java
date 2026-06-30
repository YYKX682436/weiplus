package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzf extends android.os.Handler {

    /* renamed from: zzai */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08 f6087x394b68;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08 c2041x64a32b08, android.os.Looper looper) {
        super(looper);
        this.f6087x394b68 = c2041x64a32b08;
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
            blockingQueue = this.f6087x394b68.f6049x394b66;
            blockingQueue.add(intent);
            return;
        }
        zzd = this.f6087x394b68.zzd(intent);
        if (zzd) {
            return;
        }
        context = this.f6087x394b68.zzk;
        intent.setPackage(context.getPackageName());
        context2 = this.f6087x394b68.zzk;
        context2.sendBroadcast(intent);
    }
}
