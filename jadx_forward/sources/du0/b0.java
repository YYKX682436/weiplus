package du0;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f324858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f324859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f324860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(float f17, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f324859e = f17;
        this.f324860f = f18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du0.b0(this.f324859e, this.f324860f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f324858d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f324858d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            du0.a0 a0Var = new du0.a0(rVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocationUIC", "pushLocationAddr: start");
            u60.f wi6 = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();
            u60.h hVar = new u60.h(this.f324859e, this.f324860f);
            hVar.f506407g = true;
            hVar.f506403c = 6;
            ((i11.g) wi6).b(hVar, a0Var);
            rVar.m(new du0.z(a0Var));
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
        return obj;
    }
}
