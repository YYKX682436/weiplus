package dk2;

/* renamed from: dk2.if */
/* loaded from: classes3.dex */
public final class Cif {

    /* renamed from: a */
    public static final dk2.Cif f315159a = new dk2.Cif();

    /* renamed from: b */
    public static final kk.l f315160b = new kk.l(10);

    public static /* synthetic */ void b(dk2.Cif cif, qo0.c cVar, long j17, dk2.hf hfVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        cif.a(cVar, j17, hfVar, z17);
    }

    public final void a(qo0.c statusMonitor, long j17, dk2.hf scene, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.d dVar = (mm2.d) efVar.i(mm2.d.class);
        boolean N6 = dVar != null ? dVar.N6() : false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#checkTriggerShow liveId=");
        sb6.append(j17);
        sb6.append(" scene=");
        sb6.append(scene);
        sb6.append(" shakeBtn=");
        sb6.append(z17);
        sb6.append(" isAnchorFollowed:");
        sb6.append(N6);
        sb6.append(" isBizMode=");
        mm2.d dVar2 = (mm2.d) efVar.i(mm2.d.class);
        sb6.append(dVar2 != null ? dVar2.f410475f : false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveShowFollowBtnLogic", sb6.toString());
        if (z17 && !N6) {
            qo0.b bVar = qo0.b.U;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHAKE_VIEW", z17);
            statusMonitor.mo46557x60d69242(bVar, bundle);
        }
        kk.l lVar = f315160b;
        if (lVar.k(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveShowFollowBtnLogic", "#checkTriggerShow out");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveShowFollowBtnLogic", "#checkTriggerShow come in");
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        lVar.put(java.lang.Long.valueOf(j17), new dk2.gf(scene, valueOf));
        if (N6) {
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.u1 u1Var = ml2.u1.f409576f;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("follow_icon_expose_condition", java.lang.String.valueOf(scene.ordinal()));
        linkedHashMap.put("follow_icon_expose_condition_sessionid", valueOf);
        zy2.zb.I8((zy2.zb) c17, u1Var, linkedHashMap, null, null, null, null, false, 124, null);
    }
}
