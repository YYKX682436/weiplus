package af1;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ye1.h f86029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ af1.p0 f86030g;

    public o0(af1.p0 p0Var, java.lang.String str, java.lang.String str2, ye1.h hVar) {
        this.f86030g = p0Var;
        this.f86027d = str;
        this.f86028e = str2;
        this.f86029f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*ye1.a*/.u(this.f86027d, this.f86028e, this.f86029f);
    }
}
