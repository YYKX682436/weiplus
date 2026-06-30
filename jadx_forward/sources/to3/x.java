package to3;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f502518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f502519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ to3.a0 f502520f;

    public x(to3.a0 a0Var, int i17, int i18) {
        this.f502520f = a0Var;
        this.f502518d = i17;
        this.f502519e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f502520f.b(this.f502518d, this.f502519e);
    }
}
