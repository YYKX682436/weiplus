package q9;

/* loaded from: classes15.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final d9.l0 f442403a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.n f442404b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f442405c;

    /* renamed from: d, reason: collision with root package name */
    public final m8.d0[] f442406d;

    public p(d9.l0 l0Var, q9.n nVar, java.lang.Object obj, m8.d0[] d0VarArr) {
        this.f442403a = l0Var;
        this.f442404b = nVar;
        this.f442405c = obj;
        this.f442406d = d0VarArr;
    }

    public boolean a(q9.p pVar, int i17) {
        return pVar != null && t9.d0.a(this.f442404b.f442401b[i17], pVar.f442404b.f442401b[i17]) && t9.d0.a(this.f442406d[i17], pVar.f442406d[i17]);
    }
}
