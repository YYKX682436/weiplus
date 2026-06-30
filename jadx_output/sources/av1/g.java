package av1;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.CastUIC f14180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.cast.ui.CastUIC castUIC) {
        super(0);
        this.f14180d = castUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo) this.f14180d.getIntent().getParcelableExtra("params_selected_music");
    }
}
