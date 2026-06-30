package com.p314xaae8f345.mm.p2793xcfa97743.v2.p2800xc84b4196;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR>\u0010$\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0016\u0010*\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00061"}, d2 = {"Lcom/tencent/mm/voipmp/v2/render/VoIPMPVoIPVideoView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lbp5/h;", "", "ori", "Ljz5/f0;", "setScreenOri", "Landroid/graphics/SurfaceTexture;", "<set-?>", "d", "Landroid/graphics/SurfaceTexture;", "getRenderSurface", "()Landroid/graphics/SurfaceTexture;", "renderSurface", "Landroid/util/Size;", "e", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "size", "", "f", "Z", "getNeedRecreate", "()Z", "setNeedRecreate", "(Z)V", "needRecreate", "Lkotlin/Function3;", "g", "Lyz5/q;", "getOnSurfaceTextureChanged", "()Lyz5/q;", "setOnSurfaceTextureChanged", "(Lyz5/q;)V", "onSurfaceTextureChanged", "getRenderSize", "renderSize", "", "getRenderTarget", "()Ljava/lang/Object;", "renderTarget", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-voipmp_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.voipmp.v2.render.VoIPMPVoIPVideoView */
/* loaded from: classes14.dex */
public final class TextureViewSurfaceTextureListenerC22892x75ece15d extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, bp5.h {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.graphics.SurfaceTexture renderSurface;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.util.Size size;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean needRecreate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.q onSurfaceTextureChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC22892x75ece15d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.size = new android.util.Size(0, 0);
        setSurfaceTextureListener(this);
    }

    @Override // bp5.h
    /* renamed from: getImpellerEnabled */
    public /* bridge */ /* synthetic */ boolean mo11014xf13d6265() {
        return false;
    }

    @Override // bp5.h
    public boolean getNeedRecreate() {
        return this.needRecreate;
    }

    public final yz5.q getOnSurfaceTextureChanged() {
        return this.onSurfaceTextureChanged;
    }

    /* renamed from: getRenderPts */
    public /* bridge */ /* synthetic */ long m82963x6d13fac3() {
        return -1L;
    }

    @Override // bp5.h
    /* renamed from: getRenderSize, reason: from getter */
    public android.util.Size getSize() {
        return this.size;
    }

    public final android.graphics.SurfaceTexture getRenderSurface() {
        return this.renderSurface;
    }

    @Override // bp5.h
    /* renamed from: getRenderTarget */
    public java.lang.Object mo11009x8dd3293d() {
        return this.renderSurface;
    }

    /* renamed from: getSize */
    public final android.util.Size m82965xfb854877() {
        return this.size;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPVideoView", "onSurfaceTextureAvailable() called with: surface = " + surface + ", width = " + i17 + ", height = " + i18);
        this.size = new android.util.Size(i17, i18);
        this.renderSurface = surface;
        yz5.q qVar = this.onSurfaceTextureChanged;
        if (qVar != null) {
            qVar.mo147xb9724478(surface, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.renderSurface = null;
        surface.release();
        yz5.q qVar = this.onSurfaceTextureChanged;
        if (qVar != null) {
            qVar.mo147xb9724478(null, 0, 0);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPVideoView", "onSurfaceTextureSizeChanged() called with: surface = " + surface + ", width = " + i17 + ", height = " + i18);
        this.size = new android.util.Size(i17, i18);
        yz5.q qVar = this.onSurfaceTextureChanged;
        if (qVar != null) {
            qVar.mo147xb9724478(surface, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    @Override // bp5.h
    /* renamed from: setNeedRecreate */
    public void mo11010xc3db8127(boolean z17) {
        this.needRecreate = z17;
    }

    /* renamed from: setOnSurfaceTextureChanged */
    public final void m82966x799007c5(yz5.q qVar) {
        this.onSurfaceTextureChanged = qVar;
    }

    /* renamed from: setScreenOri */
    public void m82967x6335c098(int i17) {
    }
}
