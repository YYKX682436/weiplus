package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f265727a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f265728b;

    public e(int i17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        this.f265727a = i17;
        this.f265728b = bundle;
    }

    /* renamed from: equals */
    public boolean m74439xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e) obj;
        return this.f265727a == eVar.f265727a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f265728b, eVar.f265728b);
    }

    /* renamed from: hashCode */
    public int m74440x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f265727a) * 31) + this.f265728b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74441x9616526c() {
        return "JSApiInfo(id=" + this.f265727a + ", bundle=" + this.f265728b + ')';
    }
}
