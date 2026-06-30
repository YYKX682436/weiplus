package yj5;

/* loaded from: classes5.dex */
public final class b extends yj5.a {
    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536422n;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = talkerInfo.f542275a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str);
        if (!context.f542250l.f39297xd5f7591a && z07 != null) {
            boolean z17 = true;
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str) ? z07.y0() != 2 : (z07.y0() & 1) != 1) {
                z17 = false;
            }
            int Ui = z17 ? ((nn.j) ((nn.i) i95.n0.c(nn.i.class))).Ui(str, 0L) : 0;
            if (Ui > 0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(new xj5.b(Ui));
                return linkedList;
            }
        }
        return null;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.f(ui6, tipsBarContext, this);
    }
}
