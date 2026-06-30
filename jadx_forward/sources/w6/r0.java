package w6;

/* loaded from: classes13.dex */
public class r0 implements w6.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f524726d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f524727e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.z0 f524728f;

    /* renamed from: g, reason: collision with root package name */
    public final w6.q0 f524729g;

    /* renamed from: h, reason: collision with root package name */
    public final t6.h f524730h;

    /* renamed from: i, reason: collision with root package name */
    public int f524731i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f524732m;

    public r0(w6.z0 z0Var, boolean z17, boolean z18, t6.h hVar, w6.q0 q0Var) {
        q7.n.b(z0Var);
        this.f524728f = z0Var;
        this.f524726d = z17;
        this.f524727e = z18;
        this.f524730h = hVar;
        q7.n.b(q0Var);
        this.f524729g = q0Var;
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return this.f524728f.a();
    }

    public synchronized void b() {
        if (this.f524732m) {
            throw new java.lang.IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f524731i++;
    }

    public void c() {
        boolean z17;
        synchronized (this) {
            int i17 = this.f524731i;
            if (i17 <= 0) {
                throw new java.lang.IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z17 = true;
            int i18 = i17 - 1;
            this.f524731i = i18;
            if (i18 != 0) {
                z17 = false;
            }
        }
        if (z17) {
            ((w6.g0) this.f524729g).c(this.f524730h, this);
        }
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return this.f524728f.get();
    }

    @Override // w6.z0
    /* renamed from: getSize */
    public int mo14473xfb854877() {
        return this.f524728f.mo14473xfb854877();
    }

    @Override // w6.z0
    /* renamed from: recycle */
    public synchronized void mo14474x408b7293() {
        if (this.f524731i > 0) {
            throw new java.lang.IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f524732m) {
            throw new java.lang.IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f524732m = true;
        if (this.f524727e) {
            this.f524728f.mo14474x408b7293();
        }
    }

    /* renamed from: toString */
    public synchronized java.lang.String m173246x9616526c() {
        return "EngineResource{isMemoryCacheable=" + this.f524726d + ", listener=" + this.f524729g + ", key=" + this.f524730h + ", acquired=" + this.f524731i + ", isRecycled=" + this.f524732m + ", resource=" + this.f524728f + '}';
    }
}
