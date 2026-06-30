package x82;

@j95.b
/* loaded from: classes9.dex */
public class l0 extends i95.w implements o72.w4 {
    public void Ai(android.content.Context context, java.lang.String str, o72.r2 r2Var, int i17, boolean z17, final n13.x xVar) {
        co.a b17;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i3 i3Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i3.f182693a;
        if (i3Var.c(r2Var) && (b17 = i3Var.b(r2Var, 302)) != null) {
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            n13.t tVar = new n13.t();
            tVar.f415667b = xVar;
            tVar.f415671f.f415672a = 6;
            ((dk5.y) a0Var).Ai(context, b17, P1, tVar);
            return;
        }
        r35.i1 i1Var = new r35.i1(context);
        i1Var.l(str);
        x82.k0.l(i1Var, context, r2Var);
        x82.k0.m(i1Var, context, -1, r2Var, -1L, "");
        i1Var.g(java.lang.Boolean.valueOf(z17));
        i1Var.j(i17);
        i1Var.a(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j() { // from class: x82.l0$$a
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
            public final void a(boolean z18, java.lang.String str2, int i18) {
                n13.x xVar2 = n13.x.this;
                if (xVar2 != null) {
                    xVar2.a(z18, str2, new android.os.Bundle());
                }
            }
        });
        i1Var.k();
    }

    public void wi(java.lang.String str, java.lang.String str2, java.lang.String str3, c01.f7 f7Var) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        ut.s0 s0Var = new ut.s0(str3, str);
        s0Var.f512257h = f7Var;
        if (str2 == null) {
            str2 = "";
        }
        s0Var.f512252c = str2;
        s0Var.f512254e = "forward_file_from_fav";
        dk5.w.f316499a.c(s0Var);
    }
}
