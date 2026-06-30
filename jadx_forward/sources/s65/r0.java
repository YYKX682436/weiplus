package s65;

/* loaded from: classes11.dex */
public class r0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.s f485043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.s0 f485044e;

    public r0(s65.s0 s0Var, com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        this.f485044e = s0Var;
        this.f485043d = sVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.Map d17;
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        s65.s0 s0Var = this.f485044e;
        r1Var.q(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, s0Var.f485048b.f273862m);
        s0Var.f485048b.f273862m = null;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p957x53236a1b.q0) m1Var).f152932d;
            long j17 = 0;
            if (((r45.hn3) oVar.f152243a.f152217a).f457845d == 0) {
                java.lang.String str2 = ((r45.in3) oVar.f152244b.f152233a).f458699d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "resourcecontrolinfo", null)) != null) {
                    java.lang.String str3 = (java.lang.String) d17.get(".resourcecontrolinfo.enableupdate");
                    java.lang.String str4 = (java.lang.String) d17.get(".resourcecontrolinfo.expiredtime");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate getDisableUpdateTime values[%s]", d17);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 1) == 0) {
                        j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str4, 0L);
                    }
                }
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            if (j17 > currentTimeMillis) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "summerupdate checkcontrol time[%d] > now[%d] control not auto download and ret", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 0L, 1L, true);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService after checkcontrol");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 59L, 1L, true);
        android.content.Intent intent = new android.content.Intent(s0Var.f485048b.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc.class);
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9.a(s0Var.f485048b, intent, this.f485043d, s0Var.f485047a);
        intent.putExtra("intent_extra_run_in_foreground", true);
        intent.putExtra("intent_extra_download_mode", 2);
        l85.h1.e(intent, "sandbox", true, j45.l.e("sandbox"));
    }
}
