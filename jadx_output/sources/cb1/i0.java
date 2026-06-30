package cb1;

/* loaded from: classes7.dex */
public final class i0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f40256d;

    public i0(km5.b bVar) {
        this.f40256d = bVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f40256d.a("user cancel");
    }
}
