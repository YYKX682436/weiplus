package bg2;

/* loaded from: classes3.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f101984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.x2 f101986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.nc2 f101987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(so2.h1 h1Var, int i17, bg2.x2 x2Var, r45.nc2 nc2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101984d = h1Var;
        this.f101985e = i17;
        this.f101986f = x2Var;
        this.f101987g = nc2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.r2(this.f101984d, this.f101985e, this.f101986f, this.f101987g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.r2 r2Var = (bg2.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        so2.h1 h1Var = this.f101984d;
        so2.g1 g1Var = h1Var.f491917n;
        g1Var.f491889a++;
        g1Var.f491891c = this.f101985e;
        bg2.x2 x2Var = this.f101986f;
        bg2.g2 g2Var = (bg2.g2) x2Var.N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.b7(x2Var.f102173i, x2Var.Z6());
        }
        r45.nc2 nc2Var = this.f101987g;
        java.lang.String e76 = x2Var.e7((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) nc2Var.m75936x14adae67(0));
        if (e76 != null && e76.length() > 0) {
            h1Var.f491917n.f491890b = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) nc2Var.m75936x14adae67(0);
            x2Var.d7();
        }
        return jz5.f0.f384359a;
    }
}
