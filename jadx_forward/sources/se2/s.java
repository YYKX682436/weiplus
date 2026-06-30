package se2;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488414d;

    /* renamed from: e, reason: collision with root package name */
    public int f488415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f488416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f488417g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488416f = z17;
        this.f488417g = c22789xd23e9a9b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new se2.s(this.f488416f, this.f488417g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((se2.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f488415e;
        boolean z17 = this.f488416f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (z17) {
                if (se2.w.f488430c == null) {
                    vl2.s sVar = vl2.s.f519401a;
                    vl2.h hVar = vl2.h.F;
                    this.f488415e = 1;
                    obj = sVar.f(hVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    se2.w.f488430c = (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) obj;
                }
            } else if (se2.w.f488429b == null) {
                vl2.s sVar2 = vl2.s.f519401a;
                vl2.h hVar2 = vl2.h.F;
                this.f488415e = 2;
                obj = sVar2.e(hVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
                se2.w.f488429b = (org.p3363xbe4143f1.C29690xfae77312) obj;
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            se2.w.f488430c = (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) obj;
        } else {
            if (i17 != 2) {
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            se2.w.f488429b = (org.p3363xbe4143f1.C29690xfae77312) obj;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f488417g;
        this.f488414d = c22789xd23e9a9b;
        this.f488415e = 3;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        se2.g gVar = new se2.g(rVar);
        rVar.m(new se2.r(c22789xd23e9a9b, gVar));
        c22789xd23e9a9b.n();
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(z17);
        if (z17) {
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee = se2.w.f488430c;
            if (c20942x379cf5ee != null) {
                c22789xd23e9a9b.mo82566x3e3ac3e8(c20942x379cf5ee);
            }
        } else {
            org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312 = se2.w.f488429b;
            if (c29690xfae77312 != null) {
                c22789xd23e9a9b.mo82568x3e3ac3e8(c29690xfae77312);
            }
        }
        c22789xd23e9a9b.m82583xcde73672(1);
        c22789xd23e9a9b.a(gVar);
        c22789xd23e9a9b.m82584xebcf33cb(1);
        if (c22789xd23e9a9b.getVisibility() == 0) {
            c22789xd23e9a9b.g();
        }
        if (rVar.j() == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
