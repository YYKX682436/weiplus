package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f266385a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f266386b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f266387c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f266388d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f266389e;

    public j3(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        z19 = (i17 & 4) != 0 ? false : z19;
        z27 = (i17 & 8) != 0 ? false : z27;
        z28 = (i17 & 16) != 0 ? false : z28;
        this.f266385a = z17;
        this.f266386b = z18;
        this.f266387c = z19;
        this.f266388d = z27;
        this.f266389e = z28;
    }

    /* renamed from: equals */
    public boolean m74485xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j3 j3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j3) obj;
        return this.f266385a == j3Var.f266385a && this.f266386b == j3Var.f266386b && this.f266387c == j3Var.f266387c && this.f266388d == j3Var.f266388d && this.f266389e == j3Var.f266389e;
    }

    /* renamed from: hashCode */
    public int m74486x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f266385a) * 31) + java.lang.Boolean.hashCode(this.f266386b)) * 31) + java.lang.Boolean.hashCode(this.f266387c)) * 31) + java.lang.Boolean.hashCode(this.f266388d)) * 31) + java.lang.Boolean.hashCode(this.f266389e);
    }

    /* renamed from: toString */
    public java.lang.String m74487x9616526c() {
        return "UrlParams(immersiveStyle=" + this.f266385a + ", immersiveBgDark=" + this.f266386b + ", immersiveVideoStyle=" + this.f266387c + ", hideWebViewTitle=" + this.f266388d + ", fakeImmersiveStyle=" + this.f266389e + ')';
    }
}
