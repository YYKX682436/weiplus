package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI */
/* loaded from: classes.dex */
public class ActivityC16140x55b9c685 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v2 f224170d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f224171e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f224172f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f224173g;

    /* renamed from: h, reason: collision with root package name */
    public p83.d f224174h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570720bm3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(288, this);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g5i);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.r2(this));
        mo78491xd9193382(0, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5g), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.s2(this));
        this.f224172f = findViewById(com.p314xaae8f345.mm.R.id.hgs);
        this.f224171e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.hgt);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v2 v2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v2(this);
        this.f224170d = v2Var;
        this.f224171e.setAdapter((android.widget.ListAdapter) v2Var);
        this.f224173g = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.t2(this));
        this.f224174h = new p83.d();
        c01.d9.e().g(this.f224174h);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(288, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallMyGiftCardUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof p83.d) {
            if (i17 != 0 || i18 != 0) {
                android.app.ProgressDialog progressDialog = this.f224173g;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f224173g.dismiss();
                }
                android.view.View view = this.f224172f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3w), 0).show();
                return;
            }
            r45.nr3 nr3Var = ((p83.d) m1Var).f434271e;
            android.app.ProgressDialog progressDialog2 = this.f224173g;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f224173g.dismiss();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v2 v2Var = this.f224170d;
            v2Var.f224574d = nr3Var.f463148e;
            v2Var.notifyDataSetChanged();
            if (nr3Var.f463148e.size() == 0) {
                android.view.View view2 = this.f224172f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "refreshView", "(Lcom/tencent/mm/protocal/protobuf/GetWCOGiftCardListResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "refreshView", "(Lcom/tencent/mm/protocal/protobuf/GetWCOGiftCardListResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
