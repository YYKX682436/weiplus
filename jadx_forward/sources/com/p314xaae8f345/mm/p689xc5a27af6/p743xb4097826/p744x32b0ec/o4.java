package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class o4 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f148384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f148386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f148387d;

    public o4(long j17, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, int i17, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f148384a = j17;
        this.f148385b = v4Var;
        this.f148386c = i17;
        this.f148387d = qVar;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestLiveInfo, liveId:");
        long j18 = this.f148384a;
        sb6.append(pm0.v.u(j18));
        sb6.append(",liveStatus:");
        sb6.append(i17);
        sb6.append(",resp:");
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        r45.l71 l71Var = obj instanceof r45.l71 ? (r45.l71) obj : null;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f148387d;
        if (l71Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = this.f148385b;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = v4Var.f148519g;
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            r45.nw1 nw1Var = (r45.nw1) l71Var.m75936x14adae67(1);
            concurrentHashMap.put(valueOf, new jz5.o(java.lang.Integer.valueOf(nw1Var != null ? nw1Var.m75939xb282bd08(2) : 1), java.lang.Long.valueOf(currentTimeMillis), l71Var));
            v4Var.f148522m.put(new jz5.l(java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f148386c)), java.lang.Integer.valueOf(l71Var.m75939xb282bd08(25)));
            r45.zm1 zm1Var = new r45.zm1();
            zm1Var.set(0, java.lang.Long.valueOf(currentTimeMillis));
            zm1Var.set(1, l71Var);
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(zm1Var));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
    }
}
