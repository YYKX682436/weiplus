package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public ln2.f f202345d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f202346e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f202347f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f202348g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f202349h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f202350i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f202351m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f202352n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f202353o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202354p;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var, ln2.f fVar) {
        this.f202354p = t0Var;
        this.f202345d = fVar;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(t0Var.f199914d);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = t0Var.A;
        if (c1073x7e08a787 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
            throw null;
        }
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.anm, (android.view.ViewGroup) c1073x7e08a787, false);
        this.f202346e = inflate;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f0s);
        this.f202347f = relativeLayout;
        this.f202348g = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate.findViewById(com.p314xaae8f345.mm.R.id.f0v);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f0t);
        this.f202349h = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f0o);
        this.f202350i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566181f11);
        android.widget.TextView giftPrice = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f2w);
        this.f202351m = giftPrice;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566185f15);
        this.f202352n = textView;
        this.f202353o = inflate.findViewById(com.p314xaae8f345.mm.R.id.f3g);
        relativeLayout.setOnClickListener(this);
        c22699x3dcdb352.setOnClickListener(this);
        textView.setOnClickListener(this);
        inflate.setId(inflate.hashCode());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(giftPrice, "giftPrice");
        hc2.o.a(giftPrice, false);
        a(this.f202345d);
    }

    public final void a(ln2.f fVar) {
        r45.kv1 kv1Var;
        this.f202345d = fVar;
        android.view.View view = this.f202346e;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f202348g;
        android.widget.RelativeLayout relativeLayout = this.f202347f;
        if (fVar == null) {
            relativeLayout.setVisibility(0);
            c1073x7e08a787.setVisibility(8);
            view.setTag("NULL_ITEM");
        } else {
            relativeLayout.setVisibility(8);
            c1073x7e08a787.setVisibility(0);
            view.setTag(fVar.f401423a.m75945x2fec8307(0));
        }
        if (fVar != null) {
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            r45.kv1 kv1Var2 = fVar.f401423a;
            wo0.c a17 = d1Var.a(new mn2.q3(kv1Var2.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            android.widget.ImageView giftView = this.f202349h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(giftView, "giftView");
            a17.c(giftView);
            this.f202350i.setText(kv1Var2.m75945x2fec8307(8));
            this.f202351m.setText(java.lang.String.valueOf((int) kv1Var2.m75938x746dc8a6(9)));
            this.f202352n.setText(this.f202354p.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekr, java.lang.Long.valueOf(fVar.f401424b)));
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.view.View tagView = this.f202353o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tagView, "tagView");
        r4Var.P2(tagView, (fVar == null || (kv1Var = fVar.f401423a) == null) ? null : ce2.i.U1.b(kv1Var));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        r45.kv1 kv1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$GiftItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = this.f202354p;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f0s) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) t0Var.f202311o;
            wn0Var.z1().a();
            ((mm2.s2) wn0Var.P0(mm2.s2.class)).f410937f.mo7808x76db6cb1(new mm2.q2(true, 1));
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f0t) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a0) t0Var.f202322z).mo146xb9724478(this.f202345d);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f566185f15) {
            t0Var.a();
            jz5.g gVar = t0Var.f202313q;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1) ((jz5.n) gVar).mo141623x754a37bb();
            ln2.f fVar = this.f202345d;
            if (fVar == null || (kv1Var = fVar.f401423a) == null || (str = kv1Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            ln2.f fVar2 = this.f202345d;
            long j17 = fVar2 != null ? fVar2.f401424b : 0L;
            a1Var.getClass();
            a1Var.f202220m = str;
            a1Var.f202221n = j17;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = a1Var.f202219i;
            if (c22621x7603e017 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
                throw null;
            }
            c22621x7603e017.setText("");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = a1Var.f202219i;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
                throw null;
            }
            c22621x7603e0172.mo81549xf579a34a(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishKeyBoardInputWidget", "bindCurrentGift: ".concat(str));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1) ((jz5.n) gVar).mo141623x754a37bb()).w();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$GiftItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
