package a24;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI f894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f895e;

    public o(com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        this.f894d = baseSettingPrefUI;
        this.f895e = mvvmList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI = this.f894d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) baseSettingPrefUI.findViewById(com.tencent.mm.R.id.lqa);
        if (wxRecyclerView == null || (viewTreeObserver = wxRecyclerView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a24.n(baseSettingPrefUI, this.f895e));
    }
}
