package qe;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f443457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.f0 f443458e;

    public c0(qe.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f443458e = f0Var;
        this.f443457d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep initConfig ");
        if (this.f443458e.f443478a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep lockStepNative is null");
            return;
        }
        k91.z0 z0Var = (k91.z0) this.f443457d.b(k91.z0.class);
        if (z0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep sysConfig is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "lockstep appId:%s,pkgDebugType:%d,pkgVersion:%d,mbzType:%s", z0Var.f387375e, java.lang.Integer.valueOf(z0Var.f387385r.f156932d + 1), java.lang.Integer.valueOf(z0Var.f387385r.f33456x1c82a56c), this.f443458e.f443479b);
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("appid", z0Var.f387375e);
        hashMap.put("appstate", java.lang.String.valueOf(z0Var.f387385r.f156932d + 1));
        hashMap.put("appversion", java.lang.String.valueOf(z0Var.f387385r.f33456x1c82a56c));
        hashMap.put("apptype", this.f443458e.f443479b);
        this.f443458e.f443478a.m45666xf3d9c872(hashMap);
    }
}
