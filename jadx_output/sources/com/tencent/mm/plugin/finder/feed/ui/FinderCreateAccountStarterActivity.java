package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderCreateAccountStarterActivity;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderCreateAccountStarterActivity extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbc;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.i8.class, com.tencent.mm.plugin.finder.viewmodel.component.j8.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (com.tencent.mm.ui.bk.C()) {
            setTheme(com.tencent.mm.R.style.f494380li);
        } else {
            setTheme(com.tencent.mm.R.style.f494381lj);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
