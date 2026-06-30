package l41;

/* loaded from: classes4.dex */
public class h0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, ab0.x {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397354d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397355e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397356f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f397357g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f397358h;

    public h0(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nx6();
        lVar.f152198b = new r45.ox6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifyopenimcontact";
        lVar.f152200d = td1.h.f76804x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397355e = a17;
        this.f397356f = str;
        this.f397357g = str2;
        r45.nx6 nx6Var = (r45.nx6) a17.f152243a.f152217a;
        nx6Var.f463270d = str;
        nx6Var.f463271e = str2;
        nx6Var.f463272f = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "tp_username: %s, verify_ticket:%s", str, str2);
    }

    public java.lang.String H() {
        return this.f397356f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397354d = u0Var;
        return mo9409x10f9447a(sVar, this.f397355e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return td1.h.f76804x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f397356f);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397354d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
