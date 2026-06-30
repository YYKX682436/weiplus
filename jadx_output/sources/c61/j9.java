package c61;

/* loaded from: classes3.dex */
public final class j9 implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f39069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39070c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f39072e;

    public j9(boolean z17, zy2.g5 g5Var, int i17, int i18, long j17) {
        this.f39068a = z17;
        this.f39069b = g5Var;
        this.f39070c = i17;
        this.f39071d = i18;
        this.f39072e = j17;
    }

    @Override // ug5.i
    public void a(android.content.Context context, android.view.View view, android.widget.FrameLayout parent, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(performer, "performer");
        com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "onDetachPerformView feedId: ".concat(pm0.v.u(this.f39072e)));
        super.a(context, view, parent, performer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender mMTextureViewRender;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(performer, "performer");
        boolean z17 = this.f39068a;
        int i17 = this.f39071d;
        int i18 = this.f39070c;
        if (z17) {
            com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender mMSurfaceViewRender = new com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender(context);
            mMSurfaceViewRender.a(i18, i17);
            mMSurfaceViewRender.setZOrderOnTop(true);
            mMSurfaceViewRender.setBackgroundColor(-16777216);
            mMTextureViewRender = mMSurfaceViewRender;
        } else {
            com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender mMTextureViewRender2 = new com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender(context);
            mMTextureViewRender2.a(i18, i17);
            mMTextureViewRender = mMTextureViewRender2;
        }
        mMTextureViewRender.setTagPrefix(this.f39069b.toString());
        return mMTextureViewRender;
    }
}
