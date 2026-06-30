package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class f4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 f232658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f232660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var, int i17, fm3.q qVar) {
        super(1);
        this.f232658d = h4Var;
        this.f232659e = i17;
        this.f232660f = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fm3.w animationInfo = (fm3.w) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationInfo, "animationInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g3 g3Var = this.f232658d.f232704r;
        if (g3Var != null) {
            ((jm3.c0) g3Var).a(this.f232659e, this.f232660f, true, animationInfo);
        }
        return jz5.f0.f384359a;
    }
}
