package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ic3/a", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity */
/* loaded from: classes12.dex */
public final class ActivityC16419x510d00b7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f229382o = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f229385f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f229386g;

    /* renamed from: m, reason: collision with root package name */
    public long f229389m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229383d = "MagicAdServiceDemoActivity";

    /* renamed from: e, reason: collision with root package name */
    public wj.t0 f229384e = ic3.c0.f371926a[0];

    /* renamed from: h, reason: collision with root package name */
    public final int f229387h = 1000;

    /* renamed from: i, reason: collision with root package name */
    public final c06.e f229388i = new c06.g(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f229390n = kz5.c0.i(new ic3.a(com.p314xaae8f345.mm.R.id.t9b, new ic3.o(this)), new ic3.a(com.p314xaae8f345.mm.R.id.bys, new ic3.p(this)), new ic3.a(com.p314xaae8f345.mm.R.id.f566582ty5, new ic3.q(this)), new ic3.a(com.p314xaae8f345.mm.R.id.usn, new ic3.r(this)), new ic3.a(com.p314xaae8f345.mm.R.id.f566581ty4, new ic3.s(this)), new ic3.a(com.p314xaae8f345.mm.R.id.f565893ta2, new ic3.t(this)), new ic3.a(com.p314xaae8f345.mm.R.id.t9c, new ic3.v(this)), new ic3.a(com.p314xaae8f345.mm.R.id.f565141sp5, new ic3.w(this)), new ic3.a(com.p314xaae8f345.mm.R.id.vda, new ic3.y(this)), new ic3.a(com.p314xaae8f345.mm.R.id.vd_, new ic3.c(this)), new ic3.a(com.p314xaae8f345.mm.R.id.t5x, new ic3.d(this)), new ic3.a(com.p314xaae8f345.mm.R.id.sxk, new ic3.g(this)), new ic3.a(com.p314xaae8f345.mm.R.id.sxi, new ic3.i(this)), new ic3.a(com.p314xaae8f345.mm.R.id.sxl, new ic3.l(this)), new ic3.a(com.p314xaae8f345.mm.R.id.sxj, new ic3.n(this)));

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        android.view.View view = activityC16419x510d00b7.f229386g;
        if (view != null) {
            ((android.widget.FrameLayout) activityC16419x510d00b7.findViewById(com.p314xaae8f345.mm.R.id.cg7)).removeView(view);
            activityC16419x510d00b7.f229386g = null;
        }
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7, java.lang.String str) {
        android.widget.Toast.makeText(activityC16419x510d00b7.mo55332x76847179(), str, activityC16419x510d00b7.f229387h).show();
    }

    public final void V6() {
        java.lang.String str;
        if (this.f229389m == 0) {
            str = "无超时";
        } else {
            str = this.f229389m + "ms";
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565141sp5);
        if (button == null) {
            return;
        }
        button.setText("Timeout: " + str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570785ej4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("MagicAdService Demo");
        for (ic3.a aVar : this.f229390n) {
            android.widget.Button button = (android.widget.Button) findViewById(aVar.f371919a);
            if (button != null) {
                button.setOnClickListener(aVar.f371920b);
            }
        }
        V6();
        android.widget.Spinner spinner = (android.widget.Spinner) findViewById(com.p314xaae8f345.mm.R.id.uqx);
        if (spinner != null) {
            spinner.setAdapter((android.widget.SpinnerAdapter) new android.widget.ArrayAdapter(mo55332x76847179(), android.R.layout.simple_list_item_multiple_choice, ic3.c0.f371926a));
            spinner.setSelection(0);
            spinner.setOnItemSelectedListener(new ic3.z(this));
        }
    }
}
