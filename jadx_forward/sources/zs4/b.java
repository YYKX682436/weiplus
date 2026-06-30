package zs4;

/* loaded from: classes8.dex */
public class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f556809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556810e;

    public b(boolean z17, android.app.Activity activity) {
        this.f556809d = z17;
        this.f556810e = activity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f556809d) {
            this.f556810e.finish();
        }
    }
}
