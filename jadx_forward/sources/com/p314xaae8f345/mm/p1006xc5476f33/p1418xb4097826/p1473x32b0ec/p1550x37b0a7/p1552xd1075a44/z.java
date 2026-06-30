package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final r45.z94 f202357a;

    /* renamed from: b, reason: collision with root package name */
    public android.text.SpannableString f202358b;

    public z(r45.z94 giftWish, android.text.SpannableString spannableString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftWish, "giftWish");
        this.f202357a = giftWish;
        this.f202358b = spannableString;
    }

    /* renamed from: equals */
    public boolean m58209xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.z)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f202357a, zVar.f202357a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f202358b, zVar.f202358b);
    }

    /* renamed from: hashCode */
    public int m58210x8cdac1b() {
        int hashCode = this.f202357a.hashCode() * 31;
        android.text.SpannableString spannableString = this.f202358b;
        return hashCode + (spannableString == null ? 0 : spannableString.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m58211x9616526c() {
        return "GiftWishRecommendData(giftWish=" + this.f202357a + ", spannableString=" + ((java.lang.Object) this.f202358b) + ')';
    }
}
