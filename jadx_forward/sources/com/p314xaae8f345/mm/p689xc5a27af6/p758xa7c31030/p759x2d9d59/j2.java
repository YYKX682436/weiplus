package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class j2 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f f148968d;

    public j2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f interfaceC10643xb9d7086f) {
        this.f148968d = interfaceC10643xb9d7086f;
    }

    public final void a(boolean z17) {
        if (mm.o.j(false, 1, null)) {
            if (mm.o.k(mm.o.a() ? 20 : 200)) {
                java.lang.String[] strArr = new java.lang.String[3];
                strArr[0] = "AdpfStates";
                strArr[1] = z17 ? "toggleOn" : "toggleOff";
                strArr[2] = this.f148968d.getF28911xddfceb18();
                ap.a.a(10002, "ThreadProfiler", null, null, strArr);
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stateChanged: ");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f interfaceC10643xb9d7086f = this.f148968d;
        sb6.append(interfaceC10643xb9d7086f.getF28911xddfceb18());
        sb6.append(" >> off");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfState", sb6.toString());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) ((ob0.f) i95.n0.c(ob0.f.class))).wi(interfaceC10643xb9d7086f.getF28911xddfceb18(), false);
        a(false);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stateChanged: ");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f interfaceC10643xb9d7086f = this.f148968d;
        sb6.append(interfaceC10643xb9d7086f.getF28911xddfceb18());
        sb6.append(" >> on");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfState", sb6.toString());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) ((ob0.f) i95.n0.c(ob0.f.class))).wi(interfaceC10643xb9d7086f.getF28911xddfceb18(), true);
        a(true);
    }
}
