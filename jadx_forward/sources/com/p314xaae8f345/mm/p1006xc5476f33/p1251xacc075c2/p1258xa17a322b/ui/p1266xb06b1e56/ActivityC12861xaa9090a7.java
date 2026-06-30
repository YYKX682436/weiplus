package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/device/AddNewDeviceListUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.device.AddNewDeviceListUI */
/* loaded from: classes5.dex */
public final class ActivityC12861xaa9090a7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final int f174295d = 16;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f174296e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f174297f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f174298g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f174299h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxd;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("deviceId");
        if (!(stringExtra == null || stringExtra.length() == 0) && i17 == this.f174295d) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new xo1.a(this));
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo78530x8b45058f();
        m78563x4e0f6657(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174492y);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 6L;
        c6839x89375b51.f141600e = 1L;
        c6839x89375b51.k();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mhj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174296e = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.oxg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174297f = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.mhk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174298g = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.mhi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174299h = (android.widget.LinearLayout) findViewById4;
        android.widget.LinearLayout linearLayout = this.f174296e;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("computerLl");
            throw null;
        }
        linearLayout.setOnClickListener(new xo1.b(this));
        android.widget.LinearLayout linearLayout2 = this.f174297f;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("usbDeviceLl");
            throw null;
        }
        linearLayout2.setOnClickListener(new xo1.c(this));
        android.widget.LinearLayout linearLayout3 = this.f174298g;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("netLocationLl");
            throw null;
        }
        linearLayout3.setOnClickListener(xo1.d.f537281d);
        android.widget.LinearLayout linearLayout4 = this.f174299h;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(xo1.e.f537282d);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cloudLl");
            throw null;
        }
    }
}
