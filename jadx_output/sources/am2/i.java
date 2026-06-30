package am2;

/* loaded from: classes3.dex */
public final class i {
    public i(kotlin.jvm.internal.i iVar) {
    }

    public final void a(r45.d42 d42Var) {
        r45.q53 q53Var;
        r45.q53 q53Var2;
        if (d42Var != null && zl2.q4.f473933a.E()) {
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.G1).getValue()).r()).intValue() == 1) {
                java.lang.String string = d42Var.getString(0);
                java.lang.String string2 = d42Var.getString(4);
                r45.a8 a8Var = (r45.a8) d42Var.getCustom(6);
                java.lang.String string3 = (a8Var == null || (q53Var2 = (r45.q53) a8Var.getCustom(0)) == null) ? null : q53Var2.getString(0);
                r45.a8 a8Var2 = (r45.a8) d42Var.getCustom(7);
                java.lang.String string4 = (a8Var2 == null || (q53Var = (r45.q53) a8Var2.getCustom(0)) == null) ? null : q53Var.getString(0);
                nn2.d dVar = nn2.d.f338671a;
                com.tencent.mm.vfs.w6.h(((b51.m) dVar.c()).g(string));
                com.tencent.mm.vfs.w6.h(((b51.m) dVar.c()).g(string2));
                i95.m c17 = i95.n0.c(zy.u.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.vfs.w6.h(zy.w.h9(zy.u.p3((zy.u) c17, null, 1, null), string3, null, 2, null));
                i95.m c18 = i95.n0.c(zy.u.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.vfs.w6.h(zy.w.h9(zy.u.p3((zy.u) c18, null, 1, null), string4, null, 2, null));
                com.tencent.mars.xlog.Log.i("FinderGiftFundingDebug", "checkClearResource content");
            }
        }
    }
}
