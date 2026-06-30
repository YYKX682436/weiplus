package tt5;

/* loaded from: classes14.dex */
public class a extends qt5.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qt5.l f503574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 f503575b;

    public a(com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 abstractTextureViewSurfaceTextureListenerC25495xcec752e2, qt5.l lVar) {
        this.f503575b = abstractTextureViewSurfaceTextureListenerC25495xcec752e2;
        this.f503574a = lVar;
    }

    @Override // qt5.m, qt5.p
    public void b(long j17) {
        qt5.l lVar = this.f503574a;
        if (lVar != null) {
            lVar.b(j17);
        }
    }

    @Override // qt5.m, qt5.p
    public void c(qt5.d dVar) {
        qt5.l lVar = this.f503574a;
        if (lVar != null) {
            lVar.c(dVar);
        }
    }

    @Override // qt5.l
    public void d() {
        float f17;
        float f18;
        int i17;
        if (((qt5.c) this.f503575b.f296835e).f448190b && ((qt5.c) this.f503575b.f296835e).f448191c) {
            com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 abstractTextureViewSurfaceTextureListenerC25495xcec752e2 = this.f503575b;
            if (abstractTextureViewSurfaceTextureListenerC25495xcec752e2.f296836f != null) {
                android.view.TextureView textureView = abstractTextureViewSurfaceTextureListenerC25495xcec752e2.f296834d;
                android.graphics.Point point = ((qt5.c) abstractTextureViewSurfaceTextureListenerC25495xcec752e2.f296835e).f448195g;
                android.graphics.Point point2 = new android.graphics.Point(this.f503575b.f296834d.getWidth(), this.f503575b.f296834d.getHeight());
                abstractTextureViewSurfaceTextureListenerC25495xcec752e2.getClass();
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "from " + point + " to " + point2);
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                abstractTextureViewSurfaceTextureListenerC25495xcec752e2.f296834d.getTransform(matrix);
                matrix.reset();
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "before matrix " + matrix);
                if (!point.equals(point2)) {
                    qt5.c cVar = (qt5.c) abstractTextureViewSurfaceTextureListenerC25495xcec752e2.f296835e;
                    int i18 = cVar.f448200l;
                    android.graphics.Point point3 = cVar.f448197i;
                    int i19 = point3.x;
                    int i27 = point2.x;
                    int i28 = (i19 - i27) / 2;
                    int i29 = point3.y;
                    int i37 = point2.y;
                    int i38 = (i29 - i37) / 2;
                    if (i18 % 180 != 0) {
                        f17 = (i27 * 1.0f) / point.y;
                        f18 = (i37 * 1.0f) / point.x;
                        i17 = (i29 - i27) / 2;
                        i38 = (i19 - i37) / 2;
                    } else {
                        f17 = (i27 * 1.0f) / point.x;
                        f18 = (i37 * 1.0f) / point.y;
                        i17 = i28;
                    }
                    float max = java.lang.Math.max(f17, f18);
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "scaleX %f, scaleY %f, scale %f, dx %d, dy %d", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(max), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i38));
                    matrix.preScale(1.0f / f17, 1.0f / f18);
                    matrix.postScale(max, max);
                    matrix.postTranslate(-i17, -i38);
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "after matrix " + matrix);
                }
                textureView.setTransform(matrix);
                qt5.l lVar = this.f503574a;
                if (lVar != null) {
                    lVar.d();
                }
            }
        }
    }

    @Override // qt5.m, qt5.p
    public void e() {
        qt5.l lVar = this.f503574a;
        if (lVar != null) {
            lVar.e();
        }
    }
}
