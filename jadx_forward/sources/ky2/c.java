package ky2;

/* loaded from: classes.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f395048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395049g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f395050h;

    public c(ky2.w wVar, int i17, android.widget.TextView textView, android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f395046d = wVar;
        this.f395047e = i17;
        this.f395048f = textView;
        this.f395049g = view;
        this.f395050h = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        ky2.w wVar = this.f395046d;
        int i18 = wVar.f395122i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f395050h;
        android.view.View view = this.f395049g;
        android.widget.TextView textView = this.f395048f;
        int i19 = this.f395047e;
        if (itemId == i18) {
            ((ky2.r) wVar.f395118e.get(i19)).f395109b.f395111a = true;
            textView.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejt));
            k0Var.u();
        } else if (itemId == wVar.f395123m) {
            ((ky2.r) wVar.f395118e.get(i19)).f395109b.f395111a = false;
            textView.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejr));
            k0Var.u();
        }
    }
}
