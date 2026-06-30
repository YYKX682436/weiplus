package c05;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.c f119235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c05.c cVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119235c = cVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f420367b.d(new d05.e(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f119235c.f295334c.getParcelable("key_bankcard")).f69225xed6d60f6), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof d05.e;
            c05.c cVar = this.f119235c;
            if (z17) {
                cVar.f295334c.putString("kreq_token", ((d05.e) m1Var).f307122e);
                return false;
            }
            if (m1Var instanceof d05.c) {
                cVar.f295334c.putDouble("key_credit_amount", ((d05.c) m1Var).f307119d);
                cVar.o(this.f420366a, 0, cVar.f295334c);
                return true;
            }
        }
        return false;
    }
}
