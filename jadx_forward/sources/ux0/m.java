package ux0;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux0.o f513355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 f513356e;

    public m(ux0.o oVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2) {
        this.f513355d = oVar;
        this.f513356e = interfaceC4037x150215d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ux0.o oVar = this.f513355d;
        if (oVar.f513361g == null) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) oVar.f513372u;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2 = this.f513356e;
        if (arrayList.remove(interfaceC4037x150215d2)) {
            ((ux0.c) interfaceC4037x150215d2).f513318a.close();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureVideoFrameSender", "releaseCapturedFrame: frame not found");
        }
    }
}
