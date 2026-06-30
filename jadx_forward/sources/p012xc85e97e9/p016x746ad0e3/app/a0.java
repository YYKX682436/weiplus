package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class a0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.b0 f90609a;

    public a0(p012xc85e97e9.p016x746ad0e3.app.b0 b0Var) {
        this.f90609a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p012xc85e97e9.p016x746ad0e3.app.b0 b0Var = this.f90609a;
        boolean a17 = b0Var.f90610a.a();
        if (a17 != b0Var.f90611b) {
            b0Var.f90611b = a17;
            b0Var.f90614e.a();
        }
    }
}
