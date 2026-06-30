package cl4;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final cl4.j f42950a = new cl4.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f42951b;

    static {
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("tingCache");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingDownloadHelper", "saveDir=" + c17);
        f42951b = c17;
    }

    public final java.lang.String a(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("/pic_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        return f42951b + sb6.toString();
    }
}
