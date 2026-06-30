package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class ChooseMsgFileListUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.choosemsgfile.ui.f0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f95566q = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f95567d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95568e;

    /* renamed from: f, reason: collision with root package name */
    public int f95569f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f95570g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.choosemsgfile.logic.ui.l f95571h;

    /* renamed from: i, reason: collision with root package name */
    public final xv1.b f95572i = new xv1.b();

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f95573m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f95574n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f95575o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f95576p;

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public void A(boolean z17, int i17) {
        T6(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUI", "[onDataLoaded] isFirst:%s addCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            this.f95573m.setVisibility(0);
            this.f95574n.setVisibility(8);
            this.f95573m.setText(getString(com.tencent.mm.R.string.b7a));
        } else {
            this.f95573m.setVisibility(8);
            this.f95574n.setVisibility(0);
            this.f95574n.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public void P(boolean z17) {
        T6(true);
    }

    public final void T6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f95576p = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), true, 0, null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f95576p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f95576p.dismiss();
        this.f95576p = null;
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public xv1.b f6() {
        return this.f95572i;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public android.view.View getChildAt(int i17) {
        return this.f95574n.getChildAt(i17);
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488608yi;
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public java.lang.String getUserName() {
        return this.f95567d;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f95573m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kfa);
        this.f95574n = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.e2d);
        this.f95575o = (android.widget.Button) findViewById(com.tencent.mm.R.id.nsj);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
        java.lang.String stringExtra = getIntent().getStringExtra("USERNAME");
        this.f95567d = stringExtra;
        this.f95568e = xv1.d.f(stringExtra);
        this.f95569f = getIntent().getIntExtra("COUNT", 9);
        this.f95570g = getIntent().getStringExtra("EXTENSION");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUI", "onCreate mCount:%d mExtension:%s", java.lang.Integer.valueOf(this.f95569f), this.f95570g);
        this.f95571h = new com.tencent.mm.plugin.choosemsgfile.logic.ui.l(this);
        initView();
        findViewById(com.tencent.mm.R.id.ch8).setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478829ie));
        this.f95574n.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478829ie));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f95574n;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar = this.f95571h;
        if (lVar.f95546f == null) {
            lVar.f95546f = new androidx.recyclerview.widget.LinearLayoutManager(this);
        }
        recyclerView.setLayoutManager(lVar.f95546f);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f95574n;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar2 = this.f95571h;
        lVar2.getClass();
        recyclerView2.N(new com.tencent.mm.plugin.choosemsgfile.logic.ui.k(lVar2));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f95574n;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar3 = this.f95571h;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.d dVar = new com.tencent.mm.plugin.choosemsgfile.logic.ui.d(lVar3.f95528b, lVar3.f95545e);
        lVar3.f95544d = dVar;
        dVar.f95526g = new com.tencent.mm.plugin.choosemsgfile.logic.ui.h(lVar3);
        recyclerView3.setAdapter(dVar);
        this.f95574n.setHasFixedSize(true);
        setMMTitle(this.f95568e);
        setBackBtn(new com.tencent.mm.plugin.choosemsgfile.ui.a(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.choosemsgfile.ui.b(this));
        this.f95575o.setOnClickListener(new com.tencent.mm.plugin.choosemsgfile.ui.d(this));
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar4 = this.f95571h;
        java.lang.String str = this.f95570g;
        lVar4.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChooseMsgFileUIController", "onCreate type:%s extension:%s", "file", str);
        lVar4.b(true, "file", str);
        o25.n1.c(this);
        this.f95572i.b(this.f95569f);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f95571h.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChooseMsgFileUIController", "onDestroy");
        xv1.b bVar = this.f95572i;
        synchronized (bVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileHelper", "uninit");
            ((java.util.concurrent.ConcurrentHashMap) bVar.f457388b).clear();
            bVar.f457388b = null;
            ((java.util.HashSet) bVar.f457390d).clear();
            bVar.f457390d = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f95571h.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChooseMsgFileUIController", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f95571h.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChooseMsgFileUIController", "onResume");
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.ui.f0
    public void v2() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.choosemsgfile.ui.e(this));
    }
}
