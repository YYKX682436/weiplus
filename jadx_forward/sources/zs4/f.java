package zs4;

/* loaded from: classes8.dex */
public class f implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f556819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556820e;

    public f(boolean z17, android.app.Activity activity) {
        this.f556819d = z17;
        this.f556820e = activity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f556819d) {
            this.f556820e.finish();
        }
    }
}
