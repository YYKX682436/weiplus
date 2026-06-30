package a13;

/* loaded from: classes.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f82094d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f82095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f82096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yz5.l lVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f82096f = lVar;
        this.f82097g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        a13.o oVar = new a13.o(this.f82096f, this.f82097g, interfaceC29045xdcb5ca57);
        oVar.f82095e = obj;
        return oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a13.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f82094d;
        yz5.l lVar = this.f82096f;
        java.lang.String str = this.f82097g;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f82095e;
                this.f82094d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new mx3.r(nVar, null), 3, null);
                obj = nVar.a();
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
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (!booleanValue) {
                z17 = false;
            }
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf rsp: " + str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf error: " + str + ' ' + e17.getMessage());
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        }
        return jz5.f0.f384359a;
    }
}
