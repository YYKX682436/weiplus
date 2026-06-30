package te2;

/* loaded from: classes.dex */
public final class sa implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499943d;

    public sa(te2.hc hcVar) {
        this.f499943d = hcVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f499943d.m158354x19263085().finish();
    }
}
