package we2;

/* loaded from: classes3.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a() {
        return ((java.lang.Number) ((jz5.n) we2.o.f526771k).mo141623x754a37bb()).intValue();
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) we2.o.f526770j).mo141623x754a37bb()).intValue();
    }

    public final boolean c(android.content.Context context, dk2.zf commentData) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentData, "commentData");
        java.lang.String a17 = commentData.a();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, c01.z1.r())) {
            return true;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.util.LinkedList<r45.of1> a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.a();
        if (!a18.isEmpty()) {
            for (r45.of1 of1Var : a18) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(of1Var.m75945x2fec8307(3), a17) && of1Var.m75939xb282bd08(2) == 2) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, xy2.c.e(context));
    }
}
