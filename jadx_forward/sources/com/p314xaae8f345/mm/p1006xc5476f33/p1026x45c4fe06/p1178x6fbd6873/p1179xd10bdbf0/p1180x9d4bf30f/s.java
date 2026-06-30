package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public class s extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w f169190a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w wVar, android.os.Handler handler) {
        super(handler);
        this.f169190a = wVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w wVar;
        super.onChange(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: lock orientation settings changed! request now");
        synchronized (this) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w wVar2 = this.f169190a;
                if (wVar2.f169207g == null || wVar2.f169205e.get() == null) {
                    this.f169190a.f169203c = null;
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: need change");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w wVar3 = this.f169190a;
                xi1.o oVar = wVar3.f169207g;
                wVar3.getClass();
                xi1.o oVar2 = xi1.o.UNSPECIFIED;
                if (oVar != oVar2) {
                    oVar2 = xi1.o.LANDSCAPE_SENSOR;
                    if (!oVar.a(oVar2)) {
                        oVar2 = xi1.o.PORTRAIT;
                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w.f()) {
                        oVar2 = xi1.o.LANDSCAPE_LOCKED;
                    }
                }
                wVar.b(oVar2, null);
            } finally {
                this.f169190a.f169203c = null;
            }
        }
    }
}
