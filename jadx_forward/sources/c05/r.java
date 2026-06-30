package c05;

/* loaded from: classes9.dex */
public class r extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.s f119247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c05.s sVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119247c = sVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        c05.s sVar = this.f119247c;
        if (sVar.f295334c.getBoolean("key_is_show_detail", true)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) sVar.f295334c.getParcelable("key_bankcard");
        this.f420367b.d(new d05.f(c19091x9511676c.f69223x58802fcb, c19091x9511676c.f69225xed6d60f6, sVar.f295334c.getString("key_pwd1")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof d05.f)) {
            return false;
        }
        c05.s sVar = this.f119247c;
        sVar.o(this.f420366a, 0, sVar.f295334c);
        return true;
    }
}
