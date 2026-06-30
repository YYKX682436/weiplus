package bb2;

/* loaded from: classes10.dex */
public final class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo f19061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f19062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f19063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f19064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f19065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f19066i;

    public x(r45.oo ooVar, so2.u1 u1Var, android.widget.PopupWindow.OnDismissListener onDismissListener, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, r45.qt2 qt2Var, boolean z17) {
        this.f19061d = ooVar;
        this.f19062e = u1Var;
        this.f19063f = onDismissListener;
        this.f19064g = mMFragmentActivity;
        this.f19065h = qt2Var;
        this.f19066i = z17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 11) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y yVar = hb2.y.f280114e;
            long j17 = this.f19061d.getLong(0);
            so2.u1 u1Var = this.f19062e;
            yVar.n(j17, u1Var.getFeedObject().getId(), u1Var.getFeedObject().getObjectNonceId(), true, new bb2.w(this.f19064g, this.f19065h, this.f19066i, this.f19061d, this.f19062e));
        }
        this.f19063f.onDismiss();
    }
}
