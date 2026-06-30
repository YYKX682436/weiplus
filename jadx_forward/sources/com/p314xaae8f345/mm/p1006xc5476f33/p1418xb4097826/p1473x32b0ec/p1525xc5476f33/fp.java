package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class fp {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f194115a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f194116b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.b82 f194117c;

    /* renamed from: d, reason: collision with root package name */
    public final int f194118d;

    public fp(gk2.e buContext, java.lang.String sendGiftTargetUserName, r45.b82 giftExtInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendGiftTargetUserName, "sendGiftTargetUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftExtInfo, "giftExtInfo");
        this.f194115a = buContext;
        this.f194116b = sendGiftTargetUserName;
        this.f194117c = giftExtInfo;
        this.f194118d = i17;
    }

    /* renamed from: equals */
    public boolean m56947xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fp)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fp fpVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fp) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194115a, fpVar.f194115a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194116b, fpVar.f194116b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194117c, fpVar.f194117c) && this.f194118d == fpVar.f194118d;
    }

    /* renamed from: hashCode */
    public int m56948x8cdac1b() {
        return (((((this.f194115a.hashCode() * 31) + this.f194116b.hashCode()) * 31) + this.f194117c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f194118d);
    }

    /* renamed from: toString */
    public java.lang.String m56949x9616526c() {
        return "LocalGiftMsgParams(buContext=" + this.f194115a + ", sendGiftTargetUserName=" + this.f194116b + ", giftExtInfo=" + this.f194117c + ", pk_extra_times_multi_100=" + this.f194118d + ')';
    }
}
