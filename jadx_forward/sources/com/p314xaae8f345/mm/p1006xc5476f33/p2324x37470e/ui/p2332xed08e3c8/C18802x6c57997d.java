package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2332xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/preview/VLogFakeVideoView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/vlog/model/m1;", "getScriptModel", "", "mute", "Ljz5/f0;", "setMute", "Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "d", "Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "getVlogVideoView", "()Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "setVlogVideoView", "(Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;)V", "vlogVideoView", "Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "e", "Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "getFakeLayer", "()Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "setFakeLayer", "(Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;)V", "fakeLayer", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "getLoading", "()Landroid/widget/ProgressBar;", "setLoading", "(Landroid/widget/ProgressBar;)V", "loading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.preview.VLogFakeVideoView */
/* loaded from: classes8.dex */
public final class C18802x6c57997d extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2332xed08e3c8.TextureViewSurfaceTextureListenerC18803xd0ca3927 vlogVideoView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 fakeLayer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.ProgressBar loading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18802x6c57997d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.VLogFakeVideoView", "initView");
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571132d42, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.p4h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m72612x1f291910((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2332xed08e3c8.TextureViewSurfaceTextureListenerC18803xd0ca3927) findViewById);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dqf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m72609x98488cba((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646) findViewById2);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ozc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        m72610xc54f6a7a((android.widget.ProgressBar) findViewById3);
        m72608x8c52b29c().m72615x235705aa(new ip4.a(this));
    }

    /* renamed from: getScriptModel */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 m72605xc5eb47e8() {
        new r45.hi0();
        return null;
    }

    /* renamed from: getFakeLayer */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 m72606x3bf4cc46() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 c17034x841bd646 = this.fakeLayer;
        if (c17034x841bd646 != null) {
            return c17034x841bd646;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fakeLayer");
        throw null;
    }

    /* renamed from: getLoading */
    public final android.widget.ProgressBar m72607x51de1d06() {
        android.widget.ProgressBar progressBar = this.loading;
        if (progressBar != null) {
            return progressBar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loading");
        throw null;
    }

    /* renamed from: getVlogVideoView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2332xed08e3c8.TextureViewSurfaceTextureListenerC18803xd0ca3927 m72608x8c52b29c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2332xed08e3c8.TextureViewSurfaceTextureListenerC18803xd0ca3927 textureViewSurfaceTextureListenerC18803xd0ca3927 = this.vlogVideoView;
        if (textureViewSurfaceTextureListenerC18803xd0ca3927 != null) {
            return textureViewSurfaceTextureListenerC18803xd0ca3927;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("vlogVideoView");
        throw null;
    }

    /* renamed from: setFakeLayer */
    public final void m72609x98488cba(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 c17034x841bd646) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17034x841bd646, "<set-?>");
        this.fakeLayer = c17034x841bd646;
    }

    /* renamed from: setLoading */
    public final void m72610xc54f6a7a(android.widget.ProgressBar progressBar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressBar, "<set-?>");
        this.loading = progressBar;
    }

    /* renamed from: setMute */
    public final void m72611x764d819b(boolean z17) {
    }

    /* renamed from: setVlogVideoView */
    public final void m72612x1f291910(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2332xed08e3c8.TextureViewSurfaceTextureListenerC18803xd0ca3927 textureViewSurfaceTextureListenerC18803xd0ca3927) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureViewSurfaceTextureListenerC18803xd0ca3927, "<set-?>");
        this.vlogVideoView = textureViewSurfaceTextureListenerC18803xd0ca3927;
    }
}
