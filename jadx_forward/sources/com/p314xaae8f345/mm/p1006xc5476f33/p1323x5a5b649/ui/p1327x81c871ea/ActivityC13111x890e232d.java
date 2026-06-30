package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI */
/* loaded from: classes12.dex */
public final class ActivityC13111x890e232d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f177221p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a f177222d;

    /* renamed from: e, reason: collision with root package name */
    public cw1.o0 f177223e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.CancellationSignal f177224f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f177225g = kz5.p0.f395529d;

    /* renamed from: h, reason: collision with root package name */
    public long[] f177226h = new long[21];

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f177227i = cw1.s2.f304838d;

    /* renamed from: m, reason: collision with root package name */
    public long f177228m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f177229n;

    /* renamed from: o, reason: collision with root package name */
    public long f177230o;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570147yn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.b8_);
        mo54448x9c8c0d33(new cw1.h2(this));
        long[] longArrayExtra = getIntent().getLongArrayExtra("tagsResult");
        if (longArrayExtra == null) {
            longArrayExtra = new long[21];
        }
        this.f177226h = longArrayExtra;
        this.f177222d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a) findViewById(com.p314xaae8f345.mm.R.id.bxa);
        cw1.o0 o0Var = new cw1.o0(this);
        o0Var.h(longArrayExtra);
        this.f177223e = o0Var;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568332mi1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ctb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.crz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.dft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f177227i = new cw1.y1(o0Var, textView, this, button, button2, findViewById4);
        o0Var.d(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a = this.f177222d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22700x2b5d269a);
        c22700x2b5d269a.setAdapter(o0Var);
        c22700x2b5d269a.setOnGroupClickListener(new cw1.z1(o0Var, this));
        c22700x2b5d269a.setOnChildClickListener(new cw1.a2(o0Var, this));
        button.setOnClickListener(new cw1.b2(button, o0Var, this));
        button2.setOnClickListener(new cw1.e2(this));
        ku5.u0 u0Var = ku5.t0.f394148d;
        cw1.f2 f2Var = new cw1.f2(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(f2Var, 50L, false);
        long[] jArr = o0Var.f304720e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jArr, "<this>");
        int length = jArr.length;
        java.lang.Long[] lArr = new java.lang.Long[length];
        int length2 = jArr.length;
        for (int i17 = 0; i17 < length2; i17++) {
            lArr[i17] = java.lang.Long.valueOf(jArr[i17]);
        }
        mt1.b0.s(11, 0L, (java.lang.Long[]) java.util.Arrays.copyOf(lArr, length));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a2 = this.f177222d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22700x2b5d269a2);
        c22700x2b5d269a2.setOnGroupExpandListener(new cw1.g2(o0Var, this));
        android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
        cancellationSignal.setOnCancelListener(cw1.i2.f304522a);
        this.f177224f = cancellationSignal;
        long j17 = this.f177226h[6];
        ((ku5.t0) ku5.t0.f394148d).g(new cw1.m2(cancellationSignal, this, j17));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.os.CancellationSignal cancellationSignal = this.f177224f;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.f177224f = null;
        super.onDestroy();
    }
}
