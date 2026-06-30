package c05;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.h f119238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c05.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119238c = hVar;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) objArr[0];
        this.f420367b.d(new d05.d(c19091x9511676c.f69225xed6d60f6, true, c19091x9511676c.f69223x58802fcb), true);
        return true;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f119238c.f295334c.getParcelable("key_bankcard");
        this.f420367b.d(new d05.f(c19091x9511676c.f69223x58802fcb, c19091x9511676c.f69225xed6d60f6, (java.lang.String) objArr[0]), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (m1Var instanceof d05.f) {
            this.f420367b.a(new ss4.e0(null, 0), true);
        } else if (m1Var instanceof ss4.e0) {
            c05.h hVar = this.f119238c;
            hVar.f(this.f420366a, hVar.f295334c);
        }
        return true;
    }
}
