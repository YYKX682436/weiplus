package zx1;

/* loaded from: classes7.dex */
public class a implements vx1.e {
    @Override // vx1.f
    public boolean a(int i17) {
        if (i17 != 24 && i17 != 25) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeakGlobalRefFix", "api " + i17);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weakglobal_fix, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeakGlobalRefFix", "Expt : " + Ni);
        if (Ni == 0) {
            return false;
        }
        if (Ni == 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("weakglobal_fix");
            R.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
            R.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", false);
        }
        return true;
    }

    @Override // vx1.f
    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni.C13166x581afc23.m54626x316510();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni.C13166x581afc23.m54624xb4c6af99();
            new android.view.View(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeakGlobalRefFix", "init finish");
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.view.RenderNode").getDeclaredMethod("nCreate", java.lang.String.class);
            java.lang.reflect.Method method = com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni.C13166x581afc23.class.getMethod("calculateOffset", new java.lang.Class[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeakGlobalRefFix", "reflect finish");
            com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni.C13166x581afc23.m54625x30f523(declaredMethod, method);
            new android.view.View(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeakGlobalRefFix", "succ");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("weakglobal_fix").putInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", -5);
        }
        return true;
    }
}
