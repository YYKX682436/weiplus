package bt2;

/* loaded from: classes3.dex */
public abstract class f extends com.tencent.mm.plugin.finder.live.view.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f24184d;

    /* renamed from: e, reason: collision with root package name */
    public ws2.o f24185e;

    /* renamed from: f, reason: collision with root package name */
    public bt2.c f24186f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, androidx.fragment.app.Fragment fragment, android.util.AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f24184d = "FinderLiveShoppingReplayRouter";
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        this.f24185e = new ws2.o(mMActivity, bt2.e.f24183d);
        this.f24186f = new bt2.c(mMActivity);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public abstract /* synthetic */ int getLiveRole();

    public final ws2.o getShoppingReplayBaseUIC() {
        return this.f24185e;
    }

    public final bt2.c getShoppingReplayDecorateUIC() {
        return this.f24186f;
    }

    public final java.lang.String getTAG() {
        return this.f24184d;
    }

    public final void setShoppingReplayBaseUIC(ws2.o oVar) {
        kotlin.jvm.internal.o.g(oVar, "<set-?>");
        this.f24185e = oVar;
    }

    public final void setShoppingReplayDecorateUIC(bt2.c cVar) {
        kotlin.jvm.internal.o.g(cVar, "<set-?>");
        this.f24186f = cVar;
    }
}
