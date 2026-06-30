package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rd5 f168424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0 f168425e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0 p0Var, r45.rd5 rd5Var) {
        this.f168425e = p0Var;
        this.f168424d = rd5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0 p0Var = this.f168425e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = p0Var.f168516e;
        r45.rd5 rd5Var = this.f168424d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = p0Var.f168513b;
        java.lang.String str = p0Var.f168514c;
        l01.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72.G;
        c12494xc37d1f72.getClass();
        if (rd5Var.f466282o) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x5 x5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x5(c12494xc37d1f72.getContext());
            x5Var.setWidth(-1);
            x5Var.setHeight(-2);
            android.widget.ImageView imageView = (android.widget.ImageView) x5Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.ocb);
            l01.b bVar = l01.d0.f396294a;
            bVar.b(imageView, rd5Var.f466281n, null, null);
            android.widget.TextView textView = (android.widget.TextView) x5Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.r1_);
            textView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v5(textView, rd5Var, x5Var));
            ((android.widget.TextView) x5Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.r17)).setText(rd5Var.f466275e);
            bVar.b((android.widget.ImageView) x5Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.chb), rd5Var.f466276f, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w5(x5Var));
            ((android.widget.ImageView) x5Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.l66)).setVisibility(rd5Var.f466278h ? 0 : 8);
            ((android.widget.TextView) x5Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.chx)).setText(rd5Var.f466277g);
            x5Var.getContentView().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t0(c12494xc37d1f72, rd5Var, o6Var, str));
            x5Var.getContentView().measure(0, 0);
            x5Var.showAsDropDown(c12494xc37d1f72, 0, -(c12494xc37d1f72.getHeight() + x5Var.getContentView().getMeasuredHeight() + c12494xc37d1f72.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aii)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.f(o6Var.f156336n, o6Var.N2().X1(), str, 3, c12494xc37d1f72.f167882f ? 2 : 1);
        }
    }
}
