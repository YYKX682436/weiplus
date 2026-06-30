package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v4/HistoryCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "ju1/u0", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI */
/* loaded from: classes9.dex */
public final class ActivityC13077xb3b83e76 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f176955r = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f f176956i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f176957m;

    /* renamed from: n, reason: collision with root package name */
    public ju1.k f176958n;

    /* renamed from: o, reason: collision with root package name */
    public ju1.j f176959o;

    /* renamed from: p, reason: collision with root package name */
    public int f176960p = 1;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176961q;

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
        this.f176956i = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565256bv1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f176957m = (android.view.ViewGroup) findViewById2;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565257bv2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f565255bv0);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79552x4ca416f);
        c22699x3dcdb352.m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = this.f176956i;
        if (c12808x5de4409f == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
            throw null;
        }
        boolean z17 = true;
        c12808x5de4409f.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179(), 1, false));
        ju1.j jVar = new ju1.j(true);
        this.f176959o = jVar;
        jVar.mo8164xbbdced85(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = this.f176956i;
        if (c12808x5de4409f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
            throw null;
        }
        ju1.j jVar2 = this.f176959o;
        if (jVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListAdapter");
            throw null;
        }
        c12808x5de4409f2.mo7960x6cab2c8d(jVar2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(mo55332x76847179(), 1);
        i0Var.d(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562649l6));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f3 = this.f176956i;
        if (c12808x5de4409f3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
            throw null;
        }
        c12808x5de4409f3.N(i0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f4 = this.f176956i;
        if (c12808x5de4409f4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
            throw null;
        }
        c12808x5de4409f4.m53681x626a4c3f(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569847pw);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f5 = this.f176956i;
        if (c12808x5de4409f5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
            throw null;
        }
        android.view.ViewGroup viewGroup = this.f176957m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEmptyView");
            throw null;
        }
        c12808x5de4409f5.m53686x71ef750(viewGroup);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.asz);
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        this.f176960p = getIntent().getIntExtra("card_type", 2);
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        if (z17) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jxt);
        } else {
            mo54450xbf7c1df6(stringExtra);
        }
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        mo78530x8b45058f();
        mo54448x9c8c0d33(new ju1.f1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ju1.k kVar;
        super.onCreate(bundle);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = this.f176956i;
        if (c12808x5de4409f == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
            throw null;
        }
        c12808x5de4409f.m53683x6891e372(new ju1.a1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = this.f176956i;
        if (c12808x5de4409f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
            throw null;
        }
        c12808x5de4409f2.m53687xa1aeda28(new ju1.b1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f3 = this.f176956i;
        if (c12808x5de4409f3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListRv");
            throw null;
        }
        c12808x5de4409f3.m53688x1c3e70c(new ju1.c1(this));
        int i17 = this.f176960p;
        if (i17 == 2) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = p012xc85e97e9.p093xedfae76a.k1.a(this, null).a(ju1.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            kVar = (ju1.k) a17;
        } else if (i17 != 3) {
            p012xc85e97e9.p093xedfae76a.c1 a18 = p012xc85e97e9.p093xedfae76a.k1.a(this, null).a(ju1.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
            kVar = (ju1.k) a18;
        } else {
            p012xc85e97e9.p093xedfae76a.c1 a19 = p012xc85e97e9.p093xedfae76a.k1.a(this, null).a(ju1.o1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a19);
            kVar = (ju1.k) a19;
        }
        this.f176958n = kVar;
        kVar.f383282d.mo7806x9d92d11c(this, new ju1.v0(this));
        ju1.k kVar2 = this.f176958n;
        if (kVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        kVar2.f383283e.mo7806x9d92d11c(this, new ju1.w0(this));
        ju1.k kVar3 = this.f176958n;
        if (kVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        kVar3.f383284f.mo7806x9d92d11c(this, new ju1.x0(this));
        ju1.k kVar4 = this.f176958n;
        if (kVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        kVar4.f383285g.mo7806x9d92d11c(this, new ju1.y0(this));
        ju1.k kVar5 = this.f176958n;
        if (kVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        kVar5.f383286h.mo7806x9d92d11c(this, new ju1.z0(this));
        ju1.k kVar6 = this.f176958n;
        if (kVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        kVar6.O6();
        ju1.k kVar7 = this.f176958n;
        if (kVar7 != null) {
            kVar7.N6(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ju1.k kVar = this.f176958n;
        if (kVar != null) {
            kVar.R6();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(ju1.u0.class);
    }
}
