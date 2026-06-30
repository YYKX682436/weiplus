package n36;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n36.i f416352a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f416353b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f416354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n36.k f416355d;

    public h(n36.k kVar, n36.i iVar) {
        this.f416355d = kVar;
        this.f416352a = iVar;
        this.f416353b = iVar.f416360e ? null : new boolean[kVar.f416375n];
    }

    public void a() {
        synchronized (this.f416355d) {
            if (this.f416354c) {
                throw new java.lang.IllegalStateException();
            }
            if (this.f416352a.f416361f == this) {
                this.f416355d.b(this, false);
            }
            this.f416354c = true;
        }
    }

    public void b() {
        synchronized (this.f416355d) {
            if (this.f416354c) {
                throw new java.lang.IllegalStateException();
            }
            if (this.f416352a.f416361f == this) {
                this.f416355d.b(this, true);
            }
            this.f416354c = true;
        }
    }

    public void c() {
        n36.i iVar = this.f416352a;
        if (iVar.f416361f != this) {
            return;
        }
        int i17 = 0;
        while (true) {
            n36.k kVar = this.f416355d;
            if (i17 >= kVar.f416375n) {
                iVar.f416361f = null;
                return;
            }
            try {
                ((s36.a) kVar.f416368d).a(iVar.f416359d[i17]);
            } catch (java.io.IOException unused) {
            }
            i17++;
        }
    }

    public x36.f0 d(int i17) {
        x36.x xVar;
        synchronized (this.f416355d) {
            if (this.f416354c) {
                throw new java.lang.IllegalStateException();
            }
            n36.i iVar = this.f416352a;
            if (iVar.f416361f != this) {
                return new x36.h();
            }
            if (!iVar.f416360e) {
                this.f416353b[i17] = true;
            }
            java.io.File sink = iVar.f416359d[i17];
            try {
                ((s36.a) this.f416355d.f416368d).getClass();
                try {
                    java.util.logging.Logger logger = x36.w.f533247a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "$this$sink");
                    xVar = new x36.x(new java.io.FileOutputStream(sink, false), new x36.j0());
                } catch (java.io.FileNotFoundException unused) {
                    sink.getParentFile().mkdirs();
                    java.util.logging.Logger logger2 = x36.w.f533247a;
                    xVar = new x36.x(new java.io.FileOutputStream(sink, false), new x36.j0());
                }
                return new n36.g(this, xVar);
            } catch (java.io.FileNotFoundException unused2) {
                return new x36.h();
            }
        }
    }
}
