package af1;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ye1.h f4496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ af1.p0 f4497g;

    public o0(af1.p0 p0Var, java.lang.String str, java.lang.String str2, ye1.h hVar) {
        this.f4497g = p0Var;
        this.f4494d = str;
        this.f4495e = str2;
        this.f4496f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*ye1.a*/.u(this.f4494d, this.f4495e, this.f4496f);
    }
}
