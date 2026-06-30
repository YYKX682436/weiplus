package pr0;

/* loaded from: classes14.dex */
public final class d extends pr0.g0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f439351w = 0;

    public static final sr0.i s(pr0.d dVar, xr0.c cVar, xr0.b bVar, boolean z17) {
        dVar.getClass();
        int b17 = qr0.a.f447588a.b();
        int i17 = cVar != null ? cVar.f537688a : -1;
        if (!(1 <= i17 && i17 < 4)) {
            i17 = b17;
        }
        if (z17) {
            i17 = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createCameraInstance biz set:");
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f537688a) : null);
        sb6.append(" config:");
        sb6.append(b17);
        sb6.append(", forceUseCamera1: ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = dVar.f439373u;
        int i18 = dVar.f439366d;
        sr0.f zVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? new vr0.z(j2Var, i18) : new vr0.z(j2Var, i18) : new ur0.s(j2Var, i18) : new tr0.t(j2Var, i18);
        if (cVar != null) {
            if (zVar.f492968i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.BaseCameraInstance", "CameraKitCommonSetting >>  " + java.lang.Boolean.valueOf(cVar.f537691d));
                zVar.f492968i = cVar;
            }
            dVar.k().getClass();
        }
        if (bVar != null && zVar.f492969m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.BaseCameraInstance", "setCameraAbilitySetting >> " + java.lang.Boolean.valueOf(bVar.f537684b) + ", " + java.lang.Boolean.valueOf(bVar.f537685c) + ", " + java.lang.Boolean.valueOf(bVar.f537683a));
            zVar.f492969m = bVar;
        }
        return zVar;
    }
}
