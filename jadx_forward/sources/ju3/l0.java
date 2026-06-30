package ju3;

/* loaded from: classes10.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 f383501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f383502e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 c17018x4aa057d6, int i17) {
        super(0);
        this.f383501d = c17018x4aa057d6;
        this.f383502e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f383501d.getEnableLandscape() ? 0 : this.f383502e;
        float f17 = i17;
        this.f383501d.getCameraSwitchPlugin().b(f17);
        yt3.a4 switchFlashPlugin = this.f383501d.getSwitchFlashPlugin();
        if (!(switchFlashPlugin.f546881g == f17) && com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordSwitchFlashPlugin", "updateOrientation " + f17 + "  " + switchFlashPlugin.f546878d.getRotation());
            switchFlashPlugin.f546881g = f17;
            switchFlashPlugin.f546878d.animate().cancel();
            switchFlashPlugin.f546878d.animate().rotation(f17).setDuration(100L).start();
        }
        android.view.View m68011x76530f60 = this.f383501d.m68011x76530f60();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m68011x76530f60, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.CameraKitView");
        ((com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) m68011x76530f60).m46835x2627ce99(i17);
        return jz5.f0.f384359a;
    }
}
