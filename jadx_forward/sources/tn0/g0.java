package tn0;

/* loaded from: classes10.dex */
public final class g0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502205e;

    public g0(tn0.w0 w0Var, java.lang.String str) {
        this.f502204d = w0Var;
        this.f502205e = str;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public final void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        int mo100928x463504c;
        int mo100929x8d5c7601;
        tn0.w0 w0Var = this.f502204d;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = w0Var.X;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100975x68ac462();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "startPushLocalVideo success");
        go0.f0 f0Var = w0Var.f502304r;
        ts0.c cVar = ts0.c.f503074a;
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(this.f502205e, true);
        if (d17 != null) {
            mo100928x463504c = d17.f243918d;
        } else {
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = w0Var.X;
            mo100928x463504c = interfaceC26164x73fc6bc63 != null ? interfaceC26164x73fc6bc63.mo100928x463504c() : 0;
        }
        ts0.c.f503075b = mo100928x463504c;
        if (d17 != null) {
            mo100929x8d5c7601 = d17.f243917c;
        } else {
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc64 = w0Var.X;
            mo100929x8d5c7601 = interfaceC26164x73fc6bc64 != null ? interfaceC26164x73fc6bc64.mo100929x8d5c7601() : 0;
        }
        ts0.c.f503076c = mo100929x8d5c7601;
        ts0.c.f503077d = d17 != null ? d17.f243928n : 0;
        ts0.c.f503081h = false;
        f0Var.w(cVar);
        w0Var.f502304r.mo8988x4ac79299(new tn0.f0(w0Var));
    }
}
