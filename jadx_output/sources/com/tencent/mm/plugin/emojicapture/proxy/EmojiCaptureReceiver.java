package com.tencent.mm.plugin.emojicapture.proxy;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EmojiCaptureReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f98603a = "MicroMsg.EmojiCaptureReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        java.lang.String str = this.f98603a;
        com.tencent.mars.xlog.Log.i(str, "onReceive: " + action);
        if (kotlin.jvm.internal.o.b(action, "com.tencent.mm.Emoji_Capture_Res")) {
            com.tencent.mars.xlog.Log.i(str, "onReceive: res update " + intent.getIntExtra("res_sub_type", 0) + ' ' + intent.getBooleanExtra("res_result", false));
            return;
        }
        if (kotlin.jvm.internal.o.b(action, "com.tencent.mm.Emoji_Capture_Upload")) {
            long longExtra = intent.getLongExtra("upload_time_enter", 0L);
            boolean booleanExtra = intent.getBooleanExtra("upload_success", false);
            java.lang.String stringExtra = intent.getStringExtra("upload_md5");
            qr.e.f366008a.a(longExtra, booleanExtra, stringExtra);
            com.tencent.mars.xlog.Log.i(str, "onReceive: upload " + longExtra + ", " + booleanExtra + ", " + stringExtra);
        }
    }
}
