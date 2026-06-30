package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class da extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements s82.h {
    public java.util.ArrayList A;
    public java.util.ArrayList B;
    public java.util.ArrayList C;
    public boolean D;
    public android.view.View E;
    public java.lang.String F;
    public final android.widget.AdapterView.OnItemLongClickListener G;
    public java.lang.String H;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f182109d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f182110e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f182111f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f182112g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f182113h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f182114i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 f182115m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c f182116n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 f182117o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f182118p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f182119q;

    /* renamed from: r, reason: collision with root package name */
    public o72.r2 f182120r;

    /* renamed from: s, reason: collision with root package name */
    public w82.k f182121s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f182122t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f182123u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f182124v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f182125w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f182126x;

    /* renamed from: y, reason: collision with root package name */
    public final o72.i4 f182127y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f182128z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f182109d = "";
        this.f182110e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n9(context));
        this.f182111f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o9(context));
        this.f182112g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p9(context));
        this.f182113h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m9(context));
        this.f182114i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l9(context));
        this.f182118p = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra(context, 16);
        this.f182119q = new int[2];
        this.f182122t = new java.util.ArrayList();
        this.f182127y = new o72.b3();
        this.f182128z = new java.util.HashSet();
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.F = "";
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u9(this);
        this.H = "";
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar, android.view.View view, int i17, o72.r2 r2Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(daVar.m80379x76847179());
        u1Var.g(daVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_j));
        u1Var.j(daVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_c));
        u1Var.n(daVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.caz));
        u1Var.c(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w9.f183050a, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x9(daVar, view, i17, r2Var));
        u1Var.q(false);
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        if (cVar.f182017q) {
            w82.k kVar = this.f182121s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = this.f182116n;
            if (cVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
            kVar.b(cVar2.l() > 0);
            if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) m158354x19263085;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar3 = this.f182116n;
                if (cVar3 != null) {
                    abstractActivityC13548xbf543800.Z6(cVar3.l());
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                    throw null;
                }
            }
        }
    }

    public final boolean P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 c3Var = this.f182117o;
        if (c3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavFinderManager");
            throw null;
        }
        if (c3Var.b().f497936d) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 c3Var2 = this.f182117o;
            if (c3Var2 != null) {
                c3Var2.b().P6();
                return true;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavFinderManager");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        if (cVar.f182017q) {
            cVar.g(false, null);
            R6().setOnItemLongClickListener(this.G);
            w82.k kVar = this.f182121s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
            kVar.c();
            if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) m158354x19263085).b7();
            }
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182115m;
        if (h0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavGallery");
            throw null;
        }
        if (h0Var.f182486m.getVisibility() != 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var2 = this.f182115m;
            if (h0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavGallery");
                throw null;
            }
            if (h0Var2.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var3 = this.f182115m;
                if (h0Var3 != null) {
                    h0Var3.i();
                    return true;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavGallery");
                throw null;
            }
        }
        return false;
    }

    public final android.widget.ListView Q6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f182110e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ListView) mo141623x754a37bb;
    }

    public final android.widget.ListView R6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f182111f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ListView) mo141623x754a37bb;
    }

    public final android.view.View S6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f182112g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final int T6() {
        boolean z17 = !this.B.isEmpty();
        boolean z18 = !this.A.isEmpty();
        boolean z19 = !this.C.isEmpty();
        if (z17 && z18 && z19) {
            return 7;
        }
        if (z19 && z18) {
            return 6;
        }
        if (z17 && z18) {
            return 5;
        }
        if (z17 && z19) {
            return 4;
        }
        if (z18) {
            return 3;
        }
        return z19 ? 2 : 1;
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "[refreshNormalResult]");
        Q6().setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182115m;
        if (h0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavGallery");
            throw null;
        }
        h0Var.g(8);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 c3Var = this.f182117o;
        if (c3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavFinderManager");
            throw null;
        }
        c3Var.f182070d.setVisibility(8);
        c3Var.f182076m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        if (cVar.isEmpty()) {
            android.view.View S6 = S6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshNormalResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshNormalResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6().setVisibility(8);
            return;
        }
        android.view.View S62 = S6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(S62, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshNormalResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(S62, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshNormalResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6().setVisibility(0);
    }

    public final void V6(o72.r2 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.List u17 = o72.x1.u();
        java.util.List I7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(this.B, this.C, this.A);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fav_card_origin_index", java.lang.Integer.valueOf(u17.indexOf(java.lang.Long.valueOf(info.f67645x88be67a1))));
        hashMap.put("fav_card_filted_index", java.lang.Integer.valueOf(I7.indexOf(java.lang.Long.valueOf(info.f67645x88be67a1))));
        hashMap.put("fav_ts", java.lang.Long.valueOf(info.f67659xa783a79b));
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(info.f67657x2262335f));
        hashMap.put("fav_homepage_sessionid", this.H);
        java.lang.String join = android.text.TextUtils.join(",", this.B);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(join, "join(...)");
        hashMap.put("query_word", join);
        hashMap.put("fav_res_method", java.lang.Integer.valueOf(T6()));
        hashMap.put("search_result_cnt", java.lang.Integer.valueOf(I7.size()));
        hashMap.put("queryid", this.F);
        java.lang.Integer d17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.d(info.f67657x2262335f, info.f67640x5ab01132);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getGeneralMsgType(...)");
        hashMap.put("general_msg_type", d17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("favHomePage", "fav_search_res_clk", hashMap, 32903);
    }

    public final boolean W6(java.util.List list) {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list) && list.contains(21);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0075. Please report as an issue. */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar2 = this;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (daVar2.f182123u) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 c3Var = daVar2.f182117o;
            if (c3Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavFinderManager");
                throw null;
            }
            if (c3Var.f182076m) {
                return;
            }
            if (i18 != -1) {
                if (i17 == 4105) {
                    android.app.Activity m80379x76847179 = m80379x76847179();
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar2.f182116n;
                    if (cVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(m80379x76847179, "", cVar.k(false), false);
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                        throw null;
                    }
                }
                if (i17 == 4106 && daVar2.f182120r != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    o72.r2 r2Var = daVar2.f182120r;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2Var);
                    arrayList2.add(r2Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(m80379x76847179(), "", arrayList2, false);
                    return;
                }
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent);
            java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
            if (i17 == 1) {
                if (i18 != -1) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = daVar2.f182115m;
                if (h0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavGallery");
                    throw null;
                }
                java.util.List list = h0Var.f182497x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getTransList(...)");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
                java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) new r26.t(",").g(stringExtra2, 0).toArray(new java.lang.String[0]));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P1, "stringsToList(...)");
                java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    if (new o72.b3().b(((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next()).f182431b, true, true)) {
                        db5.e1.T(m80379x76847179(), daVar2.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e));
                        return;
                    }
                }
                java.util.Iterator it6 = arrayList3.iterator();
                boolean z17 = false;
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it6.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "FavTopSearchUIC.onActivityResult: select %s for sending", stringExtra2);
                    boolean d17 = b1Var.d();
                    java.util.Iterator it7 = it6;
                    r45.gp0 gp0Var = b1Var.f182431b;
                    if (d17 || b1Var.c()) {
                        arrayList = P1;
                        str = stringExtra;
                        str2 = stringExtra2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "FavTopSearchUIC.onActivityResult VIDEO: dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, orgnPath=%s, orgnThumbPath=%s", java.lang.Integer.valueOf(gp0Var.I), gp0Var.f456967s, gp0Var.f456971u, gp0Var.f456945h, gp0Var.f456953m, gp0Var.V, gp0Var.X);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u)) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append("type:");
                            sb6.append(gp0Var.I);
                            sb6.append(";cdnDataUrl:");
                            sb6.append(gp0Var.f456967s);
                            sb6.append(";cdnDataKey:");
                            sb6.append(gp0Var.f456971u);
                            sb6.append(";cdnThumbUrl:");
                            sb6.append(gp0Var.f456945h);
                            sb6.append(";cdnThumbKey:");
                            sb6.append(gp0Var.f456953m);
                            sb6.append(";orgnPath:");
                            sb6.append(gp0Var.V);
                            sb6.append(";orgnThumbPath:");
                            sb6.append(gp0Var.X);
                            sb6.append(";is_data_empty:true");
                            pm0.z.a(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b, "fav_top_search_send_video_field_missing", true, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q9(sb6), 60, null);
                        }
                        daVar = this;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(m80379x76847179(), "", daVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q, "showProgressDlg(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s9 s9Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s9(Q);
                        java.util.Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.k(m80379x76847179(), (java.lang.String) it8.next(), gp0Var, s9Var);
                        }
                    } else {
                        str2 = stringExtra2;
                        str = stringExtra;
                        arrayList = P1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "FavTopSearchUIC.onActivityResult IMG: dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, orgnPath=%s, orgnThumbPath=%s", java.lang.Integer.valueOf(gp0Var.I), gp0Var.f456967s, gp0Var.f456971u, gp0Var.f456945h, gp0Var.f456953m, gp0Var.V, gp0Var.X);
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u);
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456953m);
                        if (z18 || z19) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append("type:");
                            sb7.append(gp0Var.I);
                            sb7.append(";cdnDataUrl:");
                            sb7.append(gp0Var.f456967s);
                            sb7.append(";cdnDataKey:");
                            sb7.append(gp0Var.f456971u);
                            sb7.append(";cdnThumbUrl:");
                            sb7.append(gp0Var.f456945h);
                            sb7.append(";cdnThumbKey:");
                            sb7.append(gp0Var.f456953m);
                            sb7.append(";orgnPath:");
                            sb7.append(gp0Var.V);
                            sb7.append(";orgnThumbPath:");
                            sb7.append(gp0Var.X);
                            if (z18) {
                                sb7.append(";is_data_empty:true");
                            }
                            if (z19) {
                                sb7.append(";is_image_thumb_empty:true");
                            }
                            pm0.z.a(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b, "fav_top_search_send_img_field_missing", true, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r9(sb7), 60, null);
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(o72.x1.x(gp0Var));
                        for (java.lang.String str3 : arrayList) {
                            java.util.Iterator it9 = arrayList4.iterator();
                            while (it9.hasNext()) {
                                java.lang.String str4 = (java.lang.String) it9.next();
                                c01.f7 b17 = o72.l2.b(gp0Var);
                                if (b17 != null) {
                                    b17.V(o72.x1.X(gp0Var));
                                }
                                k70.i0 i0Var = new k70.i0();
                                i0Var.f386175a = 3;
                                i0Var.f386190p = b17;
                                if (b17 != null && b17.y()) {
                                    i19 = 1;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                                    java.lang.String r17 = c01.z1.r();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
                                    r70.g gVar = new r70.g(str4, i19, r17, str3, i0Var);
                                    gVar.f474639h = 0;
                                    gVar.f474641j = "fav_top_send_img";
                                    ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
                                }
                                i19 = 0;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                                java.lang.String r172 = c01.z1.r();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r172, "getUsernameFromUserInfo(...)");
                                r70.g gVar2 = new r70.g(str4, i19, r172, str3, i0Var);
                                gVar2.f474639h = 0;
                                gVar2.f474641j = "fav_top_send_img";
                                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar2);
                            }
                        }
                        daVar = this;
                    }
                    it6 = it7;
                    daVar2 = daVar;
                    stringExtra2 = str2;
                    stringExtra = str;
                    z17 = true;
                    P1 = arrayList;
                }
                java.util.ArrayList<java.lang.String> arrayList5 = P1;
                java.lang.String str5 = stringExtra;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    for (java.lang.String str6 : arrayList5) {
                        ((dk5.s5) tg3.t1.a()).fj(str6, str5, c01.e2.C(str6), 0);
                    }
                }
                if (z17) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, m80379x76847179(), null, null);
                }
            } else if (i17 != 305) {
                switch (i17) {
                    case 4104:
                        if (intent.getBooleanExtra("key_fav_need_show_tips", false)) {
                            db5.t7.i(m80379x76847179(), i65.a.r(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.c_7), com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
                            break;
                        }
                        break;
                    case 4105:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "select %s for sending", stringExtra2);
                        android.app.Activity m80379x768471792 = m80379x76847179();
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = daVar2.f182116n;
                        if (cVar2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.b(m80379x768471792, cVar2.k(false), stringExtra, stringExtra2, "MicroMsg.FavSearchManager");
                        break;
                    case 4106:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "select %s for sending", stringExtra2);
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        o72.r2 r2Var2 = daVar2.f182120r;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2Var2);
                        arrayList6.add(r2Var2);
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.b(m80379x76847179(), arrayList6, stringExtra, stringExtra2, "MicroMsg.FavSearchManager");
                        break;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "requestCode = EDIT_TAG_REQUEST_CODE, call update tag");
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar3 = daVar2.f182116n;
                if (cVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                    throw null;
                }
                cVar3.c();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar4 = daVar2.f182116n;
                if (cVar4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                    throw null;
                }
                cVar4.notifyDataSetChanged();
            }
            P6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (P6()) {
            return true;
        }
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String str;
        if (m80379x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.FavBaseUI");
            java.lang.CharSequence title = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) m80379x76847179).getTitle();
            if (title == null || (str = title.toString()) == null) {
                str = "";
            }
            this.f182109d = str;
            if (str.length() == 0) {
                java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572731cb1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                this.f182109d = string;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c(m80379x76847179(), this.f182118p, false);
        this.f182116n = cVar;
        cVar.K = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j9(this);
        cVar.F = 2;
        cVar.f182025y = this;
        cVar.I = R6();
        android.widget.ListView R6 = R6();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = this.f182116n;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        R6.setAdapter((android.widget.ListAdapter) cVar2);
        R6().setOnItemLongClickListener(this.G);
        R6().setClickable(true);
        R6().setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k9(this));
        R6().setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i9(this));
        w82.k kVar = new w82.k();
        this.f182121s = kVar;
        kVar.a(mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.dtg));
        w82.k kVar2 = this.f182121s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar2);
        kVar2.f525436k = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e9(this);
        java.util.List v07 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().v0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v07, "getFavLocalIdList(...)");
        this.f182122t = v07;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        android.app.Activity m80379x76847179 = m80379x76847179();
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f182113h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0(m80379x76847179, (android.view.View) mo141623x754a37bb, this.f182118p);
        this.f182115m = h0Var;
        h0Var.f182496w = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t9(this);
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.dxs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        android.app.Activity m80379x768471792 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x768471792, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f182117o = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3((android.widget.FrameLayout) mo144222x4ff8c0f0, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x768471792);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f182126x = false;
        this.f182124v = null;
        this.f182125w = null;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182115m;
        if (h0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFavGallery");
            throw null;
        }
        h0Var.c();
        this.f182118p.f();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f182116n;
        if (cVar != null) {
            cVar.f182011J.mo48814x2efc64();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f182116n;
        if (cVar != null) {
            cVar.f182023w = true;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        cVar.f182023w = false;
        if (cVar.f182024x) {
            cVar.notifyDataSetChanged();
        }
    }
}
