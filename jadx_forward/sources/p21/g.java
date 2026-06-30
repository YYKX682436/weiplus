package p21;

/* loaded from: classes4.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f432957d;

    public g(java.lang.Runnable runnable) {
        this.f432957d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f432957d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
