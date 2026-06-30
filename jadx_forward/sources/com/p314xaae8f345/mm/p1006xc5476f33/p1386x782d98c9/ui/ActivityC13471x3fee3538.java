package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI */
/* loaded from: classes13.dex */
public class ActivityC13471x3fee3538 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f180828d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 f180829e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f180828d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
        this.f180829e = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3(this, null);
        android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.a9l, null);
        this.f180828d.setAdapter((android.widget.ListAdapter) this.f180829e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 n3Var = this.f180829e;
        java.util.List f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().f1();
        java.util.LinkedList linkedList = (java.util.LinkedList) n3Var.f181114d;
        linkedList.clear();
        if (((java.util.LinkedList) f17).size() != 0) {
            linkedList.addAll(f17);
        }
        this.f180829e.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i3(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c3t);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5341x5ec25e4e c5341x5ec25e4e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5341x5ec25e4e();
        c5341x5ec25e4e.f135662g.f89138a = true;
        c5341x5ec25e4e.e();
        mo43517x10010bd5();
        gm0.j1.n().f354821b.a(537, this.f180829e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(537, this.f180829e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0 || !this.f180829e.f181115e) {
            return super.onKeyDown(i17, keyEvent);
        }
        mo60878xf6b21fea(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571914te));
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 n3Var = this.f180829e;
        if (!n3Var.f181115e) {
            return true;
        }
        n3Var.f181115e = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.k3(n3Var));
        return true;
    }
}
