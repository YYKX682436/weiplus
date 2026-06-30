package qs4;

/* loaded from: classes9.dex */
public class h extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs4.j f447952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qs4.j jVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447952c = jVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[0];
        qs4.j jVar = this.f447952c;
        jVar.f295334c.getString("verify_card_flag", "0");
        boolean equals = "realname_verify_process".equals(jVar.e());
        np5.b0 b0Var = this.f420367b;
        if (equals) {
            b0Var.a(new rs4.b(z0Var, jVar.f295334c.getInt("entry_scene", -1), jVar.f295334c.getString("key_realname_sessionid"), (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b) jVar.f295334c.getParcelable("realname_verify_process_bundle")), true);
        } else {
            b0Var.a(new rs4.b(z0Var), true);
        }
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof rs4.b)) {
            return m1Var instanceof ys4.l;
        }
        np5.b0 b0Var = this.f420367b;
        qs4.j jVar = this.f447952c;
        jVar.F(b0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641 = ((rs4.b) m1Var).f480879d;
        if (c19093x748e2641 == null) {
            return false;
        }
        jVar.f295334c.putParcelable("key_bindcard_value_result", c19093x748e2641);
        return false;
    }
}
