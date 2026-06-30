package gq5;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f356177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq5.x0 f356178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gq5.o f356179f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(aq5.x0 x0Var, gq5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f356178e = x0Var;
        this.f356179f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gq5.m(this.f356178e, this.f356179f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gq5.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f356177d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aq5.p0 p0Var = aq5.p0.f94806a;
            this.f356177d = 1;
            obj = aq5.p0.f94809d.e(this.f356178e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        aq5.v0 v0Var = (aq5.v0) obj;
        gq5.o oVar = this.f356179f;
        oVar.f356193r = true;
        boolean z17 = v0Var.f94841a;
        int i18 = v0Var.f94843c;
        if (!(z17 && i18 == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(oVar.f356188m, "prepareSendFile failed, result.errorCode:" + i18);
            if (i18 == 1) {
                j75.f Q6 = oVar.Q6();
                eq5.h hVar = Q6 != null ? (eq5.h) Q6.mo140437x75286adb() : null;
                if (hVar != null) {
                    hVar.f337454o = true;
                }
            }
            j75.f Q62 = oVar.Q6();
            if (Q62 != null) {
                Q62.B3(new eq5.i(11));
            }
        } else if (v0Var.f94842b) {
            j75.f Q63 = oVar.Q6();
            if (Q63 != null) {
                Q63.B3(new eq5.i(15));
            }
        } else {
            oVar.Y6();
        }
        return jz5.f0.f384359a;
    }
}
