package yd5;

@yn.c(m177365x976763e5 = sb5.e2.class)
/* loaded from: classes12.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.e2 {

    /* renamed from: e, reason: collision with root package name */
    public static final yd5.f f542629e = new yd5.f();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f542630f = jz5.h.b(yd5.d.f542627d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f542631g = jz5.h.b(yd5.e.f542628d);

    private f() {
    }

    public static final void m0(int i17, boolean z17, java.lang.String str) {
        yd5.c cVar;
        yd5.c cVar2;
        if (str == null) {
            return;
        }
        f542629e.getClass();
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        jz5.g gVar = f542631g;
        if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) ((jz5.n) gVar).mo141623x754a37bb()).k(b17)) {
            java.lang.Object obj = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) ((jz5.n) gVar).mo141623x754a37bb()).get(b17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            cVar2 = (yd5.c) obj;
        } else {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                java.lang.String queryParameter = parse.getQueryParameter("__biz");
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (queryParameter == null) {
                    queryParameter = "";
                }
                byte[] decode = android.util.Base64.decode(java.net.URLDecoder.decode(queryParameter), 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(new java.lang.String(decode, r26.c.f450398a), 0L);
                long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("mid"), 0L);
                long V3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("idx"), 0L);
                long V4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("start"), 0L);
                long V5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("end"), 0L);
                java.lang.String queryParameter2 = parse.getQueryParameter("contentMd5");
                cVar = new yd5.c(V, V2, V3, V4, V5, queryParameter2 == null ? "" : queryParameter2);
            } catch (java.lang.Exception unused) {
                cVar = new yd5.c(0L, 0L, 0L, 0L, 0L, "");
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) ((jz5.n) gVar).mo141623x754a37bb()).put(b17, cVar);
            cVar2 = cVar;
        }
        long j17 = z17 ? 1L : 2L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6695x1b7ef18f c6695x1b7ef18f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6695x1b7ef18f();
        c6695x1b7ef18f.f140325d = cVar2.f542621a;
        c6695x1b7ef18f.f140326e = cVar2.f542622b;
        c6695x1b7ef18f.f140327f = cVar2.f542623c;
        c6695x1b7ef18f.f140328g = cVar2.f542624d;
        c6695x1b7ef18f.f140329h = cVar2.f542625e;
        c6695x1b7ef18f.f140330i = c6695x1b7ef18f.b("content_md5", cVar2.f542626f, true);
        c6695x1b7ef18f.f140332k = i17;
        c6695x1b7ef18f.f140331j = j17;
        c6695x1b7ef18f.m();
        c6695x1b7ef18f.k();
    }
}
