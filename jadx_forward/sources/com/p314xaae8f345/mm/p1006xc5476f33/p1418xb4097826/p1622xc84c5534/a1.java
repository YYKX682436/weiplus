package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c1 f206470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c1 c1Var) {
        super(0);
        this.f206470d = c1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c1 c1Var = this.f206470d;
        c1Var.V0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 n4Var = c1Var.f206505v;
        if (n4Var != null) {
            n4Var.K(c1Var.f206821o);
            c1Var.S0(n4Var);
            r45.vd6 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4.f206684r0.d(n4Var, c1Var.f206817h);
            linkedList.add(d17);
            c1Var.U0(n4Var, d17, false);
        }
        c1Var.f206505v = null;
        if (!linkedList.isEmpty()) {
            c1Var.f206504u.addAll(linkedList);
            c1Var.R0();
        }
        return jz5.f0.f384359a;
    }
}
