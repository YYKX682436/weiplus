package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class di extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f184689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f184690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, fc2.a aVar) {
        super(0);
        this.f184689d = ojVar;
        this.f184690e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17;
        fc2.t tVar = (fc2.t) this.f184690e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f184689d;
        java.util.ArrayList t17 = ojVar.t();
        so2.j5 j5Var = t17 != null ? (so2.j5) kz5.n0.a0(t17, tVar.f342527m) : null;
        boolean z17 = false;
        if (j5Var != null && (j5Var instanceof so2.n1)) {
            r45.en2 m76811x50f46773 = ((so2.n1) j5Var).getFeedObject().getFeedObject().m76811x50f46773();
            if ((m76811x50f46773 != null ? m76811x50f46773.m75939xb282bd08(2) : 0) == 8) {
                z17 = true;
            }
        }
        if (z17) {
            in5.s0 s0Var = ojVar.f185725q;
            o17 = s0Var != null ? s0Var.o() : null;
            if (o17 != null) {
                o17.setDescendantFocusability(262144);
            }
        } else {
            in5.s0 s0Var2 = ojVar.f185725q;
            o17 = s0Var2 != null ? s0Var2.o() : null;
            if (o17 != null) {
                o17.setDescendantFocusability(131072);
            }
        }
        return jz5.f0.f384359a;
    }
}
