package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f184005a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f184006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f184007c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f184008d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f184009e;

    public q0(long j17, java.lang.String str, int i17, java.lang.ref.WeakReference weakReference, java.lang.Boolean bool, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 4) != 0 ? 1 : i17;
        weakReference = (i18 & 8) != 0 ? null : weakReference;
        bool = (i18 & 16) != 0 ? java.lang.Boolean.FALSE : bool;
        this.f184005a = j17;
        this.f184006b = str;
        this.f184007c = i17;
        this.f184008d = weakReference;
        this.f184009e = bool;
    }

    /* renamed from: equals */
    public boolean m55542xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q0 q0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q0) obj;
        return this.f184005a == q0Var.f184005a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f184006b, q0Var.f184006b) && this.f184007c == q0Var.f184007c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f184008d, q0Var.f184008d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f184009e, q0Var.f184009e);
    }

    /* renamed from: hashCode */
    public int m55543x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f184005a) * 31;
        java.lang.String str = this.f184006b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f184007c)) * 31;
        java.lang.ref.WeakReference weakReference = this.f184008d;
        int hashCode3 = (hashCode2 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        java.lang.Boolean bool = this.f184009e;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m55544x9616526c() {
        return "ClickExtra(feedId=" + this.f184005a + ", dupFlag=" + this.f184006b + ", topicType=" + this.f184007c + ", contextRef=" + this.f184008d + ", isTopicTag=" + this.f184009e + ')';
    }
}
