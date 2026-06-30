package md1;

/* loaded from: classes7.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f407272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f407273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ md1.j1 f407274f;

    public h1(md1.j1 j1Var, boolean z17, boolean z18) {
        this.f407274f = j1Var;
        this.f407272d = z17;
        this.f407273e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f407274f.a(this.f407272d, this.f407273e);
    }
}
