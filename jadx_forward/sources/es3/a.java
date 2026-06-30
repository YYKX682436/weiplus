package es3;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f337955d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f337956e;

    /* renamed from: f, reason: collision with root package name */
    public final int f337957f;

    public a(int i17, java.lang.String str, java.lang.String str2, float f17, float f18, int i18, int i19, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.wo0();
        lVar.f152198b = new r45.xo0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmfacingcreatechatroom";
        lVar.f152200d = vd1.j.f77288x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f337956e = a17;
        r45.wo0 wo0Var = (r45.wo0) a17.f152243a.f152217a;
        this.f337957f = i17;
        wo0Var.f470864d = i17;
        wo0Var.f470865e = str;
        wo0Var.f470872o = str2;
        wo0Var.f470866f = f18;
        wo0Var.f470867g = f17;
        wo0Var.f470868h = i18;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            wo0Var.f470869i = str3;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            wo0Var.f470870m = str4;
        }
        wo0Var.f470871n = i19;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, f18, f17, i18);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f337955d = u0Var;
        return mo9409x10f9447a(sVar, this.f337956e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return vd1.j.f77288x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.xo0 xo0Var;
        java.util.LinkedList linkedList;
        if (this.f337957f == 0 && (xo0Var = (r45.xo0) this.f337956e.f152244b.f152233a) != null && (linkedList = xo0Var.f471823f) != null) {
            java.lang.System.currentTimeMillis();
            int size = linkedList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i27 = 0; i27 < size; i27++) {
                r45.yo0 yo0Var = (r45.yo0) linkedList.get(i27);
                com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yo0Var.f472784d)) {
                    r0Var.f152062a = yo0Var.f472785e;
                } else {
                    r0Var.f152062a = yo0Var.f472784d;
                }
                r0Var.f152065d = yo0Var.f472787g;
                r0Var.f152067f = 1;
                arrayList.add(r0Var);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().m0(arrayList);
            java.lang.System.currentTimeMillis();
        }
        this.f337955d.mo815x76e0bfae(i18, i19, str, this);
    }
}
