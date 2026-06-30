package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes5.dex */
public final class ib extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e1 f282570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mv.c0 f282571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e1 e1Var, mv.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282570d = e1Var;
        this.f282571e = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ib(this.f282570d, this.f282571e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ib) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Boolean bool;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e1 e1Var = this.f282570d;
        mv.c0 result = this.f282571e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r rVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r) e1Var;
        rVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f282849e, "[process] mediaId=" + rVar.f282847c + ", reportMediaType=" + rVar.f282848d + ", result=" + result);
        if (result.f413017a != 0) {
            return java.lang.Boolean.FALSE;
        }
        synchronized (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r.class) {
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(result.f413019c);
            if (k17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f282849e, "[process] tmpFileLen is 0, mediaId=" + rVar.f282847c);
                bool = java.lang.Boolean.FALSE;
            } else if (com.p314xaae8f345.mm.vfs.w6.d(result.f413019c, rVar.f282846b, false) <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(rVar.f282849e, "[process] copyFile error, tempPath=" + result.f413019c + ", fullPath=" + rVar.f282846b + ", mediaId = " + rVar.f282847c);
                bool = java.lang.Boolean.FALSE;
            } else {
                java.lang.String Q0 = rVar.f282845a.Q0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
                ((ku5.t0) ku5.t0.f394148d).r(new fo1.k(Q0, rVar.f282845a.mo78012x3fdd41df()), "RoamBackup.MediaPullObserver");
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.d(31328, java.lang.Integer.valueOf(rVar.f282848d), 1, java.lang.Integer.valueOf(result.f413018b), 0, java.lang.Long.valueOf(k17));
                if (rVar.f282845a.z2()) {
                    rVar.f282845a.c1(0);
                    mt1.b0 b0Var = mt1.b0.f412724a;
                    long m124847x74d37ac6 = rVar.f282845a.m124847x74d37ac6();
                    java.lang.String Q02 = rVar.f282845a.Q0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q02, "getTalker(...)");
                    b0Var.q(m124847x74d37ac6, Q02);
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(rVar.f282845a.m124847x74d37ac6(), rVar.f282845a);
                    fVar.d(31328, java.lang.Integer.valueOf(rVar.f282848d), 2, java.lang.Integer.valueOf(result.f413018b), 0, java.lang.Long.valueOf(k17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f282849e, "[process] report31328 deviceType=" + result.f413018b + ", tmpFileLen=" + k17 + ", mediaId=" + rVar.f282847c);
                    bool = java.lang.Boolean.TRUE;
                } else {
                    bool = java.lang.Boolean.FALSE;
                }
            }
        }
        return bool;
    }
}
