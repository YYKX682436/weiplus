package yf2;

/* loaded from: classes3.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f543350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.z0 f543351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(yf2.z0 z0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543351e = z0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf2.y0(this.f543351e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf2.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.ze2 ze2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f543350d;
        yf2.z0 z0Var = this.f543351e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f543350d = 1;
            z0Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            pf5.u uVar = pf5.u.f435469a;
            if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
                r45.ze2 ze2Var2 = (r45.ze2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) z0Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410606n).mo144003x754a37bb();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var2 != null ? ze2Var2.m75945x2fec8307(3) : null)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var2 != null ? ze2Var2.m75945x2fec8307(2) : null)) {
                        if (zl2.r4.f555483a.w1()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser begin");
                            jz5.l P6 = ((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).P6();
                            r45.d64 d64Var = new r45.d64();
                            d64Var.f453707d = ((java.lang.Number) P6.f384366d).floatValue();
                            d64Var.f453708e = ((java.lang.Number) P6.f384367e).floatValue();
                            d64Var.f453712i = 0;
                            d64Var.f453709f = 1;
                            if (!yf2.z0.Z6(z0Var, d64Var, new yf2.x0(z0Var, rVar, d64Var))) {
                                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                            }
                        } else {
                            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser poi exist");
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser no permission");
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        if (lVar != null && (ze2Var = (r45.ze2) lVar.f384366d) != null) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) z0Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410606n).k(ze2Var);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(3)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(2))) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) z0Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410606n).k(null);
            }
        }
        return jz5.f0.f384359a;
    }
}
