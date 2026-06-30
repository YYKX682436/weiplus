package if0;

/* loaded from: classes12.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final if0.a0 f372545a = new if0.a0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f372546b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f372547c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f372548d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f372549e;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__ting_rec_local_file_mmkv_key__");
        f372546b = mmkv;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mmkv, "mmkv");
        f372547c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(mmkv, 2592000L);
        f372548d = jz5.h.b(if0.z.f372593d);
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("authorResult_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public final void b(int i17, java.lang.String str) {
        ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Bi("MusicRec", i17, str);
    }

    public final java.lang.String c(java.lang.String str) {
        return r26.n0.D(str, "/", false, 2, null) ? (java.lang.String) kz5.n0.i0(r26.n0.f0(str, new java.lang.String[]{"/"}, false, 0, 6, null)) : str;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f372548d).mo141623x754a37bb();
    }

    public final int e() {
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).mj()) {
            return 0;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.p2575xc53e9ae1.C20791xa642b801());
    }

    public final java.lang.String f(java.lang.String str, java.lang.String str2) {
        return "recResult_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str + '-' + str2);
    }
}
