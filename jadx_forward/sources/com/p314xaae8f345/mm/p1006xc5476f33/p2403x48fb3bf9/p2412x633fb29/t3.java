package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264654a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f264655b;

    public t3(java.lang.String str, java.lang.String str2) {
        this.f264654a = str;
        this.f264655b = str2;
    }

    /* renamed from: equals */
    public boolean m74313xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t3 t3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f264654a, t3Var.f264654a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f264655b, t3Var.f264655b);
    }

    /* renamed from: hashCode */
    public int m74314x8cdac1b() {
        java.lang.String str = this.f264654a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f264655b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m74315x9616526c() {
        return "WebViewDownloadInfo(bizInfo=" + this.f264654a + ", sourceInfo=" + this.f264655b + ')';
    }
}
