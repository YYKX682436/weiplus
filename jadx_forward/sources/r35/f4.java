package r35;

/* loaded from: classes9.dex */
public abstract class f4 {
    public static final r45.zs4 a(java.lang.String str, v05.b bVar) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        java.lang.String str3;
        e15.c cVar;
        e15.b bVar2;
        e15.c cVar2;
        l15.d dVar;
        l15.e j17;
        e15.b bVar3;
        e15.b bVar4;
        ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
        r45.zs4 zs4Var = new r45.zs4();
        if (bVar == null || (str2 = bVar.m75945x2fec8307(bVar.f449898d + 2)) == null) {
            str2 = "";
        }
        zs4Var.f473882d = str2;
        java.lang.String str4 = null;
        java.lang.String x17 = (bVar == null || (bVar4 = (e15.b) bVar.m75936x14adae67(bVar.f513848e + 49)) == null) ? null : bVar4.x();
        if (x17 == null || x17.length() == 0) {
            m75945x2fec8307 = bVar != null ? bVar.m75945x2fec8307(bVar.f449898d + 3) : null;
        } else if (bVar == null || (bVar3 = (e15.b) bVar.m75936x14adae67(bVar.f513848e + 49)) == null || (m75945x2fec8307 = bVar3.x()) == null) {
            m75945x2fec8307 = "";
        }
        zs4Var.f473883e = m75945x2fec8307;
        zs4Var.f473887i = (bVar == null || (dVar = (l15.d) bVar.m75936x14adae67(bVar.f513848e + 30)) == null || (j17 = dVar.j()) == null || j17.k() != 1) ? false : true;
        zs4Var.f473888m = true;
        zs4Var.f473889n = false;
        zs4Var.f473891p = il4.l.g((bVar == null || (cVar2 = (e15.c) bVar.m75936x14adae67(bVar.f513848e + 48)) == null) ? 0 : cVar2.m126779xfb85f7b0());
        if (bVar == null || (str3 = bVar.m75945x2fec8307(bVar.f513848e + 46)) == null) {
            str3 = "";
        }
        if ((str3.length() == 0) && (bVar == null || (bVar2 = (e15.b) bVar.m75936x14adae67(bVar.f513848e + 49)) == null || (str3 = bVar2.n()) == null)) {
            str3 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareViewHelper", "initMusicPieceDialog imagePath: " + str + ", exist: " + com.p314xaae8f345.mm.vfs.w6.j(str) + ", coverUrl: %s", str3);
        zs4Var.f473884f = str3;
        if (str == null) {
            str = "";
        }
        zs4Var.f473885g = str;
        if (bVar != null && (cVar = (e15.c) bVar.m75936x14adae67(bVar.f513848e + 48)) != null) {
            str4 = cVar.k();
        }
        zs4Var.f473895t = rk4.l5.b(rk4.l5.c(str4));
        return zs4Var;
    }

    public static final android.view.View b(android.content.Context context, java.lang.String str, ot0.q content, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 musicPiece) {
        java.lang.String k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicPiece, "musicPiece");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a(context);
        ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
        r45.zs4 zs4Var = new r45.zs4();
        zs4Var.f473882d = content.m();
        java.lang.String str2 = musicPiece.f273229h;
        if (str2 == null || str2.length() == 0) {
            k17 = content.k();
        } else {
            k17 = musicPiece.f273229h;
            if (k17 == null) {
                k17 = "";
            }
        }
        zs4Var.f473883e = k17;
        ot0.p pVar = content.f430171b;
        zs4Var.f473887i = pVar != null && pVar.f430155b == 1;
        zs4Var.f473888m = false;
        zs4Var.f473889n = false;
        zs4Var.f473891p = il4.l.g(musicPiece.f273239r);
        java.lang.String str3 = musicPiece.f273223b;
        if (str3 == null) {
            str3 = "";
        }
        if ((str3.length() == 0) && (str3 = musicPiece.f273227f) == null) {
            str3 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareViewHelper", "initMusicPieceDialog imagePath: " + str + ", exist: " + com.p314xaae8f345.mm.vfs.w6.j(str) + ", coverUrl: %s", str3);
        zs4Var.f473884f = str3;
        if (str == null) {
            str = "";
        }
        zs4Var.f473885g = str;
        zs4Var.f473895t = rk4.l5.b(rk4.l5.c(musicPiece.f273240s));
        c18734x8eb4224a.c(zs4Var);
        return c18734x8eb4224a;
    }
}
