package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class l1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f1 I = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f1(null);

    /* renamed from: J, reason: collision with root package name */
    public static java.util.LinkedList f206643J = new java.util.LinkedList();
    public final jz5.g F;
    public final jz5.g G;
    public final boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.F = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k1(contextObj));
        this.G = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g1(activity, this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.H = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.V6).mo141623x754a37bb()).r()).intValue() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public void G0(fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 n4Var = this.f206641z;
        if (n4Var != null) {
            if (event instanceof ec2.a) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h1(event, this));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc k17 = k1();
            if (k17 != null) {
                k17.Z6(((java.lang.Number) ((jz5.n) this.F).mo141623x754a37bb()).intValue(), event, this.f206817h, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i1(n4Var, this));
            }
        }
        super.G0(event);
        if (event instanceof fc2.w) {
            fc2.w wVar = (fc2.w) event;
            if (wVar.f342533p != wVar.f342525k) {
                pm0.v.O("FinderReporterThread", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j1(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0
    public java.util.LinkedList R0() {
        java.util.LinkedList R0 = super.R0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc k17 = k1();
        if (k17 != null) {
            k17.T6(R0);
        }
        return R0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc k1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180;
        if (!this.H || (abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) ((jz5.n) this.G).mo141623x754a37bb()) == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc) pf5.z.f435481a.b(abstractC15124x7bae6180).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc.class);
    }
}
