package p0;

/* loaded from: classes14.dex */
public final class a extends kz5.h implements p0.b {

    /* renamed from: e, reason: collision with root package name */
    public final p0.b f431876e;

    /* renamed from: f, reason: collision with root package name */
    public final int f431877f;

    /* renamed from: g, reason: collision with root package name */
    public final int f431878g;

    /* JADX WARN: Multi-variable type inference failed */
    public a(p0.b source, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f431876e = source;
        this.f431877f = i17;
        t0.c.c(i17, i18, ((kz5.b) source).d());
        this.f431878g = i18 - i17;
    }

    @Override // kz5.b
    public int d() {
        return this.f431878g;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        t0.c.a(i17, this.f431878g);
        return this.f431876e.get(this.f431877f + i17);
    }

    @Override // kz5.h, java.util.List
    public java.util.List subList(int i17, int i18) {
        t0.c.c(i17, i18, this.f431878g);
        int i19 = this.f431877f;
        return new p0.a(this.f431876e, i17 + i19, i19 + i18);
    }
}
