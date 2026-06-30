package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(50)
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveConcertUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Landroid/view/View;", "root", "Ljz5/f0;", "adjustStatusbarPadding", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes.dex */
public final class FinderLiveConcertUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public final void adjustStatusbarPadding(android.view.View view) {
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + com.tencent.mm.ui.bl.h(view.getContext()), view.getPaddingRight(), view.getPaddingBottom() + com.tencent.mm.ui.bl.c(view.getContext()));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
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
        adjustStatusbarPadding(findViewById(com.tencent.mm.R.id.evr));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.finder.feed.af.class);
    }
}
