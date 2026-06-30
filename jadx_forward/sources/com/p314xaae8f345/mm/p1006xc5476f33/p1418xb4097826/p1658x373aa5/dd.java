package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ov2 f213422a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213423b;

    public dd(r45.ov2 coupon, java.lang.String noticeId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coupon, "coupon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        this.f213422a = coupon;
        this.f213423b = noticeId;
    }

    /* renamed from: equals */
    public boolean m62610xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd ddVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213422a, ddVar.f213422a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213423b, ddVar.f213423b);
    }

    /* renamed from: hashCode */
    public int m62611x8cdac1b() {
        return (this.f213422a.hashCode() * 31) + this.f213423b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m62612x9616526c() {
        return "SuccessDialogData(coupon=" + this.f213422a + ", noticeId=" + this.f213423b + ')';
    }
}
