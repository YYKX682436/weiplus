package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final o.a f9736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.z2 f9737e;

    public x2(androidx.appcompat.widget.z2 z2Var) {
        this.f9737e = z2Var;
        this.f9736d = new o.a(z2Var.f9747a.getContext(), 0, android.R.id.home, 0, 0, z2Var.f9755i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.appcompat.widget.z2 z2Var = this.f9737e;
        android.view.Window.Callback callback = z2Var.f9758l;
        if (callback == null || !z2Var.f9759m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f9736d);
    }
}
