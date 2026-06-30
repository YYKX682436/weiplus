package bb2;

/* loaded from: classes10.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18883d;

    public h2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView) {
        this.f18883d = megaVideoBulletNativeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18883d;
        megaVideoBulletNativeView.getBulletManager().getClass();
        if (xp.d.f().f455862s) {
            com.tencent.mars.xlog.Log.i("MegaVideoBulletNativeView", "scheduleRowExtendAutoHide: hiding row extend");
            megaVideoBulletNativeView.getBulletManager().getClass();
            xp.d.f().f455862s = false;
        }
        megaVideoBulletNativeView.f102809q = null;
    }
}
