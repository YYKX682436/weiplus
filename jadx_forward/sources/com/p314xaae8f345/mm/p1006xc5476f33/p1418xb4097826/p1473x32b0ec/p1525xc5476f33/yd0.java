package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yd0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 f196720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.t12 f196721e;

    public yd0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var, r45.t12 t12Var) {
        this.f196720d = de0Var;
        this.f196721e = t12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var = this.f196720d;
        int width = de0Var.v1().getWidth();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.view.ViewGroup viewGroup = de0Var.f446856d;
        android.content.Context context = viewGroup.getContext();
        r45.t12 t12Var = this.f196721e;
        java.lang.String m75945x2fec8307 = t12Var.m75945x2fec8307(2);
        ((ke0.e) xVar).getClass();
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307), de0Var.v1().getPaint(), width, android.text.Layout.Alignment.ALIGN_NORMAL, de0Var.v1().getLineSpacingMultiplier(), de0Var.v1().getLineSpacingExtra(), true);
        int height = viewGroup.getHeight();
        jz5.g gVar = de0Var.f193811s;
        int height2 = height - ((android.widget.ScrollView) ((jz5.n) gVar).mo141623x754a37bb()).getHeight();
        int b17 = i65.a.b(viewGroup.getContext(), 155) - height2;
        if (staticLayout.getHeight() > b17) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = viewGroup.getContext();
            java.lang.String m75945x2fec83072 = t12Var.m75945x2fec8307(2);
            ((ke0.e) xVar2).getClass();
            int height3 = (int) ((new android.text.StaticLayout(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, m75945x2fec83072), de0Var.v1().getPaint(), width, android.text.Layout.Alignment.ALIGN_NORMAL, de0Var.v1().getLineSpacingMultiplier(), de0Var.v1().getLineSpacingExtra(), true).getHeight() / staticLayout.getLineCount()) * 2 * 1.2f);
            viewGroup.getLayoutParams().height = height3 > b17 ? height3 + height2 : b17 + height2;
            ((android.widget.ScrollView) ((jz5.n) gVar).mo141623x754a37bb()).getHeight();
        }
        de0Var.v1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xd0(de0Var));
    }
}
