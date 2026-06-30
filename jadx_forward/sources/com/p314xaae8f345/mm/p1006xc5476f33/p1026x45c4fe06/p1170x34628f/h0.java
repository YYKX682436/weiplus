package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class h0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y9 f168181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f168182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 f168184g;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72, r45.y9 y9Var, yz5.a aVar, java.lang.String str) {
        this.f168184g = c12494xc37d1f72;
        this.f168181d = y9Var;
        this.f168182e = aVar;
        this.f168183f = str;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.LinkedList linkedList = this.f168181d.f472407e.f455948d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = this.f168184g;
        float dimension = c12494xc37d1f72.f167881e.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aif) * i65.a.q(c12494xc37d1f72.f167881e.getContext());
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTextSize(dimension);
        float dimensionPixelSize = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f278668a - c12494xc37d1f72.f167881e.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float f17 = 0.0f;
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            java.lang.String str = ((r45.ba) linkedList.get(i17)).f452177e;
            if (str == null) {
                str = "";
            }
            f17 += textPaint.measureText(str) + c12494xc37d1f72.f167881e.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            if (f17 > dimensionPixelSize) {
                return i17;
            }
        }
        return linkedList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b1) k3Var).f167955d.setText(((r45.ba) this.f168181d.f472407e.f455948d.get(i17)).f452177e);
        k3Var.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g0(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = this.f168184g;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b1(c12494xc37d1f72, android.view.LayoutInflater.from(c12494xc37d1f72.f167881e.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cb_, viewGroup, false));
    }
}
