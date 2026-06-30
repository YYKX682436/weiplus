package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165705a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.v vVar, java.lang.String str) {
        this.f165705a = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.u
    public void a(kg1.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1) eVar;
        java.lang.String str = this.f165705a;
        if (str == null) {
            w1Var.getClass();
            return;
        }
        long j17 = w1Var.c().getLong(str.concat("_PROCESS_START_TICK"), com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.f169906a.c().W(str.concat("_PROCESS_START_TICK"));
        if (j17 < com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProcessEnd id:");
            sb6.append(str);
            sb6.append(", cost:");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WAKeyStepKvLogger", sb6.toString());
        }
        w1Var.c().remove(str);
        w1Var.c().remove(str.concat("_RUNNING_RESOURCE_PREPARING"));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f(false);
        }
    }
}
