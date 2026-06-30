package bs5;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f105576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tr5.f0 f105577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bs5.o f105578g;

    public k(bs5.o oVar, java.lang.String str, int i17, tr5.f0 f0Var) {
        this.f105578g = oVar;
        this.f105575d = str;
        this.f105576e = i17;
        this.f105577f = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        or5.b.a("%.2f of TTL goes by, lookup for %s(%d) async", java.lang.Float.valueOf(0.75f), this.f105575d, java.lang.Integer.valueOf(this.f105576e));
        ((lr5.d) lr5.e.f402303c).execute(new bs5.j(this));
        ((java.util.Vector) this.f105578g.f105582a).remove(this);
    }
}
