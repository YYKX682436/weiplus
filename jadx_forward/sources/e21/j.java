package e21;

/* loaded from: classes11.dex */
public class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f328069d;

    /* renamed from: e, reason: collision with root package name */
    public final e21.g f328070e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f328071f;

    public j(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f328071f = arrayList;
        arrayList.addAll(list);
        e21.g gVar = new e21.g();
        this.f328070e = gVar;
        ((e21.h) gVar.mo47979x2d63726f()).f328056a.f457317d = H(list);
    }

    public static r45.c50 H(java.util.List list) {
        r45.c50 c50Var = new r45.c50();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            xg3.q0 q0Var = (xg3.q0) it.next();
            byte[] a17 = q0Var.a();
            r45.b50 b50Var = new r45.b50();
            b50Var.f452063d = q0Var.b();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(a17);
            b50Var.f452064e = cu5Var;
            c50Var.f452828e.add(b50Var);
        }
        c50Var.f452827d = list.size();
        return c50Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOplog", "doScene[%s] size=%d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(((java.util.ArrayList) this.f328071f).size()));
        this.f328069d = u0Var;
        return mo9409x10f9447a(sVar, this.f328070e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x.f34658x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f328069d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
