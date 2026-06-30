package sf4;

/* loaded from: classes4.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        super(0);
        this.f489062d = c18497x85806502;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489062d;
        sf4.d dVar = c18497x85806502.M;
        if (!(dVar != null ? dVar.B : false)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_EDITOR_SHOW_PRIVACY_TIP_BOOLEAN_SYNC;
            if (c17.o(u3Var, true)) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                db5.e1.t(c18497x85806502.getContext(), "", c18497x85806502.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jml), new sf4.i1(c18497x85806502));
                return jz5.f0.f384359a;
            }
        }
        lf4.l lVar = c18497x85806502.A;
        if (lVar != null) {
            int i17 = c18497x85806502.f253635u;
            int i18 = c18497x85806502.f253636v;
            sf4.d dVar2 = c18497x85806502.M;
            lVar.m(i17, i18, dVar2 != null ? dVar2.B : false);
        }
        return jz5.f0.f384359a;
    }
}
