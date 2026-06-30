package cl1;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f124397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f124398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 f124399f;

    public f(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 c12765x7ca3e730) {
        this.f124397d = i17;
        this.f124398e = i18;
        this.f124399f = c12765x7ca3e730;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainerView", "notifyCloseHeader " + this.f124397d + ' ' + this.f124398e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 c12765x7ca3e730 = this.f124399f;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb) c12765x7ca3e730.f172606f).l1(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainerView", "hideDesktopViewDirectly");
        c12765x7ca3e730.contentView.setVisibility(8);
        c12765x7ca3e730.f172605e.setVisibility(8);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb) c12765x7ca3e730.f172606f).l1(false);
    }
}
