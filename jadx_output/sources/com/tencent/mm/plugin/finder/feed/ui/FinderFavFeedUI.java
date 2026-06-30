package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFavFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFavFeedUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int W6() {
        return 24;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 3;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.pc.class, hy2.f.class});
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 10001 && i18 == -1 && intent != null) {
            java.util.Iterator it = ((com.tencent.mm.plugin.finder.viewmodel.component.pc) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.pc.class)).Y6().iterator();
            while (true) {
                if (!it.hasNext()) {
                    finderHomeTabFragment = null;
                    break;
                }
                finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) it.next();
                if (finderHomeTabFragment.f129265p == 100 && finderHomeTabFragment.isVisible()) {
                    break;
                }
            }
            com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment = finderHomeTabFragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment) finderHomeTabFragment : null;
            if (finderFavFeedFragment != null) {
                com.tencent.mm.plugin.finder.feed.i7 i7Var = finderFavFeedFragment.f129255u;
                if (i7Var == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.a1 a1Var = i7Var.f107157f;
                if (a1Var == null || (recyclerView = a1Var.getRecyclerView()) == null) {
                    return;
                }
                hc2.f1.v(recyclerView, intent, i7Var.f107156e, true, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment activeFragment = ((com.tencent.mm.plugin.finder.viewmodel.component.pc) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.pc.class)).getActiveFragment();
        if (activeFragment.f129265p == 100) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment = activeFragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment) activeFragment : null;
            com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader G0 = finderFavFeedFragment != null ? finderFavFeedFragment.G0() : null;
            if (G0 != null) {
                intent.putExtra("INNER_ITEM_COUNT", G0.f107411g);
            }
        }
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.q1(this));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFavFeedUI)).Rj(this, iy1.a.Finder);
    }
}
