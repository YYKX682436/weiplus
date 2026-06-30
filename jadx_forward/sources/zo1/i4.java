package zo1;

/* loaded from: classes5.dex */
public final class i4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f556178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f556179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f556180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f556181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f556182h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(zo1.k4 k4Var, qo1.j0 j0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var, qo1.i0 i0Var) {
        super(0);
        this.f556178d = k4Var;
        this.f556179e = j0Var;
        this.f556180f = gVar;
        this.f556181g = n0Var;
        this.f556182h = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qo1.j0 j0Var;
        zo1.k4 k4Var = this.f556178d;
        java.util.Iterator it = k4Var.f556207e.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            j0Var = this.f556179e;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d == j0Var.a()) {
                break;
            }
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pkgId=");
        sb6.append(j0Var.a());
        sb6.append(", position = ");
        sb6.append(i17);
        sb6.append(", newPkg=");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f556180f;
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.hashCode()) : null);
        sb6.append(", state=");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f556181g;
        sb6.append(n0Var);
        sb6.append(", error=");
        qo1.i0 i0Var = this.f556182h;
        sb6.append(i0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", sb6.toString());
        if (i17 != -1) {
            if (gVar != null) {
                k4Var.f556207e.set(i17, gVar);
            }
            k4Var.m8148xed6e4d18(i17, kz5.c0.i(0, n0Var, i0Var, j0Var));
        }
        return jz5.f0.f384359a;
    }
}
