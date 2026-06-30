package iy3;

/* loaded from: classes9.dex */
public final class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f377449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f377450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f377451f;

    public a(android.os.Bundle bundle, int i17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f377449d = bundle;
        this.f377450e = i17;
        this.f377451f = rVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        m1Var.m48017xd0f4c159(true);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f377451f;
        int i19 = this.f377450e;
        android.os.Bundle bundle = this.f377449d;
        if (i17 != 0 || i18 != 0) {
            h73.e.c(bundle, "code", i18);
            h73.e.c(bundle, "taskid", i19);
            if (rVar != null) {
                rVar.a(bundle);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "build channel Fail");
            return;
        }
        jy3.c cVar = (jy3.c) m1Var;
        if (cVar.I() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "ticketScene.getResp() == null");
        }
        h73.e.d(bundle, "handshke", jy3.c.f384036f.a(cVar.I()));
        h73.e.c(bundle, "code", i18);
        h73.e.c(bundle, "taskid", i19);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
