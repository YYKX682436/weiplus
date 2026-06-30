package in2;

/* loaded from: classes10.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374346e;

    public c(in2.s sVar, android.view.View view) {
        this.f374345d = sVar;
        this.f374346e = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        in2.s sVar = this.f374345d;
        if (itemId == sVar.L) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = sVar.P;
            if (viewOnClickListenerC22631x1cc07cc8 != null) {
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
            }
            sf2.x xVar = sVar.I;
            xVar.q7(false);
            xVar.n7(false, new in2.l(sVar, false, this.f374346e));
        }
    }
}
