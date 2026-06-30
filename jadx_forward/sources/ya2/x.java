package ya2;

/* loaded from: classes10.dex */
public final class x implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f542109d;

    public x(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f542109d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        db2.b1 b1Var = (db2.b1) this.f542109d.f391656d;
        if (b1Var != null) {
            b1Var.j();
        }
    }
}
