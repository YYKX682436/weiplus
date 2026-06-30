package jg0;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f381109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(jg0.x xVar, qi3.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f381108d = xVar;
        this.f381109e = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jg0.i(this.f381108d, this.f381109e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((jg0.i) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        jg0.x xVar = this.f381108d;
        java.lang.String str = xVar.f381171i.f122582b;
        ((bv.p0) h1Var).getClass();
        w21.w0 j17 = w21.x0.j(str);
        qi3.f0 f0Var = this.f381109e;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (j17 == null) {
            f0Var.f445233a = -520014;
            return f0Var2;
        }
        j17.f524025i = 3;
        j17.f524022f = 0;
        long j18 = 1000;
        j17.f524026j = java.lang.System.currentTimeMillis() / j18;
        j17.f524027k = java.lang.System.currentTimeMillis() / j18;
        j17.f524017a = 8648;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "start resend. ret: " + ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(xVar.f381171i.f122582b, j17) + " file:" + j17.f524018b + " msgId:" + j17.f524029m + "  stat:" + j17.f524025i);
        if (j17.f524029m != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f524019c)) {
            pt0.e0 e0Var = pt0.f0.f439742b1;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(j17.f524019c, j17.f524029m);
            if (k17 != null) {
                k17.r1(1);
                qz5.b.d(e0Var.s(k17.Q0(), k17.m124847x74d37ac6(), k17));
            }
            return f0Var2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", " failed msg id:" + j17.f524029m + " user:" + j17.f524019c);
        f0Var.f445233a = -520025;
        return f0Var2;
    }
}
