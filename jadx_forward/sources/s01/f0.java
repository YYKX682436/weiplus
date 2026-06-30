package s01;

/* loaded from: classes4.dex */
public class f0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f483399d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f483400e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f483401f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f483402g;

    public f0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.g90();
        lVar.f152198b = new r45.h90();
        lVar.f152199c = "/cgi-bin/mmocbiz-bin/convertbizchat";
        lVar.f152200d = cc1.u.f4292x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f483400e = a17;
        r45.g90 g90Var = (r45.g90) a17.f152243a.f152217a;
        g90Var.f456539d = str;
        g90Var.f456541f = str2;
        g90Var.f456540e = str3;
        this.f483402g = obj;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f483399d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneConvertBizChat", "do scene");
        return mo9409x10f9447a(sVar, this.f483400e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return cc1.u.f4292x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f483399d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
