package m55;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f405858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f405859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rm5.v f405860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f405861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, rm5.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2);
        this.f405858d = j17;
        this.f405859e = c0Var;
        this.f405860f = vVar;
        this.f405861g = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f405858d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("export finished, success:");
        sb6.append(booleanValue);
        sb6.append(", errCode:");
        sb6.append(intValue);
        sb6.append(", cost:");
        sb6.append(elapsedRealtime);
        sb6.append(", isCallbackInvoked:");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f405859e;
        sb6.append(c0Var.f391645d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompositionRemuxChain", sb6.toString());
        if (!c0Var.f391645d) {
            if (!booleanValue) {
                this.f405860f.d();
            }
            if (booleanValue && intValue == 0) {
                intValue = 0;
            } else if (intValue == 0) {
                intValue = -1;
            }
            int i17 = intValue;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f405861g.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(i17 == 0 ? og3.h.f426698e : og3.h.f426697d, i17, null, null, 8, null)));
        }
        return jz5.f0.f384359a;
    }
}
