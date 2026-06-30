package aw1;

/* loaded from: classes12.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final aw1.a0 f96027i = new aw1.a0(null);

    /* renamed from: d, reason: collision with root package name */
    public final aw1.x f96028d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96029e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.l6 f96030f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96031g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f96032h;

    public b0(aw1.x callback, boolean z17, com.p314xaae8f345.mm.vfs.l6 l6Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f96028d = callback;
        this.f96029e = z17;
        this.f96030f = l6Var;
        this.f96031g = c26987xeef691ab;
        this.f96032h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        aw1.x xVar = this.f96028d;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f96031g;
        if (c26987xeef691ab != null) {
            try {
                c26987xeef691ab.m108011xf4ed245c();
            } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
                xVar.a(true);
                return;
            }
        }
        java.lang.Runnable runnable = this.f96032h;
        if (runnable != null) {
            runnable.run();
        }
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108011xf4ed245c();
        }
        f96027i.b();
        java.util.Iterator it = ((pm5.b) com.p314xaae8f345.mm.vfs.b2.g(this.f96029e, this.f96030f)).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            xVar.b((com.p314xaae8f345.mm.vfs.k6) it.next());
            i17++;
            if ((i17 & 15) == 0 && c26987xeef691ab != null) {
                c26987xeef691ab.m108011xf4ed245c();
            }
        }
        xVar.a(false);
    }
}
