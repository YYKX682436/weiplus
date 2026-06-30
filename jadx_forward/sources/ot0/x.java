package ot0;

/* loaded from: classes4.dex */
public final class x implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f430344d;

    public x(km5.b bVar) {
        this.f430344d = bVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f430344d.a(new ot0.p0(0, "cancel by user"));
    }
}
