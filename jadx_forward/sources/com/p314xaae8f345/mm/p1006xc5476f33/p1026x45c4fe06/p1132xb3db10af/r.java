package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class r implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165704a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.v vVar, java.lang.String str) {
        this.f165704a = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.u
    public void a(kg1.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1) eVar;
        java.lang.String str = this.f165704a;
        if (str == null) {
            w1Var.getClass();
            return;
        }
        java.lang.String[] b17 = w1Var.c().b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        int length = b17.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String str2 = b17[i17];
            if (r26.i0.y(str2 == null ? "" : str2, str, false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.f169906a.c().remove(str2);
            }
        }
        w1Var.c().putBoolean(str, true);
        w1Var.c().putLong(str.concat("_PROCESS_START_TICK"), android.os.SystemClock.elapsedRealtime());
        w1Var.c().remove(str.concat("_RUNNING_RESOURCE_PREPARING"));
    }
}
