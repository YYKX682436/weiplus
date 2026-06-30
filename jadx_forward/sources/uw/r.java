package uw;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f513036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw.y f513037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f513038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f513039g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(uw.y yVar, float f17, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513037e = yVar;
        this.f513038f = f17;
        this.f513039g = f18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        uw.r rVar = new uw.r(this.f513037e, this.f513038f, this.f513039g, interfaceC29045xdcb5ca57);
        rVar.f513036d = obj;
        return rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        uw.r rVar = (uw.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        rVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f513036d;
        uw.y yVar = this.f513037e;
        float f17 = this.f513038f;
        float f18 = this.f513039g;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            yVar.f513056b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23538xfa8f1487(new java.lang.Double(f17), new java.lang.Double(f18), null, 4, null)));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            uw.y yVar2 = this.f513037e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FlutterBSGetPoiHelper", m143898xd4a2fc34, "", new java.lang.Object[0]);
            yVar2.f513056b = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(m143898xd4a2fc34)));
        }
        uw.y yVar3 = this.f513037e;
        synchronized (y0Var) {
            if (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                yz5.l lVar = yVar3.f513057c;
                if (lVar != null) {
                    p3321xbce91901.C29043x91b2b43d c29043x91b2b43d = yVar3.f513056b;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(c29043x91b2b43d != null ? c29043x91b2b43d.getValue() : p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("No Location")))));
                }
                yVar3.f513057c = null;
            }
        }
        return jz5.f0.f384359a;
    }
}
