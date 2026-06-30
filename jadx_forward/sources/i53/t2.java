package i53;

/* loaded from: classes8.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f370270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f370271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.u2 f370272f;

    public t2(i53.u2 u2Var, java.util.LinkedList linkedList, boolean z17) {
        this.f370272f = u2Var;
        this.f370270d = linkedList;
        this.f370271e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.u2 u2Var = this.f370272f;
        if (((android.app.Activity) u2Var.f370277a.getContext()).isFinishing() || ((android.app.Activity) u2Var.f370277a.getContext()).isDestroyed()) {
            return;
        }
        u2Var.f370277a.postDelayed(new i53.s2(this), 100L);
        u2Var.f370277a.c(this.f370270d, this.f370271e, false);
    }
}
