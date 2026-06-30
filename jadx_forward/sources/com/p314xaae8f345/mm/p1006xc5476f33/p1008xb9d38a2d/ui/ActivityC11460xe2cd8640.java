package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI */
/* loaded from: classes11.dex */
public class ActivityC11460xe2cd8640 extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public int Z6() {
        return 382;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public com.p314xaae8f345.mm.p944x882e457a.m1 a7() {
        return new r61.s1(this.f155182e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public java.lang.String c7() {
        return ((android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.lrx)).getText().toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public java.lang.String d7() {
        return ((android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.lrw)).getText().toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public boolean f7(int i17, int i18, java.lang.String str) {
        if (i17 != 0 || i18 != 0) {
            return e7(i17, i18, str);
        }
        gm0.j1.u().c().w(57, 0);
        db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hw_, (java.lang.String) gm0.j1.u().c().l(5, null)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574328hw1), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.se(this));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public void g7(c71.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hvz, com.p314xaae8f345.mm.R.C30867xcad56011.f574328hw1);
            return;
        }
        if (ordinal == 1) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f574327hw0, com.p314xaae8f345.mm.R.C30867xcad56011.f574328hw1);
        } else if (ordinal == 2) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k69, com.p314xaae8f345.mm.R.C30867xcad56011.f571922tm);
        } else {
            if (ordinal != 3) {
                return;
            }
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k66, com.p314xaae8f345.mm.R.C30867xcad56011.f571922tm);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cdq;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public android.app.ProgressDialog h7(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return db5.e1.Q(context, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574330hw3), z17, z18, onCancelListener);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hwb);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f, com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
