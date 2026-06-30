package com.tencent.mm.plugin.account.friend.ui;

/* loaded from: classes8.dex */
public class RecommendFriendUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f73161p = 0;

    /* renamed from: e, reason: collision with root package name */
    public s61.c0 f73163e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f73164f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f73165g;

    /* renamed from: n, reason: collision with root package name */
    public boolean f73169n;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f73162d = null;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f73166h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f73167i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f73168m = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f73170o = false;

    public final void T6() {
        iz5.a.g("dealGetInviteFriendGroupSuccess just only qq", this.f73168m == 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendGroupSuccess  respList.size:" + this.f73167i.size());
        s61.c0 c0Var = this.f73163e;
        c0Var.f403333f = this.f73167i;
        this.f73164f.setAdapter((android.widget.ListAdapter) c0Var);
        showOptionMenu(false);
        this.f73169n = true;
        setMMTitle(com.tencent.mm.R.string.irk);
        s61.c0 c0Var2 = this.f73163e;
        c0Var2.f403334g = this.f73169n;
        c0Var2.notifyDataSetChanged();
    }

    public final void U6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendSuccess  respList.size:" + this.f73166h.size());
        s61.c0 c0Var = this.f73163e;
        java.util.LinkedList linkedList = this.f73166h;
        if (i17 < 0) {
            c0Var.f403332e = linkedList;
        } else {
            c0Var.getClass();
            c0Var.f403332e = new java.util.LinkedList();
            for (int i18 = 0; i18 < linkedList.size(); i18++) {
                if (i17 == ((r45.ku4) linkedList.get(i18)).f378964m) {
                    c0Var.f403332e.add((r45.ku4) linkedList.get(i18));
                }
            }
        }
        c0Var.f403335h = new boolean[c0Var.f403332e.size()];
        this.f73164f.setAdapter((android.widget.ListAdapter) this.f73163e);
        this.f73169n = false;
        if (this.f73168m == 0) {
            java.lang.String str = "";
            for (int i19 = 0; i19 < this.f73167i.size(); i19++) {
                if (i17 == ((r45.e53) this.f73167i.get(i19)).f373019d) {
                    str = ((r45.e53) this.f73167i.get(i19)).f373020e;
                }
            }
            setMMTitle(str);
        }
        s61.c0 c0Var2 = this.f73163e;
        c0Var2.f403334g = this.f73169n;
        c0Var2.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73165g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfx);
        int i17 = this.f73168m;
        if (i17 == 1) {
            setMMTitle(com.tencent.mm.R.string.ix9);
            this.f73165g.setText(com.tencent.mm.R.string.ixc);
        } else if (i17 == 2) {
            setMMTitle(com.tencent.mm.R.string.ix8);
            this.f73165g.setText(com.tencent.mm.R.string.ixb);
        } else {
            setMMTitle(com.tencent.mm.R.string.irk);
            this.f73165g.setText(com.tencent.mm.R.string.ixd);
        }
        this.f73163e = new s61.c0(getLayoutInflater());
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.hfc);
        this.f73164f = listView;
        listView.setOnItemClickListener(new s61.l0(this));
        this.f73164f.setAdapter((android.widget.ListAdapter) this.f73163e);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.g27), new s61.o0(this));
        showOptionMenu(false);
        this.f73170o = true;
        r61.g1 g1Var = new r61.g1(this.f73168m);
        gm0.j1.d().g(g1Var);
        this.f73162d = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.g2_), true, true, new s61.r0(this, g1Var));
        setBackBtn(new s61.p0(this));
        setToTop(new s61.q0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73168m = com.tencent.mm.sdk.platformtools.t8.P(getIntent().getStringExtra("recommend_type"), 0);
        this.f73169n = false;
        gm0.j1.d().a(135, this);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(135, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (this.f73168m != 0) {
            finish();
            return true;
        }
        if (this.f73169n || this.f73170o) {
            finish();
            return true;
        }
        T6();
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendFriendUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f73162d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f73162d = null;
        }
        if (i17 != 0 || i18 != 0 || m1Var.getType() != 135) {
            this.f73165g.setVisibility(0);
            this.f73164f.setVisibility(8);
            return;
        }
        r45.hu4 hu4Var = (r45.hu4) ((r61.g1) m1Var).f392872d.f70711b.f70700a;
        java.util.LinkedList linkedList = hu4Var.f376449e;
        this.f73166h = linkedList;
        this.f73167i = hu4Var.f376451g;
        this.f73170o = false;
        if (linkedList.size() <= 0) {
            this.f73165g.setVisibility(0);
            this.f73164f.setVisibility(8);
        } else if (this.f73168m == 0 && this.f73167i.size() <= 0) {
            this.f73165g.setVisibility(0);
            this.f73164f.setVisibility(8);
        } else if (this.f73168m != 0) {
            U6(-1);
        } else {
            T6();
        }
    }
}
