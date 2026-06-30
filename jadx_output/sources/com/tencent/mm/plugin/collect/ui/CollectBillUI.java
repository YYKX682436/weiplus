package com.tencent.mm.plugin.collect.ui;

/* loaded from: classes9.dex */
public class CollectBillUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    public long A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f96357d;

    /* renamed from: e, reason: collision with root package name */
    public zw1.b f96358e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f96359f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f96360g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.collect.ui.CollectBillHeaderView f96361h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f96362i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f96363m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f96364n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f96365o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f96366p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s6 f96367q;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f96372v;

    /* renamed from: w, reason: collision with root package name */
    public int f96373w;

    /* renamed from: x, reason: collision with root package name */
    public int f96374x;

    /* renamed from: y, reason: collision with root package name */
    public long f96375y;

    /* renamed from: r, reason: collision with root package name */
    public boolean f96368r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f96369s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f96370t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f96371u = true;

    /* renamed from: z, reason: collision with root package name */
    public final int f96376z = 20;
    public final com.tencent.mm.modelbase.u0 B = new zw1.m(this);
    public final db5.t4 C = new zw1.s(this);

    public final void U6() {
        this.f96357d.setVisibility(8);
        this.f96360g.setVisibility(0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.c1m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void V6(int i17, int i18, long j17) {
        if (this.f96371u) {
            com.tencent.mm.plugin.collect.ui.CollectBillHeaderView collectBillHeaderView = this.f96361h;
            collectBillHeaderView.f96339d.setText(ww1.d0.a(collectBillHeaderView.getContext(), j17, this.f96373w));
            collectBillHeaderView.f96340e.setText(ww1.d0.b(i18));
            collectBillHeaderView.f96341f.setText(collectBillHeaderView.getContext().getString(com.tencent.mm.R.string.b9s, java.lang.Integer.valueOf(i17)));
            this.f96371u = false;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488628yy;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f96357d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.c1z);
        this.f96360g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.c1l);
        this.f96366p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c1i);
        this.f96359f = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f488635z5, (android.view.ViewGroup) this.f96357d, false);
        com.tencent.mm.plugin.collect.ui.CollectBillHeaderView collectBillHeaderView = new com.tencent.mm.plugin.collect.ui.CollectBillHeaderView(this);
        this.f96361h = collectBillHeaderView;
        this.f96357d.addHeaderView(collectBillHeaderView, null, false);
        zw1.b bVar = new zw1.b(this);
        this.f96358e = bVar;
        this.f96357d.setAdapter((android.widget.ListAdapter) bVar);
        this.f96357d.setOnScrollListener(new zw1.n(this));
        this.f96367q = new com.tencent.mm.ui.tools.s6(this);
        this.f96357d.setOnItemClickListener(new zw1.o(this));
        this.f96357d.setOnItemLongClickListener(new zw1.p(this));
        if (this.f96374x != 2) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.b9n), new zw1.q(this));
        }
        if (this.f96374x == 2) {
            android.view.View findViewById = this.f96361h.findViewById(com.tencent.mm.R.id.c57);
            android.view.View findViewById2 = this.f96360g.findViewById(com.tencent.mm.R.id.f483824c56);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f96362i = (android.widget.ImageView) this.f96361h.findViewById(com.tencent.mm.R.id.f483822c54);
        this.f96363m = (com.tencent.mm.ui.widget.MMSwitchBtn) this.f96361h.findViewById(com.tencent.mm.R.id.f483823c55);
        this.f96364n = (android.widget.ImageView) this.f96360g.findViewById(com.tencent.mm.R.id.f483822c54);
        this.f96365o = (com.tencent.mm.ui.widget.MMSwitchBtn) this.f96360g.findViewById(com.tencent.mm.R.id.f483823c55);
        if (tw1.f.Di().Ri()) {
            this.f96363m.setCheck(true);
            this.f96365o.setCheck(true);
            this.f96362i.setImageResource(com.tencent.mm.R.raw.collect_sound_on);
            this.f96364n.setImageResource(com.tencent.mm.R.raw.collect_sound_on);
        } else {
            this.f96363m.setCheck(false);
            this.f96365o.setCheck(false);
            this.f96362i.setImageResource(com.tencent.mm.R.raw.collect_sound_off);
            this.f96364n.setImageResource(com.tencent.mm.R.raw.collect_sound_off);
        }
        zw1.r rVar = new zw1.r(this);
        this.f96363m.setSwitchListener(rVar);
        this.f96365o.setSwitchListener(rVar);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.A = c01.z1.j();
        this.f96374x = getIntent().getIntExtra("key_from_scene", 0);
        this.f96373w = getIntent().getIntExtra("key_type", 0);
        this.f96375y = getIntent().getLongExtra("key_timestamp", java.lang.System.currentTimeMillis() / 1000);
        if (!this.f96370t) {
            doSceneForceProgress(new ww1.y1(this.f96373w, this.f96375y, this.f96372v, this.f96376z));
            this.f96369s = true;
        }
        initView();
        setMMTitle(com.tencent.mm.R.string.b9r);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1256, this.B);
        ww1.p1 p1Var = new ww1.p1();
        gm0.j1.i();
        gm0.j1.n().f273288b.g(p1Var);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, com.tencent.mm.R.string.b9o);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1256, this.B);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ww1.y1)) {
            if (m1Var instanceof ww1.w1) {
                ww1.w1 w1Var = (ww1.w1) m1Var;
                if (i17 == 0 && i18 == 0) {
                    zw1.b bVar = this.f96358e;
                    java.lang.String str2 = w1Var.f450323f;
                    java.util.ArrayList arrayList = (java.util.ArrayList) bVar.f476581e;
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ww1.g gVar = (ww1.g) it.next();
                        if (gVar.f450187a.equals(str2)) {
                            arrayList.remove(gVar);
                            bVar.notifyDataSetChanged();
                            break;
                        }
                    }
                    if (this.f96358e.getCount() <= 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "delete all records");
                        U6();
                    } else {
                        V6(w1Var.f450321d, w1Var.f450322e, this.f96375y);
                    }
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "net error, errType: %s, errCode: %s, errMsg: %s, billId: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, w1Var.f450323f);
                dp.a.makeText(this, com.tencent.mm.R.string.b9j, 1).show();
            }
            return false;
        }
        ww1.y1 y1Var = (ww1.y1) m1Var;
        if (this.f96368r) {
            this.f96357d.removeFooterView(this.f96359f);
            this.f96368r = false;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "net error!");
            this.f96369s = false;
            dp.a.makeText(this, com.tencent.mm.R.string.b9k, 1).show();
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96372v)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "first query failed, finish activity!");
            }
            return true;
        }
        this.f96370t = y1Var.f450366m;
        this.f96373w = y1Var.f450363g;
        long j17 = y1Var.f450362f;
        this.f96375y = j17;
        V6(y1Var.f450360d, y1Var.f450361e, j17);
        java.util.List list = y1Var.f450364h;
        if (((java.util.ArrayList) list).isEmpty()) {
            this.f96370t = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96372v)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "no record, show empty view");
                U6();
            }
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96372v)) {
                this.f96357d.setVisibility(0);
                this.f96360g.setVisibility(8);
            }
            zw1.b bVar2 = this.f96358e;
            ((java.util.ArrayList) bVar2.f476581e).addAll(list);
            bVar2.notifyDataSetChanged();
            this.f96372v = ((ww1.g) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).f450187a;
        }
        this.f96369s = false;
        return true;
    }
}
