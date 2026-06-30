package ye5;

/* loaded from: classes9.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f542787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f542788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f542789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b11.f f542790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(rd5.d dVar, yb5.d dVar2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, b11.f fVar) {
        super(0);
        this.f542787d = dVar;
        this.f542788e = dVar2;
        this.f542789f = a0Var;
        this.f542790g = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b11.b bVar;
        rd5.d dVar = this.f542787d;
        boolean J2 = dVar.f475787d.f526833b.J2();
        yb5.d dVar2 = this.f542788e;
        if (J2) {
            b11.b bVar2 = new b11.b();
            af5.y0.b(bVar2, dVar.f475787d.f526833b);
            bVar2.f550674f = new ye5.b0(dVar2, this.f542789f, dVar);
            bVar = bVar2;
        } else if (dVar.f475787d.f526833b.m78014x7b98c171()) {
            b11.d dVar3 = new b11.d();
            ze5.ia.c(dVar3, dVar.f475787d.f526833b, dVar2, dVar2.g());
            dVar3.f550614y = new ye5.c0(dVar2, dVar);
            dVar3.D = new ye5.s(dVar, dVar2);
            dVar3.E = new ye5.d0(dVar2);
            dVar3.F = new ye5.e0(dVar2);
            dVar3.G = new ye5.f0(dVar2);
            bVar = dVar3;
        } else {
            bVar = new b11.b();
        }
        bVar.Q2(this.f542790g);
        return bVar;
    }
}
