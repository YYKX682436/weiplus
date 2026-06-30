package u91;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u91.d f507351d;

    public c(u91.d dVar) {
        this.f507351d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar;
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectGame.AppBrandServiceDirectGameComponentView", "destroy view containers");
        u91.d dVar = this.f507351d;
        iaVar = dVar.f507353r;
        if (iaVar != null) {
            iaVar.h();
        }
        dVar.f507353r = null;
        viewGroup = dVar.f507354s;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        dVar.f507354s = null;
    }
}
