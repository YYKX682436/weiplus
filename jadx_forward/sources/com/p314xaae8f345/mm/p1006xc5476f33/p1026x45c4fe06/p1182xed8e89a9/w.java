package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9;

/* loaded from: classes7.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.d f169245a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.d dVar) {
        this.f169245a = dVar;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: isProfileFromStart */
    public boolean m52340x29b81879() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o) this.f169245a).f169231g;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onExternalInspectMessage */
    public void m52341xdf1620bd(java.lang.String str) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.ProfileGlobalJSInterface", "onExternalInspectMessage data:%s", str);
        this.f169245a.m(str);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onInspectMessage */
    public void m52342x4d8a1f12(java.lang.String str) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.ProfileGlobalJSInterface", "onInspectorMsg data:%s", str);
        this.f169245a.s(str);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: profileStart */
    public void m52343x4849ec39() {
        this.f169245a.I();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: profileStop */
    public java.lang.String m52344xa97094b() {
        return this.f169245a.L1();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: sendExternalInspectMessage */
    public void m52345xf8d34da6(java.lang.String str) {
        this.f169245a.s(str);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: sendInspectMessage */
    public void m52346x9f344fb(java.lang.String str) {
        this.f169245a.m(str);
    }
}
