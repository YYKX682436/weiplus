package at2;

/* loaded from: classes3.dex */
public final class o1 {
    public o1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(long j17, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        android.view.Window window;
        android.view.View decorView;
        ig2.a aVar = ig2.a.f291362a;
        ig2.r rVar = (ig2.r) ig2.a.f291363b.get(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("FinderFluentReplaySwitchManager", "recordFluentSwitchInRoomPlayer feedId:" + j17 + " director:" + rVar);
        if (rVar instanceof ig2.i) {
            ig2.i iVar = (ig2.i) rVar;
            iVar.c();
            ig2.a.f291364c.put(java.lang.Long.valueOf(j17), iVar.c());
        }
        com.tencent.mars.xlog.Log.i("FinderFluentReplaySwitchManager", "getSwitchInLiveRoomDirector feedId:" + j17 + " checkDetach:true director:" + rVar);
        if (rVar != null && rVar.i()) {
            rVar = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detachBlock feedId: ");
        sb6.append(j17);
        sb6.append(" director: ");
        sb6.append(rVar);
        sb6.append(" isDetach: ");
        sb6.append(rVar != null ? java.lang.Boolean.valueOf(rVar.i()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerPlugin", sb6.toString());
        if ((rVar == null || rVar.i()) ? false : true) {
            rVar.h();
        }
        if (k0Var != null) {
            k0Var.setAlpha(1.0f);
        }
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null || (window = mMActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setBackgroundColor(-16777216);
    }
}
