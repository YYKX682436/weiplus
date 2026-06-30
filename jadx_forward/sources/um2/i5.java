package um2;

/* loaded from: classes3.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f510366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f510368f;

    public i5(android.os.Bundle bundle, um2.x5 x5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f510366d = bundle;
        this.f510367e = x5Var;
        this.f510368f = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dk dkVar;
        android.view.ViewGroup viewGroup;
        boolean z17 = false;
        android.os.Bundle bundle = this.f510366d;
        if (bundle != null && bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f510368f;
        um2.x5 x5Var = this.f510367e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = x5Var.f510619x;
            if ((etVar != null ? etVar.N : null) == null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = mgVar.f446856d.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                x5Var.f510560c1 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "lxltest2 22 originCommentBottomMargin:" + x5Var.f510560c1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar2 = x5Var.f510619x;
            if (etVar2 != null) {
                etVar2.N = x5Var.f510604s;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = mgVar.f446856d.getLayoutParams();
            layoutParams = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams != null) {
                layoutParams.addRule(12);
            }
            if (layoutParams != null) {
                layoutParams.removeRule(2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar3 = x5Var.f510619x;
            if (etVar3 == null || (viewGroup = etVar3.f446856d) == null) {
                return;
            }
            viewGroup.post(new um2.h5(x5Var));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui uiVar = x5Var.f510611u0;
        if (uiVar != null) {
            java.lang.Boolean valueOf = (uiVar == null || (dkVar = uiVar.f196101p) == null) ? null : java.lang.Boolean.valueOf(dkVar.b());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
            if (valueOf.booleanValue()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar4 = x5Var.f510619x;
                if (etVar4 != null) {
                    etVar4.N = null;
                }
                android.view.ViewGroup.LayoutParams layoutParams4 = mgVar.f446856d.getLayoutParams();
                layoutParams = layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams != null) {
                    layoutParams.removeRule(12);
                }
                if (layoutParams != null) {
                    layoutParams.addRule(2, x5Var.f510607t);
                }
                android.view.ViewGroup.LayoutParams layoutParams5 = mgVar.f446856d.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = x5Var.f510560c1;
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar5 = x5Var.f510619x;
        if (etVar5 != null) {
            etVar5.N = null;
        }
        android.view.ViewGroup.LayoutParams layoutParams6 = mgVar.f446856d.getLayoutParams();
        layoutParams = layoutParams6 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams != null) {
            layoutParams.removeRule(12);
        }
        if (layoutParams != null) {
            layoutParams.addRule(2, x5Var.f510607t);
        }
        android.view.ViewGroup.LayoutParams layoutParams7 = mgVar.f446856d.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = x5Var.f510560c1;
        mgVar.f446856d.requestLayout();
    }
}
