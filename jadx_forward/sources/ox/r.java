package ox;

@j95.b
/* loaded from: classes8.dex */
public final class r extends i95.w implements rm.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0 f431042d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0 f431043e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h1 f431044f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h1 f431045g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 f431046h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 f431047i;

    /* renamed from: m, reason: collision with root package name */
    public long f431048m;

    public r() {
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1 t1Var = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c;
        this.f431042d = t1Var.a().a();
        this.f431043e = t1Var.f().a();
        this.f431044f = t1Var.a().c();
        this.f431045g = t1Var.f().c();
        this.f431046h = t1Var.a().b();
        this.f431047i = t1Var.f().b();
    }

    public java.lang.String Ai() {
        java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449686a;
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = str.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        byte[] decode = android.util.Base64.decode(bytes, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
        return new java.lang.String(decode, charset);
    }

    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0 Bi(int i17) {
        tk.s[] sVarArr = tk.s.f501403d;
        if (i17 == 2) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0 z0Var = this.f431043e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z0Var);
            return z0Var;
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.z0 z0Var2 = this.f431042d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z0Var2);
        return z0Var2;
    }

    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 Di(int i17) {
        tk.s[] sVarArr = tk.s.f501403d;
        if (i17 == 2) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 p1Var = this.f431047i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p1Var);
            return p1Var;
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 p1Var2 = this.f431046h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p1Var2);
        return p1Var2;
    }

    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h1 Ni(int i17) {
        tk.s[] sVarArr = tk.s.f501403d;
        if (i17 == 2) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h1 h1Var = this.f431045g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var);
            return h1Var;
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h1 h1Var2 = this.f431044f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var2);
        return h1Var2;
    }

    public boolean wi() {
        boolean c17 = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c.c();
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449681m.f449687b;
        return c17 && (bVar != null && bVar.f299434t == 1);
    }
}
