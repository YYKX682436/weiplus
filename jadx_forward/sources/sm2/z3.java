package sm2;

/* loaded from: classes3.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f491343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f491345f;

    public z3(android.os.Bundle bundle, sm2.o4 o4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f491343d = bundle;
        this.f491344e = o4Var;
        this.f491345f = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        boolean z17 = false;
        android.os.Bundle bundle = this.f491343d;
        if (bundle != null && bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f491345f;
        sm2.o4 o4Var = this.f491344e;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = o4Var.A;
            if (etVar != null) {
                etVar.N = null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = mgVar.f446856d.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.addRule(2, com.p314xaae8f345.mm.R.id.fin);
            android.view.ViewGroup.LayoutParams layoutParams3 = mgVar.f446856d.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = o4Var.f491152j0;
            mgVar.f446856d.requestLayout();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar2 = o4Var.A;
        if ((etVar2 != null ? etVar2.N : null) == null) {
            android.view.ViewGroup.LayoutParams layoutParams4 = mgVar.f446856d.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            o4Var.f491152j0 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar3 = o4Var.A;
        if (etVar3 != null) {
            etVar3.N = o4Var.f491161o;
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = mgVar.f446856d.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.addRule(12);
        layoutParams6.removeRule(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar4 = o4Var.A;
        if (etVar4 == null || (viewGroup = etVar4.f446856d) == null) {
            return;
        }
        viewGroup.post(new sm2.y3(o4Var));
    }
}
