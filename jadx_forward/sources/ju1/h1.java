package ju1;

/* loaded from: classes9.dex */
public final class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 f383259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju1.a f383260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f383261f;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76, ju1.a aVar, int i17) {
        this.f383259d = activityC13077xb3b83e76;
        this.f383260e = aVar;
        this.f383261f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76.f176955r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76 = this.f383259d;
        activityC13077xb3b83e76.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13077xb3b83e76.mo55332x76847179(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(activityC13077xb3b83e76.mo55332x76847179());
        textView.setText(activityC13077xb3b83e76.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asv));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(activityC13077xb3b83e76.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        textView.setGravity(17);
        int dimensionPixelSize = activityC13077xb3b83e76.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize2 = activityC13077xb3b83e76.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f293405n = new ju1.d1(activityC13077xb3b83e76);
        k0Var.f293414s = new ju1.e1(activityC13077xb3b83e76, this.f383260e, this.f383261f);
        k0Var.v();
    }
}
