package mi5;

/* loaded from: classes9.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f408382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi5.i0 f408383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b11.f f408385g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, mi5.i0 i0Var, android.content.Context context, b11.f fVar) {
        super(0);
        this.f408382d = f9Var;
        this.f408383e = i0Var;
        this.f408384f = context;
        this.f408385g = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [z01.j0, b11.d] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b11.b bVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f408382d;
        boolean J2 = f9Var.J2();
        android.content.Context context = this.f408384f;
        mi5.i0 i0Var = this.f408383e;
        if (J2) {
            b11.b bVar2 = new b11.b();
            af5.y0.b(bVar2, f9Var);
            i0Var.getClass();
            bVar2.f550674f = new mi5.g0(context, f9Var);
            bVar = bVar2;
        } else if (f9Var.m78014x7b98c171()) {
            ?? dVar = new b11.d();
            ze5.ia.c(dVar, f9Var, null, context);
            i0Var.getClass();
            dVar.f550614y = new mi5.g0(context, f9Var);
            bVar = dVar;
        } else {
            bVar = new b11.b();
        }
        bVar.Q2(this.f408385g);
        bVar.mo9570x9e476d06(true);
        return bVar;
    }
}
