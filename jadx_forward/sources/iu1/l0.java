package iu1;

/* loaded from: classes.dex */
public final class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 f376431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f376432e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025, r45.g45 g45Var) {
        this.f376431d = activityC13065x7a79a025;
        this.f376432e = g45Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025.f176731v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025 = this.f376431d;
        activityC13065x7a79a025.getClass();
        r45.g45 g45Var = this.f376432e;
        if (g45Var == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13065x7a79a025.mo55332x76847179(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(activityC13065x7a79a025.mo55332x76847179());
        textView.setText(activityC13065x7a79a025.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asv));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(activityC13065x7a79a025.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        textView.setGravity(17);
        int dimensionPixelSize = activityC13065x7a79a025.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize2 = activityC13065x7a79a025.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f293405n = new iu1.m0(activityC13065x7a79a025);
        k0Var.f293414s = new iu1.n0(activityC13065x7a79a025, g45Var);
        k0Var.v();
    }
}
