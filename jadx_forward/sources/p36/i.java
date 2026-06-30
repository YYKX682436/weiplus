package p36;

/* loaded from: classes16.dex */
public final class i implements l36.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f433255a;

    /* renamed from: b, reason: collision with root package name */
    public final o36.j f433256b;

    /* renamed from: c, reason: collision with root package name */
    public final p36.d f433257c;

    /* renamed from: d, reason: collision with root package name */
    public final o36.d f433258d;

    /* renamed from: e, reason: collision with root package name */
    public final int f433259e;

    /* renamed from: f, reason: collision with root package name */
    public final l36.w0 f433260f;

    /* renamed from: g, reason: collision with root package name */
    public final l36.n f433261g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.f0 f433262h;

    /* renamed from: i, reason: collision with root package name */
    public final int f433263i;

    /* renamed from: j, reason: collision with root package name */
    public final int f433264j;

    /* renamed from: k, reason: collision with root package name */
    public final int f433265k;

    /* renamed from: l, reason: collision with root package name */
    public int f433266l;

    public i(java.util.List list, o36.j jVar, p36.d dVar, o36.d dVar2, int i17, l36.w0 w0Var, l36.n nVar, l36.f0 f0Var, int i18, int i19, int i27) {
        this.f433255a = list;
        this.f433258d = dVar2;
        this.f433256b = jVar;
        this.f433257c = dVar;
        this.f433259e = i17;
        this.f433260f = w0Var;
        this.f433261g = nVar;
        this.f433262h = f0Var;
        this.f433263i = i18;
        this.f433264j = i19;
        this.f433265k = i27;
    }

    public l36.a1 a(l36.w0 w0Var, o36.j jVar, p36.d dVar, o36.d dVar2) {
        java.util.List list = this.f433255a;
        int size = list.size();
        int i17 = this.f433259e;
        if (i17 >= size) {
            throw new java.lang.AssertionError();
        }
        this.f433266l++;
        p36.d dVar3 = this.f433257c;
        if (dVar3 != null) {
            if (!this.f433258d.j(w0Var.f397214a)) {
                throw new java.lang.IllegalStateException("network interceptor " + list.get(i17 - 1) + " must retain the same host and port");
            }
        }
        if (dVar3 != null && this.f433266l > 1) {
            throw new java.lang.IllegalStateException("network interceptor " + list.get(i17 - 1) + " must call proceed() exactly once");
        }
        java.util.List list2 = this.f433255a;
        p36.i iVar = new p36.i(list2, jVar, dVar, dVar2, i17 + 1, w0Var, this.f433261g, this.f433262h, this.f433263i, this.f433264j, this.f433265k);
        l36.m0 m0Var = (l36.m0) list2.get(i17);
        l36.a1 a17 = m0Var.a(iVar);
        if (dVar != null && i17 + 1 < list.size() && iVar.f433266l != 1) {
            throw new java.lang.IllegalStateException("network interceptor " + m0Var + " must call proceed() exactly once");
        }
        if (a17 == null) {
            throw new java.lang.NullPointerException("interceptor " + m0Var + " returned null");
        }
        if (a17.f396994m != null) {
            return a17;
        }
        throw new java.lang.IllegalStateException("interceptor " + m0Var + " returned a response with no body");
    }
}
