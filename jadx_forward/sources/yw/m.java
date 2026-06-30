package yw;

/* loaded from: classes9.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f547928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f547929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yw.y yVar, boolean z17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547927d = yVar;
        this.f547928e = z17;
        this.f547929f = i17;
    }

    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5 a(boolean z17, boolean z18) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5 s5Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5();
        s5Var.f300158g = z18 ? 1 : 0;
        boolean[] zArr = s5Var.f300162n;
        zArr[4] = true;
        s5Var.f300159h = z17 ? 1 : 0;
        zArr[5] = true;
        return s5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw.m(this.f547927d, this.f547928e, this.f547929f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true);
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f308700r;
        boolean Ri = ((d85.d1) m0Var).Ri(g0Var, f0Var);
        this.f547927d.getClass();
        boolean z17 = false;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_feed_request_with_poi_android, 0) == 1;
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_disable_out_box_rec_feed_with_poi_android_v2, 0) == 1;
        tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar2).getClass();
        boolean d18 = j35.u.d(context2, "android.permission.ACCESS_FINE_LOCATION", true);
        boolean Ri2 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(g0Var, f0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "request rec feed location enable, hasSystemLocationPermission:" + d18 + ", disableOutBoxRequestRecFeedWithPoi:" + z19 + ", hasBusinessPermission:" + Ri2 + ", requestRecFeedLocationSwitch:" + z18);
        if (z18 && !z19 && d18 && Ri2) {
            z17 = true;
        }
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (!z17) {
            ((ku5.t0) ku5.t0.f394148d).q(new yw.j(this.f547927d, this.f547929f, d17, Ri));
            return f0Var2;
        }
        if (!this.f547928e) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f547927d.f548042a;
            if (cVar != null) {
                cVar.F0(this.f547929f, a(d17, Ri));
            }
        } else if (i95.n0.h(u60.g.class)) {
            ((ku5.t0) ku5.t0.f394148d).q(new yw.l(this.f547927d, this.f547929f, d17, Ri));
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar2 = this.f547927d.f548042a;
            if (cVar2 != null) {
                int i17 = this.f547929f;
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5 a17 = a(d17, Ri);
                a17.f300161m = 1;
                a17.f300162n[7] = true;
                cVar2.F0(i17, a17);
            }
        }
        return f0Var2;
    }
}
