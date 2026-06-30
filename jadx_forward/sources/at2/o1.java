package at2;

/* loaded from: classes3.dex */
public final class o1 {
    public o1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        android.view.Window window;
        android.view.View decorView;
        ig2.a aVar = ig2.a.f372895a;
        ig2.r rVar = (ig2.r) ig2.a.f372896b.get(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentReplaySwitchManager", "recordFluentSwitchInRoomPlayer feedId:" + j17 + " director:" + rVar);
        if (rVar instanceof ig2.i) {
            ig2.i iVar = (ig2.i) rVar;
            iVar.c();
            ig2.a.f372897c.put(java.lang.Long.valueOf(j17), iVar.c());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentReplaySwitchManager", "getSwitchInLiveRoomDirector feedId:" + j17 + " checkDetach:true director:" + rVar);
        if (rVar != null && rVar.i()) {
            rVar = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detachBlock feedId: ");
        sb6.append(j17);
        sb6.append(" director: ");
        sb6.append(rVar);
        sb6.append(" isDetach: ");
        sb6.append(rVar != null ? java.lang.Boolean.valueOf(rVar.i()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerPlugin", sb6.toString());
        if ((rVar == null || rVar.i()) ? false : true) {
            rVar.h();
        }
        if (k0Var != null) {
            k0Var.setAlpha(1.0f);
        }
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf == null || (window = abstractActivityC21394xb3d2c0cf.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setBackgroundColor(-16777216);
    }
}
