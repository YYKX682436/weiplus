package com.tencent.mm.plugin.brandservice.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class BrandServiceLocalSearchUI extends com.tencent.mm.ui.MMActivity implements y90.j, pr1.j {

    /* renamed from: d, reason: collision with root package name */
    public y90.k f94003d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f94004e;

    @Override // y90.j
    public void G2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceLocalSearchUI", "search biz, key word : %s", str);
        this.f94004e.a(str);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488247o1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = (com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView) findViewById(com.tencent.mm.R.id.ndr);
        this.f94004e = brandServiceSortView;
        brandServiceSortView.setMode(1);
        this.f94004e.setReturnResult(getIntent().getBooleanExtra("is_return_result", false));
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView2 = this.f94004e;
        brandServiceSortView2.f197872p = false;
        fb5.m mVar = brandServiceSortView2.f197866g;
        mVar.c(mVar.f260894d);
        this.f94004e.d(false);
        this.f94004e.setShowFooterView(false);
        this.f94004e.setITransferToChildOnTouchListener(this);
        this.f94004e.setServiceType(getIntent().getIntExtra("intent_service_type", 251658241));
        ((x90.q) ((y90.l) i95.n0.c(y90.l.class))).getClass();
        a31.v vVar = new a31.v();
        this.f94003d = vVar;
        vVar.c(true);
        a31.v vVar2 = (a31.v) this.f94003d;
        vVar2.f999u = this;
        vVar2.f210324i = this;
        vVar2.f996r = false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        hideVKB();
        return true;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.a07));
        initView();
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        gm0.j1.d().g(new f21.g0(18));
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        ((com.tencent.mm.ui.tools.c9) this.f94003d).j(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f94004e.j();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((a31.v) this.f94003d).s();
        ((com.tencent.mm.ui.tools.c9) this.f94003d).a();
    }

    @Override // com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        ((a31.v) this.f94003d).m(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
