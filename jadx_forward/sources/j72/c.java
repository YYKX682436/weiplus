package j72;

/* loaded from: classes14.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f379574d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f379575e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.lf3 f379576f;

    /* renamed from: g, reason: collision with root package name */
    public r45.mf3 f379577g;

    /* JADX WARN: Removed duplicated region for block: B:59:0x0269 A[Catch: Exception -> 0x0264, TryCatch #3 {Exception -> 0x0264, blocks: (B:73:0x025b, B:59:0x0269, B:62:0x026f, B:64:0x0286, B:69:0x028f, B:71:0x0299), top: B:72:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026f A[Catch: Exception -> 0x0264, TryCatch #3 {Exception -> 0x0264, blocks: (B:73:0x025b, B:59:0x0269, B:62:0x026f, B:64:0x0286, B:69:0x028f, B:71:0x0299), top: B:72:0x025b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r25, java.lang.String r26, float r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, java.lang.String r32, byte[] r33, boolean r34, int r35, long r36, double r38, double r40, k72.v r42) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j72.c.<init>(java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, byte[], boolean, int, long, double, double, k72.v):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f379574d = u0Var;
        return mo9409x10f9447a(sVar, this.f379575e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2726;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetFaceCheckResult", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, i19 == 0 ? 54L : 55L, 1L, false);
        this.f379577g = (r45.mf3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f379574d.mo815x76e0bfae(i18, i19, str, this);
    }
}
