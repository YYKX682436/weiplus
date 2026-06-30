package ee5;

/* loaded from: classes9.dex */
public final class h0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements o13.x {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 E;
    public p3325xe03a0797.p3326xc267989b.r2 F;
    public final java.util.HashMap G;
    public long H;
    public final java.util.concurrent.atomic.AtomicBoolean I;

    /* renamed from: J, reason: collision with root package name */
    public long f333427J;
    public boolean K;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f333428d;

    /* renamed from: e, reason: collision with root package name */
    public p13.c f333429e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333430f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f333431g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f333432h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f333433i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f333434m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f333435n;

    /* renamed from: o, reason: collision with root package name */
    public p13.r f333436o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f333437p;

    /* renamed from: q, reason: collision with root package name */
    public zd5.g f333438q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f333439r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f333440s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f333441t;

    /* renamed from: u, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f333442u;

    /* renamed from: v, reason: collision with root package name */
    public aq.c f333443v;

    /* renamed from: w, reason: collision with root package name */
    public final ce5.d f333444w;

    /* renamed from: x, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f333445x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f333446y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f333447z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f333428d = "";
        this.f333430f = "";
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(ae5.n.f85965d);
        this.f333431g = j0Var;
        this.f333432h = j0Var;
        this.f333433i = new java.util.ArrayList();
        this.f333434m = new java.util.ArrayList();
        this.f333435n = new java.util.ArrayList();
        this.f333439r = new java.util.ArrayList();
        this.f333440s = new java.util.ArrayList();
        this.f333443v = aq.c.f94375d;
        this.f333444w = new ce5.d();
        this.G = new java.util.HashMap();
        this.I = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final java.util.ArrayList O6(ee5.h0 h0Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        h0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "getInsetDataFromFlow >> " + arrayList.size() + ' ' + arrayList2.size());
        if (arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "picImageList is empty");
            return arrayList;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        long j17 = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) kz5.n0.i0(arrayList2)).f134737e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = (com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next();
            if (c4988x89c61bdd.f134737e < j17) {
                arrayList3.add(c4988x89c61bdd);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "getInsetDataFromFlow >> " + j17 + ", " + arrayList3.size());
        return arrayList3;
    }

    public final void P6(ae5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f333435n.remove(item);
        this.f333434m.remove(item);
        zd5.g gVar = this.f333438q;
        if (gVar != null) {
            java.util.ArrayList arrayList = this.f333435n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<set-?>");
            gVar.f553216f = arrayList;
        }
        zd5.g gVar2 = this.f333438q;
        if (gVar2 != null) {
            gVar2.m8146xced61ae5();
        }
    }

    public final void Q6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "dismissDialog " + this.f333430f);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.F;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.E;
        if (u3Var != null && u3Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "go to dismiss " + this.f333430f);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.E;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0074, code lost:
    
        if (r18.f333441t != false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList R6() {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.h0.R6():java.util.ArrayList");
    }

    public final ae5.j S6(com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd, zd5.a aVar) {
        java.lang.String s17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).f333403f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(c4988x89c61bdd.f134743n, c4988x89c61bdd.f134736d);
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f333428d);
        java.lang.String str2 = "";
        if (n17.A0() == 1) {
            s17 = c01.z1.r();
        } else {
            s17 = R4 ? c01.w9.s(n17.j()) : "";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s17)) {
                s17 = n17.Q0();
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s17, true);
        if (this.f333437p != null) {
            if (!(s17 == null || s17.length() == 0)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f333437p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a3Var);
                str2 = a3Var.z0(s17);
            }
        }
        if (str2.length() == 0) {
            str2 = n18 != null ? n18.w0() : null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = n18 != null ? n18.f2() : null;
        }
        java.lang.String str3 = str2;
        android.text.SpannableString m17 = o13.q.m(m158362x2fec8307(aVar == zd5.a.f553185f ? com.p314xaae8f345.mm.R.C30867xcad56011.fgo : com.p314xaae8f345.mm.R.C30867xcad56011.fgn), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgp), str);
        zd5.b bVar = zd5.b.f553190f;
        long j17 = c4988x89c61bdd.f134737e;
        long j18 = c4988x89c61bdd.f134736d;
        return new ae5.j(aVar, bVar, n17.Q0(), str3, m17, k35.m1.f(m80379x76847179(), c4988x89c61bdd.f134737e, true, false), c4988x89c61bdd.f134738f, n18 != null ? n18.d1() : null, j18, null, this.f333436o, j17, 512, null);
    }

    public final void T6(java.util.ArrayList list, zd5.a type, java.util.ArrayList targetList) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetList, "targetList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "size: " + list.size() + ", " + type + ", " + targetList.size());
        if (targetList.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                targetList.add(S6((com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next(), type));
            }
            return;
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = (com.p314xaae8f345.mm.api.C4988x89c61bdd) it6.next();
            int size = targetList.size();
            boolean z18 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    z17 = false;
                    break;
                }
                z17 = true;
                if (c4988x89c61bdd.f134737e == ((ae5.j) targetList.get(i17)).f85955l) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult find similar");
                    break;
                }
                if (c4988x89c61bdd.f134737e > ((ae5.j) targetList.get(i17)).f85955l) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult find inset");
                    targetList.add(i17, S6(c4988x89c61bdd, type));
                    z17 = false;
                    z18 = true;
                    break;
                }
                i17++;
            }
            if (!z18 && !z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult in last");
                targetList.add(targetList.size(), S6(c4988x89c61bdd, type));
            }
        }
    }

    public final void U6(aq.c type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "updateCurrentIdentifyType >> " + type);
        this.f333443v = type;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01c4, code lost:
    
        if (r29.D == false) goto L34;
     */
    @Override // o13.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X2(p13.v r30) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.h0.X2(p13.v):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f333428d = stringExtra;
        this.f333437p = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f333428d);
        this.E = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ffj), false, 3, null);
        de5.a aVar = de5.a.f310929a;
        java.lang.String userName = this.f333428d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reset");
        de5.a.f310930b = "";
        de5.a.f310931c = "";
        de5.a.f310932d = "";
        de5.a.f310933e = 0;
        de5.a.f310934f = "";
        de5.a.f310935g = 1;
        de5.a.f310936h = 0L;
        de5.a.f310937i = 0L;
        de5.a.f310938j.clear();
        de5.a.f310940l = false;
        de5.a.f310939k = 0L;
        de5.a.f310942n = 0;
        de5.a.f310930b = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "setUserName >> " + userName + ", setSessionId >> " + de5.a.f310930b);
        de5.a.f310932d = userName;
        aVar.g(1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (!this.K && this.H != 0) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.I;
            if (!atomicBoolean.get()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.H;
                this.K = true;
                atomicBoolean.set(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "reportKeywordSearchIfPending >> keyword search exit, duration: " + currentTimeMillis + "ms");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_history_search_keyword_result_exit", kz5.c1.k(new jz5.l("search_chat_sessionid", de5.a.f310930b), new jz5.l("clk_search_sessionid", de5.a.f310931c), new jz5.l("keyword_input_exit_duration", java.lang.Long.valueOf(currentTimeMillis)), new jz5.l("chat_name", this.f333428d), new jz5.l("search_result_cnt", java.lang.Integer.valueOf(this.f333435n.size())), new jz5.l("search_query", this.f333430f)), 38014);
            }
        }
        if (this.f333429e != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f333429e);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f333442u;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.F;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f333445x;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        ce5.d dVar = this.f333444w;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadMoreImageDataModel", "destroy");
        dVar.f122345a = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var4 = dVar.f122347c;
        if (r2Var4 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var4, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(dVar.f122346b, null, 1, null);
        this.G.clear();
    }
}
