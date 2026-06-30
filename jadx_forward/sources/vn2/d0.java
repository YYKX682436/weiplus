package vn2;

/* loaded from: classes2.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f519784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f519785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f519786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f519787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519788h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, jz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122, ym5.q1 q1Var, java.lang.String str) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519784d = hVar;
        this.f519785e = lVar;
        this.f519786f = abstractC13919x46aff122;
        this.f519787g = q1Var;
        this.f519788h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vn2.d0(this.f519784d, interfaceC29045xdcb5ca57, this.f519785e, this.f519786f, this.f519787g, this.f519788h);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vn2.d0 d0Var = (vn2.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pm0.v.X(new vn2.a0(this.f519785e, this.f519786f, this.f519787g, this.f519788h));
        return jz5.f0.f384359a;
    }
}
