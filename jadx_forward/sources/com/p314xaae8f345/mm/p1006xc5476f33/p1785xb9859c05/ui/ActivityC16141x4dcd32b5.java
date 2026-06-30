package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI */
/* loaded from: classes15.dex */
public class ActivityC16141x4dcd32b5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f224175d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f224176e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f224177f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f224178g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f224179h = null;

    /* renamed from: i, reason: collision with root package name */
    public p83.e f224180i = null;

    /* renamed from: m, reason: collision with root package name */
    public p83.j f224181m = null;

    /* renamed from: n, reason: collision with root package name */
    public final q83.e f224182n = new q83.e();

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPackageUI", "startGetPackageProductList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f3Var = this.f224179h;
        if (f3Var != null) {
            f3Var.f224358d = null;
            f3Var.notifyDataSetChanged();
        }
        android.widget.ListView listView = this.f224175d;
        if (listView != null) {
            listView.setVisibility(8);
        }
        android.widget.TextView textView = this.f224176e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.app.ProgressDialog progressDialog = this.f224177f;
        if (progressDialog == null) {
            this.f224177f = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x2(this));
        } else {
            progressDialog.show();
        }
        this.f224180i = new p83.e();
        c01.d9.e().g(this.f224180i);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570722bm5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(831, this);
        c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.k.f33927x366c91de, this);
        q83.e eVar = this.f224182n;
        eVar.d();
        eVar.f442289b++;
        eVar.b();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g5v);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w2(this));
        this.f224175d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.kns);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3(this);
        this.f224179h = f3Var;
        this.f224175d.setAdapter((android.widget.ListAdapter) f3Var);
        this.f224176e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kca);
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(831, this);
        c01.d9.e().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.k.f33927x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.List list;
        java.util.LinkedList linkedList;
        android.app.ProgressDialog progressDialog = this.f224177f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f224177f.dismiss();
        }
        android.app.ProgressDialog progressDialog2 = this.f224178g;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.f224178g.dismiss();
        }
        r45.p57 p57Var = null;
        if (m1Var instanceof p83.e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallGetPackageProductList errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), str);
            if (i17 != 0 || i18 != 0) {
                dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3w), 0).show();
                finish();
                return;
            }
            r45.pr3 pr3Var = ((p83.e) m1Var).f434274e;
            if (pr3Var == null || (linkedList = pr3Var.f464860e) == null || linkedList.size() <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f3Var = this.f224179h;
                f3Var.f224358d = null;
                f3Var.notifyDataSetChanged();
                this.f224176e.setVisibility(0);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f3Var2 = this.f224179h;
            f3Var2.f224358d = linkedList;
            f3Var2.notifyDataSetChanged();
            this.f224175d.setVisibility(0);
            return;
        }
        if (!(m1Var instanceof p83.j)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPackageUI", "onSceneEnd errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallPurchasePackage errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), str);
        q83.e eVar = this.f224182n;
        eVar.f442293f = i18;
        if (i17 == 0 && i18 == 0) {
            eVar.b();
            dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5x), 0).show();
            T6();
            return;
        }
        if (i18 != 101) {
            eVar.b();
            dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5r), 0).show();
            T6();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f3Var3 = this.f224179h;
        r45.r57 r57Var = ((p83.j) m1Var).f434291e;
        java.lang.String str2 = r57Var != null ? r57Var.f466099d : "";
        f3Var3.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (list = f3Var3.f224358d) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.p57 p57Var2 = (r45.p57) it.next();
                if (p57Var2 != null && p57Var2.f464314m.equals(str2)) {
                    p57Var = p57Var2;
                    break;
                }
            }
        }
        if (p57Var != null) {
            db5.e1.C(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5t, p57Var.f464309e, p57Var.f464308d), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5u), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4b), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5o), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.z2(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a3(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallPackageUI", "onSceneEnd: proToBuy is null");
        eVar.b();
        dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5r), 0).show();
    }
}
