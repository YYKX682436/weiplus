package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class t2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f173843a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2 f173844b;

    public t2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        this.f173843a = bottomSheet;
        android.view.View view = bottomSheet.S;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f173844b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2(view);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<action-sheet>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2 z2Var = this.f173844b;
        sb6.append(z2Var != null ? z2Var.b() : "");
        sb6.append("</action-sheet>");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    public java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2 z2Var = this.f173844b;
        return z2Var != null ? z2Var.c() : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    /* renamed from: destroy */
    public void mo53732x5cd39ffa() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2 z2Var = this.f173844b;
        if (z2Var != null) {
            z2Var.mo53732x5cd39ffa();
        }
        this.f173844b = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    public int id() {
        return this.f173843a.hashCode();
    }
}
