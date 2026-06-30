package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@db5.a(m123858x6ac9171 = 1)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "cw1/m", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI */
/* loaded from: classes3.dex */
public final class ActivityC13107x4291ddb8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f177179n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f177180d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f177181e;

    /* renamed from: f, reason: collision with root package name */
    public cw1.m f177182f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f177183g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f177184h = jz5.h.b(cw1.o.f304718d);

    /* renamed from: i, reason: collision with root package name */
    public int f177185i;

    /* renamed from: m, reason: collision with root package name */
    public long f177186m;

    public final boolean T6() {
        return ((java.lang.Boolean) ((jz5.n) this.f177184h).mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570144yp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new cw1.p(this));
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        android.content.Intent intent = getIntent();
        this.f177185i = intent != null ? intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) : 0;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.r0z);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.qzg);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.l68);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qze);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qzf);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mbo);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d2_);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dsg);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (T6()) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o3d)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572813ni5));
        }
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o3c)).getPaint());
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        com.p314xaae8f345.mm.ui.bk.s0(textView3.getPaint());
        cw1.k0 k0Var = new cw1.k0(this, textView2, findViewById, findViewById2, findViewById3, textView3, textView5);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.b5i);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jbv)).setOnClickListener(new cw1.c0(this, findViewById, findViewById2, findViewById3, textView2, findViewById4, k0Var));
        findViewById4.setOnClickListener(new cw1.g0(this, textView, textView2, findViewById4));
        textView4.setOnClickListener(new cw1.h0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        cw1.m mVar = this.f177182f;
        if (mVar != null) {
            mVar.f304657a = null;
            mVar.f304658b = null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = mVar.f304659c;
            if (z2Var != null) {
                z2Var.B();
            }
            mVar.f304659c = null;
        }
        this.f177182f = null;
        yz5.p pVar = this.f177183g;
        if (pVar != null) {
            ((yv1.q) ((c01.d8) i95.n0.c(c01.d8.class))).getClass();
            yv1.m mVar2 = yv1.q.f547668e;
            synchronized (yv1.m.b(mVar2)) {
                yv1.m.b(mVar2).remove(pVar);
            }
            this.f177183g = null;
        }
        this.f177186m = 0L;
        java.util.concurrent.Future future = ((yv1.q) ((c01.d8) i95.n0.c(c01.d8.class))).f547671d;
        if (future != null) {
            future.cancel(true);
        }
    }
}
