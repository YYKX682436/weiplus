package n0;

/* loaded from: classes14.dex */
public final class x2 implements n0.e {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e f415280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f415281b;

    /* renamed from: c, reason: collision with root package name */
    public int f415282c;

    public x2(n0.e applier, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        this.f415280a = applier;
        this.f415281b = i17;
    }

    @Override // n0.e
    public java.lang.Object a() {
        return this.f415280a.a();
    }

    @Override // n0.e
    public void b(int i17, int i18) {
        this.f415280a.b(i17 + (this.f415282c == 0 ? this.f415281b : 0), i18);
    }

    @Override // n0.e
    public void c() {
    }

    @Override // n0.e
    /* renamed from: clear */
    public void mo148702x5a5b64d() {
        n0.e1.c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // n0.e
    public void d() {
    }

    @Override // n0.e
    public void e(int i17, int i18, int i19) {
        int i27 = this.f415282c == 0 ? this.f415281b : 0;
        this.f415280a.e(i17 + i27, i18 + i27, i19);
    }

    @Override // n0.e
    public void f(int i17, java.lang.Object obj) {
        this.f415280a.f(i17 + (this.f415282c == 0 ? this.f415281b : 0), obj);
    }

    @Override // n0.e
    public void g(int i17, java.lang.Object obj) {
        this.f415280a.g(i17 + (this.f415282c == 0 ? this.f415281b : 0), obj);
    }

    @Override // n0.e
    public void h(java.lang.Object obj) {
        this.f415282c++;
        this.f415280a.h(obj);
    }

    @Override // n0.e
    public void i() {
        int i17 = this.f415282c;
        if (!(i17 > 0)) {
            n0.e1.c("OffsetApplier up called with no corresponding down".toString());
            throw null;
        }
        this.f415282c = i17 - 1;
        this.f415280a.i();
    }
}
