package a24;

/* loaded from: classes.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI f892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f893e;

    public n(com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        this.f892d = baseSettingPrefUI;
        this.f893e = mvvmList;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewTreeObserver viewTreeObserver2;
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI = this.f892d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) baseSettingPrefUI.findViewById(com.tencent.mm.R.id.lqa);
        if (wxRecyclerView != null && (viewTreeObserver2 = wxRecyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
        java.lang.String str = baseSettingPrefUI.f161839f;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) baseSettingPrefUI.findViewById(com.tencent.mm.R.id.lqa);
        if (wxRecyclerView2 == null || (viewTreeObserver = wxRecyclerView2.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a24.s(wxRecyclerView2, this.f893e, str, baseSettingPrefUI));
    }
}
