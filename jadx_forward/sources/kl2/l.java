package kl2;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f390322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kl2.n nVar) {
        super(0);
        this.f390322d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        kl2.n nVar = this.f390322d;
        int ordinal = nVar.f390331r.ordinal();
        jz5.f0 f0Var = jz5.f0.f384359a;
        jl2.a aVar = nVar.f390324h;
        if (ordinal == 0) {
            il2.r rVar = (il2.r) aVar;
            rVar.getClass();
            mm2.p5 p5Var = (mm2.p5) ((mm2.v5) rVar.P0(mm2.v5.class)).f411016f.mo3195x754a37bb();
            long j17 = p5Var != null ? p5Var.f410883b : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRestrictConsumePlugin", "continueSend: " + j17);
            zl2.j5.f555383a.e(j17);
            ((mm2.v5) rVar.P0(mm2.v5.class)).f411021n.mo7808x76db6cb1(mm2.q5.f410900a);
            il2.s.f373619a.a(zl2.e5.f555273g, nVar.f390330q);
            return f0Var;
        }
        if (ordinal != 1) {
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consumeVerifyUrl jump: ");
        mm2.p5 p5Var2 = nVar.f390333t;
        sb6.append(p5Var2 != null ? p5Var2.f410885d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RestrictConsumeDialogWidget", sb6.toString());
        mm2.p5 p5Var3 = nVar.f390333t;
        if (p5Var3 == null || (str = p5Var3.f410885d) == null) {
            return null;
        }
        java.lang.String str2 = p5Var3.f410884c;
        if (str2 == null) {
            str2 = "";
        }
        ((il2.r) aVar).n(new il2.a(1, str2, str, new kl2.k(nVar)));
        return f0Var;
    }
}
