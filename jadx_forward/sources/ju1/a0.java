package ju1;

/* loaded from: classes9.dex */
public final class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 f383224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju1.a f383225e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1, ju1.a aVar) {
        this.f383224d = activityC13076xc17cada1;
        this.f383225e = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1.f176947s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1 = this.f383224d;
        activityC13076xc17cada1.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13076xc17cada1.mo55332x76847179(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(activityC13076xc17cada1.mo55332x76847179());
        textView.setText(activityC13076xc17cada1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asv));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(activityC13076xc17cada1.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        textView.setGravity(17);
        int dimensionPixelSize = activityC13076xc17cada1.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize2 = activityC13076xc17cada1.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f293405n = new ju1.b0(activityC13076xc17cada1);
        k0Var.f293414s = new ju1.c0(activityC13076xc17cada1, this.f383225e);
        k0Var.v();
    }
}
