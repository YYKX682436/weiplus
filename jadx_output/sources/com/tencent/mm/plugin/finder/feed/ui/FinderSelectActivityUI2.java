package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSelectActivityUI2;", "Lcom/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSelectActivityUI2 extends com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI {
    public com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader E;
    public r45.ip2 G;
    public final java.lang.String C = "Finder.FinderActivitySearchUI";
    public final ot2.f D = new ot2.f();
    public java.lang.String F = "";

    @Override // com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI
    public pt2.o c7() {
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = this.E;
        if (finderActivitySearchLoader != null) {
            return finderActivitySearchLoader;
        }
        kotlin.jvm.internal.o.o("feedloader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI
    public pt2.p g7() {
        return this.D;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.adv;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setResult(-1, intent);
        if (i18 != -1 || isFinishing()) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("vst_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.F = stringExtra;
        int intExtra = getIntent().getIntExtra("KEY_FINDER_AD_POST_ENTER_SOURCE", 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_FINDER_AD_POST_BY_PASS");
        if (intExtra != 0) {
            r45.ip2 ip2Var = new r45.ip2();
            ip2Var.set(0, java.lang.Integer.valueOf(intExtra));
            ip2Var.set(1, stringExtra2);
            this.G = ip2Var;
        }
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = new com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader();
        finderActivitySearchLoader.f125679g = this.G;
        finderActivitySearchLoader.f125678f = new com.tencent.mm.plugin.finder.feed.ui.bk(this, finderActivitySearchLoader);
        this.E = finderActivitySearchLoader;
        super.onCreate(bundle);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f125913w;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.feed.ui.ck(this);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
