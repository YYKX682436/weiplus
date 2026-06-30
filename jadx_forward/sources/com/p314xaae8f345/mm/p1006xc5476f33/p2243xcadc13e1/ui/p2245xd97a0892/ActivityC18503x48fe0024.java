package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2245xd97a0892;

/* renamed from: com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI */
/* loaded from: classes15.dex */
public class ActivityC18503x48fe0024 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f253690d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f253691e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f253692f = null;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseIntArray f253693g = new android.util.SparseIntArray();

    /* renamed from: h, reason: collision with root package name */
    public int f253694h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569696iw;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        int i17;
        this.f253690d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.k6k);
        this.f253691e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a9a);
        this.f253692f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.a9_);
        this.f253690d.m81392x52cfa5c6((this.f253694h & 32) != 0);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AutoAddFriendShow");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            d17 = "0";
        }
        try {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17, 0);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        if (i17 == 1) {
            this.f253692f.m81392x52cfa5c6((this.f253694h & 2097152) != 0);
            this.f253692f.m81396xb3e0a10a(new dg4.a(this));
        } else {
            this.f253691e.setVisibility(8);
            this.f253692f.setVisibility(8);
        }
        this.f253690d.m81396xb3e0a10a(new dg4.b(this));
        mo54448x9c8c0d33(new dg4.c(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a6t);
        this.f253694h = c01.z1.p();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        c01.d9.b().p().w(7, java.lang.Integer.valueOf(this.f253694h));
        int i17 = 0;
        while (true) {
            android.util.SparseIntArray sparseIntArray = this.f253693g;
            if (i17 >= sparseIntArray.size()) {
                sparseIntArray.clear();
                return;
            }
            int keyAt = sparseIntArray.keyAt(i17);
            int valueAt = sparseIntArray.valueAt(i17);
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = keyAt;
            p53Var.f464295e = valueAt;
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(23, p53Var));
            i17++;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
