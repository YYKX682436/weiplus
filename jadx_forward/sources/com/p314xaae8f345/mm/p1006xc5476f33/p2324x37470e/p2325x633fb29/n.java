package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class n implements com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f257214p = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f257217c;

    /* renamed from: h, reason: collision with root package name */
    public int f257222h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f257224j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f257225k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f257226l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f257227m;

    /* renamed from: n, reason: collision with root package name */
    public rm5.v f257228n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f257229o;

    /* renamed from: a, reason: collision with root package name */
    public int f257215a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f257216b = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f257218d = true;

    /* renamed from: e, reason: collision with root package name */
    public final ko4.e f257219e = new ko4.e(false, false, 3, null);

    /* renamed from: f, reason: collision with root package name */
    public final lo4.b f257220f = new lo4.b(false, false, null);

    /* renamed from: g, reason: collision with root package name */
    public int f257221g = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f257223i = new java.util.LinkedList();

    static {
        new java.util.LinkedList();
    }

    public final boolean c(boolean z17) {
        boolean z18 = false;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_soft_encode_audio_enable, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionExporter", "exportImpl: audio soft enable");
            z18 = true;
        }
        if (!z18 && z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_soft_encode_audio_fallback, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionExporter", "exportImpl: audio soft fallback");
                return true;
            }
        }
        return z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0776, code lost:
    
        if (r9 == 2) goto L284;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0793 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0555  */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float d(r45.h70 r45, yz5.l r46) {
        /*
            Method dump skipped, instructions count: 2790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n.d(r45.h70, yz5.l):float");
    }

    public final int e() {
        xo4.d dVar = xo4.d.f537303a;
        if (!kz5.z.G(xo4.d.f537305c, java.lang.Integer.valueOf(this.f257217c))) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("video_composition_export_config");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
            return M.getInt("fallback_size", 0);
        }
        i95.m c17 = i95.n0.c(e42.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((h62.d) ((e42.e0) c17)).Ni(e42.c0.clicfg_finder_post_disable_remux_fallback_size, 1) == 1) {
            return 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("video_composition_export_config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M2, "getMMKV(...)");
        return M2.getInt("finder_fallback_size", 0);
    }

    public java.lang.String f(r45.h70 h70Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h70Var, "<this>");
        java.lang.String str = h70Var.f457442s;
        if (str != null) {
            return str;
        }
        java.lang.String outputPath = h70Var.f457435i.f458308d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(outputPath, "outputPath");
        return outputPath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0230, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiMediaIDKeyStat", "cannot get videoInfo path:".concat(r1));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1372, 0, 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 r25, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n.g(com.tencent.mm.plugin.vlog.model.h1, java.lang.String, boolean):void");
    }

    public int h(int i17, int i18) {
        if (i17 <= i18) {
            return i18;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf((i18 - 1) & i17);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return i17;
        }
        int intValue = valueOf.intValue();
        return intValue * 2 > i18 ? (i17 - intValue) + i18 : i17 - intValue;
    }

    public void i(boolean z17, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoTransPara) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoTransPara, "videoTransPara");
        this.f257224j = z17;
        this.f257225k = videoTransPara;
    }
}
