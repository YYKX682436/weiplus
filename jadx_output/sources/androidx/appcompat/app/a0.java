package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class a0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.b0 f9076a;

    public a0(androidx.appcompat.app.b0 b0Var) {
        this.f9076a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        androidx.appcompat.app.b0 b0Var = this.f9076a;
        boolean a17 = b0Var.f9077a.a();
        if (a17 != b0Var.f9078b) {
            b0Var.f9078b = a17;
            b0Var.f9081e.a();
        }
    }
}
