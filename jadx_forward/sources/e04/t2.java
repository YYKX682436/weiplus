package e04;

/* loaded from: classes12.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final e04.t2 f327639a = new e04.t2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f327641c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2566x35c67d.C20655x188e7e f327642d = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2566x35c67d.C20655x188e7e();

    /* renamed from: b, reason: collision with root package name */
    public static final dn.k f327640b = new e04.p2();

    public static final void a(java.lang.String str, java.lang.String str2, int i17, e04.q2 uploadCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uploadCallback, "uploadCallback");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        boolean z17 = true;
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, options);
        java.lang.String str3 = options.outMimeType;
        if ((str3 == null || str3.length() == 0) || (!r26.i0.o(str3, "hevc", false, 2, null) && !r26.i0.n(str3, "wxpc", false) && !r26.i0.n(str3, "wxam", false))) {
            z17 = false;
        }
        e04.t2 t2Var = f327639a;
        if (!z17) {
            t2Var.b(str, str2, i17, uploadCallback);
            return;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2 + com.p314xaae8f345.mm.vfs.w6.l(str2));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Ri();
        java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Ni() + java.lang.String.format("%s_%s.%s", "tmp", a17, "jpg");
        if (!com.p314xaae8f345.mm.vfs.w6.j(str4)) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new e04.s2(str4, str2, str, i17, uploadCallback, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "addUploadTask hevc image exist");
            t2Var.b(str, str4, i17, uploadCallback);
        }
    }

    public static final java.lang.String c(java.lang.String str) {
        return c01.z1.r() + '_' + str + '_' + java.lang.System.currentTimeMillis();
    }

    public final void b(java.lang.String str, java.lang.String str2, int i17, e04.q2 q2Var) {
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_ScannerCdnService";
        mVar.f323320f = f327640b;
        mVar.f69601xaca5bdda = str;
        mVar.f69595x6d25b0d9 = str2;
        mVar.f69592xf1ebe47b = i17;
        mVar.f69609xd84b8349 = 2;
        boolean z17 = false;
        mVar.f69606xccdbf540 = false;
        mVar.f69605xa1af661e = true;
        mVar.f69597x853bb235 = false;
        mVar.f69594x4b409164 = true;
        mVar.f69621xf91593ca = false;
        int h17 = bm5.o1.f104252a.h(f327642d);
        if (h17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "doUpload, isDcRoute: false, disabled by repairer.");
        } else if (h17 != 1) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_ocr_translate_dc_route_enabled, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "doUpload, isDcRoute: " + z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "doUpload, isDcRoute: true, enabled by repairer.");
            z17 = true;
        }
        if (z17) {
            mVar.f323322h = 5;
            mVar.f69580x454032b6 = 100;
        }
        ((java.util.HashMap) f327641c).put(str, q2Var);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }
}
