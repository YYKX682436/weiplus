package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* renamed from: com.tencent.mm.plugin.product.ui.MallBaseUI */
/* loaded from: classes14.dex */
public abstract class AbstractActivityC16810x42519079 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f234725d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.e(this));
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 == -10002) {
            return com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(mo55332x76847179(), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.g(this));
        }
        if (i17 != -10001) {
            return super.onCreateDialog(i17);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f234725d)) {
            this.f234725d = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gro);
        }
        return db5.e1.G(this, this.f234725d, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.f(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && keyEvent.getAction() == 1) {
            m78496x82776364();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setContentViewVisibility */
    public void mo67598xf0aced2e(int i17) {
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/product/ui/MallBaseUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/product/ui/MallBaseUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            m78602x5a7a36a0();
        } else {
            m78531x8f8cf1fb();
        }
    }
}
