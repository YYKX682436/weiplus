package x36;

/* loaded from: classes16.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f533190a;

    /* renamed from: b, reason: collision with root package name */
    public int f533191b;

    /* renamed from: c, reason: collision with root package name */
    public int f533192c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f533193d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f533194e;

    /* renamed from: f, reason: collision with root package name */
    public x36.c0 f533195f;

    /* renamed from: g, reason: collision with root package name */
    public x36.c0 f533196g;

    public c0() {
        this.f533190a = new byte[8192];
        this.f533194e = true;
        this.f533193d = false;
    }

    public final x36.c0 a() {
        x36.c0 c0Var = this.f533195f;
        if (c0Var == this) {
            c0Var = null;
        }
        x36.c0 c0Var2 = this.f533196g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
        c0Var2.f533195f = this.f533195f;
        x36.c0 c0Var3 = this.f533195f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var3);
        c0Var3.f533196g = this.f533196g;
        this.f533195f = null;
        this.f533196g = null;
        return c0Var;
    }

    public final x36.c0 b(x36.c0 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        segment.f533196g = this;
        segment.f533195f = this.f533195f;
        x36.c0 c0Var = this.f533195f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        c0Var.f533196g = segment;
        this.f533195f = segment;
        return segment;
    }

    public final x36.c0 c() {
        this.f533193d = true;
        return new x36.c0(this.f533190a, this.f533191b, this.f533192c, true, false);
    }

    public final void d(x36.c0 sink, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        if (!sink.f533194e) {
            throw new java.lang.IllegalStateException("only owner can write".toString());
        }
        int i18 = sink.f533192c;
        if (i18 + i17 > 8192) {
            if (sink.f533193d) {
                throw new java.lang.IllegalArgumentException();
            }
            int i19 = sink.f533191b;
            if ((i18 + i17) - i19 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = sink.f533190a;
            kz5.v.l(bArr, bArr, 0, i19, i18, 2, null);
            sink.f533192c -= sink.f533191b;
            sink.f533191b = 0;
        }
        int i27 = sink.f533192c;
        int i28 = this.f533191b;
        kz5.v.h(this.f533190a, sink.f533190a, i27, i28, i28 + i17);
        sink.f533192c += i17;
        this.f533191b += i17;
    }

    public c0(byte[] data, int i17, int i18, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f533190a = data;
        this.f533191b = i17;
        this.f533192c = i18;
        this.f533193d = z17;
        this.f533194e = z18;
    }
}
