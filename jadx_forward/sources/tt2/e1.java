package tt2;

/* loaded from: classes3.dex */
public class e1 extends in5.q0 {
    public static final tt2.j D = new tt2.j(null);
    public ut2.q0 A;
    public java.lang.String B;
    public java.lang.String C;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f503413h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f503414i;

    /* renamed from: m, reason: collision with root package name */
    public final gk2.e f503415m;

    /* renamed from: n, reason: collision with root package name */
    public final int f503416n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f503417o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f503418p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f503419q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f503420r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f503421s;

    /* renamed from: t, reason: collision with root package name */
    public final xt2.i5 f503422t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f503423u;

    /* renamed from: v, reason: collision with root package name */
    public st2.h1 f503424v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.p f503425w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f503426x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.q f503427y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.l f503428z;

    public e1(android.content.Context context, boolean z17, gk2.e liveData, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f503413h = context;
        this.f503414i = z17;
        this.f503415m = liveData;
        this.f503416n = i17;
        this.f503417o = new java.util.LinkedList();
        this.f503418p = new java.util.LinkedList();
        this.f503419q = new java.util.LinkedList();
        this.f503420r = new java.util.LinkedList();
        this.f503421s = new java.util.ArrayList();
        float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4.f207856i;
        this.f503422t = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4.f207859o;
        this.f503423u = jz5.h.b(new tt2.z(this));
        this.B = "";
        mo8164xbbdced85(true);
    }

