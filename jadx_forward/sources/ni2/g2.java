package ni2;

/* loaded from: classes10.dex */
public final class g2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.k2 f418837d;

    public g2(ni2.k2 k2Var) {
        this.f418837d = k2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        km2.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        ni2.k2 k2Var = this.f418837d;
        if (itemId != 1) {
            if (itemId != 4) {
                return;
            }
            k2Var.a();
            return;
        }
        fj2.s sVar = fj2.s.f344716a;
        ml2.w4 w4Var = ml2.w4.f409724i;
        xh2.a aVar = k2Var.f418895d;
        if (aVar == null || (qVar = aVar.f536053a) == null || (str = qVar.f390705c) == null) {
            str = "";
        }
        fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        ((ni2.f1) ((jz5.n) k2Var.f418898g).mo141623x754a37bb()).B(k2Var.f418895d, k2Var.f418896e);
    }
}
