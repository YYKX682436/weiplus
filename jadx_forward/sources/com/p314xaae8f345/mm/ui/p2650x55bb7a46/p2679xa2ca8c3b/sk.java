package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class sk extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {
    public sk(yb5.d dVar, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(dVar);
        if (i17 == 1) {
            b(f9Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).c());
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (c01.d9.b().E()) {
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
            int ag6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag();
            yb5.d dVar = this.f280025d;
            if (ag6 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiClickListener", "exit in teen mode");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(dVar.g());
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 M = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).M(f9Var);
            if (M == null || M.k()) {
                return;
            }
            java.lang.String z07 = f9Var.z0();
            if (z07 == null) {
                z07 = "";
            }
            d22.d dVar2 = new d22.d(z07, M);
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            dVar2.f445540i = Q0;
            dVar2.f445541j = f9Var.I0();
            java.lang.String j17 = f9Var.j();
            dVar2.f445542k = j17 != null ? j17 : "";
            dVar2.f445543l = dVar.x();
            dVar2.f445689b = true;
            dVar2.f445688a = 9;
            d22.u.f307409a.a(dVar.g(), dVar2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11592, 0);
        }
    }
}
