package vx1;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx1.e f522760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx1.f f522761e;

    public h(vx1.i iVar, vx1.e eVar, vx1.f fVar) {
        this.f522760d = eVar;
        this.f522761e = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        vx1.e eVar = this.f522760d;
        ((zx1.a) eVar).getClass();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("weakglobal_fix").getBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", false);
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("weakglobal_fix").getBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeakGlobalRefFix", "start " + z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeakGlobalRefFix", "end " + z19);
        if (z18 == z19) {
            if (z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1113L, 2L, 1L, false);
            }
            z17 = false;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("weakglobal_fix").getInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", 0) == -5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1113L, 0L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1113L, 1L, 1L, false);
            }
            z17 = true;
        }
        vx1.f fVar = this.f522761e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SystemCrashFixPatch", fVar.getClass().getCanonicalName() + " has failed before");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SystemCrashFixPatch", fVar.getClass().getCanonicalName() + " : start");
        ((zx1.a) eVar).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("weakglobal_fix");
        R.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
        R.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", true);
        R.putInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", 0);
        ((zx1.a) eVar).b();
        ((zx1.a) eVar).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("weakglobal_fix").putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SystemCrashFixPatch", fVar.getClass().getCanonicalName() + " : true");
    }
}
