package r61;

/* loaded from: classes8.dex */
public class g1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474405d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474406e;

    public g1(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gu4();
        lVar.f152198b = new r45.hu4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/newgetinvitefriend";
        lVar.f152200d = 135;
        lVar.f152201e = 23;
        lVar.f152202f = 1000000023;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f474405d = a17;
        ((r45.gu4) a17.f152243a.f152217a).f457064d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474406e = u0Var;
        return mo9409x10f9447a(sVar, this.f474405d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 135;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.hu4 hu4Var = (r45.hu4) this.f474405d.f152244b.f152233a;
        hu4Var.f457982e.size();
        hu4Var.f457984g.size();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i27 = 0; i27 < hu4Var.f457981d; i27++) {
            if (!hashSet.contains(((r45.ku4) hu4Var.f457982e.get(i27)).f460495h)) {
                linkedList.add((r45.ku4) hu4Var.f457982e.get(i27));
                hashSet.add(((r45.ku4) hu4Var.f457982e.get(i27)).f460495h);
            }
        }
        hu4Var.f457982e = linkedList;
        hu4Var.f457981d = linkedList.size();
        this.f474406e.mo815x76e0bfae(i18, i19, str, this);
    }
}
