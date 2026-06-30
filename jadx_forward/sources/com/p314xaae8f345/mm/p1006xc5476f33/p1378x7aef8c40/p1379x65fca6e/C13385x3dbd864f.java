package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.p1379x65fca6e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureReceiver */
/* loaded from: classes9.dex */
public final class C13385x3dbd864f extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f180136a = "MicroMsg.EmojiCaptureReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        java.lang.String str = this.f180136a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onReceive: " + action);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(action, "com.tencent.mm.Emoji_Capture_Res")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onReceive: res update " + intent.getIntExtra("res_sub_type", 0) + ' ' + intent.getBooleanExtra("res_result", false));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(action, "com.tencent.mm.Emoji_Capture_Upload")) {
            long longExtra = intent.getLongExtra("upload_time_enter", 0L);
            boolean booleanExtra = intent.getBooleanExtra("upload_success", false);
            java.lang.String stringExtra = intent.getStringExtra("upload_md5");
            qr.e.f447541a.a(longExtra, booleanExtra, stringExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onReceive: upload " + longExtra + ", " + booleanExtra + ", " + stringExtra);
        }
    }
}
