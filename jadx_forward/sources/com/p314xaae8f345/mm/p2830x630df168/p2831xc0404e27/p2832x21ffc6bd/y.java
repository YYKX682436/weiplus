package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f296690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 f296691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yq5.k f296692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f296693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296694h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var, yq5.k kVar, long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f296691e = m0Var;
        this.f296692f = kVar;
        this.f296693g = j17;
        this.f296694h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.y(this.f296691e, this.f296692f, this.f296693g, this.f296694h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f296690d;
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var = this.f296691e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zq5.k kVar = m0Var.f296526b;
            yq5.k kVar2 = this.f296692f;
            long j17 = this.f296693g;
            java.util.List list = m0Var.f296545u;
            this.f296690d = 1;
            b17 = com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.q0.b(kVar, kVar2, j17, list, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        boolean m143902xc481aacd = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(b17);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yq5.k kVar3 = this.f296692f;
        java.lang.String str = this.f296694h;
        if (m143902xc481aacd && !(p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(b17) instanceof java.util.concurrent.CancellationException) && !(p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(b17) instanceof java.util.concurrent.CancellationException)) {
            m0Var.f296526b.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.w(m0Var, str, b17, kVar3));
            return f0Var;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(b17);
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v0 v0Var = (com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v0) b17;
        yq5.c cVar = kVar3.f546134b;
        if (cVar == null) {
            cVar = v0Var.f296655m;
        }
        yq5.c cVar2 = cVar;
        m0Var.f296546v = cVar2;
        m0Var.f296532h = v0Var;
        ((br5.b) m0Var.f296527c).a(cVar2.f546124a);
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var2 = this.f296691e;
        m0Var2.f296526b.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.x(m0Var2, this.f296694h, this.f296693g, cVar2, this.f296692f));
        m0Var.d(str);
        m0Var.g(str);
        return f0Var;
    }
}
