package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class hv implements com.tencent.tencentmap.mapsdk.maps.model.Animation {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.im f49861a = null;

    /* renamed from: b, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.hv.a f49862b;

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.im.a {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.tencentmap.mapsdk.maps.model.AnimationListener f49863a;

        public a(com.tencent.tencentmap.mapsdk.maps.model.AnimationListener animationListener) {
            this.f49863a = animationListener;
        }

        @Override // com.tencent.mapsdk.internal.im.a
        public final void b() {
            if (this.f49863a != null) {
                com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.hv.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.internal.hv.a.this.f49863a.onAnimationEnd();
                    }
                });
            }
        }

        @Override // com.tencent.mapsdk.internal.im.a
        public final void a() {
            if (this.f49863a != null) {
                com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.hv.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.internal.hv.a.this.f49863a.onAnimationStart();
                    }
                });
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public com.tencent.tencentmap.mapsdk.maps.model.AnimationListener getAnimationListener() {
        com.tencent.mapsdk.internal.hv.a aVar = this.f49862b;
        if (aVar != null) {
            return aVar.f49863a;
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public long getDuration() {
        com.tencent.mapsdk.internal.im imVar = this.f49861a;
        if (imVar != null) {
            return imVar.a();
        }
        return 0L;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public android.view.animation.Interpolator getInterpolator() {
        com.tencent.mapsdk.internal.im imVar = this.f49861a;
        if (imVar != null) {
            return imVar.f49908f;
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public void setAnimationListener(com.tencent.tencentmap.mapsdk.maps.model.AnimationListener animationListener) {
        com.tencent.mapsdk.internal.hv.a aVar = new com.tencent.mapsdk.internal.hv.a(animationListener);
        this.f49862b = aVar;
        com.tencent.mapsdk.internal.im imVar = this.f49861a;
        if (imVar != null) {
            imVar.a(aVar);
        }
    }
}
