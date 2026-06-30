package dl;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f316567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f316568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f316569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl.c0 f316570g;

    public a0(dl.c0 c0Var, float f17, float f18, float f19) {
        this.f316570g = c0Var;
        this.f316567d = f17;
        this.f316568e = f18;
        this.f316569f = f19;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.c0 c0Var = this.f316570g;
        ok.c cVar = c0Var.f316597e.H;
        cVar.f427453k = 100L;
        cVar.f427448f = this.f316568e;
        cVar.f427449g = this.f316569f;
        android.graphics.Rect rect = c0Var.f316596d;
        cVar.f427450h = rect;
        cVar.f427451i.set(rect);
        cVar.f427447e = this.f316567d;
        cVar.b();
    }
}
