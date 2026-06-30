package ou0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f430416a;

    /* renamed from: b, reason: collision with root package name */
    public final float f430417b;

    /* renamed from: c, reason: collision with root package name */
    public float f430418c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f430419d = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f);

    /* renamed from: e, reason: collision with root package name */
    public boolean f430420e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f430421f;

    public b(float f17, float f18) {
        this.f430416a = f17;
        this.f430417b = f18;
        this.f430418c = f18;
    }

    public abstract void a(float f17);

    public abstract float b(float f17, float f18, float f19);

    public abstract boolean c();

    public final void d() {
        this.f430418c = this.f430417b;
        this.f430420e = false;
        this.f430421f = false;
    }

    /* renamed from: toString */
    public java.lang.String m157098x9616526c() {
        return "Flag(value=" + this.f430418c + ", has=" + this.f430420e + ", first=" + this.f430421f + ')';
    }
}
