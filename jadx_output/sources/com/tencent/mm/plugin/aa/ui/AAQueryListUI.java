package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class AAQueryListUI extends com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f72444h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.aa.ui.w f72445i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Dialog f72446m;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f72449p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.aa.ui.AAQueryListH5UrlFooterView f72450q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f72451r;

    /* renamed from: g, reason: collision with root package name */
    public final k61.d f72443g = (k61.d) this.f72474e.a(this, k61.d.class);

    /* renamed from: n, reason: collision with root package name */
    public boolean f72447n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f72448o = false;

    /* renamed from: s, reason: collision with root package name */
    public int f72452s = 1;

    public final void f7(boolean z17, int i17) {
        if (this.f72447n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListUI", "getNextPage, loading");
            return;
        }
        if (z17) {
            this.f72448o = false;
            this.f72444h.removeFooterView(this.f72450q);
        }
        this.f72447n = true;
        k61.c cVar = this.f72443g.f304492b;
        cVar.getClass();
        ((km5.q) ((km5.q) km5.u.f(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17))).n(cVar).h(new com.tencent.mm.plugin.aa.ui.e0(this, z17))).s(new com.tencent.mm.plugin.aa.ui.d0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487871a8;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            boolean booleanExtra = intent.getBooleanExtra("close_aa", false);
            int intExtra = intent.getIntExtra("item_position", 0);
            int intExtra2 = intent.getIntExtra("item_offset", 0);
            if (booleanExtra) {
                this.f72444h.setSelectionFromTop(intExtra, intExtra2);
                f7(true, this.f72452s);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.aa.ui.x(this));
        setMMTitle(com.tencent.mm.R.string.f489754ar);
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.aa.ui.c0(this));
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482309ay);
        this.f72444h = listView;
        listView.setOnScrollListener(new com.tencent.mm.plugin.aa.ui.y(this));
        this.f72444h.setOnItemClickListener(new com.tencent.mm.plugin.aa.ui.z(this));
        this.f72449p = new com.tencent.mm.plugin.aa.ui.AAQueryListLoadingMoreView(this);
        this.f72450q = new com.tencent.mm.plugin.aa.ui.AAQueryListH5UrlFooterView(this);
        this.f72446m = com.tencent.mm.wallet_core.ui.b2.e(this, false, false, null);
        com.tencent.mm.plugin.aa.ui.w wVar = new com.tencent.mm.plugin.aa.ui.w(this, this.f72452s);
        this.f72445i = wVar;
        this.f72444h.setAdapter((android.widget.ListAdapter) wVar);
        this.f72444h.setVisibility(4);
        f7(false, this.f72452s);
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(getContext(), this);
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(getContext(), this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(h61.b.class);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.aa.ui.w wVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListUI", "onScreenShot");
        if (((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).ij() || (wVar = this.f72445i) == null || ((java.util.ArrayList) wVar.f72861d).size() <= 0) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.ArrayList) this.f72445i.f72861d).iterator();
        while (it.hasNext()) {
            r45.p pVar = (r45.p) it.next();
            if (pVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(pVar.f382632d)) {
                linkedList.add(pVar.f382632d);
            }
        }
        if (linkedList.size() > 0) {
            int i17 = this.f72452s;
            if (i17 == 1) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_aa_pay_record_launch_page", linkedList, 0);
            } else if (i17 == 2) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_aa_pay_record_participate_page", linkedList, 0);
            }
        }
    }
}
