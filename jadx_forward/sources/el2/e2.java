package el2;

/* loaded from: classes3.dex */
public final class e2 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f335318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f52 f335319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f335320f;

    public e2(el2.i2 i2Var, r45.f52 f52Var, java.lang.Boolean bool) {
        this.f335318d = i2Var;
        this.f335319e = f52Var;
        this.f335320f = bool;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.lang.String str;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        el2.i2 i2Var = this.f335318d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i2Var.f335362m, "joinLive = " + booleanValue + ", live = " + i2Var.Z6());
        xy2.b bVar = xy2.b.f539688b;
        r45.f52 f52Var = this.f335319e;
        pm0.z.b(bVar, "pollingPromoteInfoWithoutJoinLive", booleanValue, null, null, false, false, new el2.d2(i2Var, f52Var), 60, null);
        if (booleanValue) {
            if (f52Var == null) {
                so2.j5 j5Var = ((mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class)).f410582w;
                f52Var = j5Var != null ? zl2.r4.f555483a.J2(j5Var) : null;
            }
            long j17 = ((mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class)).L;
            r45.qc2 qc2Var = new r45.qc2();
            qc2Var.set(0, java.lang.Long.valueOf(f52Var != null ? f52Var.m75942xfb822ef2(4) : j17));
            if (f52Var == null || (gVar = f52Var.m75934xbce7f2f(6)) == null) {
                gVar = ((mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class)).M;
            }
            boolean z17 = true;
            qc2Var.set(1, gVar);
            qc2Var.set(2, f52Var != null ? f52Var.m75934xbce7f2f(2) : null);
            java.lang.Boolean bool = this.f335320f;
            if (bool != null) {
                z17 = bool.booleanValue();
            } else if (j17 <= 0) {
                z17 = false;
            }
            qc2Var.set(3, java.lang.Boolean.valueOf(z17));
            if (f52Var == null || (str = f52Var.m75945x2fec8307(13)) == null) {
                str = "";
            }
            qc2Var.set(4, str);
            qc2Var.set(5, ((mm2.f6) i2Var.m56788xbba4bfc0(mm2.f6.class)).N);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i2Var.f335362m, "[startPollingPromoteInfoInternal-" + i2Var.Z6() + "] req:" + pm0.b0.g(qc2Var));
            dk2.ef.f314925k.e(10, qc2Var, new el2.h2(i2Var, r45.rc2.class), false);
        }
        return jz5.f0.f384359a;
    }
}
