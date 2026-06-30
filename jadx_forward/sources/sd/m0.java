package sd;

/* loaded from: classes8.dex */
public abstract class m0 implements sd.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f488157d;

    /* renamed from: e, reason: collision with root package name */
    public final sd.l0 f488158e;

    public m0(android.content.Context context, java.lang.Class cls) {
        ((h53.j) this).f360591h = h53.i.initing;
        this.f488157d = context;
        this.f488158e = new sd.g(context, cls);
    }

    @Override // sd.a
    /* renamed from: getContext */
    public android.content.Context mo64555x76847179() {
        return this.f488157d;
    }

    @Override // sd.a
    /* renamed from: getRuntime */
    public sd.l0 mo64556x9a3f0ba2() {
        return this.f488158e;
    }
}
