package fs4;

/* loaded from: classes9.dex */
public class c extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs4.h f347869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fs4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f347869c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) objArr[0];
        fs4.h hVar = this.f347869c;
        if (hVar.r()) {
            c19090x75920c71.f261075d = 4;
        } else {
            c19090x75920c71.f261075d = 1;
        }
        this.f420367b.d(new gs4.s(c19090x75920c71, hVar.f295334c.getBoolean("key_is_reset_with_new_card", false), hVar.f295334c.getBoolean("key_is_paymanager") ? 1 : 0), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof gs4.s)) {
            return false;
        }
        gs4.s sVar = (gs4.s) m1Var;
        fs4.h hVar = this.f347869c;
        hVar.f295334c.putString("kreq_token", sVar.f356669e);
        hVar.f347875e = sVar;
        if (sVar.f356670f) {
            return true;
        }
        hVar.o(this.f420366a, 0, hVar.f295334c);
        return true;
    }
}
