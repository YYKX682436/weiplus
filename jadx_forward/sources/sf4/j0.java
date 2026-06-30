package sf4;

/* loaded from: classes4.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        super(0);
        this.f489029d = c18497x85806502;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489029d;
        sf4.d dVar = c18497x85806502.M;
        if (!(dVar != null ? dVar.D : false)) {
            ef4.v vVar = ef4.w.f334001t;
            nf4.l i17 = vVar.i();
            java.lang.String e17 = vVar.e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (e17.length() > 0) {
                android.database.Cursor f17 = i17.f418405h.f("select *,rowid from MMStoryInfo  " + i17.y0(e17, true) + " AND " + nf4.l.f418398t + ' ' + nf4.l.f418392n, null, 2);
                if (f17 != null) {
                    while (f17.moveToNext()) {
                        nf4.j jVar = new nf4.j();
                        jVar.mo9015xbf5d97fd(f17);
                        arrayList.add(jVar);
                    }
                    f17.close();
                }
            }
            if (arrayList.size() >= 9) {
                db5.e1.s(c18497x85806502.getContext(), "", c18497x85806502.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmi));
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_EDITOR_SHOW_FAV_TIP_BOOLEAN_SYNC;
                if (c17.o(u3Var, true)) {
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                    db5.e1.t(c18497x85806502.getContext(), "", c18497x85806502.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmk), new sf4.h1(c18497x85806502));
                }
            }
            return jz5.f0.f384359a;
        }
        lf4.l lVar = c18497x85806502.A;
        if (lVar != null) {
            int i18 = c18497x85806502.f253635u;
            int i19 = c18497x85806502.f253636v;
            sf4.d dVar2 = c18497x85806502.M;
            lVar.l(i18, i19, dVar2 != null ? dVar2.D : false, null);
        }
        return jz5.f0.f384359a;
    }
}
