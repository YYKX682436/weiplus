package com.tencent.mm.plugin.collect.ui;

@ul5.d(0)
/* loaded from: classes9.dex */
public class CollectBillListUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f96342d;

    /* renamed from: e, reason: collision with root package name */
    public zw1.d f96343e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f96344f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f96345g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.collect.ui.CollectPullDownView f96346h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f96347i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Dialog f96348m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f96349n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f96350o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f96351p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f96352q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final int f96353r = 20;

    /* renamed from: s, reason: collision with root package name */
    public int f96354s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f96355t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f96356u = new java.util.ArrayList();

    public final void U6() {
        int count = this.f96343e.getCount();
        if (count > 0) {
            long j17 = ((ww1.n1) ((java.util.ArrayList) this.f96343e.f476600e).get(count - 1)).f450249b;
            if (j17 < this.f96355t) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "server lastTimestamp is error! %s, %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f96355t));
                this.f96355t = j17;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "get next page, type: %d, timestamp: %s", java.lang.Integer.valueOf(this.f96352q), java.lang.Long.valueOf(this.f96355t));
        doSceneProgress(new ww1.x1(this.f96352q, this.f96355t, 0, this.f96353r, 0), false);
        this.f96349n = true;
    }

    public final void V6(int i17, long j17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "get retry page, type: %d, timestamp: %s, tryNum: %d, directFlag: %d, chooseFlag: %d", java.lang.Integer.valueOf(this.f96352q), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        doSceneProgress(new ww1.x1(this.f96352q, j17, i18, this.f96353r, i19, i17), false);
        this.f96354s++;
    }

    public final void W6() {
        com.tencent.mm.plugin.collect.ui.CollectPullDownView collectPullDownView = this.f96346h;
        collectPullDownView.scrollTo(0, collectPullDownView.getTopHeight());
    }

    public final void X6() {
        this.f96342d.setVisibility(8);
        this.f96345g.setVisibility(0);
        this.f96347i.setVisibility(0);
    }

    public final void Y6(java.lang.String str) {
        if (this.f96343e.getCount() != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            dp.a.makeText(getContext(), str, 1).show();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "show empty view");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f96347i.setText(str);
        } else if (this.f96351p) {
            this.f96347i.setText(getString(com.tencent.mm.R.string.b9l));
        } else {
            this.f96347i.setText(getString(com.tencent.mm.R.string.b9l) + getString(com.tencent.mm.R.string.b9m));
        }
        X6();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488632z2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f96342d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.c1w);
        this.f96345g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.c1u);
        this.f96347i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c1v);
        this.f96344f = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f488634z4, (android.view.ViewGroup) this.f96342d, false);
        android.view.View view = new android.view.View(this);
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i65.a.b(this, 5)));
        this.f96342d.addHeaderView(view, null, true);
        new android.view.View(this).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i65.a.b(this, 10)));
        this.f96342d.addFooterView(view, null, true);
        this.f96342d.setOverScrollMode(2);
        zw1.d dVar = new zw1.d(this);
        this.f96343e = dVar;
        this.f96342d.setAdapter((android.widget.ListAdapter) dVar);
        this.f96342d.setOnItemClickListener(new zw1.g(this));
        this.f96342d.setOnScrollListener(new zw1.h(this));
        com.tencent.mm.plugin.collect.ui.CollectPullDownView collectPullDownView = (com.tencent.mm.plugin.collect.ui.CollectPullDownView) findViewById(com.tencent.mm.R.id.c1y);
        this.f96346h = collectPullDownView;
        collectPullDownView.setTopViewVisible(false);
        this.f96346h.setIsTopShowAll(false);
        this.f96346h.setBottomViewVisible(true);
        this.f96346h.setIsBottomShowAll(false);
        this.f96346h.setCanOverScrool(true);
        this.f96346h.setAtTopCallBack(new zw1.i(this));
        this.f96346h.setAtBottomCallBack(new zw1.j(this));
        this.f96346h.setOnTopLoadDataListener(new zw1.k(this));
        this.f96346h.setOnBottomLoadDataListener(new zw1.e(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        setMMTitle(com.tencent.mm.R.string.b9n);
        this.f96348m = com.tencent.mm.wallet_core.ui.b2.h(this, false, new zw1.f(this));
        U6();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 4);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        int i27;
        if (!(m1Var instanceof ww1.x1)) {
            return false;
        }
        ww1.x1 x1Var = (ww1.x1) m1Var;
        if (this.f96348m.isShowing()) {
            this.f96348m.dismiss();
        }
        this.f96346h.setLoadDataEnd(true);
        if (i17 != 0 || i18 != 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(x1Var.f450335f);
            int i28 = x1Var.f450336g;
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "net error, errType: %s, errCode: %s, errMsg: %s, chooseFlag: %d, direcFlag: %d", valueOf, valueOf2, str, valueOf3, java.lang.Integer.valueOf(i28));
            if (x1Var.f450335f != 0) {
                this.f96350o = false;
            } else if (i28 == 0) {
                this.f96349n = false;
                W6();
            }
            if (this.f96343e.isEmpty()) {
                X6();
            }
            dp.a.makeText(this, com.tencent.mm.R.string.b9k, 1).show();
            return true;
        }
        int i29 = x1Var.f450335f;
        java.util.List list = this.f96356u;
        java.util.List list2 = x1Var.f450341o;
        boolean z17 = x1Var.f450334e;
        if (i29 != 0) {
            this.f96351p = x1Var.f450333d;
            if (z17) {
                if (!((java.util.ArrayList) list2).isEmpty()) {
                    ((java.util.ArrayList) list).addAll(list2);
                }
                int i37 = x1Var.f450337h;
                if (i37 != 0 || x1Var.f450338i <= 0) {
                    this.f96354s = 0;
                    this.f96355t = x1Var.f450339m;
                    if (i37 == 0) {
                        this.f96351p = false;
                    } else {
                        this.f96351p = true;
                    }
                    if (((java.util.ArrayList) list).size() > 0) {
                        zw1.d dVar = this.f96343e;
                        java.util.ArrayList arrayList = (java.util.ArrayList) dVar.f476600e;
                        arrayList.clear();
                        arrayList.addAll(list);
                        dVar.notifyDataSetChanged();
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "still empty data, show empty view");
                        X6();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(x1Var.f450340n)) {
                            this.f96347i.setText(x1Var.f450340n);
                            this.f96347i.setVisibility(0);
                        }
                        zw1.d dVar2 = this.f96343e;
                        ((java.util.ArrayList) dVar2.f476600e).clear();
                        dVar2.notifyDataSetChanged();
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "continue retry: %d", java.lang.Integer.valueOf(this.f96354s));
                    V6(x1Var.f450338i, x1Var.f450339m, x1Var.f450336g, x1Var.f450335f);
                }
                return true;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
            if (!arrayList2.isEmpty()) {
                zw1.d dVar3 = this.f96343e;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) dVar3.f476600e;
                arrayList3.clear();
                arrayList3.addAll(list2);
                dVar3.notifyDataSetChanged();
                long j17 = ((ww1.n1) arrayList2.get(0)).f450249b;
                this.f96355t = ((ww1.n1) arrayList2.get(arrayList2.size() - 1)).f450249b;
            } else if (x1Var.f450337h != 0 || (i19 = x1Var.f450338i) <= 0) {
                X6();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(x1Var.f450339m));
                V6(x1Var.f450338i, x1Var.f450339m, x1Var.f450336g, x1Var.f450335f);
                ((java.util.ArrayList) list).clear();
            }
            this.f96350o = false;
        } else {
            if (this.f96350o) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "is loading filter, skip!");
                return true;
            }
            if (x1Var.f450336g == 1) {
                java.util.ArrayList arrayList4 = (java.util.ArrayList) list2;
                if (!arrayList4.isEmpty()) {
                    zw1.d dVar4 = this.f96343e;
                    ((java.util.ArrayList) dVar4.f476600e).addAll(0, list2);
                    dVar4.notifyDataSetChanged();
                    long j18 = ((ww1.n1) arrayList4.get(0)).f450249b;
                }
            } else {
                this.f96351p = x1Var.f450333d;
                this.f96342d.setVisibility(0);
                this.f96345g.setVisibility(8);
                if (z17) {
                    java.util.ArrayList arrayList5 = (java.util.ArrayList) list2;
                    if (!arrayList5.isEmpty()) {
                        ((java.util.ArrayList) list).addAll(list2);
                    }
                    if (x1Var.f450337h == 0 && x1Var.f450338i > 0 && arrayList5.isEmpty()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "continue retry: %d", java.lang.Integer.valueOf(this.f96354s));
                        V6(x1Var.f450338i, x1Var.f450339m, x1Var.f450336g, x1Var.f450335f);
                    } else {
                        this.f96354s = 0;
                        if (((java.util.ArrayList) list).size() > 0) {
                            zw1.d dVar5 = this.f96343e;
                            ((java.util.ArrayList) dVar5.f476600e).addAll(list);
                            dVar5.notifyDataSetChanged();
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "retry data is empty");
                            Y6(x1Var.f450340n);
                        }
                        this.f96349n = false;
                        this.f96355t = x1Var.f450339m;
                        W6();
                        this.f96346h.setBottomViewVisible(!this.f96351p);
                    }
                    return true;
                }
                java.util.ArrayList arrayList6 = (java.util.ArrayList) list2;
                if (!arrayList6.isEmpty()) {
                    zw1.d dVar6 = this.f96343e;
                    ((java.util.ArrayList) dVar6.f476600e).addAll(list2);
                    dVar6.notifyDataSetChanged();
                    long j19 = ((ww1.n1) arrayList6.get(arrayList6.size() - 1)).f450249b;
                    this.f96355t = j19;
                    long j27 = x1Var.f450339m;
                    if (j19 > j27) {
                        this.f96355t = j27;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "last record timestamp is less than fromtimestamp, %s, %s", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(x1Var.f450339m));
                    }
                    this.f96349n = false;
                    W6();
                    this.f96346h.setBottomViewVisible(!this.f96351p);
                } else if (x1Var.f450337h != 0 || (i27 = x1Var.f450338i) <= 0) {
                    this.f96349n = false;
                    W6();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "next loading is empty without retry");
                    Y6(x1Var.f450340n);
                    this.f96346h.setBottomViewVisible(!this.f96351p);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(x1Var.f450339m));
                    V6(x1Var.f450338i, x1Var.f450339m, x1Var.f450336g, x1Var.f450335f);
                    ((java.util.ArrayList) list).clear();
                }
            }
        }
        return true;
    }
}
