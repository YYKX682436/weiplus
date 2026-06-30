package qf2;

/* loaded from: classes.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f443948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f443949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f443950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f443952h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, km2.q qVar, qf2.v0 v0Var, yz5.l lVar, boolean z17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443948d = hVar;
        this.f443949e = qVar;
        this.f443950f = v0Var;
        this.f443951g = lVar;
        this.f443952h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.j0(this.f443948d, interfaceC29045xdcb5ca57, this.f443949e, this.f443950f, this.f443951g, this.f443952h);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.j0 j0Var = (qf2.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f443948d).f535914b).f535912a;
        if (jVar == null || (str = jVar.f478959g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f478958f : 0;
        int i18 = jVar != null ? jVar.f478957e : 0;
        km2.q qVar = this.f443949e;
        if (qVar != null) {
            qVar.f390714l = 0;
        }
        if (str.length() > 0) {
            db5.t7.g(this.f443950f.O6(), str);
        }
        yz5.l lVar = this.f443951g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        if (qVar != null) {
            mk2.h.f408666a.d(qVar.f390705c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "close pk response fail, errCode: " + i17 + " errMsg: " + str + " errType: " + i18 + " isAnchorSelfExit: " + this.f443952h);
        return jz5.f0.f384359a;
    }
}
