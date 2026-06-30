package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class sa implements ni1.f {

    /* renamed from: d, reason: collision with root package name */
    public final ni1.f f168620d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o f168621e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f168622f;

    public sa(ni1.f originExtension) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originExtension, "originExtension");
        this.f168620d = originExtension;
    }

    @Override // ni1.f
    public void P() {
        android.view.View mo51532x11b85c7e;
        boolean z17 = false;
        this.f168622f = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = this.f168621e;
        if (oVar != null && (mo51532x11b85c7e = ((of1.w1) oVar).mo51532x11b85c7e()) != null && mo51532x11b85c7e.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17) {
            this.f168620d.P();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar2 = this.f168621e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar2);
        ((of1.w1) oVar2).P();
    }

    @Override // ni1.f
    public void V() {
        this.f168622f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = this.f168621e;
        if (oVar != null) {
            ((of1.w1) oVar).V();
        }
        this.f168620d.V();
    }

    public final void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f168621e, oVar)) {
            return;
        }
        this.f168621e = oVar;
        if (this.f168622f) {
            V();
        } else {
            P();
            if (this.f168621e != null) {
                this.f168620d.V();
            }
        }
        if (oVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ra raVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ra(this);
            of1.w1 w1Var = (of1.w1) oVar;
            if (w1Var.f426569g) {
                return;
            }
            w1Var.f426583x.add(raVar);
        }
    }
}
