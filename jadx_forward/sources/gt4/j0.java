package gt4;

/* loaded from: classes14.dex */
public final class j0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f356988d;

    public j0(gt4.s0 s0Var) {
        this.f356988d = s0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gt4.s0 s0Var = this.f356988d;
        gt4.s0.a(s0Var, false, 0, 0, 0);
        s0Var.e();
    }
}
