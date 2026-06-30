package ms3;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f412507d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f412508e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f412509f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f412510g;

    public a(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 11665;
        lVar.f152199c = "/cgi-bin/xmmailbroker/mb_createuploadurl";
        this.f412509f = str;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        ks3.a1 a1Var = new ks3.a1();
        a1Var.f393151d = gm0.j1.b().h();
        java.lang.String str5 = a17.f294812f;
        int lastIndexOf = str5.lastIndexOf("/");
        a1Var.f393152e = lastIndexOf >= 0 ? str5.substring(lastIndexOf + 1) : str5;
        a1Var.f393153f = i17;
        a1Var.f393154g = str2;
        a1Var.f393155h = str3;
        this.f412510g = str2;
        lVar.f152197a = a1Var;
        lVar.f152198b = new ks3.b1();
        this.f412507d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f412508e = u0Var;
        return mo9409x10f9447a(sVar, this.f412507d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11665;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NetSceneCreateUploadUrl", "errType:%s errCode%s errMsg:%s", objArr);
        this.f412508e.mo815x76e0bfae(i18, i19, str, this);
    }
}
