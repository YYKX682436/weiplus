package dl1;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f316704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl1.f f316705e;

    public d(dl1.f fVar, java.lang.Runnable runnable) {
        this.f316705e = fVar;
        this.f316704d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl1.k0 k0Var;
        dl1.f fVar = this.f316705e;
        dl1.a aVar = fVar.f316713d;
        if (aVar != null) {
            android.view.View view = fVar.f316711b;
            int i17 = fVar.f316716g;
            int i18 = fVar.f316717h;
            java.lang.Object obj = fVar.f316714e;
            cl1.h hVar = (cl1.h) aVar;
            hVar.getClass();
            if ((obj instanceof cl1.n0) && ((cl1.n0) obj).f124422b == 2 && (k0Var = hVar.f124404a.H) != null) {
                k0Var.c(i17, i18, obj);
            }
        }
        java.lang.Runnable runnable = this.f316704d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
