package zs4;

/* loaded from: classes8.dex */
public class e implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f556817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556818e;

    public e(boolean z17, android.app.Activity activity) {
        this.f556817d = z17;
        this.f556818e = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        if (this.f556817d) {
            this.f556818e.finish();
        }
    }
}
