package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ub extends android.view.View implements com.tencent.mapsdk.internal.bu {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f52386a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tr f52387b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.Object f52388c;

    /* renamed from: d, reason: collision with root package name */
    private int f52389d;

    /* renamed from: e, reason: collision with root package name */
    private int f52390e;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tq f52391f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f52392g;

    public ub(com.tencent.mapsdk.internal.bd bdVar) {
        super(bdVar.getContext());
        this.f52392g = true;
        java.lang.Object l17 = bdVar.l();
        if (l17 == null) {
            return;
        }
        this.f52386a = bdVar.getContext();
        this.f52387b = (com.tencent.mapsdk.internal.tr) bdVar.d();
        this.f52388c = l17;
        this.f52389d = bdVar.m();
        int n17 = bdVar.n();
        this.f52390e = n17;
        if (n17 <= 0 || this.f52389d <= 0) {
            this.f52389d = 0;
            this.f52390e = 0;
        }
        com.tencent.mapsdk.internal.tq tqVar = new com.tencent.mapsdk.internal.tq(this.f52387b);
        this.f52391f = tqVar;
        tqVar.a(this.f52388c);
        com.tencent.mapsdk.internal.tq.a(bdVar.p());
        this.f52391f.f52164a = bdVar.r();
        this.f52391f.start();
    }

    private void f() {
        com.tencent.mapsdk.internal.tr trVar = this.f52387b;
        if (trVar == null || !this.f52392g) {
            return;
        }
        trVar.a((javax.microedition.khronos.opengles.GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
        this.f52387b.a((javax.microedition.khronos.opengles.GL10) null, this.f52389d, this.f52390e);
        this.f52387b.e(this.f52389d, this.f52390e);
        this.f52392g = false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a() {
        com.tencent.mapsdk.internal.tq tqVar = this.f52391f;
        if (tqVar != null) {
            tqVar.b();
        }
        com.tencent.mapsdk.internal.tr trVar = this.f52387b;
        if (trVar == null || !this.f52392g) {
            return;
        }
        trVar.a((javax.microedition.khronos.opengles.GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
        this.f52387b.a((javax.microedition.khronos.opengles.GL10) null, this.f52389d, this.f52390e);
        this.f52387b.e(this.f52389d, this.f52390e);
        this.f52392g = false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void b() {
        com.tencent.mapsdk.internal.tq tqVar = this.f52391f;
        if (tqVar != null) {
            tqVar.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void c() {
        com.tencent.mapsdk.internal.tq tqVar = this.f52391f;
        if (tqVar != null) {
            tqVar.c();
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void d() {
        com.tencent.mapsdk.internal.tq tqVar = this.f52391f;
        if (tqVar != null) {
            synchronized (tqVar) {
                this.f52391f.notify();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final boolean e() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final int getMapHeight() {
        return this.f52390e;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final int getMapWidth() {
        return this.f52389d;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final android.view.View getView() {
        return this;
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.tr trVar = this.f52387b;
        if (trVar != null) {
            this.f52389d = i17;
            this.f52390e = i18;
            trVar.a((javax.microedition.khronos.opengles.GL10) null, i17, i18);
            this.f52387b.e(i17, i18);
            this.f52387b.H();
            this.f52392g = true;
        }
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setMapOpaque(boolean z17) {
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setZOrderMediaOverlay(boolean z17) {
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(java.lang.Object obj, int i17, int i18) {
        com.tencent.mapsdk.internal.tq tqVar;
        if (this.f52387b == null || (tqVar = this.f52391f) == null || !tqVar.isAlive()) {
            return;
        }
        com.tencent.mapsdk.internal.tq tqVar2 = this.f52391f;
        if (tqVar2 != null) {
            this.f52388c = obj;
            tqVar2.a(obj);
        }
        com.tencent.mapsdk.internal.tr trVar = this.f52387b;
        if (trVar != null) {
            trVar.a((javax.microedition.khronos.opengles.GL10) null, (javax.microedition.khronos.egl.EGLConfig) null);
            this.f52387b.a((javax.microedition.khronos.opengles.GL10) null, i17, i18);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(float f17) {
        if (this.f52391f != null) {
            com.tencent.mapsdk.internal.tq.a(f17);
        }
    }
}
