package bb2;

/* loaded from: classes10.dex */
public final class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f18979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f18980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.oo f18981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f18982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f18983h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18984i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f18985m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f18986n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18987o;

    public s(r45.qt2 qt2Var, so2.u1 u1Var, r45.oo ooVar, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, android.widget.PopupWindow.OnDismissListener onDismissListener, android.view.View view, yz5.a aVar, boolean z17, int i17) {
        this.f18979d = qt2Var;
        this.f18980e = u1Var;
        this.f18981f = ooVar;
        this.f18982g = mMFragmentActivity;
        this.f18983h = onDismissListener;
        this.f18984i = view;
        this.f18985m = aVar;
        this.f18986n = z17;
        this.f18987o = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 10) {
            new bq.e1(this.f18979d, this.f18980e.getItemId(), this.f18981f.getLong(0), 1L).l().h(new bb2.r(this.f18984i, this.f18980e, this.f18981f, this.f18985m, this.f18982g, this.f18979d, this.f18986n, this.f18987o)).f(this.f18982g);
        }
        this.f18983h.onDismiss();
    }
}
