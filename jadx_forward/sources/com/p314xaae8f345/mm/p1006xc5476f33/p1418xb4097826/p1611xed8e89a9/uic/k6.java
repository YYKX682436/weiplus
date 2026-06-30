package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f205421a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.SpannableString f205422b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.StringBuilder f205423c;

    public k6(java.lang.String signature, android.text.SpannableString spannableString, java.lang.StringBuilder reportNickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportNickName, "reportNickName");
        this.f205421a = signature;
        this.f205422b = spannableString;
        this.f205423c = reportNickName;
    }

    /* renamed from: equals */
    public boolean m58727xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k6 k6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f205421a, k6Var.f205421a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f205422b, k6Var.f205422b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f205423c, k6Var.f205423c);
    }

    /* renamed from: hashCode */
    public int m58728x8cdac1b() {
        int hashCode = this.f205421a.hashCode() * 31;
        android.text.SpannableString spannableString = this.f205422b;
        return ((hashCode + (spannableString == null ? 0 : spannableString.hashCode())) * 31) + this.f205423c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58729x9616526c() {
        return "DescSpanInfo(signature=" + this.f205421a + ", signatureSpan=" + ((java.lang.Object) this.f205422b) + ", reportNickName=" + ((java.lang.Object) this.f205423c) + ')';
    }
}
