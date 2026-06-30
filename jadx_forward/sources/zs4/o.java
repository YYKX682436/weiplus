package zs4;

/* loaded from: classes8.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f556843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556844e;

    public o(boolean z17, android.app.Activity activity) {
        this.f556843d = z17;
        this.f556844e = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        if (this.f556843d) {
            this.f556844e.finish();
        }
    }
}
