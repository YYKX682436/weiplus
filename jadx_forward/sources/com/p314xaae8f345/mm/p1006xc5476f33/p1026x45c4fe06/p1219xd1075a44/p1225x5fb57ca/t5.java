package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class t5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib {

    /* renamed from: f, reason: collision with root package name */
    public static final android.view.View.OnTouchListener f173196f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r5();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f173197d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p f173198e;

    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f173197d = v5Var;
        this.f173198e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p(v5Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bb bbVar) {
        if (bbVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bb.MODAL || bbVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bb.ACTION_SHEET) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.d(this.f173197d, null);
        }
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) fbVar.mo14662xc2a54588();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p pVar = this.f173198e;
        viewGroup.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s5(this, pVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i5(pVar)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        this.f173198e.d(i17, i18, i19, i27, view);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib
    /* renamed from: getContainer */
    public android.view.ViewGroup mo14679xe6eebdcb() {
        return this.f173198e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r8
    public void h(int i17) {
        this.f173198e.setTranslationY(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja
    public void j(boolean z17, int i17, int i18, int i19, int i27) {
        this.f173198e.j(z17, i17, i18, i19, i27);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
        if (fbVar.mo14662xc2a54588() == null) {
            return;
        }
        ((android.view.ViewGroup) fbVar.mo14662xc2a54588()).setOnTouchListener(f173196f);
    }
}
