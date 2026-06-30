package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class o4 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f66851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f66853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f66854d;

    public o4(long j17, com.tencent.mm.feature.finder.live.v4 v4Var, int i17, kotlinx.coroutines.q qVar) {
        this.f66851a = j17;
        this.f66852b = v4Var;
        this.f66853c = i17;
        this.f66854d = qVar;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestLiveInfo, liveId:");
        long j18 = this.f66851a;
        sb6.append(pm0.v.u(j18));
        sb6.append(",liveStatus:");
        sb6.append(i17);
        sb6.append(",resp:");
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        r45.l71 l71Var = obj instanceof r45.l71 ? (r45.l71) obj : null;
        kotlinx.coroutines.q qVar = this.f66854d;
        if (l71Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.feature.finder.live.v4 v4Var = this.f66852b;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = v4Var.f66986g;
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
            concurrentHashMap.put(valueOf, new jz5.o(java.lang.Integer.valueOf(nw1Var != null ? nw1Var.getInteger(2) : 1), java.lang.Long.valueOf(currentTimeMillis), l71Var));
            v4Var.f66989m.put(new jz5.l(java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f66853c)), java.lang.Integer.valueOf(l71Var.getInteger(25)));
            r45.zm1 zm1Var = new r45.zm1();
            zm1Var.set(0, java.lang.Long.valueOf(currentTimeMillis));
            zm1Var.set(1, l71Var);
            qVar.resumeWith(kotlin.Result.m521constructorimpl(zm1Var));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
    }
}
