package cl1;

/* loaded from: classes8.dex */
public class p extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView f42891c;

    public p(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView) {
        this.f42891c = appBrandDesktopView;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = this.f42891c;
        int itemViewType = appBrandDesktopView.getAdapter().getItemViewType(i17);
        if (itemViewType == 3 || itemViewType == 4 || itemViewType == 6) {
            return appBrandDesktopView.f91081e2;
        }
        return 1;
    }
}
