package mm3;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 f411151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk4.c f411153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f411154g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f411155h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var, int i17, pk4.c cVar, long j17, java.util.List list) {
        super(2);
        this.f411151d = h6Var;
        this.f411152e = i17;
        this.f411153f = cVar;
        this.f411154g = j17;
        this.f411155h = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fm3.b bVar = (fm3.b) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "preview transition: " + bVar);
        this.f411151d.O6(this.f411152e, bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29 textureViewSurfaceTextureListenerC18694xeac4a29 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) this.f411153f;
        long j17 = this.f411154g;
        textureViewSurfaceTextureListenerC18694xeac4a29.d(j17);
        textureViewSurfaceTextureListenerC18694xeac4a29.c();
        kl3.t.g().a().c((int) j17);
        kl3.t.g().a().mo67221xc84dc82d();
        java.util.Iterator it = this.f411155h.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fm3.b) it.next()).f345561a, bVar != null ? bVar.f345561a : null)) {
                break;
            }
            i17++;
        }
        int i18 = i17 + 1;
        if (i18 < 0) {
            i18 = 0;
        }
        if (booleanValue) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = fm3.g0.f345603a.c();
            c17.f141015k = 16L;
            c17.G = 0;
            c17.F = i18;
            c17.k();
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c18 = fm3.g0.f345603a.c();
            c18.f141015k = 15L;
            c18.G = 0;
            c18.F = i18;
            c18.k();
        }
        return jz5.f0.f384359a;
    }
}
