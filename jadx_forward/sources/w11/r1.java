package w11;

/* loaded from: classes11.dex */
public class r1 {

    /* renamed from: f, reason: collision with root package name */
    public int f523664f;

    /* renamed from: g, reason: collision with root package name */
    public long f523665g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f523666h;

    /* renamed from: i, reason: collision with root package name */
    public int f523667i;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f523669k;

    /* renamed from: l, reason: collision with root package name */
    public w11.p1 f523670l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f523671m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f523672n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f523673o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f523674p;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f523659a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f523660b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f523661c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f523662d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f523663e = 1;

    /* renamed from: j, reason: collision with root package name */
    public c01.h7 f523668j = new c01.h7();

    public static /* synthetic */ void d(w11.r1 r1Var, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeByPPC");
        }
        if ((i17 & 1) != 0) {
            lVar = w11.q1.f523646d;
        }
        r1Var.c(lVar);
    }

    public final w11.n1 a() {
        w11.m1 a17;
        w11.n1 n1Var = new w11.n1();
        w11.o1 o1Var = w11.s1.f523679a;
        if (o1Var != null && (a17 = ((aq1.l) o1Var).a(this)) != null) {
            n1Var.f523628a = a17.f523621a;
            n1Var.f523629b = a17.f523622b;
        }
        return n1Var;
    }

    public final void b() {
        d(this, null, 1, null);
    }

    public final void c(yz5.l msgIdCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdCallback, "msgIdCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgCgiFactory", "executeByPPC() called with: content size = " + this.f523662d.length() + " isByp = " + com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(this.f523660b));
        if (this.f523670l == w11.p1.f523635d) {
            y11.b0 b0Var = (y11.b0) ((qx.j0) i95.n0.c(qx.j0.class));
            b0Var.getClass();
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) b0Var.f540337m).mo141623x754a37bb(), null, new y11.y(this, c01.w9.o(this.f523660b), msgIdCallback, null), 1, null);
        }
    }

    public final w11.r1 e(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f523662d = str;
        return this;
    }

    public final w11.r1 f(c01.h7 h7Var) {
        if (h7Var == null) {
            h7Var = new c01.h7();
        }
        this.f523668j = h7Var;
        return this;
    }

    public final w11.r1 g(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f523660b = str;
        return this;
    }

    public w11.r1 h(int i17) {
        this.f523663e = i17;
        return this;
    }
}
