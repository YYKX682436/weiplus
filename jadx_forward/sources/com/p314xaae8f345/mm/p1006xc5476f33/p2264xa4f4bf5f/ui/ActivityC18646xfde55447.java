package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lqi4/b;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/bc", "com/tencent/mm/plugin/textstatus/ui/cc", "com/tencent/mm/plugin/textstatus/ui/fc", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI */
/* loaded from: classes8.dex */
public final class ActivityC18646xfde55447 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements qi4.b {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.bc f255159i = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.bc(null);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f255160d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f255161e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.cc f255162f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f255163g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f255164h;

    @Override // qi4.b
    public void L3(java.lang.String event, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusHalfScreenLikeListUI", "onObserver() called with: event = " + i17);
        U6();
    }

    public final void U6() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData: old size=");
        java.util.ArrayList arrayList = this.f255161e;
        sb6.append(arrayList.size());
        sb6.append(", scene=0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusHalfScreenLikeListUI", sb6.toString());
        arrayList.clear();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI$buildItemConverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new oi4.e();
            }
        }, arrayList, false);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f255160d;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
        }
        c22848x6ddd90cf.mo8163xed962dec(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.gc(this));
        android.content.Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("status_id")) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.cc ccVar = this.f255162f;
        if (ccVar != null) {
            gm0.j1.d().q(6621, ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.fc) ccVar).f255410c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.fc fcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.fc(str2, c22848x6ddd90cf, null, 4, null);
        this.f255162f = fcVar;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loadNextPage: ");
        java.lang.String str3 = fcVar.f255408a;
        sb7.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusHalfScreenLikeListUI", sb7.toString());
        gm0.j1.d().g(new ej4.g(str3, fcVar.f255411d));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        setResult(-1);
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.czi;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.r0.f395535d;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: isContentAtTop */
    public boolean mo45060x28c9d73() {
        if (this.f255160d != null) {
            return !r0.canScrollVertically(-1);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.lqa);
        this.f255160d = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179(), 1, false));
        }
        this.f255163g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dft);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.imn);
        this.f255164h = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.cc ccVar = this.f255162f;
        if (ccVar != null) {
            gm0.j1.d().q(6621, ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.fc) ccVar).f255410c);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ai4.m0.f86706a.p(this, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ai4.m0.f86706a.J(this, null);
    }
}
