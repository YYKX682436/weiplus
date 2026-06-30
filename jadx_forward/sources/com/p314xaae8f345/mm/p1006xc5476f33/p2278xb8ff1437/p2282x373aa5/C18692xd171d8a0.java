package com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5;

/* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMTextureView */
/* loaded from: classes14.dex */
public class C18692xd171d8a0 extends com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249 implements pk4.a, db5.e7 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f256085d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f256086e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f256087f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f256088g;

    public C18692xd171d8a0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f256086e = false;
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        super.destroyDrawingCache();
        if (this.f256086e) {
            j();
        }
    }

    public void h() {
        try {
            mo70831x49dc7633(false);
            j();
            java.lang.reflect.Method method = android.view.TextureView.class.getMethod("destroyHardwareLayer", new java.lang.Class[0]);
            method.setAccessible(true);
            method.invoke(this, new java.lang.Object[0]);
            java.lang.reflect.Method method2 = android.view.TextureView.class.getMethod("releaseSurfaceTexture", new java.lang.Class[0]);
            method2.setAccessible(true);
            method2.invoke(this, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
        }
    }

    public void i() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "hookInnerDetach");
            java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f256087f = declaredField.get(this);
            declaredField.set(this, null);
            java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f256088g = declaredField2.get(this);
            declaredField2.set(this, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
        }
    }

    public void j() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "unHookInnerDetach");
            if (this.f256087f != null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f256087f);
                this.f256087f = null;
            }
            if (this.f256088g != null) {
                java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f256088g);
                this.f256088g = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        if (this.f256086e) {
            i();
        }
        super.onAttachedToWindow();
        if (this.f256086e) {
            j();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (this.f256086e) {
            i();
        }
        try {
            super.onDetachedFromWindow();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextureView", e17, "unkown error", new java.lang.Object[0]);
        }
    }

    @Override // pk4.a, db5.e7
    /* renamed from: setInterceptDetach */
    public void mo70831x49dc7633(boolean z17) {
        this.f256086e = z17;
    }

    @Override // android.view.TextureView, pk4.a
    public void setSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
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
            if (this.f256085d == null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mSurface");
                this.f256085d = declaredField;
                declaredField.setAccessible(true);
            }
            android.graphics.SurfaceTexture surfaceTexture2 = (android.graphics.SurfaceTexture) this.f256085d.get(this);
            if (surfaceTexture2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
                return;
            }
            if (surfaceTexture2 instanceof pk4.m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextureView", "detect texture problem, wrapped");
                return;
            }
            pk4.m mVar = new pk4.m(0);
            mVar.f438042a = surfaceTexture2;
            this.f256085d.set(this, mVar);
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

    public C18692xd171d8a0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f256086e = false;
    }

    public C18692xd171d8a0(android.content.Context context) {
        super(context);
        this.f256086e = false;
    }
}
