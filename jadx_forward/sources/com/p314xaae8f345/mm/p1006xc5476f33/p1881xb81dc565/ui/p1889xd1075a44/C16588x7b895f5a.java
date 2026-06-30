package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/ScreenCastBigView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "Landroid/view/LayoutInflater;", "getLayoutInflater", "Lcom/tencent/mm/plugin/multitalk/mt_render/mt_render_impl/render/VideoView;", "kotlin.jvm.PlatformType", "d", "Ljz5/g;", "getVideoView", "()Lcom/tencent/mm/plugin/multitalk/mt_render/mt_render_impl/render/VideoView;", "videoView", "Landroid/widget/ImageView;", "f", "getMaskView", "()Landroid/widget/ImageView;", "maskView", "", "g", "Ljava/lang/String;", "getCurrentUsername", "()Ljava/lang/String;", "setCurrentUsername", "(Ljava/lang/String;)V", "currentUsername", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView */
/* loaded from: classes14.dex */
public final class C16588x7b895f5a extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f231888m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoView;

    /* renamed from: e, reason: collision with root package name */
    public int f231890e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g maskView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.lang.String currentUsername;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f231893h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f231894i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16588x7b895f5a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.videoView = jz5.h.b(new sj3.p5(this));
        this.maskView = jz5.h.b(new sj3.h5(this));
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570965ci5, (android.view.ViewGroup) this, true);
        this.currentUsername = "";
        this.f231894i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMaskView */
    public final android.widget.ImageView m67088x8c409d27() {
        return (android.widget.ImageView) ((jz5.n) this.maskView).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getVideoView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 m67089x4ee17f0a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0) ((jz5.n) this.videoView).mo141623x754a37bb();
    }

    public final void c(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "bindUser: " + this.currentUsername + " to " + username);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
        if (n17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 m67089x4ee17f0a = m67089x4ee17f0a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m67089x4ee17f0a, "<get-videoView>(...)");
            n17.a(m67089x4ee17f0a, username);
        }
        this.currentUsername = username;
        m67088x8c409d27().setVisibility(8);
    }

    public final void d() {
        if (this.f231893h == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "dismissCenterInfo: " + this.f231890e);
        pm0.v.X(new sj3.g5(this));
    }

    public final void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "showCenterLoading: " + z17);
        android.view.View view = this.f231893h;
        if (view != null) {
            removeView(view);
            this.f231893h = null;
        }
        android.view.View inflate = m67091xacd3518b().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570844c33, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567556jw5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        if (!z17) {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jw6)).setVisibility(8);
            m67089x4ee17f0a().m67063x60d7080c(new sj3.j5(this));
        }
        pm0.v.X(new sj3.k5(this, inflate, z17, imageView));
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "unbindUser: " + this.currentUsername);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
        if (n17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 m67089x4ee17f0a = m67089x4ee17f0a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m67089x4ee17f0a, "<get-videoView>(...)");
            n17.l(m67089x4ee17f0a, this.currentUsername);
        }
    }

    public final java.lang.String getCurrentUsername() {
        return this.currentUsername;
    }

    /* renamed from: getLayoutInflater */
    public final android.view.LayoutInflater m67091xacd3518b() {
        java.lang.Object systemService = getContext().getSystemService("layout_inflater");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return (android.view.LayoutInflater) systemService;
    }

    /* renamed from: setCurrentUsername */
    public final void m67092x91b38cad(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.currentUsername = str;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            e(false);
        } else {
            d();
        }
    }
}
