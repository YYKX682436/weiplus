package gq1;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f356041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gq1.o f356042e;

    public l(gq1.o oVar, java.util.UUID uuid) {
        this.f356042e = oVar;
        this.f356041d = uuid;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        gq1.o oVar = this.f356042e;
        oVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.IBeaconServer", "stopRanging");
        java.util.UUID uuid = this.f356041d;
        if (uuid == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
            z17 = false;
        } else {
            oVar.f356055f.remove(uuid);
            oVar.e();
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "stopRanging failed!!!");
    }
}
