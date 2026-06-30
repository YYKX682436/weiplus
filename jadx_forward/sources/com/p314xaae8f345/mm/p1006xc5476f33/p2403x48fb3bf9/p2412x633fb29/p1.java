package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes4.dex */
public class p1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264589d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264590e;

    /* renamed from: f, reason: collision with root package name */
    public long f264591f;

    public p1(int i17, java.lang.String str, java.util.LinkedList linkedList, int i18) {
        this(i17, str, linkedList, i18, null, false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f264591f = java.lang.System.currentTimeMillis();
        this.f264590e = u0Var;
        return mo9409x10f9447a(sVar, this.f264589d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1137;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f264590e.mo815x76e0bfae(i18, i19, str, this);
        hy4.b.INSTANCE.b(4, (int) (java.lang.System.currentTimeMillis() - this.f264591f), i19);
    }

    public p1(int i17, java.lang.String str, java.util.LinkedList linkedList, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17) {
        this.f264591f = 0L;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ag5();
        lVar.f152198b = new r45.bg5();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/qrconnect_authorize_confirm";
        lVar.f152200d = 1137;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264589d = a17;
        r45.ag5 ag5Var = (r45.ag5) a17.f152243a.f152217a;
        ag5Var.f451531e = i17;
        ag5Var.f451530d = str;
        ag5Var.f451532f = linkedList;
        ag5Var.f451533g = i18;
        ag5Var.f451534h = gVar;
        ag5Var.f451535i = z17;
    }
}
