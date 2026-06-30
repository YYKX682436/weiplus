package u81;

/* loaded from: classes7.dex */
public final class x extends u81.i0 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f507019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f507020h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u81.f0 f0Var, u81.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super(k0Var, c11510xdd90c2f2);
        this.f507020h = f0Var;
    }

    @Override // u81.i0, u81.j0, k75.c
    public void a() {
        this.f507019g = false;
        u81.f0 f0Var = this.f507020h;
        if (f0Var.f506958w) {
            u81.e0 e0Var = f0Var.C;
            e0Var.f506945a = 0;
            u81.f0 f0Var2 = e0Var.f506946b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var2.f506956u, "resetSuspendFlag, appId:%s", f0Var2.f506957v.f156336n);
        }
        super.a();
    }

    @Override // k75.c
    public void b() {
        this.f507019g = false;
        this.f507020h.H.b(this);
        this.f506971f = 0;
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterComponentCallbacks(this);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        if (r12.B0() != null) goto L68;
     */
    @Override // k75.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(android.os.Message r12) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u81.x.c(android.os.Message):boolean");
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "|Background";
    }
}
