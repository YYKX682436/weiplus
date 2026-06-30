package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.tc1 f206544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(r45.tc1 tc1Var) {
        super(1);
        this.f206544d = tc1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        sc2.q8 q8Var;
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f84680h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = p0Var != null ? p0Var.f534767a : null;
        r45.tc1 tc1Var = this.f206544d;
        boolean z17 = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19786x6a1e2862, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) tc1Var.m75936x14adae67(0))) {
            xc2.p0 p0Var2 = observer.f84680h;
            if (p0Var2 != null && (q8Var = p0Var2.f534766J) != null && q8Var.f487710a) {
                z17 = true;
            }
            if (z17) {
                tc1Var.set(1, 2);
            }
        }
        return jz5.f0.f384359a;
    }
}
