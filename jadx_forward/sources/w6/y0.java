package w6;

/* loaded from: classes13.dex */
public final class y0 implements w6.z0, r7.f {

    /* renamed from: h, reason: collision with root package name */
    public static final m3.e f524779h = r7.h.a(20, new w6.x0());

    /* renamed from: d, reason: collision with root package name */
    public final r7.k f524780d = new r7.j();

    /* renamed from: e, reason: collision with root package name */
    public w6.z0 f524781e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f524782f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f524783g;

    @Override // w6.z0
    public java.lang.Class a() {
        return this.f524781e.a();
    }

    public synchronized void b() {
        this.f524780d.a();
        if (!this.f524782f) {
            throw new java.lang.IllegalStateException("Already unlocked");
        }
        this.f524782f = false;
        if (this.f524783g) {
            mo14474x408b7293();
        }
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return this.f524781e.get();
    }

    @Override // w6.z0
    /* renamed from: getSize */
    public int mo14473xfb854877() {
        return this.f524781e.mo14473xfb854877();
    }

    @Override // r7.f
    public r7.k h() {
        return this.f524780d;
    }

    @Override // w6.z0
    /* renamed from: recycle */
    public synchronized void mo14474x408b7293() {
        this.f524780d.a();
        this.f524783g = true;
        if (!this.f524782f) {
            this.f524781e.mo14474x408b7293();
            this.f524781e = null;
            ((r7.e) f524779h).b(this);
        }
    }
}
