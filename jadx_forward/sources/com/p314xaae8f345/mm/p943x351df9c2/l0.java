package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class l0 extends com.p314xaae8f345.mm.p943x351df9c2.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p943x351df9c2.r0 f152004e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f152005f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f152006g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f152007h;

    /* renamed from: i, reason: collision with root package name */
    public final fp.j f152008i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.m0 f152009m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var, com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var) {
        super(m0Var.f152020i);
        this.f152009m = m0Var;
        this.f152004e = null;
        this.f152005f = null;
        this.f152007h = true;
        this.f152004e = r0Var;
        java.lang.String j17 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().j(r0Var.e(), true);
        this.f152005f = j17;
        this.f152006g = j17 + ".tmp";
        this.f152008i = new fp.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x018b A[Catch: Exception -> 0x0187, TRY_LEAVE, TryCatch #7 {Exception -> 0x0187, blocks: (B:69:0x0183, B:62:0x018b), top: B:68:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p943x351df9c2.l0.a():boolean");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var = this.f152009m;
        m0Var.getClass();
        if (this.f152007h || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152005f)) {
            m0Var.f152016e.a(4, -1);
            return false;
        }
        this.f152004e.getClass();
        this.f152008i.a();
        c01.s8 s8Var = c01.n8.f118881a;
        if (s8Var != null) {
            ((com.p314xaae8f345.mm.p959x883644fd.s0) s8Var).a((int) com.p314xaae8f345.mm.vfs.w6.k(this.f152006g), 0, 0);
        }
        com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var2 = this.f152009m;
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p943x351df9c2.k0(m0Var2, m0Var2.f152015d, this.f152005f, this.f152006g, false), "get-hd-headimg");
        return true;
    }
}
