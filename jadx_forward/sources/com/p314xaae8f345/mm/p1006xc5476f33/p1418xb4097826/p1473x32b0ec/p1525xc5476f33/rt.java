package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class rt implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195718d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f195719e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f195720f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f195721g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f195722h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f195723i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f195724m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f195725n;

    public rt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f195718d = plugin;
        this.f195719e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mt(this));
        this.f195720f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lt(this));
        this.f195721g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pt(this));
        this.f195722h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kt(this));
        this.f195724m = new java.util.ArrayList();
        this.f195725n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ot(this));
    }

    public final void a(java.lang.String source, java.lang.String clientMsgId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientMsgId, "clientMsgId");
        if ((i17 != 0 && i17 != 4) || (i17 == 4 && (i18 == -200018 || i18 == -200014 || i18 == -200017 || i18 == -100075))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveInputPluginDanmaku", "afterPostMsg: don't consume coin, source=" + source + ", errType=" + i17 + ", errCode=" + i18 + ", clientMsgId=" + clientMsgId);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveInputPluginDanmaku", "afterPostMsg: source=" + source + ", errType=" + i17 + ", errCode=" + i18 + ", clientMsgId=" + clientMsgId);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ft(this, source));
    }

    public final void b() {
        if2.d0 d0Var;
        android.view.ViewGroup viewGroup;
        if2.d0 d0Var2;
        android.view.ViewGroup viewGroup2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195718d;
        boolean z17 = ((mm2.j2) etVar.P0(mm2.j2.class)).f410704s;
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = etVar.K;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = etVar.f193994y;
        if (!z17) {
            etVar.f193987t = 120;
            etVar.W1(120);
            ck5.f b17 = ck5.f.b(c22621x7603e017);
            b17.f124094f = 1;
            b17.f124093e = 120;
            b17.f124095g = t4Var;
            b17.f124089a = true;
            b17.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jr(etVar, 120));
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f17 = f();
            if (f17 != null) {
                f17.setVisibility(8);
            }
            if (this.f195723i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg c17 = c();
                if (c17 != null) {
                    c17.K0(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg c18 = c();
                if (c18 != null && (viewGroup = c18.f446856d) != null) {
                    viewGroup.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jt(this), 200L);
                }
                this.f195723i = false;
            }
            df2.ug ugVar = (df2.ug) etVar.U0(df2.ug.class);
            if (ugVar == null || (d0Var = ugVar.f313058p) == null) {
                return;
            }
            d0Var.d(0);
            return;
        }
        etVar.f193987t = 30;
        etVar.W1(30);
        ck5.f b18 = ck5.f.b(c22621x7603e017);
        b18.f124094f = 1;
        b18.f124093e = 30;
        b18.f124095g = t4Var;
        b18.f124089a = true;
        b18.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jr(etVar, 30));
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(8);
        }
        if (f() != null) {
            f().setVisibility(0);
            if (f().mo7946xf939df19() == null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f18 = f();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(f().getContext());
                c1162x665295de.Q(0);
                f18.mo7967x900dcbe1(c1162x665295de);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f19 = f();
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveInputPluginDanmaku$showSelectDanmakuRv$2
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        return new hk2.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rt.this.f195718d.S0());
                    }
                }, this.f195724m, false);
                c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qt(this);
                f19.mo7960x6cab2c8d(c22848x6ddd90cf);
            }
            f().getLayoutParams().width = (int) (((java.lang.Number) ((jz5.n) this.f195725n).mo141623x754a37bb()).intValue() / 0.7f);
            f().setPivotX(0.0f);
            f().setPivotY(i65.a.a(etVar.f446856d.getContext(), 114.0f));
            f().setScaleX(0.7f);
            f().setScaleY(0.7f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg c19 = c();
        this.f195723i = (c19 == null || (viewGroup2 = c19.f446856d) == null || viewGroup2.getVisibility() != 0) ? false : true;
        pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ht(this));
        df2.ug ugVar2 = (df2.ug) etVar.U0(df2.ug.class);
        if (ugVar2 == null || (d0Var2 = ugVar2.f313058p) == null) {
            return;
        }
        d0Var2.d(8);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) ((jz5.n) this.f195722h).mo141623x754a37bb();
    }

    public final android.widget.CheckBox d() {
        return (android.widget.CheckBox) ((jz5.n) this.f195720f).mo141623x754a37bb();
    }

    public final android.view.View e() {
        return (android.view.View) ((jz5.n) this.f195719e).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f() {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.f195721g).mo141623x754a37bb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        df2.ug ugVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if ((view != null && view.getId() == com.p314xaae8f345.mm.R.id.cq7) != false) {
            android.widget.CheckBox d17 = d();
            if ((d17 != null && d17.getVisibility() == 0) != false) {
                android.widget.CheckBox d18 = d();
                boolean z17 = !(d18 != null ? d18.isChecked() : false);
                android.widget.CheckBox d19 = d();
                if (d19 != null) {
                    d19.setChecked(z17);
                }
                ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(2, 3, kz5.b1.e(new jz5.l("status", java.lang.String.valueOf(z17 ? 1 : 0))));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195718d;
                mm2.j2 j2Var = (mm2.j2) etVar.P0(mm2.j2.class);
                android.widget.CheckBox d27 = d();
                j2Var.f410704s = d27 != null ? d27.isChecked() : false;
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.Bj((ml2.r0) c17, ml2.g5.f409031y, null, 2, 2, null);
                b();
                if (etVar.x0() && z17 && (ugVar = (df2.ug) etVar.U0(df2.ug.class)) != null) {
                    ugVar.W6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nt(ugVar));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPluginDanmaku", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
