package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class s0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f168603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f168604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 f168605f;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f168605f = c12494xc37d1f72;
        this.f168603d = list;
        this.f168604e = o6Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f168603d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x0) this.f168603d.get(i17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v0) k3Var).f168688d.setText(x0Var.f168774b.f454596d);
        k3Var.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r0(this, x0Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = this.f168605f;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v0(c12494xc37d1f72, android.view.LayoutInflater.from(c12494xc37d1f72.f167881e.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dyr, viewGroup, false));
    }
}
