package o72;

/* loaded from: classes12.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o72.l2 f424926a = new o72.l2();

    public static final c01.f7 b(r45.gp0 gp0Var) {
        if (gp0Var == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavDataItemConverter", "toFavDataItemInMsg: dataId=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, fullmd5=%s, thumbFullSize=%d, orgnPath=%s, orgnThumbPath=%s", gp0Var.T, java.lang.Integer.valueOf(gp0Var.I), gp0Var.f456967s, gp0Var.f456971u, gp0Var.f456945h, gp0Var.f456953m, java.lang.Long.valueOf(gp0Var.R), gp0Var.M, java.lang.Long.valueOf(gp0Var.f456951l1), gp0Var.V, gp0Var.X);
        c01.f7 f7Var = new c01.f7();
        f7Var.f0(gp0Var.f456937d);
        f7Var.J(gp0Var.f456941f);
        f7Var.H(gp0Var.I);
        f7Var.I(gp0Var.K);
        f7Var.F(gp0Var.T);
        f7Var.L(gp0Var.G);
        f7Var.A(gp0Var.f456967s);
        f7Var.z(gp0Var.f456971u);
        f7Var.O(gp0Var.M);
        f7Var.Q(gp0Var.P);
        f7Var.P(gp0Var.R);
        f7Var.B(gp0Var.f456975w);
        f7Var.E(gp0Var.f456945h);
        f7Var.C(gp0Var.f456953m);
        f7Var.c0(gp0Var.Z);
        f7Var.a0(gp0Var.f456978x0);
        f7Var.Z(gp0Var.f456951l1);
        f7Var.d0(gp0Var.f456957o);
        f7Var.b0(gp0Var.f456963q);
        f7Var.e0(gp0Var.f456972u2);
        f7Var.N(gp0Var.f456976w2);
        f7Var.U(gp0Var.V);
        f7Var.V(gp0Var.X);
        f7Var.K(gp0Var.f456981y);
        f7Var.Y(gp0Var.R1);
        f7Var.W(gp0Var.V1);
        f7Var.T(gp0Var.f456964q2);
        f7Var.S(gp0Var.f456968s2);
        f7Var.G(gp0Var.f456979x1);
        f7Var.R(gp0Var.D2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavDataItemConverter", "toFavDataItemInMsg: isHighQualityResources=" + gp0Var.D2 + ", dataId=" + gp0Var.T);
        return f7Var;
    }

    public final l15.c a(c01.f7 f7Var, java.lang.String str) {
        if (f7Var == null) {
            return null;
        }
        l15.c cVar = new l15.c();
        v05.b bVar = new v05.b();
        java.lang.String m13819x7531c8a2 = f7Var.m13819x7531c8a2();
        if (m13819x7531c8a2 == null) {
            m13819x7531c8a2 = "";
        }
        int i17 = bVar.f449898d;
        bVar.set(i17 + 2, m13819x7531c8a2);
        bVar.set(i17 + 6, 6);
        v05.a aVar = new v05.a();
        if (str == null) {
            str = "";
        }
        int i18 = aVar.f449897d;
        aVar.set(i18 + 1, str);
        java.lang.String p17 = f7Var.p();
        if (p17 == null) {
            p17 = "";
        }
        aVar.N(p17);
        aVar.set(i18 + 0, java.lang.Long.valueOf(f7Var.r()));
        int i19 = bVar.f513848e;
        bVar.set(i19 + 8, aVar);
        java.lang.String q17 = f7Var.q();
        bVar.set(i19 + 24, q17 != null ? q17 : "");
        cVar.q(bVar);
        f15.a aVar2 = new f15.a();
        aVar2.k(f7Var);
        cVar.s(aVar2);
        return cVar;
    }
}
