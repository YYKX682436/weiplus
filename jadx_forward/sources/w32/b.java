package w32;

/* loaded from: classes13.dex */
public class b extends w32.a implements w32.d {

    /* renamed from: d, reason: collision with root package name */
    public final w32.d f524203d;

    public b(i32.d dVar, w32.d dVar2) {
        super(dVar, dVar2);
        this.f524201b = this;
        this.f524203d = dVar2;
    }

    @Override // w32.d
    public void a(long j17, int i17, int i18, java.lang.String str) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "onTaskSceneEnd, SwitchViewPush taskId = %d, errType = %d, errCode = %d, errMsg = %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        i32.d dVar = this.f524200a;
        o32.n nVar = (o32.n) ((i32.i) dVar).f369655d;
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "null = pushReq");
            i19 = -1;
        } else {
            i19 = nVar.f424254e;
        }
        if (2 == i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Switch view push has been sended to device, now try to check close strategy");
            v32.b b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().b1(dVar.f369652a + "");
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "get hdinfo by mac failed!!!, Mac = %d", java.lang.Long.valueOf(dVar.f369652a));
                w32.d dVar2 = this.f524203d;
                if (dVar2 != null) {
                    dVar2.a(j17, i17, i18, str);
                    return;
                }
                return;
            }
            int i27 = b17.f66603x2e78a306;
            if (i27 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, stop channel(device id = %d)", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(dVar.f369652a));
                if (u32.h1.c().f180539a != null) {
                    ((u32.k1) u32.h1.c().f180539a).e(dVar.f369652a);
                }
            } else if (i27 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Error close strategy(%d)", java.lang.Integer.valueOf(i27));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, Record it(%d) in the shut down device list", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(dVar.f369652a));
                if (!v32.a.a("shut_down_device", dVar.f369652a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "MMExDeviceCore.getDeviceInfoManager().addShutDownDevice failed!!!");
                }
            }
        }
        w32.d dVar3 = this.f524203d;
        if (dVar3 != null) {
            dVar3.a(j17, i17, i18, str);
        }
    }
}
