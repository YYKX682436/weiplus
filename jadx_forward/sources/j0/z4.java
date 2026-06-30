package j0;

/* loaded from: classes14.dex */
public final class z4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f378231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(j0.c5 c5Var) {
        super(1);
        this.f378231d = c5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.l lVar;
        jz5.f0 f0Var;
        int i17 = ((g2.k) obj).f349247a;
        j0.g2 g2Var = this.f378231d.f377778m;
        g2Var.getClass();
        if (i17 == 7) {
            lVar = g2Var.a().f377872a;
        } else {
            if (i17 == 2) {
                lVar = g2Var.a().f377873b;
            } else {
                if (i17 == 6) {
                    lVar = g2Var.a().f377874c;
                } else {
                    if (i17 == 5) {
                        lVar = g2Var.a().f377875d;
                    } else {
                        if (i17 == 3) {
                            lVar = g2Var.a().f377876e;
                        } else {
                            if (i17 == 4) {
                                lVar = g2Var.a().f377877f;
                            } else {
                                if (!((i17 == 1) || i17 == 0)) {
                                    throw new java.lang.IllegalStateException("invalid ImeAction".toString());
                                }
                                lVar = null;
                            }
                        }
                    }
                }
            }
        }
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (lVar != null) {
            lVar.mo146xb9724478(g2Var);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (i17 == 6) {
                c1.k kVar = g2Var.f377832b;
                if (kVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("focusManager");
                    throw null;
                }
                ((c1.m) kVar).b(1);
            } else {
                if (i17 == 5) {
                    c1.k kVar2 = g2Var.f377832b;
                    if (kVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("focusManager");
                        throw null;
                    }
                    ((c1.m) kVar2).b(2);
                }
            }
        }
        return f0Var2;
    }
}
