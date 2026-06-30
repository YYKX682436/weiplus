package qr;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final qr.e f447541a = new qr.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f447542b = new java.util.HashMap();

    public final void a(long j17, boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureCallbackDispatcher", "dispatch: " + j17 + ", " + z17 + ", " + str);
        pm0.v.X(new qr.b(j17, z17, str));
        if (((km0.c) gm0.j1.p().a()).a()) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.Emoji_Capture_Upload");
            intent.putExtra("upload_time_enter", j17);
            intent.putExtra("upload_success", z17);
            intent.putExtra("upload_md5", str);
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        }
    }

    public final void b(long j17, qr.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.X(new qr.d(j17, callback));
    }
}
