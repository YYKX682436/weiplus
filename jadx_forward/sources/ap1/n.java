package ap1;

/* loaded from: classes5.dex */
public final class n implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.w f94238d;

    public n(ap1.w wVar) {
        this.f94238d = wVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        j75.f U6 = this.f94238d.U6();
        if (U6 != null) {
            U6.B3(new ap1.c(null, 1, null));
        }
    }
}
