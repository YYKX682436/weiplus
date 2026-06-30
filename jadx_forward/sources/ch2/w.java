package ch2;

/* loaded from: classes10.dex */
public final class w implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f123017d;

    public w(ch2.o2 o2Var) {
        this.f123017d = o2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            ch2.o2 o2Var = this.f123017d;
            r45.yx1 Q6 = o2Var.q7().Q6();
            if (Q6 != null) {
                o2Var.E(Q6, new ch2.z(o2Var));
            }
        }
    }
}
