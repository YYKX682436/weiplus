package l36;

/* loaded from: classes16.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public l36.w0 f397224a;

    /* renamed from: b, reason: collision with root package name */
    public l36.r0 f397225b;

    /* renamed from: c, reason: collision with root package name */
    public int f397226c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f397227d;

    /* renamed from: e, reason: collision with root package name */
    public l36.g0 f397228e;

    /* renamed from: f, reason: collision with root package name */
    public l36.h0 f397229f;

    /* renamed from: g, reason: collision with root package name */
    public l36.c1 f397230g;

    /* renamed from: h, reason: collision with root package name */
    public l36.a1 f397231h;

    /* renamed from: i, reason: collision with root package name */
    public l36.a1 f397232i;

    /* renamed from: j, reason: collision with root package name */
    public l36.a1 f397233j;

    /* renamed from: k, reason: collision with root package name */
    public long f397234k;

    /* renamed from: l, reason: collision with root package name */
    public long f397235l;

    public z0() {
        this.f397226c = -1;
        this.f397229f = new l36.h0();
    }

    public l36.a1 a() {
        if (this.f397224a == null) {
            throw new java.lang.IllegalStateException("request == null");
        }
        if (this.f397225b == null) {
            throw new java.lang.IllegalStateException("protocol == null");
        }
        if (this.f397226c >= 0) {
            if (this.f397227d != null) {
                return new l36.a1(this);
            }
            throw new java.lang.IllegalStateException("message == null");
        }
        throw new java.lang.IllegalStateException("code < 0: " + this.f397226c);
    }

    public final void b(java.lang.String str, l36.a1 a1Var) {
        if (a1Var.f396994m != null) {
            throw new java.lang.IllegalArgumentException(str + ".body != null");
        }
        if (a1Var.f396995n != null) {
            throw new java.lang.IllegalArgumentException(str + ".networkResponse != null");
        }
        if (a1Var.f396996o != null) {
            throw new java.lang.IllegalArgumentException(str + ".cacheResponse != null");
        }
        if (a1Var.f396997p == null) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + ".priorResponse != null");
    }

    public z0(l36.a1 a1Var) {
        this.f397226c = -1;
        this.f397224a = a1Var.f396988d;
        this.f397225b = a1Var.f396989e;
        this.f397226c = a1Var.f396990f;
        this.f397227d = a1Var.f396991g;
        this.f397228e = a1Var.f396992h;
        this.f397229f = a1Var.f396993i.e();
        this.f397230g = a1Var.f396994m;
        this.f397231h = a1Var.f396995n;
        this.f397232i = a1Var.f396996o;
        this.f397233j = a1Var.f396997p;
        this.f397234k = a1Var.f396998q;
        this.f397235l = a1Var.f396999r;
    }
}
