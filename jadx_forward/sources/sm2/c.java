package sm2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f490918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.b f490919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sm2.f f490920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f490921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, km2.b bVar, sm2.f fVar, int i17) {
        super(0);
        this.f490918d = z17;
        this.f490919e = bVar;
        this.f490920f = fVar;
        this.f490921g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        km2.b bVar;
        if (this.f490918d && (bVar = this.f490919e) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f490920f.f490982g;
            if (v3Var != null) {
                v3Var.M1(bVar);
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.T.f409194h = bVar.f390585b;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            long j17 = bVar.f390586c;
            ml2.k5 k5Var = y4Var.T;
            k5Var.f409195i = j17;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            k5Var.f409196j = bVar.f390587d;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            k5Var.f409193g = bVar.f390584a;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var2 = ml2.j0.f409116i;
        y4Var2.p();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.k5 k5Var2 = y4Var2.T;
        int i17 = this.f490921g;
        k5Var2.f409197k = i17;
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        k5Var2.f409191e = java.lang.System.currentTimeMillis();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409901p, java.lang.String.valueOf(i17), null, 4, null);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Hj();
        return jz5.f0.f384359a;
    }
}
