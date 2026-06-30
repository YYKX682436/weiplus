package iy3;

/* loaded from: classes13.dex */
public final class e implements my3.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f377453a;

    public e(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f377453a = rVar;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_GetLicenceInfo", "invoke GetLicenceInfo deviceId:%s json:%s", str, str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_GetLicenceInfo", "invoke GetLicenceInfo deviceId:%s json:%s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str2));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("licence", str2);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f377453a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
