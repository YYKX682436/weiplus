package bs5;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f24042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tr5.f0 f24044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bs5.o f24045g;

    public k(bs5.o oVar, java.lang.String str, int i17, tr5.f0 f0Var) {
        this.f24045g = oVar;
        this.f24042d = str;
        this.f24043e = i17;
        this.f24044f = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        or5.b.a("%.2f of TTL goes by, lookup for %s(%d) async", java.lang.Float.valueOf(0.75f), this.f24042d, java.lang.Integer.valueOf(this.f24043e));
        ((lr5.d) lr5.e.f320770c).execute(new bs5.j(this));
        ((java.util.Vector) this.f24045g.f24049a).remove(this);
    }
}
