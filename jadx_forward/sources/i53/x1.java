package i53;

/* loaded from: classes8.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f370314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f370315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.y1 f370316f;

    public x1(i53.y1 y1Var, java.util.LinkedList linkedList, boolean z17) {
        this.f370316f = y1Var;
        this.f370314d = linkedList;
        this.f370315e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.y1 y1Var = this.f370316f;
        if (((android.app.Activity) y1Var.f370321a.getContext()).isFinishing() || ((android.app.Activity) y1Var.f370321a.getContext()).isDestroyed()) {
            return;
        }
        y1Var.f370321a.g(this.f370314d, this.f370315e, false);
        y1Var.f370321a.f370045w = true;
    }
}
