package ef0;

/* loaded from: classes4.dex */
public final class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f333831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f333832b;

    public p2(ef0.y2 y2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f333831a = y2Var;
        this.f333832b = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "getListenUserConfig callback errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b);
        int i17 = fVar.f152148a;
        bw5.lc0 lc0Var = null;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f333832b;
        if (i17 == 0 && fVar.f152149b == 0) {
            bw5.q70 q70Var = (bw5.q70) fVar.f152151d;
            if (q70Var != null) {
                lc0Var = q70Var.f113523f[2] ? q70Var.f113521d : new bw5.lc0();
            }
            if (lc0Var != null) {
                ef0.y2 y2Var = this.f333831a;
                y2Var.f333893d = lc0Var;
                y2Var.wi();
            }
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(lc0Var));
        } else {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        return jz5.f0.f384359a;
    }
}
