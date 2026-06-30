package com.tencent.mm.plugin.brandservice.ui;

/* loaded from: classes12.dex */
public class SearchOrRecommendBizUI extends com.tencent.mm.ui.MMActivity implements or1.q {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f94043d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f94044e = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper f94045f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer f94046g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2r;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.bke);
        setBackBtn(new or1.h2(this));
        com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper = (com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper) findViewById(com.tencent.mm.R.id.mfo);
        this.f94045f = searchViewNotRealTimeHelper;
        searchViewNotRealTimeHelper.setSearchColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f94045f.setSearchHint(getString(com.tencent.mm.R.string.bke));
        this.f94045f.setSearchHintColor(getResources().getColor(com.tencent.mm.R.color.f479231tj));
        this.f94045f.setSearchIcon(0);
        this.f94045f.setShowBackIcon(false);
        this.f94045f.setCallBack(new or1.j2(this));
        com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer bizSearchResultItemContainer = (com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer) findViewById(com.tencent.mm.R.id.md_);
        this.f94046g = bizSearchResultItemContainer;
        bizSearchResultItemContainer.setOnTouchListener(new or1.i2(this));
        or1.d2 d2Var = new or1.d2(this);
        d2Var.f347473t = lr1.f0.H();
        this.f94046g.setAdapter(d2Var);
        this.f94046g.setBusinessTypes(1);
        com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer bizSearchResultItemContainer2 = this.f94046g;
        or1.m mVar = bizSearchResultItemContainer2.f93982e;
        mVar.f347533p = false;
        mVar.f347532o = false;
        bizSearchResultItemContainer2.setMode(1);
        this.f94046g.setScene(this.f94044e);
        this.f94046g.setIOnSearchStateChangedListener(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("intent_extra_entry_flag", 0);
        this.f94044e = getIntent().getIntExtra("fromScene", 0);
        initView();
        if (java.lang.System.currentTimeMillis() - lr1.f0.f320659f > 3600000) {
            gm0.j1.d().a(456, new or1.f2(this));
            gm0.j1.d().g(new lr1.f0());
        }
        java.lang.String stringExtra = getIntent().getStringExtra("Search_Str");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new or1.g2(this, stringExtra));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((java.util.ArrayList) r01.q3.pj().f368275a).clear();
    }
}
