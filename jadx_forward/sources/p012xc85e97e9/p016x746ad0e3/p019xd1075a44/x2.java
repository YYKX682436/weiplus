package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final o.a f91269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 f91270e;

    public x2(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var) {
        this.f91270e = z2Var;
        this.f91269d = new o.a(z2Var.f91280a.getContext(), 0, android.R.id.home, 0, 0, z2Var.f91288i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = this.f91270e;
        android.view.Window.Callback callback = z2Var.f91291l;
        if (callback == null || !z2Var.f91292m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f91269d);
    }
}
