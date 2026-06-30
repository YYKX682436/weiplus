package z23;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final z23.a f551262d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f551263e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f551264f;

    /* renamed from: g, reason: collision with root package name */
    public int f551265g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Matrix f551266h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f551267i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f551268m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Rect f551269n;

    /* renamed from: o, reason: collision with root package name */
    public e60.h1 f551270o;

    public e(z23.h hVar, z23.a generate, int i17, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(generate, "generate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f551262d = generate;
        this.f551263e = callback;
        this.f551270o = new e60.h1(0);
    }

    @Override // java.lang.Runnable
    public void run() {
        z23.d dVar;
        long currentTimeMillis;
        z23.a aVar;
        java.lang.String str;
        try {
            try {
                try {
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                    aVar = this.f551262d;
                    str = this.f551264f;
                } catch (java.lang.Exception e17) {
                    this.f551270o.f331240a = -1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MediaTailor", e17, "", new java.lang.Object[0]);
                    this.f551270o.getClass();
                    dVar = new z23.d(this);
                }
            } catch (java.lang.Error e18) {
                this.f551270o.f331240a = -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MediaTailor", e18, "", new java.lang.Object[0]);
                this.f551270o.getClass();
                dVar = new z23.d(this);
            }
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("input");
                throw null;
            }
            int i17 = this.f551265g;
            android.graphics.Matrix matrix = this.f551266h;
            if (matrix == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("matrix");
                throw null;
            }
            android.graphics.Rect rect = this.f551267i;
            if (rect == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clipRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f551269n;
            if (rect2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentRect");
                throw null;
            }
            android.graphics.Rect rect3 = this.f551268m;
            if (rect3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewRect");
                throw null;
            }
            this.f551270o = (e60.h1) aVar.a(str, i17, matrix, rect, rect2, rect3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaTailor", "generate image cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            this.f551270o.getClass();
            dVar = new z23.d(this);
            pm0.v.X(dVar);
        } catch (java.lang.Throwable th6) {
            this.f551270o.getClass();
            pm0.v.X(new z23.d(this));
            throw th6;
        }
    }
}
