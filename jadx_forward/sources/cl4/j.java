package cl4;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final cl4.j f124483a = new cl4.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f124484b;

    static {
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("tingCache");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingDownloadHelper", "saveDir=" + c17);
        f124484b = c17;
    }

    public final java.lang.String a(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("/pic_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        return f124484b + sb6.toString();
    }
}
