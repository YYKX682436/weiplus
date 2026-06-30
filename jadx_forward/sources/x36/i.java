package x36;

/* loaded from: classes16.dex */
public final class i implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public x36.k f533214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f533215e;

    /* renamed from: f, reason: collision with root package name */
    public x36.c0 f533216f;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f533218h;

    /* renamed from: g, reason: collision with root package name */
    public long f533217g = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f533219i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f533220m = -1;

    public final int a(long j17) {
        x36.c0 c0Var;
        x36.k kVar = this.f533214d;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        if (j17 >= -1) {
            long j18 = kVar.f533227e;
            if (j17 <= j18) {
                if (j17 == -1 || j17 == j18) {
                    this.f533216f = null;
                    this.f533217g = j17;
                    this.f533218h = null;
                    this.f533219i = -1;
                    this.f533220m = -1;
                    return -1;
                }
                x36.c0 c0Var2 = kVar.f533226d;
                x36.c0 c0Var3 = this.f533216f;
                long j19 = 0;
                if (c0Var3 != null) {
                    long j27 = this.f533217g;
                    int i17 = this.f533219i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var3);
                    long j28 = j27 - (i17 - c0Var3.f533191b);
                    if (j28 > j17) {
                        c0Var = c0Var2;
                        c0Var2 = this.f533216f;
                        j18 = j28;
                    } else {
                        c0Var = this.f533216f;
                        j19 = j28;
                    }
                } else {
                    c0Var = c0Var2;
                }
                if (j18 - j17 > j17 - j19) {
                    while (true) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                        int i18 = c0Var.f533192c;
                        int i19 = c0Var.f533191b;
                        if (j17 < (i18 - i19) + j19) {
                            break;
                        }
                        j19 += i18 - i19;
                        c0Var = c0Var.f533195f;
                    }
                } else {
                    while (j18 > j17) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
                        c0Var2 = c0Var2.f533196g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
                        j18 -= c0Var2.f533192c - c0Var2.f533191b;
                    }
                    c0Var = c0Var2;
                    j19 = j18;
                }
                if (this.f533215e) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                    if (c0Var.f533193d) {
                        byte[] bArr = c0Var.f533190a;
                        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
                        x36.c0 c0Var4 = new x36.c0(copyOf, c0Var.f533191b, c0Var.f533192c, false, true);
                        if (kVar.f533226d == c0Var) {
                            kVar.f533226d = c0Var4;
                        }
                        c0Var.b(c0Var4);
                        x36.c0 c0Var5 = c0Var4.f533196g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var5);
                        c0Var5.a();
                        c0Var = c0Var4;
                    }
                }
                this.f533216f = c0Var;
                this.f533217g = j17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                this.f533218h = c0Var.f533190a;
                int i27 = c0Var.f533191b + ((int) (j17 - j19));
                this.f533219i = i27;
                int i28 = c0Var.f533192c;
                this.f533220m = i28;
                return i28 - i27;
            }
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("offset=" + j17 + " > size=" + kVar.f533227e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!(this.f533214d != null)) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        this.f533214d = null;
        this.f533216f = null;
        this.f533217g = -1L;
        this.f533218h = null;
        this.f533219i = -1;
        this.f533220m = -1;
    }
}
