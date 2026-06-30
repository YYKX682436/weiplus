package ck1;

/* loaded from: classes4.dex */
public final class j implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f123868d;

    public j(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f123868d = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiRevokeUserInfoAuthorize", "callback, errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f123868d;
        if (i17 != 0 || i18 != 0) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("Server Framework Error(errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str + ')'))));
            return 0;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        r45.tc7 tc7Var = fVar instanceof r45.tc7 ? (r45.tc7) fVar : null;
        if (tc7Var == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("Client Framework Error(resp is null)"))));
            return 0;
        }
        r45.jw6 jw6Var = tc7Var.f467851d;
        int i19 = jw6Var.f459710d;
        java.lang.String str2 = jw6Var.f459711e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiRevokeUserInfoAuthorize", "callback, logicErrCode: " + i19 + ", logicErrMsg: " + str2);
        if (i19 == 0) {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
            return 0;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("Server Logic Error(logicErrCode: " + i19 + ", logicErrMsg: " + str2 + ')'))));
        return 0;
    }
}
