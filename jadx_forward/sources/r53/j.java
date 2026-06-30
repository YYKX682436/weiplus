package r53;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474205f;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f474203d = str;
        this.f474204e = str2;
        this.f474205f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.d(this.f474203d);
        if (d17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17.f269910g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUtil", "wepkgVersion not exists or pkgPath is empty");
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(d17.f269910g);
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUtil", "wepkg file not exists");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o(r6Var);
        if (oVar.f269980b) {
            java.util.Iterator it = oVar.c().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.k) it.next();
                if (kVar.f269964a.equals(this.f474204e)) {
                    java.lang.String str = this.f474205f;
                    if (str == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "patchId is null");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.j.a(kVar);
                    } else if (!android.text.TextUtils.equals(str, kVar.f269966c)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "patchId does not match");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.j.a(kVar);
                    }
                }
            }
        }
    }
}
