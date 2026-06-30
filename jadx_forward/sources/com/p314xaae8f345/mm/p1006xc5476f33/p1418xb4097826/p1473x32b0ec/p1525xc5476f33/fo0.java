package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class fo0 {

    /* renamed from: a, reason: collision with root package name */
    public final ce2.i f194113a;

    /* renamed from: b, reason: collision with root package name */
    public r45.e82 f194114b;

    public fo0(ce2.i giftInfo, r45.e82 e82Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftInfo, "giftInfo");
        this.f194113a = giftInfo;
        this.f194114b = e82Var;
    }

    /* renamed from: equals */
    public boolean m56944xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo0 fo0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194113a, fo0Var.f194113a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194114b, fo0Var.f194114b);
    }

    /* renamed from: hashCode */
    public int m56945x8cdac1b() {
        int hashCode = this.f194113a.hashCode() * 31;
        r45.e82 e82Var = this.f194114b;
        return hashCode + (e82Var == null ? 0 : e82Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m56946x9616526c() {
        return "PrepareRewardSendInfo(giftInfo=" + this.f194113a + ", prepareResp=" + this.f194114b + ')';
    }
}
