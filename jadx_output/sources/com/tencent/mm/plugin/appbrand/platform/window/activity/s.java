package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class s extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.w f87657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.appbrand.platform.window.activity.w wVar, android.os.Handler handler) {
        super(handler);
        this.f87657a = wVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        com.tencent.mm.plugin.appbrand.platform.window.activity.w wVar;
        super.onChange(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: lock orientation settings changed! request now");
        synchronized (this) {
            try {
                com.tencent.mm.plugin.appbrand.platform.window.activity.w wVar2 = this.f87657a;
                if (wVar2.f87674g == null || wVar2.f87672e.get() == null) {
                    this.f87657a.f87670c = null;
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: need change");
                com.tencent.mm.plugin.appbrand.platform.window.activity.w wVar3 = this.f87657a;
                xi1.o oVar = wVar3.f87674g;
                wVar3.getClass();
                xi1.o oVar2 = xi1.o.UNSPECIFIED;
                if (oVar != oVar2) {
                    oVar2 = xi1.o.LANDSCAPE_SENSOR;
                    if (!oVar.a(oVar2)) {
                        oVar2 = xi1.o.PORTRAIT;
                    } else if (com.tencent.mm.plugin.appbrand.platform.window.activity.w.f()) {
                        oVar2 = xi1.o.LANDSCAPE_LOCKED;
                    }
                }
                wVar.b(oVar2, null);
            } finally {
                this.f87657a.f87670c = null;
            }
        }
    }
}
