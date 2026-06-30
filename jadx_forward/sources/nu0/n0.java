package nu0;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421565d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f421566e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f421567f;

    /* renamed from: g, reason: collision with root package name */
    public int f421568g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421569h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f421570i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f421571m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(nu0.q0 q0Var, android.view.SurfaceView surfaceView, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421569h = q0Var;
        this.f421570i = surfaceView;
        this.f421571m = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.n0(this.f421569h, this.f421570i, this.f421571m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f421568g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nu0.q0 q0Var = this.f421569h;
            android.view.SurfaceView surfaceView = this.f421570i;
            java.util.List list = this.f421571m;
            this.f421565d = q0Var;
            this.f421566e = surfaceView;
            this.f421567f = list;
            this.f421568g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            try {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c76 = q0Var.c7();
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(128.0f, 128.0f);
                com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4059x6f54a607 a17 = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4059x6f54a607.a();
                com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4066x14985fa8 c4066x14985fa8 = new com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4066x14985fa8(c76, c3974x289f3e);
                com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = q0Var.f421608r;
                if (c4063x855a1ef8 != null) {
                    c4063x855a1ef8.o(surfaceView, list, a17, c4066x14985fa8, new nu0.l0(q0Var, rVar));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageControlUIC", "[startup] failed, " + e17.getMessage());
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17)));
            }
            rVar.m(nu0.m0.f421549d);
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
