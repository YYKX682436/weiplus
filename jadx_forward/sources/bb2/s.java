package bb2;

/* loaded from: classes10.dex */
public final class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f100512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f100513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.oo f100514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f100515g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f100516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100517i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f100518m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f100519n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f100520o;

    public s(r45.qt2 qt2Var, so2.u1 u1Var, r45.oo ooVar, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, android.widget.PopupWindow.OnDismissListener onDismissListener, android.view.View view, yz5.a aVar, boolean z17, int i17) {
        this.f100512d = qt2Var;
        this.f100513e = u1Var;
        this.f100514f = ooVar;
        this.f100515g = activityC21401x6ce6f73f;
        this.f100516h = onDismissListener;
        this.f100517i = view;
        this.f100518m = aVar;
        this.f100519n = z17;
        this.f100520o = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 10) {
            new bq.e1(this.f100512d, this.f100513e.mo2128x1ed62e84(), this.f100514f.m75942xfb822ef2(0), 1L).l().h(new bb2.r(this.f100517i, this.f100513e, this.f100514f, this.f100518m, this.f100515g, this.f100512d, this.f100519n, this.f100520o)).f(this.f100515g);
        }
        this.f100516h.onDismiss();
    }
}
