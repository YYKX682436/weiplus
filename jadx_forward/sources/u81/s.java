package u81;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u81.u f506991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f506992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f506993f;

    public s(u81.f0 f0Var, u81.u uVar, java.lang.Object obj) {
        this.f506993f = f0Var;
        this.f506991d = uVar;
        this.f506992e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f506993f.s(this.f506991d, this.f506992e);
    }
}
