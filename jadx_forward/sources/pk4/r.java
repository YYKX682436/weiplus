package pk4;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 f438054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9) {
        super(1);
        this.f438054d = c18691x35cf85c9;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dk4.a aVar;
        dk4.a aVar2;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9 = this.f438054d;
        java.lang.String str = c18691x35cf85c9.f256076d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreatePlayerSurface createVideoTexture finished surface:");
        sb6.append(surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        c18691x35cf85c9.f256082m = surfaceTexture;
        c18691x35cf85c9.f256083n = new android.view.Surface(c18691x35cf85c9.f256082m);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recreatePlayerSurface create playerSurface finished surface:");
        android.view.Surface surface = c18691x35cf85c9.f256083n;
        sb7.append(surface != null ? surface.hashCode() : 0);
        java.lang.String sb8 = sb7.toString();
        java.lang.String str2 = c18691x35cf85c9.f256076d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8);
        kk4.b player = c18691x35cf85c9.getPlayer();
        int i17 = (player == null || (aVar2 = ((kk4.v) player).f390111c) == null) ? 0 : aVar2.f316018v;
        kk4.b player2 = c18691x35cf85c9.getPlayer();
        int i18 = (player2 == null || (aVar = ((kk4.v) player2).f390111c) == null) ? 0 : aVar.f316019w;
        android.graphics.SurfaceTexture surfaceTexture2 = c18691x35cf85c9.f256082m;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i17, i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "recreatePlayerSurface defaultBufferSize:[" + i17 + ',' + i18 + ']');
        kk4.b player3 = c18691x35cf85c9.getPlayer();
        if (player3 != null) {
            kk4.b.h(player3, c18691x35cf85c9.f256083n, false, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
