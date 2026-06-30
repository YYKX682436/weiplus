package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class i7 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f205322e;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, boolean z17) {
        this.f205321d = obVar;
        this.f205322e = z17;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        ya2.b2 m58740xf5e37f2d;
        r45.lh2 req = (r45.lh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205321d;
        if (m75939xb282bd08 != 0) {
            db5.t7.m123883x26a183b(obVar.m158354x19263085(), obVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.eoi), 0).show();
            return;
        }
        ya2.g gVar = ya2.h.f542017a;
        ya2.b2 b17 = gVar.b(obVar.m58741x6c03c64c());
        if (b17 != null) {
            int m75939xb282bd082 = req.m75939xb282bd08(1);
            boolean z17 = this.f205322e;
            if (m75939xb282bd082 == 1) {
                b17.f69308x26b1b2e8 |= 16384;
                if (z17) {
                    db5.t7.i(obVar.m158354x19263085(), obVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.eom), com.p314xaae8f345.mm.R.raw.f79727x82c23f2a);
                }
                if (ya2.g.h(gVar, obVar.m58741x6c03c64c(), null, true, false, 10, null) && (m58740xf5e37f2d = obVar.m58740xf5e37f2d()) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.O6(obVar, m58740xf5e37f2d);
                }
            } else {
                b17.f69308x26b1b2e8 &= -16385;
                if (z17) {
                    db5.t7.i(obVar.m158354x19263085(), obVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.eon), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                }
            }
            gVar.o(b17);
            boolean z18 = req.m75939xb282bd08(1) == 1;
            jz5.g gVar2 = obVar.f205604p0;
            if (z18) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(0);
            } else {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(8);
            }
        }
    }
}
