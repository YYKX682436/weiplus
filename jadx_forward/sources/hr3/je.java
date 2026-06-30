package hr3;

/* loaded from: classes.dex */
public final class je implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f365234e;

    public je(hr3.pf pfVar, android.widget.TextView textView) {
        this.f365233d = pfVar;
        this.f365234e = textView;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            hr3.pf pfVar = this.f365233d;
            hr3.pf.P6(pfVar, 3, 0);
            pfVar.Y6("", "");
            this.f365234e.setVisibility(8);
        }
    }
}
