package gu0;

/* loaded from: classes5.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f357327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(gu0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357326e = k2Var;
        this.f357327f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.q0(this.f357326e, this.f357327f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.o oVar;
        java.lang.String str;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b2;
        eu0.o oVar2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357325d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.p pVar = this.f357327f;
        gu0.k2 k2Var = this.f357326e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                this.f357325d = 1;
                obj = gu0.k2.e(k2Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            oVar = (jz5.o) obj;
            str = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "exportVideoForReedit: exception: " + e17.getMessage());
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, "Exception: " + e17.getMessage());
        }
        if (oVar != null && oVar.f384376f == null) {
            k2Var.f357279v = (java.lang.String) oVar.f384374d;
            k2Var.f357280w = (java.lang.String) oVar.f384375e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "exportVideoForReedit: success, path=" + k2Var.f357279v + ", checksum=" + k2Var.f357280w);
            eu0.q qVar = new eu0.q();
            qVar.f338263a = "reedit";
            eu0.b bVar = k2Var.f357258a;
            qVar.f338264b = bVar.f338240m;
            qVar.f338265c = bVar.f338231d;
            qVar.f338266d = bVar.f338238k;
            qVar.f338267e = bVar.f338233f;
            eu0.o oVar3 = bVar.f338241n;
            if (oVar3 != null) {
                java.lang.String finderTabContextId = oVar3.f338260a;
                java.lang.String finderContextId = oVar3.f338261b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderTabContextId, "finderTabContextId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderContextId, "finderContextId");
                oVar2 = new eu0.o(finderTabContextId, finderContextId);
            } else {
                oVar2 = null;
            }
            qVar.f338268f = oVar2;
            k2Var.C = qVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "exportVideoForReedit: new params=" + k2Var.C);
            k2Var.D = gu0.k2.a(k2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "exportVideoForReedit: new edit info: " + k2Var.D);
            k2Var.E = gu0.k2.b(k2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "exportVideoForReedit: new local create info: " + k2Var.E);
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, null);
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportVideoForReedit: export failed, err=");
        sb6.append((oVar == null || (c4093x6b88526b2 = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) oVar.f384376f) == null) ? null : c4093x6b88526b2.f16057x38eb0007);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", sb6.toString());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Export video failed: ");
        if (oVar != null && (c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) oVar.f384376f) != null) {
            str = c4093x6b88526b.f16057x38eb0007;
        }
        sb7.append(str);
        pVar.mo149xb9724478(bool, sb7.toString());
        return f0Var;
    }
}
