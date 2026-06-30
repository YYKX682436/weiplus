package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class f0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y9 f168127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 f168129f;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72, r45.y9 y9Var, java.lang.String str) {
        this.f168129f = c12494xc37d1f72;
        this.f168127d = y9Var;
        this.f168128e = str;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f168127d.f472409g.f469527d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        r45.y9 y9Var = this.f168127d;
        r45.w9 w9Var = (r45.w9) y9Var.f472409g.f469527d.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w0) k3Var;
        em.d dVar = w0Var.f168722d;
        if (dVar.f335724d == null) {
            dVar.f335724d = (android.widget.TextView) dVar.f335721a.findViewById(com.p314xaae8f345.mm.R.id.vgv);
        }
        dVar.f335724d.setText(w9Var.f470508d);
        em.d dVar2 = w0Var.f168722d;
        android.widget.ImageView a17 = dVar2.a();
        if (!w9Var.f470509e.equals(a17.getTag())) {
            a17.setTag(w9Var.f470509e);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                l01.d0.f396294a.b(dVar2.a(), w9Var.f470510f, l01.a.h(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72.G);
            } else {
                l01.d0.f396294a.b(dVar2.a(), w9Var.f470509e, l01.a.h(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72.G);
            }
        }
        if (i17 != y9Var.f472409g.f469527d.size() - 1) {
            dVar2.b().setVisibility(8);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y9Var.f472409g.f469528e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y9Var.f472409g.f469529f)) {
            dVar2.b().setVisibility(8);
            return;
        }
        dVar2.b().setVisibility(0);
        dVar2.b().setText(y9Var.f472409g.f469528e);
        dVar2.b().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e0(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = this.f168129f;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w0(c12494xc37d1f72, android.view.LayoutInflater.from(c12494xc37d1f72.f167881e.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569636dz3, viewGroup, false));
    }
}
