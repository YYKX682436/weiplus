package r61;

/* loaded from: classes4.dex */
public class q1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474478d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474479e = null;

    public q1(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sz5();
        lVar.f152198b = new r45.tz5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendsmstomfriend";
        lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f474478d = a17;
        r45.sz5 sz5Var = (r45.sz5) a17.f152243a.f152217a;
        sz5Var.f467569d = str;
        sz5Var.f467571f = new java.util.LinkedList();
        sz5Var.f467570e = list != null ? list.size() : 0;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.util.LinkedList linkedList = sz5Var.f467571f;
                    r45.du5 du5Var = new r45.du5();
                    du5Var.f454289d = str2;
                    du5Var.f454290e = true;
                    linkedList.add(du5Var);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474479e = u0Var;
        return mo9409x10f9447a(sVar, this.f474478d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f474479e.mo815x76e0bfae(i18, i19, str, this);
    }
}
