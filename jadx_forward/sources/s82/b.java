package s82;

/* loaded from: classes9.dex */
public class b extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f486265f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        super(raVar);
        this.f486265f = i65.a.h(raVar.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561308ew);
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        java.lang.String string = gVar.f486309c.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572147a00);
        r45.dp0 dp0Var = gVar.f486307a.f67640x5ab01132.I;
        if (dp0Var == null) {
            return string;
        }
        k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(dp0Var.f454167d);
        return Bi != null ? Bi.f68913x21f9b213 : gVar.f486309c.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572147a00);
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80180x52351ff4);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.a aVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new s82.a();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.aba, null);
            a(view2, aVar, r2Var);
            aVar.f486261q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dum);
            aVar.f486262r = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dut);
            aVar.f486263s = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwp);
        } else {
            view2 = view;
            aVar = (s82.a) view.getTag();
        }
        g(aVar, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String str = r2Var.f67640x5ab01132.f452505q;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = J2.f456937d;
        }
        aVar.f486263s.setText(str);
        r45.dp0 dp0Var = r2Var.f67640x5ab01132.I;
        if (dp0Var == null || dp0Var.f454178r != 1) {
            aVar.f486262r.setVisibility(8);
        } else {
            aVar.f486262r.setVisibility(0);
        }
        android.util.Pair kj6 = r2Var.f67640x5ab01132.I != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).kj(r2Var.f67640x5ab01132.I.f454169f) : null;
        if (kj6 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) kj6.first)) {
            aVar.f486312f.setText((java.lang.CharSequence) null);
            aVar.f486312f.setVisibility(8);
        } else {
            aVar.f486312f.setText((java.lang.CharSequence) kj6.first);
            aVar.f486312f.setBackgroundResource(((java.lang.Integer) kj6.second).intValue());
            aVar.f486312f.setVisibility(0);
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b0.a(aVar.f486261q, r2Var.f67640x5ab01132.I, 0.5f)) {
            android.widget.ImageView imageView = aVar.f486261q;
            int i17 = this.f486265f;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.d(imageView, com.p314xaae8f345.mm.R.raw.f79105xe824b7e6, J2, r2Var, false, i17, i17);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.dp0 dp0Var = ((s82.g) view.getTag()).f486307a.f67640x5ab01132.I;
        if (dp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavAppBrandListItem", "onListItemClick appBrandItem null");
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = dp0Var.f454167d;
        b1Var.f398547b = dp0Var.f454168e;
        b1Var.f398549c = dp0Var.f454169f;
        b1Var.f398551d = dp0Var.f454174n;
        b1Var.f398555f = dp0Var.f454172i;
        b1Var.f398565k = 1010;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        b1Var.f398574s = c11812xa040dc98;
        c11812xa040dc98.f158859h = dp0Var.f454177q;
        c11812xa040dc98.f158855d = 6;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(view.getContext(), b1Var);
    }
}
