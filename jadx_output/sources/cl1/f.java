package cl1;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f42864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView f42866f;

    public f(int i17, int i18, com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView) {
        this.f42864d = i17;
        this.f42865e = i18;
        this.f42866f = appBrandDesktopContainerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainerView", "notifyCloseHeader " + this.f42864d + ' ' + this.f42865e);
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView appBrandDesktopContainerView = this.f42866f;
        ((com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView) appBrandDesktopContainerView.f91073f).l1(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainerView", "hideDesktopViewDirectly");
        appBrandDesktopContainerView.contentView.setVisibility(8);
        appBrandDesktopContainerView.f91072e.setVisibility(8);
        ((com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView) appBrandDesktopContainerView.f91073f).l1(false);
    }
}
