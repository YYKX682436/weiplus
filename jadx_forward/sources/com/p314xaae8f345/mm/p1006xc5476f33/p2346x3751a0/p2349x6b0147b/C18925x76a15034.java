package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b;

/* renamed from: com.tencent.mm.plugin.voip.video.OpenGlView */
/* loaded from: classes13.dex */
public class C18925x76a15034 extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b {

    /* renamed from: s, reason: collision with root package name */
    public final int f258612s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.ref.WeakReference f258613t;

    public C18925x76a15034(android.content.Context context) {
        super(context);
        this.f258612s = 1;
        this.f258612s = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.c();
        f(false, 0, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b
    public void c(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19) {
        super.c(surfaceTexture, i17, i18, i19);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b
    public void d(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlView", "surfaceCreated");
        super.d(surfaceTexture);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65) this.f258613t.get();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "%s surfaceCreated", java.lang.Integer.valueOf(c18924x4c862f65.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.c();
        c18924x4c862f65.f258586a = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b
    public void e(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 c18925x76a15034;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlView", "surfaceDestroyed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65) this.f258613t.get();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "onSurfaceDestroyed,mRenderMode:%d", java.lang.Integer.valueOf(c18924x4c862f65.f258591f));
        if (c18924x4c862f65.f258597l != null) {
            c18924x4c862f65.f258611z = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "surfaceDestroy call detachGLContext");
            c18924x4c862f65.b(false);
        }
        c18924x4c862f65.f258586a = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "steve: after Uninit in onSurfaceDestroyed");
        c18924x4c862f65.f258588c = 0;
        c18924x4c862f65.f258589d = 0;
        java.lang.ref.WeakReference weakReference = c18924x4c862f65.f258590e;
        if (weakReference != null && (c18925x76a15034 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034) weakReference.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "onSurfaceDestroyed queue release renderer event");
            c18925x76a15034.b(new wq4.v(c18924x4c862f65));
        }
        super.e(surfaceTexture);
    }

    public final void f(boolean z17, int i17, int i18) {
        if (this.f258612s == 2) {
            m72897xa172aac3(new wq4.b());
            m72894x81a19c31(new wq4.a(5, 6, 5, 0, 0, 0));
        }
    }

    /* renamed from: setRenderer */
    public void m72910x5913df45(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65) {
        this.f258613t = new java.lang.ref.WeakReference(c18924x4c862f65);
        super.m72902x5913df45((wq4.q) c18924x4c862f65);
        m72901x638e3a5b(0);
    }

    public C18925x76a15034(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258612s = 1;
        this.f258612s = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.c();
        f(false, 0, 0);
    }
}
