package l41;

/* loaded from: classes2.dex */
public final class s extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f397449d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397450e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397451f;

    public s(java.lang.String str) {
        this.f397449d = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.oc0();
        lVar.f152198b = new r45.pc0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/delopenimkefucontact";
        lVar.f152200d = 5997;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397451f = a17;
        this.f397449d = str != null ? str : "";
        r45.oc0 oc0Var = (r45.oc0) a17.f152243a.f152217a;
        if (oc0Var != null) {
            oc0Var.f463676d = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDelOpenIMKefuContact", "delOpenImKefuContact username: " + str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397450e = u0Var;
        return mo9409x10f9447a(sVar, this.f397451f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5997;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDelOpenIMKefuContact", "delOpenImKefuContact onGYNetEnd errType: " + i18 + ", errCode: " + i19 + ", errMsg: " + str + ", type: 5997, username: " + this.f397449d);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397450e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        } else {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f397450e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var2);
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
