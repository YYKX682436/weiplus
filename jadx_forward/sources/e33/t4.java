package e33;

/* loaded from: classes10.dex */
public class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f329011d;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f329011d = activityC15656x6f26b561;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        e33.h5 h5Var;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f329011d;
        boolean z17 = !activityC15656x6f26b561.f220130q;
        activityC15656x6f26b561.f220130q = z17;
        if (z17) {
            activityC15656x6f26b561.F7(true);
            if (activityC15656x6f26b561.f220124m.size() == 0 && !t21.d3.s()) {
                activityC15656x6f26b561.D.performClick();
            }
            if (t21.d3.s() && (((i18 = activityC15656x6f26b561.L) == 3 || i18 == 16) && activityC15656x6f26b561.f220130q)) {
                activityC15656x6f26b561.U6(true);
                activityC15656x6f26b561.Q1.Y0(activityC15656x6f26b561.e7());
                activityC15656x6f26b561.s7();
            } else {
                activityC15656x6f26b561.f220137x.setVisibility(8);
            }
        } else {
            activityC15656x6f26b561.F7(false);
            activityC15656x6f26b561.f220137x.setVisibility(8);
            activityC15656x6f26b561.X6(true);
        }
        activityC15656x6f26b561.f220136w.setText(activityC15656x6f26b561.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573715fj0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 k17 = activityC15656x6f26b561.f220112e.k(activityC15656x6f26b561.f220126o.intValue());
        if (k17 != null) {
            activityC15656x6f26b561.K7(k17);
        }
        if (t21.d3.s() && (((i17 = activityC15656x6f26b561.L) == 3 || i17 == 16) && (h5Var = (e33.h5) activityC15656x6f26b561.f220114f.mo7946xf939df19()) != null)) {
            h5Var.f328797o = activityC15656x6f26b561.f220130q;
            h5Var.m8146xced61ae5();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
