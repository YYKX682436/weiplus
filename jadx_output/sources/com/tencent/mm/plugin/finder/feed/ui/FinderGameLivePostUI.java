package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLivePostUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public final class FinderGameLivePostUI extends com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI {
    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.live.viewmodel.u.class, com.tencent.mm.plugin.finder.live.viewmodel.n.class, d92.b1.class, com.tencent.mm.plugin.finder.live.viewmodel.k2.class, com.tencent.mm.plugin.finder.live.viewmodel.s5.class, com.tencent.mm.plugin.finder.live.viewmodel.n1.class, com.tencent.mm.plugin.finder.live.viewmodel.x.class, com.tencent.mm.plugin.finder.live.viewmodel.v.class, com.tencent.mm.plugin.finder.live.viewmodel.w.class, com.tencent.mm.plugin.finder.live.viewmodel.v4.class, com.tencent.mm.plugin.finder.live.viewmodel.g4.class, com.tencent.mm.plugin.finder.live.viewmodel.a6.class});
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI, com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        com.tencent.mm.plugin.finder.assist.b3.f102022a.a(findViewById(com.tencent.mm.R.id.f484763fg3));
        ((com.tencent.mm.plugin.finder.live.viewmodel.v4) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.v4.class)).f117474f.observe(this, new com.tencent.mm.plugin.finder.feed.ui.r4(this));
    }
}
