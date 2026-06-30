package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "ju1/p", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI */
/* loaded from: classes9.dex */
public final class ActivityC13076xc17cada1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f176947s = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f176948i = "MicroMsg.CouponAndGiftCardListV4UI";

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f f176949m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f176950n;

    /* renamed from: o, reason: collision with root package name */
    public ju1.j0 f176951o;

    /* renamed from: p, reason: collision with root package name */
    public ju1.j f176952p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f176953q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176954r;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595
    public void T6(int i17, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570229a34;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cnr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f176949m = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565256bv1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f176950n = (android.view.ViewGroup) findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = this.f176949m;
        if (c12808x5de4409f == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        boolean z17 = true;
        c12808x5de4409f.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179(), 1, false));
        ju1.j jVar = new ju1.j(false);
        this.f176952p = jVar;
        jVar.mo8164xbbdced85(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = this.f176949m;
        if (c12808x5de4409f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        ju1.j jVar2 = this.f176952p;
        if (jVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCardsCardListAdapter");
            throw null;
        }
        c12808x5de4409f2.mo7960x6cab2c8d(jVar2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(mo55332x76847179(), 1);
        i0Var.d(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562649l6));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f3 = this.f176949m;
        if (c12808x5de4409f3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        c12808x5de4409f3.N(i0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f4 = this.f176949m;
        if (c12808x5de4409f4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        c12808x5de4409f4.m53681x626a4c3f(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569847pw);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f5 = this.f176949m;
        if (c12808x5de4409f5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        android.view.ViewGroup viewGroup = this.f176950n;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEmptyView");
            throw null;
        }
        c12808x5de4409f5.m53686x71ef750(viewGroup);
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        if (z17) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572320as3);
        } else {
            mo54450xbf7c1df6(stringExtra);
        }
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        mo78530x8b45058f();
        mo54448x9c8c0d33(new ju1.y(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = this.f176949m;
        if (c12808x5de4409f == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        c12808x5de4409f.m53683x6891e372(new ju1.v(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = this.f176949m;
        if (c12808x5de4409f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        c12808x5de4409f2.m53687xa1aeda28(new ju1.w(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f3 = this.f176949m;
        if (c12808x5de4409f3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListRv");
            throw null;
        }
        c12808x5de4409f3.m53688x1c3e70c(new ju1.x(this));
        p012xc85e97e9.p093xedfae76a.c1 a17 = p012xc85e97e9.p093xedfae76a.k1.a(this, null).a(ju1.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ju1.j0 j0Var = (ju1.j0) a17;
        this.f176951o = j0Var;
        j0Var.f383282d.mo7806x9d92d11c(this, new ju1.q(this));
        ju1.j0 j0Var2 = this.f176951o;
        if (j0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        j0Var2.f383283e.mo7806x9d92d11c(this, new ju1.r(this));
        ju1.j0 j0Var3 = this.f176951o;
        if (j0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        j0Var3.f383284f.mo7806x9d92d11c(this, new ju1.s(this));
        ju1.j0 j0Var4 = this.f176951o;
        if (j0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        j0Var4.f383285g.mo7806x9d92d11c(this, new ju1.t(this));
        ju1.j0 j0Var5 = this.f176951o;
        if (j0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        j0Var5.f383286h.mo7806x9d92d11c(this, new ju1.u(this));
        ju1.j0 j0Var6 = this.f176951o;
        if (j0Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        j0Var6.O6();
        ju1.j0 j0Var7 = this.f176951o;
        if (j0Var7 != null) {
            j0Var7.N6(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ju1.j0 j0Var = this.f176951o;
        if (j0Var != null) {
            j0Var.R6();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.f176953q) {
            ju1.j0 j0Var = this.f176951o;
            if (j0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            j0Var.N6(this);
            this.f176953q = false;
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(ju1.p.class);
    }
}
