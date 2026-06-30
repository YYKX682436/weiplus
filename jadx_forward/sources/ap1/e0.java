package ap1;

/* loaded from: classes5.dex */
public final class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f94179d;

    public e0(ap1.i0 i0Var) {
        this.f94179d = i0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        j75.f U6 = this.f94179d.U6();
        if (U6 != null) {
            U6.B3(new ap1.c(null, 1, null));
        }
    }
}
