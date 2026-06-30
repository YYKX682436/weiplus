package si1;

/* loaded from: classes7.dex */
public class b1 implements si1.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f489764a;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        java.util.Objects.requireNonNull(c11510xdd90c2f2);
        this.f489764a = c11510xdd90c2f2;
    }

    @Override // si1.c1
    public ti1.b a() {
        return (ti1.b) this.f489764a.p0(ti1.b.class, false);
    }

    @Override // si1.c1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) this.f489764a.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class);
        java.util.Objects.requireNonNull(interfaceC11702x4ae7c33);
        return interfaceC11702x4ae7c33;
    }

    @Override // si1.c1
    public u81.b c() {
        return this.f489764a.N.b();
    }

    @Override // si1.c1
    public void d(java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f489764a;
        if (c11510xdd90c2f2.C0() != null) {
            c11510xdd90c2f2.C0().g(str, jSONObject.toString());
        }
    }

    @Override // si1.c1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 e() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54) this.f489764a.p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54.class, false);
    }

    @Override // si1.c1
    public si1.n f() {
        return (si1.n) this.f489764a.p0(si1.n.class, false);
    }

    @Override // si1.c1
    public boolean g() {
        u81.f0 f0Var = this.f489764a.N.f506965a;
        int ordinal = f0Var.t().ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            return false;
        }
        return ((java.lang.Boolean) new u81.p(f0Var, 1000L, java.lang.Boolean.FALSE).a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(f0Var.f386380e.getLooper()))).booleanValue();
    }
}
