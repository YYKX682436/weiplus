package x;

/* loaded from: classes16.dex */
public final class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f532387d;

    public r(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f532387d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        az2.j jVar = (az2.j) this.f532387d.f391656d;
        if (jVar != null) {
            jVar.j();
        }
    }
}
