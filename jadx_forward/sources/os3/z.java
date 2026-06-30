package os3;

/* loaded from: classes8.dex */
public class z implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.b0 f429793d;

    public z(os3.b0 b0Var) {
        this.f429793d = b0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        os3.b0 b0Var = this.f429793d;
        b0Var.f429569d.f236386y.a();
        b0Var.f429569d.f236386y.f429762n = null;
    }
}
