package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class m implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p943x351df9c2.r0 f152010d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f152011e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f152012f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f152013g = false;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.r f152014h;

    public m(com.p314xaae8f345.mm.p943x351df9c2.r rVar, com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var) {
        this.f152014h = rVar;
        this.f152010d = null;
        this.f152010d = r0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:193:0x016c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x068d A[Catch: Exception -> 0x0688, TryCatch #37 {Exception -> 0x0688, blocks: (B:67:0x0684, B:58:0x068d, B:59:0x0690), top: B:66:0x0684 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0684 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05db  */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 1788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p943x351df9c2.m.a():boolean");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = this.f152010d;
        if (r0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.e())) {
            boolean M0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f152011e);
            com.p314xaae8f345.mm.p943x351df9c2.r rVar = this.f152014h;
            if (M0) {
                rVar.f152055e.remove(r0Var.e());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(138L, 10L, 1L, true);
                if (this.f152013g && (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r0Var.e(), true)) != null && n17.X4()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HttpGetAvatar", "try getContact to fetch new avatar imgUrl, username: %s", n17.d1());
                    c01.n8.a().c(n17.d1(), 11);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n17.d1());
                }
                return false;
            }
            c01.s8 s8Var = c01.n8.f118881a;
            if (s8Var != null) {
                ((com.p314xaae8f345.mm.p959x883644fd.s0) s8Var).a(this.f152011e.length, 0, 0);
            }
            rVar.h(new com.p314xaae8f345.mm.p943x351df9c2.l(rVar, r0Var, this.f152011e, this.f152012f));
        }
        return false;
    }
}
