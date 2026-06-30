package xc5;

/* loaded from: classes12.dex */
public abstract class c implements mf3.k, uh5.i, xc5.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f534932a;

    /* renamed from: b, reason: collision with root package name */
    public mf3.w f534933b;

    public c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f534932a = f9Var;
    }

    @Override // uh5.i
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 b() {
        return this.f534932a;
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        this.f534933b = level;
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return java.lang.String.valueOf(this.f534932a.m124847x74d37ac6());
    }

    @Override // mf3.k
    /* renamed from: getLevel */
    public mf3.w mo147256x74bf41ce() {
        mf3.w wVar = this.f534933b;
        return wVar == null ? mf3.w.f407661d : wVar;
    }

    public final co.a h(co.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f534932a;
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        int i17 = aVar.f125235d;
        aVar.set(i17 + 0, java.lang.Long.valueOf(m124847x74d37ac6));
        aVar.set(i17 + 2, java.lang.Long.valueOf(f9Var.I0()));
        aVar.set(i17 + 3, java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
        java.lang.String Q0 = f9Var.Q0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (Q0 == null) {
            Q0 = "";
        }
        aVar.set(i17 + 1, Q0);
        return aVar;
    }
}