    public static final void E(tt2.e1 e1Var, r45.hx0 hx0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar;
        dk2.xf W0;
        e1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "modifyShelfProduct :scene:" + hx0Var.m75939xb282bd08(0));
        st2.h1 h1Var = e1Var.f503424v;
        if (h1Var == null || (lVar = h1Var.f493870h) == null || (W0 = lVar.W0()) == null) {
            return;
        }
        android.content.Context context = e1Var.f503413h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        gk2.e eVar = e1Var.f503415m;
        ((dk2.r4) W0).a0(abstractActivityC21394xb3d2c0cf, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o, hx0Var, new tt2.u(e1Var, hx0Var));
    }

    public static final void I(tt2.e1 e1Var, cm2.m0 m0Var, int i17) {
        e1Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.t2[] t2VarArr = ml2.t2.f409547d;
        jSONObject.put("type", 36);
        jSONObject.put("productid", m0Var != null ? java.lang.Long.valueOf(m0Var.f124902w) : "");
        jSONObject.put("explain_mode", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0011, B:9:0x0021, B:12:0x002a, B:18:0x0039, B:20:0x0071, B:21:0x0075, B:23:0x008c, B:27:0x0097, B:28:0x00a0, B:31:0x00a8, B:35:0x00b6, B:38:0x00bd, B:40:0x00ca, B:42:0x00db, B:44:0x00e3, B:49:0x00ef, B:50:0x00f4, B:52:0x0110, B:53:0x0116, B:55:0x013e, B:60:0x014d, B:63:0x016d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0011, B:9:0x0021, B:12:0x002a, B:18:0x0039, B:20:0x0071, B:21:0x0075, B:23:0x008c, B:27:0x0097, B:28:0x00a0, B:31:0x00a8, B:35:0x00b6, B:38:0x00bd, B:40:0x00ca, B:42:0x00db, B:44:0x00e3, B:49:0x00ef, B:50:0x00f4, B:52:0x0110, B:53:0x0116, B:55:0x013e, B:60:0x014d, B:63:0x016d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0011, B:9:0x0021, B:12:0x002a, B:18:0x0039, B:20:0x0071, B:21:0x0075, B:23:0x008c, B:27:0x0097, B:28:0x00a0, B:31:0x00a8, B:35:0x00b6, B:38:0x00bd, B:40:0x00ca, B:42:0x00db, B:44:0x00e3, B:49:0x00ef, B:50:0x00f4, B:52:0x0110, B:53:0x0116, B:55:0x013e, B:60:0x014d, B:63:0x016d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0011, B:9:0x0021, B:12:0x002a, B:18:0x0039, B:20:0x0071, B:21:0x0075, B:23:0x008c, B:27:0x0097, B:28:0x00a0, B:31:0x00a8, B:35:0x00b6, B:38:0x00bd, B:40:0x00ca, B:42:0x00db, B:44:0x00e3, B:49:0x00ef, B:50:0x00f4, B:52:0x0110, B:53:0x0116, B:55:0x013e, B:60:0x014d, B:63:0x016d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110 A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0011, B:9:0x0021, B:12:0x002a, B:18:0x0039, B:20:0x0071, B:21:0x0075, B:23:0x008c, B:27:0x0097, B:28:0x00a0, B:31:0x00a8, B:35:0x00b6, B:38:0x00bd, B:40:0x00ca, B:42:0x00db, B:44:0x00e3, B:49:0x00ef, B:50:0x00f4, B:52:0x0110, B:53:0x0116, B:55:0x013e, B:60:0x014d, B:63:0x016d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0011, B:9:0x0021, B:12:0x002a, B:18:0x0039, B:20:0x0071, B:21:0x0075, B:23:0x008c, B:27:0x0097, B:28:0x00a0, B:31:0x00a8, B:35:0x00b6, B:38:0x00bd, B:40:0x00ca, B:42:0x00db, B:44:0x00e3, B:49:0x00ef, B:50:0x00f4, B:52:0x0110, B:53:0x0116, B:55:0x013e, B:60:0x014d, B:63:0x016d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(tt2.e1 r26, int r27, ut2.s3 r28, ml2.f4 r29) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.e1.J(tt2.e1, int, ut2.s3, ml2.f4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(tt2.e1 r25, ut2.s3 r26, int r27, r45.bd5 r28) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.e1.K(tt2.e1, ut2.s3, int, r45.bd5):void");
    }

    public static /* synthetic */ void W(tt2.e1 e1Var, ml2.f4 f4Var, cm2.m0 m0Var, int i17, l81.b1 b1Var, ut2.s3 s3Var, java.util.Map map, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onProductItemClickReport");
        }
        if ((i18 & 32) != 0) {
            map = new java.util.LinkedHashMap();
        }
        e1Var.V(f4Var, m0Var, i17, b1Var, s3Var, map);
    }

    public static void X(tt2.e1 e1Var, ut2.s3 s3Var, int i17, int i18, int i19, int i27, yz5.l lVar, int i28, java.lang.Object obj) {
        df2.od odVar;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: promoteProduct");
        }
        int i29 = (i28 & 16) != 0 ? 1 : i27;
        yz5.l lVar2 = (i28 & 32) != 0 ? null : lVar;
        so2.j5 P = e1Var.P(i17);
        cm2.m0 m0Var = P instanceof cm2.m0 ? (cm2.m0) P : null;
        if (m0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null && (odVar = (df2.od) c14197x319b1b9e.m56798x25fe639c(df2.od.class)) != null) {
            odVar.e7(r45.n72.kActionType_ExplainProduct);
        }
        long j17 = m0Var.f124902w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "promoteProduct id:" + j17 + " scene:" + i18);
        android.content.Context context = e1Var.f503413h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
        gk2.e eVar = e1Var.f503415m;
        long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
        java.lang.String str = ((mm2.e1) eVar.a(mm2.e1.class)).f410517n;
        android.content.Context context2 = s3Var.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        new ek2.e2(m75942xfb822ef2, j18, str, xy2.c.e(context2), j17, 0, i18, i19, V6, 0, new tt2.d0(m0Var, i18, e1Var, s3Var, i17, i29, lVar2)).l();
    }

    @Override // in5.q0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B */
    public void mo8162x34789575(in5.r0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        if ((holder instanceof ut2.s3 ? holder : null) != null) {
            ut2.s3 s3Var = (ut2.s3) holder;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3) ((jz5.n) s3Var.C).mo141623x754a37bb()).countdownJob;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            xt2.k1 k1Var = s3Var.D;
            if (k1Var != null) {
                xt2.p0 p0Var = k1Var.f538378d;
                if (p0Var != null) {
                    p0Var.b(3);
                }
                yt2.g gVar = k1Var.f538379e;
                if (gVar != null) {
                    gVar.b(3);
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14977x87989529) ((jz5.n) s3Var.F).mo141623x754a37bb()).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShopPromoteContainer", "recycled");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 L = s3Var.L();
            L.setVisibility(8);
            L.f207869f.removeAllViews();
            s3Var.L = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(ut2.s3 r30, cm2.m0 r31, int r32) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.e1.L(ut2.s3, cm2.m0, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0454  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(cm2.m0 r35, ut2.s3 r36, int r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.e1.M(cm2.m0, ut2.s3, int, boolean):void");
    }

    public final void N(long j17, yz5.p pVar) {
        int i17 = 0;
        for (java.lang.Object obj : this.f503418p) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj;
            if ((j5Var instanceof cm2.m0) && ((cm2.m0) j5Var).f124902w == j17) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), j5Var);
                return;
            } else {
                if ((j5Var instanceof cm2.i0) && ((cm2.i0) j5Var).f124887v.m75942xfb822ef2(0) == j17) {
                    pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), j5Var);
                    return;
                }
                i17 = i18;
            }
        }
        pVar.mo149xb9724478(-1, null);
    }

    public final rl5.r O() {
        return (rl5.r) ((jz5.n) this.f503423u).mo141623x754a37bb();
    }

    public final so2.j5 P(int i17) {
        java.util.LinkedList linkedList = this.f503417o;
        if (!linkedList.isEmpty()) {
            if (i17 >= 0 && i17 < linkedList.size()) {
                return (so2.j5) linkedList.get(i17);
            }
        }
        java.util.LinkedList linkedList2 = this.f503418p;
        if (i17 >= 0 && i17 < linkedList2.size()) {
            return (so2.j5) linkedList2.get(i17);
        }
        return null;
    }

    public final org.json.JSONArray Q(cm2.m0 m0Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.LinkedList<r45.p56> m75941xfb821914 = m0Var.f124901v.m75941xfb821914(28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getShow_box_items(...)");
        for (r45.p56 p56Var : m75941xfb821914) {
            try {
                jSONArray.put(new org.json.JSONObject(p56Var.m75945x2fec8307(3)));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.LiveShoppingListAdapter", e17, "parse report data " + p56Var.m75945x2fec8307(3) + " failed", new java.lang.Object[0]);
            }
        }
        java.util.LinkedList<r45.p56> m75941xfb8219142 = m0Var.f124901v.m75941xfb821914(49);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getEvalution_label_list(...)");
        for (r45.p56 p56Var2 : m75941xfb8219142) {
            try {
                jSONArray.put(new org.json.JSONObject(p56Var2.m75945x2fec8307(3)));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.LiveShoppingListAdapter", e18, "parse report data " + p56Var2.m75945x2fec8307(3) + " failed", new java.lang.Object[0]);
            }
        }
        return jSONArray;
    }

    public final boolean R() {
        java.util.LinkedList linkedList = this.f503418p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (obj instanceof cm2.m0) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public final boolean S() {
        return this.f503417o.size() > 0;
    }

    public final void T(long j17, java.lang.Object obj) {
        N(j17, new tt2.w(this, obj));
    }

    public final void U(int i17, r45.y23 product, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(product, "product");
        N(product.m75942xfb822ef2(0), new tt2.y(this, product, i17, obj));
    }

    public final void V(ml2.f4 action, cm2.m0 data, int i17, l81.b1 b1Var, ut2.s3 holder, java.util.Map extra) {
        java.lang.String str;
        r45.n32 n32Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        r45.gt3 gt3Var = (r45.gt3) data.f124901v.m75936x14adae67(61);
        java.lang.String m75945x2fec8307 = gt3Var != null ? gt3Var.m75945x2fec8307(1) : null;
        int i18 = ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? 1 : 0) ^ 1;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        java.lang.String str2 = b1Var != null ? b1Var.f398567l : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String valueOf = java.lang.String.valueOf(data.f124902w);
        st2.g3 g3Var = st2.g3.f493859a;
        org.json.JSONObject k17 = g3Var.k(data.f124901v);
        k17.put("click_type", i17);
        k17.put("if_explaining", data.G);
        xt2.k1 k1Var = holder.D;
        g3Var.i(k17, k1Var != null ? k1Var.f538380f : null);
        k17.put("list_type", !S() ? 1 : 0);
        r45.t42 t42Var = (r45.t42) data.f124901v.m75936x14adae67(52);
        k17.put("animation_type", (t42Var == null || (n32Var = (r45.n32) t42Var.m75936x14adae67(5)) == null) ? 0 : n32Var.m75939xb282bd08(4));
        k17.put("product_tag", Q(data));
        k17.put("list_type", this.f503416n);
        k17.put("is_gift_show", i18);
        r45.bd5 bd5Var = (r45.bd5) data.f124901v.m75936x14adae67(71);
        if (bd5Var == null || (str = bd5Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        k17.put("gift_btn_word", str);
        java.util.LinkedList m75941xfb821914 = data.f124901v.m75941xfb821914(19);
        if (m75941xfb821914 != null) {
            java.util.LinkedList linkedList = m75941xfb821914.isEmpty() ^ true ? m75941xfb821914 : null;
            if (linkedList != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String m75945x2fec83072 = ((r45.l90) it.next()).m75945x2fec8307(1);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    sb6.append(m75945x2fec83072);
                    sb6.append(";");
                }
                k17.put("couponid", r26.n0.Y(sb6, ";").toString());
            }
        }
        for (java.util.Map.Entry entry : extra.entrySet()) {
            k17.put((java.lang.String) entry.getKey(), entry.getValue());
        }
        ml2.r0.Dj(r0Var, action, str2, valueOf, null, null, null, 0, 0L, k17, null, null, null, false, data.f124901v.m75945x2fec8307(17), 7928, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.tencent.mm.protobuf.e, java.lang.Object, r45.y23] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(r45.y23 r24) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.e1.Y(r45.y23):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(boolean r8) {
        /*
            r7 = this;
            st2.h1 r0 = r7.f503424v
            java.lang.String r1 = "searchProductPage"
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L20
            st2.s1 r0 = r0.L
            if (r0 == 0) goto L1c
            android.view.View r0 = r0.f493974a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L17
            r0 = r4
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 != r4) goto L20
            r0 = r4
            goto L21
        L1c:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r2
        L20:
            r0 = r3
        L21:
            if (r0 == 0) goto L59
            st2.h1 r0 = r7.f503424v
            if (r0 == 0) goto L59
            st2.s1 r0 = r0.L
            if (r0 == 0) goto L55
            java.lang.String r1 = r0.f493988o
            if (r1 == 0) goto L35
            int r5 = r1.length()
            if (r5 != 0) goto L36
        L35:
            r3 = r4
        L36:
            java.lang.String r5 = r0.f493977d
            if (r3 == 0) goto L40
            java.lang.String r0 = "refreshSearchResult: no previous search query"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r0)
            goto L59
        L40:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "refreshSearchResult: refreshing for query="
            r3.<init>(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3)
            r0.b(r1)
            goto L59
        L55:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r2
        L59:
            if (r8 == 0) goto L65
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r8 = "PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK"
            r2.putBoolean(r8, r4)
        L65:
            st2.h1 r8 = r7.f503424v
            if (r8 == 0) goto L72
            com.tencent.mm.plugin.finder.live.plugin.l r8 = r8.f493870h
            if (r8 == 0) goto L72
            qo0.b r0 = qo0.b.f446892h2
            r8.M0(r0, r2)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.e1.Z(boolean):void");
    }

    public final void a0(ut2.s3 s3Var, int i17) {
        s3Var.f3639x46306858.setOnClickListener(new tt2.l0(this, i17, s3Var));
        s3Var.M().setOnClickListener(new tt2.m0(this, i17, s3Var));
        s3Var.N().setOnClickListener(new tt2.n0(this, i17, s3Var));
        s3Var.A().setOnClickListener(new tt2.o0(this, i17, s3Var));
        if (D.a()) {
            s3Var.f3639x46306858.setOnLongClickListener(new tt2.p0(this, s3Var, i17));
            ((android.view.View) ((jz5.n) s3Var.f512615r).mo141623x754a37bb()).setOnClickListener(new tt2.q0(this, s3Var, i17));
        }
        s3Var.f3639x46306858.setTag(java.lang.Integer.valueOf(i17));
        android.view.View itemView = s3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new tt2.r0(this, s3Var));
    }

    public final void b0(boolean z17, boolean z18, boolean z19, ut2.s3 s3Var, int i17, cm2.m0 m0Var) {
        java.lang.String string;
        r45.y23 y23Var;
        r45.bd5 bd5Var;
        java.lang.String string2;
        r45.y23 y23Var2;
        r45.y23 y23Var3;
        r45.y23 y23Var4;
        android.widget.TextView P = ((m0Var == null || (y23Var4 = m0Var.f124901v) == null) ? null : (r45.bd5) y23Var4.m75936x14adae67(70)) != null ? s3Var.P() : (android.widget.TextView) ((jz5.n) s3Var.f512610n).mo141623x754a37bb();
        android.view.View N = ((m0Var == null || (y23Var3 = m0Var.f124901v) == null) ? null : (r45.bd5) y23Var3.m75936x14adae67(70)) != null ? s3Var.N() : s3Var.M();
        boolean z27 = (m0Var == null || (y23Var2 = m0Var.f124901v) == null || y23Var2.m75939xb282bd08(42) != 10) ? false : true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAnchorPromoteText,anchor:");
        sb6.append(z17);
        sb6.append(",promoting:");
        sb6.append(z18);
        sb6.append(",pos:");
        sb6.append(i17);
        sb6.append(",button_wording:");
        sb6.append(m0Var != null ? m0Var.K : null);
        sb6.append(", isFlashSale = ");
        sb6.append(z27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", sb6.toString());
        N.setEnabled(true);
        if (z17) {
            if (z27) {
                P.setText(s3Var.M().getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lr8));
                P.setTextColor(s3Var.M().getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560044t));
                N.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a2z);
                return;
            } else if (z18) {
                P.setText(s3Var.M().getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eep));
                P.setTextColor(s3Var.M().getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560633pz));
                N.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a2z);
                return;
            } else {
                P.setText(s3Var.M().getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eeo));
                P.setTextColor(s3Var.M().getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                N.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a8d);
                return;
            }
        }
        if (z19) {
            if (m0Var == null || (string2 = m0Var.K) == null) {
                string2 = s3Var.M().getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eej);
            }
            P.setText(string2);
            P.setTextColor(s3Var.M().getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
            N.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a8p);
            N.setEnabled(false);
            return;
        }
        if ((m0Var == null || (y23Var = m0Var.f124901v) == null || (bd5Var = (r45.bd5) y23Var.m75936x14adae67(70)) == null || bd5Var.m75939xb282bd08(13) != 3) ? false : true) {
            N.setBackground(null);
            N.setEnabled(false);
            return;
        }
        if (m0Var == null || (string = m0Var.K) == null) {
            string = s3Var.M().getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573363ed3);
        }
        P.setText(string);
        P.setTextColor(s3Var.M().getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        N.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a8d);
    }

    public final void c0(qm0.a productList) {
        int i17;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productList, "productList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "before updateShoppingList,ori size:" + this.f503418p.size() + ",new size:" + productList.f446213a.size());
        this.f503417o.clear();
        this.f503418p.clear();
        this.f503418p.addAll(productList.b(tt2.w0.f503543d));
        this.f503419q.clear();
        this.f503419q.addAll(this.f503418p);
        java.util.Iterator it = this.f503418p.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            so2.j5 j5Var = (so2.j5) obj;
            if (((j5Var instanceof cm2.m0) && ((cm2.m0) j5Var).G == 1) || ((j5Var instanceof cm2.i0) && ((cm2.i0) j5Var).f124887v.m75939xb282bd08(14) == 1)) {
                break;
            }
        }
        so2.j5 j5Var2 = (so2.j5) obj;
        if (j5Var2 != null) {
            this.f503418p.remove(j5Var2);
            this.f503418p.addFirst(j5Var2);
        }
        this.f503420r.clear();
        this.f503420r.addAll(productList.b(tt2.x0.f503549d));
        java.util.ArrayList arrayList = this.f503421s;
        arrayList.clear();
        java.util.Iterator it6 = this.f503418p.iterator();
        while (it6.hasNext()) {
            if (((so2.j5) it6.next()) instanceof cm2.i0) {
                arrayList.add(5);
            } else {
                arrayList.add(2);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(10);
        }
        if (this.f503414i) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.j0.f409116i.Z.clear();
            java.util.List list = productList.f446213a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
            synchronized (list) {
                for (java.lang.Object obj2 : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Integer.valueOf(i17).intValue();
                    so2.j5 item = (so2.j5) obj2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
                    if (item instanceof cm2.m0) {
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                        ml2.j0.f409116i.Z.add(java.lang.Long.valueOf(((cm2.m0) item).f124902w));
                    }
                    i17 = i18;
                }
            }
        }
        m8146xced61ae5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "after updateShoppingList,data size:" + this.f503418p.size());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return S() ? this.f503417o.size() : this.f503421s.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        if (mo863xcdaf1228(i17) != 2) {
            return super.mo7906x1ed62e84(i17);
        }
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(this.f503418p, i17);
        return j5Var instanceof cm2.m0 ? ((cm2.m0) j5Var).f124902w : super.mo7906x1ed62e84(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (S()) {
            return 2;
        }
        java.lang.Object obj = this.f503421s.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return ((java.lang.Number) obj).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
    
        if ((r4 != null && r4.y()) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x06c3  */
    @Override // in5.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(in5.r0 r44, int r45) {
        /*
            Method dump skipped, instructions count: 2367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.e1.x(in5.r0, int):void");
    }

    @Override // in5.q0
    public void y(in5.r0 holder, int i17, java.util.List payloads) {
        java.lang.String str;
        gk2.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar;
        gk2.e eVar2;
        r45.t42 t42Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "onBindViewHolder payload, pos:" + i17 + ",payloads:" + payloads);
        st2.h1 h1Var = this.f503424v;
        if (h1Var != null) {
            r45.xv2 xv2Var = h1Var.n().f512650g;
            str = xv2Var != null ? xv2Var.m75945x2fec8307(0) : null;
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.C) && str != null) {
            this.C = str;
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408797s;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", 1072);
            jSONObject.put("tab_name", str);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            ml2.r0.hj(r0Var, b4Var, r26.i0.t(jSONObject2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
        }
        if (S()) {
            x(holder, i17);
            return;
        }
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        java.util.LinkedList linkedList = this.f503418p;
        int i18 = com.p314xaae8f345.mm.R.id.f565946e70;
        int i19 = 4;
        int i27 = 3;
        gk2.e eVar3 = this.f503415m;
        int i28 = 2;
        if (mo863xcdaf1228 != 2 || !(holder instanceof ut2.s3)) {
            gk2.e eVar4 = eVar3;
            if (!(holder instanceof ut2.p)) {
                x(holder, i17);
                return;
            }
            so2.j5 P = P(i17);
            for (java.lang.Object obj : payloads) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 1) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 2)) {
                    ut2.p pVar = (ut2.p) holder;
                    ((android.widget.TextView) ((jz5.n) pVar.f512564i).mo141623x754a37bb()).setText(java.lang.String.valueOf(linkedList.size() - i17));
                    holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.f565946e70, ((android.widget.TextView) ((jz5.n) pVar.f512564i).mo141623x754a37bb()).getText());
                    eVar = eVar4;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 3)) {
                    ut2.p pVar2 = (ut2.p) holder;
                    st2.h1 h1Var2 = this.f503424v;
                    if (h1Var2 != null) {
                        lVar = h1Var2.f493870h;
                        eVar = eVar4;
                    } else {
                        eVar = eVar4;
                        lVar = null;
                    }
                    pVar2.v(true, P, eVar, lVar);
                } else {
                    eVar = eVar4;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 4)) {
                        ut2.p pVar3 = (ut2.p) holder;
                        st2.h1 h1Var3 = this.f503424v;
                        pVar3.v(false, P, eVar, h1Var3 != null ? h1Var3.f493870h : null);
                    }
                }
                eVar4 = eVar;
            }
            return;
        }
        so2.j5 P2 = P(i17);
        if (payloads.isEmpty()) {
            x(holder, i17);
            return;
        }
        for (java.lang.Object obj2 : payloads) {
            if (obj2 instanceof java.lang.Integer) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 1) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, java.lang.Integer.valueOf(i28))) {
                    ut2.s3 s3Var = (ut2.s3) holder;
                    s3Var.F().setText(java.lang.String.valueOf(linkedList.size() - i17));
                    holder.f3639x46306858.setTag(i18, s3Var.F().getText());
                    a0(s3Var, i17);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, java.lang.Integer.valueOf(i27))) {
                    ut2.s3 s3Var2 = (ut2.s3) holder;
                    st2.h1 h1Var4 = this.f503424v;
                    s3Var2.Y(true, P2, eVar3, h1Var4 != null ? h1Var4.f493870h : null);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, java.lang.Integer.valueOf(i19))) {
                    ut2.s3 s3Var3 = (ut2.s3) holder;
                    st2.h1 h1Var5 = this.f503424v;
                    s3Var3.Y(false, P2, eVar3, h1Var5 != null ? h1Var5.f493870h : null);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 5)) {
                    cm2.m0 m0Var = P2 instanceof cm2.m0 ? (cm2.m0) P2 : null;
                    if (m0Var != null) {
                        ut2.s3 s3Var4 = (ut2.s3) holder;
                        s3Var4.C().b(2, m0Var, s3Var4.p(m0Var));
                        s3Var4.S(m0Var);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 12)) {
                    cm2.m0 m0Var2 = P2 instanceof cm2.m0 ? (cm2.m0) P2 : null;
                    if (m0Var2 != null) {
                        ut2.s3 s3Var5 = (ut2.s3) holder;
                        yt2.v vVar = s3Var5.f512624y0;
                        if (vVar != null) {
                            vVar.a();
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                        yt2.v a17 = yt2.w.a(s3Var5.C(), new ut2.c1(s3Var5, h0Var));
                        h0Var.f391656d = a17;
                        s3Var5.f512624y0 = a17;
                        s3Var5.C().b(2, m0Var2, s3Var5.p(m0Var2));
                        s3Var5.S(m0Var2);
                    }
                } else {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 6)) {
                        st2.h1 h1Var6 = this.f503424v;
                        boolean z17 = h1Var6 != null && h1Var6.y();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "on bind with payloadCountDownAnim, is in hot sale tab = " + z17);
                        if (!z17) {
                            cm2.m0 m0Var3 = P2 instanceof cm2.m0 ? (cm2.m0) P2 : null;
                            r45.y23 y23Var = m0Var3 != null ? m0Var3.f124901v : null;
                            if (y23Var != null && (t42Var = (r45.t42) y23Var.m75936x14adae67(52)) != null) {
                                java.lang.Object mo141623x754a37bb = ((jz5.n) ((ut2.s3) holder).Q).mo141623x754a37bb();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                                eVar2 = eVar3;
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14976x4bd61e3f) mo141623x754a37bb).b(y23Var.m75942xfb822ef2(0), t42Var, "list");
                            }
                        }
                    } else {
                        eVar2 = eVar3;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 7)) {
                            cm2.m0 m0Var4 = P2 instanceof cm2.m0 ? (cm2.m0) P2 : null;
                            r45.y23 y23Var2 = m0Var4 != null ? m0Var4.f124901v : null;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on item ");
                            sb6.append(y23Var2 != null ? java.lang.Long.valueOf(y23Var2.m75942xfb822ef2(0)) : null);
                            sb6.append(" flicker");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", sb6.toString());
                            ut2.s3 s3Var6 = (ut2.s3) holder;
                            s3Var6.f512613p0 = true;
                            android.view.View w17 = s3Var6.w();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(w17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder", "flicker", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            w17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(w17, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder", "flicker", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(s3Var6.w(), "alpha", 0.0f, 1.0f, 0.0f);
                            ofFloat.setDuration(1000L);
                            ofFloat.setRepeatCount(1);
                            ofFloat.addListener(new ut2.o1(s3Var6));
                            ofFloat.start();
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 9)) {
                            cm2.m0 m0Var5 = P2 instanceof cm2.m0 ? (cm2.m0) P2 : null;
                            if (m0Var5 != null) {
                                ((ut2.s3) holder).V(m0Var5);
                            }
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 8)) {
                            cm2.m0 m0Var6 = P2 instanceof cm2.m0 ? (cm2.m0) P2 : null;
                            if (m0Var6 != null) {
                                ((ut2.s3) holder).S(m0Var6);
                            }
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 10)) {
                            if ((P2 instanceof cm2.m0 ? (cm2.m0) P2 : null) != null) {
                                ut2.s3 s3Var7 = (ut2.s3) holder;
                                L(s3Var7, (cm2.m0) P2, i17);
                                a0(s3Var7, i17);
                            }
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 11)) {
                            cm2.m0 m0Var7 = P2 instanceof cm2.m0 ? (cm2.m0) P2 : null;
                            if (m0Var7 != null) {
                                ((ut2.s3) holder).R(m0Var7);
                            }
                        }
                    }
                    eVar3 = eVar2;
                    i18 = com.p314xaae8f345.mm.R.id.f565946e70;
                    i19 = 4;
                    i27 = 3;
                    i28 = 2;
                }
            }
            eVar2 = eVar3;
            eVar3 = eVar2;
            i18 = com.p314xaae8f345.mm.R.id.f565946e70;
            i19 = 4;
            i27 = 3;
            i28 = 2;
        }
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        tt2.j jVar = D;
        android.content.Context context = this.f503413h;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aze, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            ut2.t0 t0Var = new ut2.t0(inflate, jVar.a());
            t0Var.f512628e = this.A;
            return t0Var;
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.azd, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new ut2.s3(inflate2);
        }
        if (i17 == 5) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e5n, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            st2.h1 h1Var = this.f503424v;
            return new ut2.p(inflate3, this.f503415m, this, h1Var != null ? h1Var.f493870h : null);
        }
        if (i17 != 10) {
            return new ut2.t0(new android.widget.FrameLayout(context), jVar.a());
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ebs, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
        ym5.a1.h(inflate4, new tt2.m());
        return new tt2.k(inflate4);
    }
}
