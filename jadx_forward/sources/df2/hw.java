package df2;

/* loaded from: classes3.dex */
public final class hw implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.kw f311890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gw1 f311891e;

    public hw(df2.kw kwVar, r45.gw1 gw1Var) {
        this.f311890d = kwVar;
        this.f311891e = gw1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f311890d.f312137n.remove(java.lang.Integer.valueOf(this.f311891e.m75939xb282bd08(1)));
    }
}
