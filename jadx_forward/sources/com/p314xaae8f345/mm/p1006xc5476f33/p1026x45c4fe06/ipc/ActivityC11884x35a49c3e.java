package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI */
/* loaded from: classes14.dex */
public class ActivityC11884x35a49c3e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProxyTransparentUI", "onCreate");
        com.p314xaae8f345.mm.ui.bk.k0(getWindow());
        try {
            getIntent().getExtras().setClassLoader(java.lang.Class.forName(getIntent().getStringExtra("task_class_name")).getClassLoader());
        } catch (java.lang.ClassNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProxyTransparentUI", "ClassNotFoundException");
            setResult(1);
            finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 abstractC11885x29239176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176) getIntent().getParcelableExtra("task_object");
        java.lang.String stringExtra = getIntent().getStringExtra("task_id");
        if (abstractC11885x29239176 != null) {
            abstractC11885x29239176.d(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.o(this, abstractC11885x29239176, stringExtra));
        } else {
            setResult(1);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProxyTransparentUI", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        int intExtra = getIntent().getIntExtra("orientation", -1);
        if (intExtra != -1) {
            setRequestedOrientation(intExtra);
        }
    }
}
