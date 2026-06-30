package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(2336)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveShoppingManagerUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public final class FinderLiveShoppingManagerUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f109415v = kotlinx.coroutines.z0.b();

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingManagerUI", "onBackPressed");
        vt2.g gVar = ((zt2.a) pf5.z.f353948a.a(this).a(zt2.a.class)).f475574d;
        if (gVar != null) {
            gVar.b(2);
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        this.mController.G0(getResources().getColor(com.tencent.mm.R.color.f478553an));
        this.mController.E0(getResources().getColor(com.tencent.mm.R.color.f478553an));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kotlinx.coroutines.z0.e(this.f109415v, null, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingManagerUI", "onSwipeBack");
        vt2.g gVar = ((zt2.a) pf5.z.f353948a.a(this).a(zt2.a.class)).f475574d;
        if (gVar != null) {
            gVar.b(1);
        }
        super.onSwipeBack();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(zt2.a.class);
    }
}
