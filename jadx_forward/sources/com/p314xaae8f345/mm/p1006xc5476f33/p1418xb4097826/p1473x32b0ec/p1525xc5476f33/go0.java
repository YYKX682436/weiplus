package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class go0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.yv1 f194253a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ov1 f194254b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.c42 f194255c;

    public go0(r45.yv1 yv1Var, r45.ov1 ov1Var, r45.c42 c42Var) {
        this.f194253a = yv1Var;
        this.f194254b = ov1Var;
        this.f194255c = c42Var;
    }

    /* renamed from: equals */
    public boolean m56959xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go0 go0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194253a, go0Var.f194253a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194254b, go0Var.f194254b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194255c, go0Var.f194255c);
    }

    /* renamed from: hashCode */
    public int m56960x8cdac1b() {
        r45.yv1 yv1Var = this.f194253a;
        int hashCode = (yv1Var == null ? 0 : yv1Var.hashCode()) * 31;
        r45.ov1 ov1Var = this.f194254b;
        int hashCode2 = (hashCode + (ov1Var == null ? 0 : ov1Var.hashCode())) * 31;
        r45.c42 c42Var = this.f194255c;
        return hashCode2 + (c42Var != null ? c42Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m56961x9616526c() {
        return "SpecialProcessGiftExInfo(randomCtx=" + this.f194253a + ", attackCtx=" + this.f194254b + ", pkExtraItem=" + this.f194255c + ')';
    }
}
