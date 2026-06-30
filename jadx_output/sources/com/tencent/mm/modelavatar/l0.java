package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class l0 extends com.tencent.mm.modelavatar.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelavatar.r0 f70471e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f70472f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f70473g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f70474h;

    /* renamed from: i, reason: collision with root package name */
    public final fp.j f70475i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.m0 f70476m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.modelavatar.m0 m0Var, com.tencent.mm.modelavatar.r0 r0Var) {
        super(m0Var.f70487i);
        this.f70476m = m0Var;
        this.f70471e = null;
        this.f70472f = null;
        this.f70474h = true;
        this.f70471e = r0Var;
        java.lang.String j17 = com.tencent.mm.modelavatar.d1.Ai().j(r0Var.e(), true);
        this.f70472f = j17;
        this.f70473g = j17 + ".tmp";
        this.f70475i = new fp.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x018b A[Catch: Exception -> 0x0187, TRY_LEAVE, TryCatch #7 {Exception -> 0x0187, blocks: (B:69:0x0183, B:62:0x018b), top: B:68:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.sdk.platformtools.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelavatar.l0.a():boolean");
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        com.tencent.mm.modelavatar.m0 m0Var = this.f70476m;
        m0Var.getClass();
        if (this.f70474h || com.tencent.mm.sdk.platformtools.t8.K0(this.f70472f)) {
            m0Var.f70483e.a(4, -1);
            return false;
        }
        this.f70471e.getClass();
        this.f70475i.a();
        c01.s8 s8Var = c01.n8.f37348a;
        if (s8Var != null) {
            ((com.tencent.mm.modelstat.s0) s8Var).a((int) com.tencent.mm.vfs.w6.k(this.f70473g), 0, 0);
        }
        com.tencent.mm.modelavatar.m0 m0Var2 = this.f70476m;
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.modelavatar.k0(m0Var2, m0Var2.f70482d, this.f70472f, this.f70473g, false), "get-hd-headimg");
        return true;
    }
}
