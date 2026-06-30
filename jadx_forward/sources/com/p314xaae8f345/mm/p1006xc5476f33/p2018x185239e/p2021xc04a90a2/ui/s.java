package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.y f238246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ow3 f238247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.v f238248f;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.y yVar, r45.ow3 ow3Var) {
        this.f238248f = vVar;
        this.f238246d = yVar;
        this.f238247e = ow3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.y yVar = this.f238246d;
        int measuredWidth = yVar.f238276e.getMeasuredWidth();
        r45.ow3 ow3Var = this.f238247e;
        if (measuredWidth != 0) {
            float measureText = yVar.f238277f.getPaint().measureText(ow3Var.f464109e);
            float measureText2 = yVar.f238278g.getPaint().measureText(ow3Var.f464110f);
            float b17 = i65.a.b(this.f238248f.f238258e, 14);
            float f17 = measuredWidth;
            if (measureText + measureText2 + b17 > f17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) yVar.f238277f.getLayoutParams();
                layoutParams.width = (int) ((f17 - measureText2) - b17);
                yVar.f238277f.setLayoutParams(layoutParams);
            }
        }
        yVar.f238277f.setText(ow3Var.f464109e);
        yVar.f238278g.setText(ow3Var.f464110f);
    }
}
