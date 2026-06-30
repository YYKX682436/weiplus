package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMTextureView */
/* loaded from: classes14.dex */
public class C21518xd171d8a0 extends android.view.TextureView implements db5.e7 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f279131d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279132e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f279133f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f279134g;

    public C21518xd171d8a0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279132e = false;
    }

    public void B() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "hookInnerDetach");
            java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f279133f = declaredField.get(this);
            declaredField.set(this, null);
            java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f279134g = declaredField2.get(this);
            declaredField2.set(this, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
        }
    }

    public void C() {
        if (fp.h.a(16)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return;
        }
        if (fp.h.b(20)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return;
        }
        if (wo.v1.f529366m.E == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "do not do sly textureView, config ERROR");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "detect texture problem, sly");
        try {
            if (this.f279131d == null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mSurface");
                this.f279131d = declaredField;
                declaredField.setAccessible(true);
            }
            android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) this.f279131d.get(this);
            if (surfaceTexture == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
                return;
            }
            if (surfaceTexture instanceof db5.h6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "detect texture problem, wrapped");
                return;
            }
            db5.h6 h6Var = new db5.h6(0);
            h6Var.f309916a = surfaceTexture;
            this.f279131d.set(this, h6Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "detect texture problem, wrap");
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTextureView", "detect texture problem, IllegalAccessException");
        } catch (java.lang.IllegalArgumentException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e18, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTextureView", "detect texture problem, IllegalArgumentException");
        } catch (java.lang.NoSuchFieldException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e19, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTextureView", "detect texture problem, NoSuchFieldException");
        }
    }

    public void D() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "unHookInnerDetach");
            if (this.f279133f != null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f279133f);
                this.f279133f = null;
            }
            if (this.f279134g != null) {
                java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f279134g);
                this.f279134g = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        super.destroyDrawingCache();
        if (this.f279132e) {
            D();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        if (this.f279132e) {
            B();
        }
        super.onAttachedToWindow();
        if (this.f279132e) {
            D();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (this.f279132e) {
            B();
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e17, "unkown error", new java.lang.Object[0]);
        }
    }

    @Override // db5.e7
    /* renamed from: setInterceptDetach */
    public void mo70831x49dc7633(boolean z17) {
        this.f279132e = z17;
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
        C();
    }

    public C21518xd171d8a0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279132e = false;
    }

    public C21518xd171d8a0(android.content.Context context) {
        super(context);
        this.f279132e = false;
    }
}
