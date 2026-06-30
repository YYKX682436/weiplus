package pk4;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c f438038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk4.v f438039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f438040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c, kk4.v vVar, long j17) {
        super(1);
        this.f438038d = c18689xd498e45c;
        this.f438039e = vVar;
        this.f438040f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dk4.a aVar;
        dk4.a aVar2;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438038d;
        java.lang.String str = c18689xd498e45c.f256045d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreatePlayerSurface create surface finished:");
        sb6.append(surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        c18689xd498e45c.f256057s = surfaceTexture;
        kk4.v vVar = this.f438039e;
        int i17 = (vVar == null || (aVar2 = vVar.f390111c) == null) ? 0 : aVar2.f316018v;
        int i18 = (vVar == null || (aVar = vVar.f390111c) == null) ? 0 : aVar.f316019w;
        java.lang.String str2 = c18689xd498e45c.f256045d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "recreatePlayerSurface defaultBufferSize:[" + i17 + ',' + i18 + ']');
        android.graphics.SurfaceTexture surfaceTexture2 = c18689xd498e45c.f256057s;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i17, i18);
        }
        c18689xd498e45c.f256058t = new android.view.Surface(c18689xd498e45c.f256057s);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recreatePlayerSurface create playerSurface:");
        android.view.Surface surface = c18689xd498e45c.f256058t;
        sb7.append(surface != null ? surface.hashCode() : 0);
        sb7.append(", cost:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb7.append(android.os.SystemClock.elapsedRealtime() - this.f438040f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
        if (vVar != null) {
            kk4.b.h(vVar, c18689xd498e45c.f256058t, false, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
