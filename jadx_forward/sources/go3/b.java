package go3;

/* loaded from: classes12.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f355642d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f355643e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f355644f;

    /* renamed from: g, reason: collision with root package name */
    public int f355645g = 0;

    public b(boolean z17, byte[] bArr) {
        this.f355644f = true;
        this.f355644f = z17;
        o45.qh qhVar = new o45.qh(z17);
        this.f355643e = qhVar;
        ((o45.rh) qhVar.mo47979x2d63726f()).f424538b.f456925e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f355642d = u0Var;
        this.f355645g++;
        return mo9409x10f9447a(sVar, this.f355643e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f355644f ? 3789 : 3644;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f355642d;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        if (this.f355645g < 2) {
            if (mo807x6c193ac1(m47995xb7ba1aa7(), this.f355642d) < 0) {
                this.f355642d.mo815x76e0bfae(3, -1, "", this);
            }
        } else {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f355642d;
            if (u0Var2 != null) {
                u0Var2.mo815x76e0bfae(i18, i19, str, this);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
