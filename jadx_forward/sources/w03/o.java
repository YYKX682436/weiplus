package w03;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f523425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f523426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f523427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f523428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w03.u f523429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f523430i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z17, boolean z18, boolean z19, w03.u uVar, boolean z27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f523426e = z17;
        this.f523427f = z18;
        this.f523428g = z19;
        this.f523429h = uVar;
        this.f523430i = z27;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new w03.o(this.f523426e, this.f523427f, this.f523428g, this.f523429h, this.f523430i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((w03.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f523425d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kd2.o0 o0Var = kd2.p1.N;
            o0Var.a().f174665d.f174591s = false;
            kd2.p1 a17 = o0Var.a();
            boolean z17 = this.f523426e;
            boolean z18 = this.f523427f;
            boolean z19 = this.f523428g;
            this.f523425d = 1;
            obj = kd2.p1.y0(a17, z17, false, z18, null, z19, this, 10, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z27 = this.f523430i;
        w03.u uVar = this.f523429h;
        if (booleanValue) {
            uVar.f523446q = true;
            if (z27) {
                uVar.O6().a7(false);
            } else {
                ep1.m.a(uVar.m158354x19263085(), false);
                pv.g0 g0Var = (pv.g0) ((jz5.n) uVar.f523436d).mo141623x754a37bb();
                if (g0Var != null ? ((ep1.k) g0Var).e(null, uVar.m158354x19263085().getWindow().getDecorView(), null, null, new w03.p(uVar)) : false) {
                    uVar.O6().Z6();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = uVar.m158354x19263085();
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
                    if (abstractActivityC21394xb3d2c0cf != null) {
                        abstractActivityC21394xb3d2c0cf.mo78578x8b18f126(uVar.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
                    }
                }
            }
        } else {
            uVar.O6().a7(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "addFloatBall: ret=" + booleanValue + ", isPassive=" + this.f523426e + ", addFromSwipe=" + z27);
        return jz5.f0.f384359a;
    }
}
