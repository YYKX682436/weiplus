package a24;

/* loaded from: classes.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI f900f;

    public r(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, int i17, com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI) {
        this.f898d = wxRecyclerView;
        this.f899e = i17;
        this.f900f = baseSettingPrefUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f898d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            android.view.View childAt = wxRecyclerView.getChildAt(0);
            int height = childAt != null ? wxRecyclerView.getHeight() - childAt.getHeight() : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height / 2));
            arrayList.add(java.lang.Integer.valueOf(this.f899e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingPrefUI$scrollToHighlightItem$1$onGlobalLayout$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingPrefUI$scrollToHighlightItem$1$onGlobalLayout$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        wxRecyclerView.post(new a24.q(this.f900f));
    }
}
