package a24;

/* loaded from: classes.dex */
public final class s implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI f904g;

    public s(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.lang.String str, com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI) {
        this.f901d = wxRecyclerView;
        this.f902e = mvvmList;
        this.f903f = str;
        this.f904g = baseSettingPrefUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        a24.i iVar;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f901d;
        android.view.ViewTreeObserver viewTreeObserver = wxRecyclerView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f902e;
        java.util.ArrayList<xm3.d> arrayList = mvvmList != null ? mvvmList.f152065o : null;
        if (arrayList != null) {
            i17 = 0;
            for (xm3.d dVar : arrayList) {
                c24.f fVar = dVar instanceof c24.f ? (c24.f) dVar : null;
                if (kotlin.jvm.internal.o.b((fVar == null || (iVar = fVar.f38077e) == null) ? null : iVar.a7(), this.f903f)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        i17 = -1;
        if (i17 == -1) {
            return;
        }
        wxRecyclerView.post(new a24.r(wxRecyclerView, i17, this.f904g));
    }
}
