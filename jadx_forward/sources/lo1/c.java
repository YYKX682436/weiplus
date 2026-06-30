package lo1;

/* loaded from: classes5.dex */
public final class c implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401628a;

    public c(java.lang.String str) {
        this.f401628a = str;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j1
    /* renamed from: complete */
    public final void mo53948xdc453139(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on connectInfo gotten, deviceId=");
        java.lang.String deviceId = this.f401628a;
        sb6.append(deviceId);
        sb6.append(", ret=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.AppBrandJsApiRoamApiHandler", sb6.toString());
        lo1.i iVar = lo1.i.f401635a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(deviceId, "$deviceId");
        iVar.b(deviceId, i17 == 0);
    }
}
