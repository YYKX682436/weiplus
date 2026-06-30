package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class qd implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f284158d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f284159e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.pd f284160f;

    public qd(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.pd pdVar) {
        this.f284158d = str;
        this.f284160f = pdVar;
        this.f284159e = new android.widget.LinearLayout(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean W5() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return this.f284158d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f284159e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str = this.f284158d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowRedDotCompoent", "menuKey:%s，show：%s", str, valueOf);
        this.f284160f.a(z17, str);
        return true;
    }
}
