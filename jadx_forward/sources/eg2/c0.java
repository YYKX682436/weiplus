package eg2;

/* loaded from: classes3.dex */
public abstract class c0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f334077d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f334078e;

    /* renamed from: f, reason: collision with root package name */
    public final qc0.a f334079f;

    public c0(ju3.d0 status, android.view.ViewGroup parent, qc0.a editContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editContext, "editContext");
        this.f334077d = status;
        this.f334078e = parent;
        this.f334079f = editContext;
        status.f(this);
    }

    @Override // yt3.r2
    /* renamed from: name */
    public java.lang.String mo122733x337a8b() {
        return getClass().getName();
    }
}
