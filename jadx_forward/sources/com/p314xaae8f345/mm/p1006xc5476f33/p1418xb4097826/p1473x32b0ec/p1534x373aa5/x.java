package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f198319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        super(1);
        this.f198319d = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        boolean z17;
        java.lang.String uId = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uId, "uId");
        java.util.List Z6 = ((mm2.o4) this.f198319d.m57635xbba4bfc0(mm2.o4.class)).Z6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Z6, "<get-allLinkMicUserList>(...)");
        synchronized (Z6) {
            java.util.Iterator it = Z6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390703a, uId)) {
                    break;
                }
            }
        }
        km2.q qVar = (km2.q) obj2;
        if (qVar == null && ((om2.l) this.f198319d.m57635xbba4bfc0(om2.l.class)).R6()) {
            z17 = true;
            qVar = new km2.q(uId, null, null, null, 1, null, null, false, 0, null, null, 0, 0, false, null, false, 0L, null, false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -128, 1, null);
        } else {
            z17 = false;
        }
        return new jz5.l(qVar, java.lang.Boolean.valueOf(z17));
    }
}
