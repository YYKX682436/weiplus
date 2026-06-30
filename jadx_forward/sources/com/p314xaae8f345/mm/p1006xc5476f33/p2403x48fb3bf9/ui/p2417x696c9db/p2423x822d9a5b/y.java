package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f265772a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f265773b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f265774c;

    /* renamed from: d, reason: collision with root package name */
    public final long f265775d;

    public y(java.lang.String rawUrl, java.lang.String str, java.lang.String key, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawUrl, "rawUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f265772a = rawUrl;
        this.f265773b = str;
        this.f265774c = key;
        this.f265775d = j17;
    }

    /* renamed from: equals */
    public boolean m74453xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f265772a, yVar.f265772a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f265773b, yVar.f265773b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f265774c, yVar.f265774c) && this.f265775d == yVar.f265775d;
    }

    /* renamed from: hashCode */
    public int m74454x8cdac1b() {
        int hashCode = this.f265772a.hashCode() * 31;
        java.lang.String str = this.f265773b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f265774c.hashCode()) * 31) + java.lang.Long.hashCode(this.f265775d);
    }

    /* renamed from: toString */
    public java.lang.String m74455x9616526c() {
        return "WebViewFloatBallDataObject(rawUrl=" + this.f265772a + ", currentProcess=" + this.f265773b + ", key=" + this.f265774c + ", activeTime=" + this.f265775d + ')';
    }
}
