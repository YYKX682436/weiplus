package bb2;

/* loaded from: classes10.dex */
public final class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo f100594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f100595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f100596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f100597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f100598h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f100599i;

    public x(r45.oo ooVar, so2.u1 u1Var, android.widget.PopupWindow.OnDismissListener onDismissListener, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, r45.qt2 qt2Var, boolean z17) {
        this.f100594d = ooVar;
        this.f100595e = u1Var;
        this.f100596f = onDismissListener;
        this.f100597g = activityC21401x6ce6f73f;
        this.f100598h = qt2Var;
        this.f100599i = z17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 11) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y yVar = hb2.y.f361647e;
            long m75942xfb822ef2 = this.f100594d.m75942xfb822ef2(0);
            so2.u1 u1Var = this.f100595e;
            yVar.n(m75942xfb822ef2, u1Var.getFeedObject().m59251x5db1b11(), u1Var.getFeedObject().m59276x6c285d75(), true, new bb2.w(this.f100597g, this.f100598h, this.f100599i, this.f100594d, this.f100595e));
        }
        this.f100596f.onDismiss();
    }
}
