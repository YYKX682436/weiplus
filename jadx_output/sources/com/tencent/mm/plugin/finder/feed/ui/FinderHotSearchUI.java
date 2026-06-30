package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderHotSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickCancelBtn", "onClickBackBtn", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderHotSearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements tj5.w {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f109298v = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f109299t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.b4 f109300u;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 125;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109545t() {
        return "FinderHotSearchUI";
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b5f;
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        hideVKB();
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public void onClickCancelBtn(android.view.View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f5, code lost:
    
        if (r2 != false) goto L22;
     */
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f109299t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.post(new com.tencent.mm.plugin.finder.feed.ui.t5(this));
        com.tencent.mm.plugin.finder.search.b4 b4Var = this.f109300u;
        if (b4Var != null) {
            b4Var.c();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }
}
