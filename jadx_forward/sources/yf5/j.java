package yf5;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f543422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f543424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yf5.m mVar, java.lang.String str, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543422d = mVar;
        this.f543423e = str;
        this.f543424f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf5.j(this.f543422d, this.f543423e, this.f543424f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yf5.j jVar = (yf5.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yf5.m mVar = this.f543422d;
        java.lang.String str = mVar.f543441b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("submitDelete, ");
        java.lang.String str2 = this.f543423e;
        sb6.append(str2);
        sb6.append(", version: ");
        int i17 = this.f543424f;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = mVar.f543440a.f543495f;
        if (c16718x7059cefe != null) {
            c16718x7059cefe.s(str2);
        }
        java.util.HashMap hashMap = mVar.f543444e;
        yf5.x xVar = new yf5.x();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        l4Var.b2(str2);
        xVar.f543528d = l4Var;
        hashMap.put(str2, new yf5.f(xVar, xm3.i.f536856f, i17));
        return jz5.f0.f384359a;
    }
}
