package gx0;

/* loaded from: classes5.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 f358283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f358284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xt0.h f358285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358286i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358287m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358288n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f358289o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.ab4 f358290p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(gx0.w8 w8Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, xt0.h hVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.ab4 ab4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358282e = w8Var;
        this.f358283f = c4167x88133861;
        this.f358284g = c16993xacc19624;
        this.f358285h = hVar;
        this.f358286i = c4128x879fba0a;
        this.f358287m = str;
        this.f358288n = str2;
        this.f358289o = gVar;
        this.f358290p = ab4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.n6(this.f358282e, this.f358283f, this.f358284g, this.f358285h, this.f358286i, this.f358287m, this.f358288n, this.f358289o, this.f358290p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.n6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c76;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358281d;
        gx0.w8 w8Var = this.f358282e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f358281d = 1;
            c76 = gx0.w8.c7(w8Var, this);
            if (c76 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c76 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) c76).booleanValue();
        xt0.d dVar = w8Var.f358655x0;
        android.app.Activity m80379x76847179 = w8Var.m80379x76847179();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861 = this.f358283f;
        double m33987xd22e7c2d = c4167x88133861.l().m33987xd22e7c2d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f358284g;
        r45.q23 q23Var = w8Var.v7().f150880i;
        boolean a17 = w8Var.v7().a();
        xt0.h hVar = this.f358285h;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f358286i;
        java.lang.String str = this.f358287m;
        java.lang.String str2 = this.f358288n;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
        java.lang.String B = c4167x88133861.B();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g c17 = B != null ? com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(B) : null;
        java.nio.ByteBuffer A = c4167x88133861.A();
        if (A != null) {
            byte[] bArr = new byte[A.capacity()];
            A.rewind();
            A.get(bArr);
            gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        } else {
            gVar = null;
        }
        dVar.c(m80379x76847179, m33987xd22e7c2d, c16993xacc19624, q23Var, a17, hVar, c4128x879fba0a, str, str2, valueOf, c17, gVar, this.f358289o, this.f358290p);
        return jz5.f0.f384359a;
    }
}
