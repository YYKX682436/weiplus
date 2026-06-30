package tm2;

/* loaded from: classes3.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f502088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f502090f;

    public n2(android.os.Bundle bundle, tm2.s2 s2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f502088d = bundle;
        this.f502089e = s2Var;
        this.f502090f = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = false;
        android.os.Bundle bundle = this.f502088d;
        if (bundle != null && bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f502090f;
        tm2.s2 s2Var = this.f502089e;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = s2Var.f502148z;
            if (etVar != null) {
                etVar.N = null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = mgVar.f446856d.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.addRule(2, s2Var.f502135n0);
            android.view.ViewGroup.LayoutParams layoutParams3 = mgVar.f446856d.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = s2Var.f502118e0;
            mgVar.f446856d.requestLayout();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar2 = s2Var.f502148z;
        if ((etVar2 != null ? etVar2.N : null) == null) {
            android.view.ViewGroup.LayoutParams layoutParams4 = mgVar.f446856d.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            s2Var.f502118e0 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar3 = s2Var.f502148z;
        if (etVar3 != null) {
            etVar3.N = s2Var.f502136o;
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = mgVar.f446856d.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.addRule(12);
        layoutParams6.removeRule(2);
    }
}
