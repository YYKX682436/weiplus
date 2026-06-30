package ku3;

/* loaded from: classes10.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 f393694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47, int i17) {
        super(0);
        this.f393694d = c17028xc20c4c47;
        this.f393695e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47.f237389x1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47 = this.f393694d;
        int i18 = c17028xc20c4c47.getEnableLandscape() ? 0 : this.f393695e;
        c17028xc20c4c47.getCameraSwitchPlugin().b(i18);
        android.view.View m68051x76530f60 = c17028xc20c4c47.m68051x76530f60();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m68051x76530f60, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.CameraKitView");
        ((com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) m68051x76530f60).m46835x2627ce99(i18);
        return jz5.f0.f384359a;
    }
}
