package n3;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f415960a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f415961b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f415962c = new java.util.HashMap();

    public w(java.lang.Runnable runnable) {
        this.f415960a = runnable;
    }

    public void a(n3.b0 b0Var) {
        this.f415961b.remove(b0Var);
        n3.x xVar = (n3.x) ((java.util.HashMap) this.f415962c).remove(b0Var);
        if (xVar != null) {
            xVar.f415967a.c(xVar.f415968b);
            xVar.f415968b = null;
        }
        this.f415960a.run();
    }
}
