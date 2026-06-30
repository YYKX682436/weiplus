package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class j2 implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.adpf.IAdpfState f67435d;

    public j2(com.tencent.mm.feature.performance.adpf.IAdpfState iAdpfState) {
        this.f67435d = iAdpfState;
    }

    public final void a(boolean z17) {
        if (mm.o.j(false, 1, null)) {
            if (mm.o.k(mm.o.a() ? 20 : 200)) {
                java.lang.String[] strArr = new java.lang.String[3];
                strArr[0] = "AdpfStates";
                strArr[1] = z17 ? "toggleOn" : "toggleOff";
                strArr[2] = this.f67435d.get$stateName();
                ap.a.a(10002, "ThreadProfiler", null, null, strArr);
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stateChanged: ");
        com.tencent.mm.feature.performance.adpf.IAdpfState iAdpfState = this.f67435d;
        sb6.append(iAdpfState.get$stateName());
        sb6.append(" >> off");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfState", sb6.toString());
        ((com.tencent.mm.feature.performance.adpf.s0) ((ob0.f) i95.n0.c(ob0.f.class))).wi(iAdpfState.get$stateName(), false);
        a(false);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stateChanged: ");
        com.tencent.mm.feature.performance.adpf.IAdpfState iAdpfState = this.f67435d;
        sb6.append(iAdpfState.get$stateName());
        sb6.append(" >> on");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfState", sb6.toString());
        ((com.tencent.mm.feature.performance.adpf.s0) ((ob0.f) i95.n0.c(ob0.f.class))).wi(iAdpfState.get$stateName(), true);
        a(true);
    }
}
