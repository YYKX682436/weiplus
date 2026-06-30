package w71;

/* loaded from: classes11.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.z f524984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w71.y f524985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f524986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f524987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bw5.z zVar, w71.y yVar, long j17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f524984d = zVar;
        this.f524985e = yVar;
        this.f524986f = j17;
        this.f524987g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new w71.u(this.f524984d, this.f524985e, this.f524986f, this.f524987g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((w71.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            bw5.z zVar = this.f524984d;
            w71.y yVar = this.f524985e;
            w71.s sVar = new w71.s(zVar, yVar.f525001a, yVar.f525002b);
            w71.r rVar = new w71.r(sVar, new w71.t(this.f524985e, this.f524987g));
            synchronized (sVar) {
                sVar.f524979g = rVar;
                sVar.f524980h.a();
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(((gm0.n) com.p314xaae8f345.mm.p944x882e457a.z2.f152380b).f354793a.f354821b.h(sVar.f524978f, 0)));
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    m143895xf1229813 = null;
                }
                java.lang.Boolean bool = (java.lang.Boolean) m143895xf1229813;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "FTSCgi doScene failed");
                    sVar.a(3, -1, "RunCgi doScene failed", null);
                }
            }
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "create fts cgi error " + this.f524986f + ", " + th7.getMessage());
            yz5.l lVar = this.f524987g;
            bw5.a0 a0Var = new bw5.a0();
            a0Var.c(this.f524986f);
            a0Var.b(-1);
            a0Var.f106487f = th7.getMessage();
            a0Var.f106490i[3] = true;
            lVar.mo146xb9724478(a0Var);
            return jz5.f0.f384359a;
        }
    }
}
