package dl;

/* loaded from: classes10.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f316589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f316590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f316591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl.c0 f316592g;

    public b0(dl.c0 c0Var, float f17, float f18, float f19) {
        this.f316592g = c0Var;
        this.f316589d = f17;
        this.f316590e = f18;
        this.f316591f = f19;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.c0 c0Var = this.f316592g;
        ok.c cVar = c0Var.f316597e.H;
        cVar.f427453k = 1000L;
        cVar.f427448f = this.f316590e;
        cVar.f427449g = this.f316591f;
        android.graphics.Rect rect = c0Var.f316596d;
        cVar.f427450h = rect;
        cVar.f427451i.set(rect);
        cVar.f427447e = this.f316589d;
        c0Var.f316597e.H.b();
    }
}
