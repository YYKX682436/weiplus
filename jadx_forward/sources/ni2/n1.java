package ni2;

/* loaded from: classes10.dex */
public final class n1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.r1 f418922d;

    public n1(ni2.r1 r1Var) {
        this.f418922d = r1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        ni2.r1 r1Var = this.f418922d;
        if (itemId == 1) {
            ((ni2.f1) ((jz5.n) r1Var.f418990g).mo141623x754a37bb()).B(r1Var.f418987d, r1Var.f418988e);
        } else {
            if (itemId != 2) {
                return;
            }
            ((nj2.b) ((jz5.n) r1Var.f418991h).mo141623x754a37bb()).w();
        }
    }
}
