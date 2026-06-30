package uf2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f508706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf2.f f508707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf2.a f508708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f508709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508710h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uf2.f fVar, uf2.a aVar, int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508707e = fVar;
        this.f508708f = aVar;
        this.f508709g = i17;
        this.f508710h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new uf2.e(this.f508707e, this.f508708f, this.f508709g, this.f508710h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uf2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.gs5 gs5Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f508706d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f508706d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int i18 = this.f508709g;
        uf2.f fVar = this.f508707e;
        uf2.a aVar2 = this.f508708f;
        if (uf2.f.Z6(fVar, aVar2, i18)) {
            fVar.getClass();
            r45.l43 l43Var = (r45.l43) dk2.u7.f315724k.get(this.f508710h);
            java.lang.String m75945x2fec8307 = (l43Var == null || (gs5Var = (r45.gs5) l43Var.m75936x14adae67(0)) == null) ? null : gs5Var.m75945x2fec8307(0);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17 && (!aVar2.f508696b.f() || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, aVar2.f508698d))) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = aVar2.f508696b;
                c22789xd23e9a9b.n();
                rj.j.a(nn2.d.f420204a.c(), m75945x2fec8307, aVar2.f508696b, null, 4, null);
                c22789xd23e9a9b.m82584xebcf33cb(3);
                c22789xd23e9a9b.m82583xcde73672(0);
                c22789xd23e9a9b.m82582x3ae760af(0.0d);
                c22789xd23e9a9b.g();
                c22789xd23e9a9b.d();
                c22789xd23e9a9b.setVisibility(0);
                aVar2.f508698d = m75945x2fec8307;
            }
        }
        return jz5.f0.f384359a;
    }
}
