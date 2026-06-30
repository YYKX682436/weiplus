package yl2;

/* loaded from: classes3.dex */
public final class w0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f544613d;

    public w0(int i17, v65.n nVar, int i18) {
        this.f544613d = nVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        v65.n nVar = this.f544613d;
        if (valueOf != null && valueOf.intValue() == 1) {
            nVar.a(yl2.i.f544554d);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            nVar.a(yl2.i.f544555e);
        }
    }
}
