package s7;

/* loaded from: classes16.dex */
public abstract class u1 extends s7.x1 implements s7.w1, s7.t1 {

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f485379i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public java.util.Set f485380j = null;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f485381k = null;

    /* renamed from: l, reason: collision with root package name */
    public java.util.Set f485382l = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Set f485383m = null;

    @Override // s7.t1
    public java.lang.String a() {
        return this.f485381k;
    }

    @Override // s7.t1
    public void b(java.util.Set set) {
        this.f485383m = set;
    }

    @Override // s7.w1
    public java.util.List c() {
        return this.f485379i;
    }

    @Override // s7.t1
    public void e(java.util.Set set) {
    }

    @Override // s7.t1
    public java.util.Set f() {
        return this.f485382l;
    }

    @Override // s7.t1
    public java.util.Set g() {
        return null;
    }

    @Override // s7.t1
    /* renamed from: getRequiredFeatures */
    public java.util.Set mo164028xf716cc72() {
        return this.f485380j;
    }

    public void h(s7.a2 a2Var) {
        this.f485379i.add(a2Var);
    }

    @Override // s7.t1
    public void i(java.util.Set set) {
        this.f485380j = set;
    }

    @Override // s7.t1
    public void j(java.util.Set set) {
        this.f485382l = set;
    }

    @Override // s7.t1
    public void k(java.lang.String str) {
        this.f485381k = str;
    }

    @Override // s7.t1
    public java.util.Set m() {
        return this.f485383m;
    }
}
