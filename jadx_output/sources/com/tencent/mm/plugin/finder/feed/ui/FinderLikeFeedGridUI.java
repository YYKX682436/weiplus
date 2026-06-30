package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLikeFeedGridUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLikeFeedGridUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int W6() {
        return 35;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 3;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.pn.class, hy2.f.class});
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment activeFragment = ((com.tencent.mm.plugin.finder.viewmodel.component.pn) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.pn.class)).getActiveFragment();
        if (activeFragment.f129265p == 102) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment = activeFragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment) activeFragment : null;
            com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader G0 = finderLikeFeedGridFragment != null ? finderLikeFeedGridFragment.G0() : null;
            if (G0 != null) {
                intent.putExtra("INNER_ITEM_COUNT", G0.f107473e);
            }
        }
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.w6(this));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderLikeFeedGridUI)).Rj(this, iy1.a.Finder);
    }
}
