package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CouponCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "com/tencent/mm/plugin/card/ui/v3/v", "com/tencent/mm/plugin/card/ui/v3/w", "com/tencent/mm/plugin/card/ui/v3/g0", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI */
/* loaded from: classes9.dex */
public final class ActivityC13072x745567c8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595 {
    public static final /* synthetic */ int L = 0;
    public r45.iu A;
    public java.lang.String B;
    public r45.ru C;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int K;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f176787m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f176788n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f176789o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f176790p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f176791q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f176792r;

    /* renamed from: t, reason: collision with root package name */
    public int f176794t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f176795u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f176797w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f176798x;

    /* renamed from: z, reason: collision with root package name */
    public long f176800z;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f176786i = "MicroMsg.CouponCardListUI";

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f176793s = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public int f176796v = 10;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f176799y = "";
    public java.lang.String D = "";

    /* renamed from: J, reason: collision with root package name */
    public boolean f176785J = true;

    public static final void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13072x745567c8.f176786i, "go to card detail ui");
        android.content.Intent intent = new android.content.Intent(activityC13072x745567c8.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13072x745567c8.mo55332x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595
    public void T6(int i17, boolean z17) {
        if (this.f176785J && this.E == 1) {
            Y6(true);
        } else {
            if (z17) {
                return;
            }
            W6();
        }
    }

    public final void Y6(boolean z17) {
        int i17;
        java.lang.String str = "do load vip card list: " + this.G + ", " + this.f176794t + ", " + this.E;
        java.lang.String str2 = this.f176786i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (this.f176795u && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "already load complete");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f176788n;
            if (c22801x87cbdc00 != null) {
                c22801x87cbdc00.N(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                throw null;
            }
        }
        if (this.G) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "is loading");
            return;
        }
        this.G = true;
        int i18 = this.f176794t;
        if (z17) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f176788n;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                throw null;
            }
            c22801x87cbdc002.m82693x1501d518(true);
            i17 = 0;
        } else {
            i17 = i18;
        }
        bu1.a aVar = new bu1.a(i17, this.f176796v, this.f176745d, this.f176746e, 1, this.E);
        aVar.f152182i = true;
        pq5.g l17 = aVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.i0(this, z17)).f(this);
    }

    public final void Z6() {
        if (this.E <= 0 || !(!this.f176793s.isEmpty())) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f176792r;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListAdapter");
                throw null;
            }
            if (this.f176790p == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
                throw null;
            }
            c22848x6ddd90cf.i0(r5.hashCode(), false);
        } else {
            android.widget.TextView textView = this.f176791q;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSortTv");
                throw null;
            }
            textView.setText(this.D);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f176792r;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListAdapter");
                throw null;
            }
            android.view.ViewGroup viewGroup = this.f176790p;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
                throw null;
            }
            c22848x6ddd90cf2.T(viewGroup, 2, false);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f176792r;
        if (c22848x6ddd90cf3 != null) {
            c22848x6ddd90cf3.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListAdapter");
            throw null;
        }
    }

    public final void a7(r45.ud3 ud3Var) {
        java.util.ArrayList arrayList;
        r45.au auVar = ud3Var.f468792h;
        if (auVar == null || auVar.f451793d.isEmpty()) {
            return;
        }
        java.util.Iterator it = ud3Var.f468792h.f451793d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f176793s;
            if (!hasNext) {
                break;
            }
            r45.wt wtVar = (r45.wt) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar);
            wVar.f176924d = wtVar;
            arrayList.add(wVar);
        }
        if (arrayList.isEmpty()) {
            android.view.ViewGroup viewGroup = this.f176789o;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEmptyView");
                throw null;
            }
            viewGroup.setVisibility(0);
        } else {
            android.view.ViewGroup viewGroup2 = this.f176789o;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEmptyView");
                throw null;
            }
            viewGroup2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f176792r;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListAdapter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569853q2;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.bw_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f176787m = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.bw8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f176788n = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.bw6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f176789o = (android.view.ViewGroup) findViewById3;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f176787m;
        if (c22849x81a93d25 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179(), 1, false));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$initView$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8.this);
            }
        }, this.f176793s, false);
        this.f176792r = c22848x6ddd90cf;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f176787m;
        if (c22849x81a93d252 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        c22849x81a93d252.mo7960x6cab2c8d(c22848x6ddd90cf);
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f176787m;
        if (c22849x81a93d253 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569858q7, (android.view.ViewGroup) c22849x81a93d253, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f176790p = viewGroup;
        viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, i65.a.b(mo55332x76847179(), 12));
        android.view.ViewGroup viewGroup2 = this.f176790p;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById4 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.bwb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f176791q = (android.widget.TextView) findViewById4;
        android.view.ViewGroup viewGroup3 = this.f176790p;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        viewGroup3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.j0(this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f176792r;
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListAdapter");
            throw null;
        }
        android.view.ViewGroup viewGroup4 = this.f176790p;
        if (viewGroup4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        c22848x6ddd90cf2.T(viewGroup4, 2, false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f176788n;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
        c22801x87cbdc00.m82690xd3a27e96(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f176788n;
        if (c22801x87cbdc002 != null) {
            c22801x87cbdc002.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.l0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f176797w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f176786i, "no data to save snapshot");
            return;
        }
        r45.ud3 ud3Var = new r45.ud3();
        r45.ie ieVar = new r45.ie();
        ud3Var.f76492x92037252 = ieVar;
        ieVar.f458493e = new r45.du5();
        ud3Var.f468792h = new r45.au();
        java.util.Iterator it = this.f176793s.iterator();
        while (it.hasNext()) {
            ud3Var.f468792h.f451793d.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w) it.next()).a());
        }
        ud3Var.f468797p = this.C;
        ud3Var.f468790f = this.f176794t;
        ud3Var.f468794m = this.B;
        ud3Var.f468793i = this.A;
        pm0.v.K(null, new au1.b(ud3Var));
        r45.qu quVar = new r45.qu();
        quVar.f465792d = this.E;
        quVar.f465794f = this.D;
        quVar.f465793e = this.f176796v;
        pm0.v.K(null, new au1.d(quVar));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f176786i, "do get mch infoset: %s", java.lang.Boolean.valueOf(this.f176798x));
        if (this.f176798x) {
            au1.o oVar = new au1.o(this.f176799y, this.f176800z, this.f176745d, this.f176746e, this.E, 1);
            oVar.f152182i = true;
            oVar.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.h0(this)).f(this);
        }
    }
}
