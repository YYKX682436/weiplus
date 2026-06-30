package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public abstract class e2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f173730a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2 f173731b;

    public e2(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f173730a = view;
        this.f173731b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2(view);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<cover-view>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2 z2Var = this.f173731b;
        sb6.append(z2Var != null ? z2Var.b() : "");
        sb6.append("</cover-view>");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    public java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2 z2Var = this.f173731b;
        return z2Var != null ? z2Var.c() : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    /* renamed from: destroy */
    public void mo53732x5cd39ffa() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.z2 z2Var = this.f173731b;
        if (z2Var != null) {
            z2Var.mo53732x5cd39ffa();
        }
        this.f173731b = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r2
    public int id() {
        return this.f173730a.hashCode();
    }
}
