package c61;

/* loaded from: classes.dex */
public final class v6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f120878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(yz5.l lVar) {
        super(1);
        this.f120878d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.n42 n42Var;
        r45.qp1 qp1Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f120878d.mo146xb9724478(fVar);
        if (fVar != null && fVar.f152149b == -200279) {
            r45.n42 n42Var2 = (r45.n42) fVar.f152151d;
            if ((n42Var2 != null ? (r45.qp1) n42Var2.m75936x14adae67(3) : null) != null && (n42Var = (r45.n42) fVar.f152151d) != null && (qp1Var = (r45.qp1) n42Var.m75936x14adae67(3)) != null) {
                int m75939xb282bd08 = qp1Var.m75939xb282bd08(0);
                if (m75939xb282bd08 == 1) {
                    java.lang.String m75945x2fec8307 = qp1Var.m75945x2fec8307(1);
                    java.lang.String str = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll());
                    u1Var.g(str);
                    u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
                    u1Var.a(true);
                    u1Var.l(hz2.b.f367843a);
                    u1Var.q(false);
                } else if (m75939xb282bd08 == 3) {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.lang.String m75945x2fec83072 = qp1Var.m75945x2fec8307(1);
                    db5.t7.m(context, m75945x2fec83072 != null ? m75945x2fec83072 : "");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
