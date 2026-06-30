package qg3;

/* loaded from: classes2.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444402d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f444404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.d30 f444405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f444406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f444407i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f444408m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444409n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(int i17, bw5.d30 d30Var, byte[] bArr, int i18, int i19, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444404f = i17;
        this.f444405g = d30Var;
        this.f444406h = bArr;
        this.f444407i = i18;
        this.f444408m = i19;
        this.f444409n = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qg3.u0 u0Var = new qg3.u0(this.f444404f, this.f444405g, this.f444406h, this.f444407i, this.f444408m, this.f444409n, interfaceC29045xdcb5ca57);
        u0Var.f444403e = obj;
        return u0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg3.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444402d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f444403e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchTopStoryFlow start commentScene=");
            int i18 = this.f444404f;
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
            bw5.d30 d30Var = this.f444405g;
            if (d30Var != null) {
                r45.vs2 vs2Var = new r45.vs2();
                vs2Var.mo11468x92b714fd(d30Var.mo14344x5f01b1f6());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
                jbVar2.t0(vs2Var);
                jbVar = jbVar2;
            } else {
                jbVar = null;
            }
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(5, java.lang.Integer.valueOf(i18));
            vn2.k kVar = vn2.l.f519848a;
            p3325xe03a0797.p3326xc267989b.f1 b17 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qg3.t0(kVar.c(jbVar, qt2Var, pm0.b0.h(this.f444406h), this.f444407i, kVar.a(this.f444408m), null), null), 2, null);
            this.f444402d = 1;
            obj = ((p3325xe03a0797.p3326xc267989b.g1) b17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c) obj;
        int errType = cVar.getErrType();
        yz5.l lVar = this.f444409n;
        if (errType == 0 && cVar.getErrCode() == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mainFlowResp: ");
            r45.m03 m03Var = cVar.f202439b;
            sb7.append(m03Var.m75941xfb821914(1).size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgiJavaStatic", sb7.toString());
            try {
                byte[] mo14344x5f01b1f6 = m03Var.mo14344x5f01b1f6();
                if (mo14344x5f01b1f6 == null) {
                    mo14344x5f01b1f6 = new byte[0];
                }
                lVar.mo146xb9724478(mo14344x5f01b1f6);
            } catch (java.lang.Exception e17) {
                lVar.mo146xb9724478(new byte[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NativeCgiJavaStatic", e17, "fetchChannelFlow toByteArray", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgiJavaStatic", "mainFlowResp: failed errType:" + cVar.getErrType() + ", errCode:" + cVar.getErrCode());
            lVar.mo146xb9724478(new byte[0]);
        }
        return jz5.f0.f384359a;
    }
}
