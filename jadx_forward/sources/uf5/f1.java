package uf5;

/* loaded from: classes10.dex */
public class f1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f508760d;

    public f1(uf5.j1 j1Var, java.lang.Runnable runnable) {
        this.f508760d = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        java.lang.Runnable runnable = this.f508760d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
