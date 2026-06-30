package com.p314xaae8f345.mm.ui;

/* loaded from: classes7.dex */
public class ek implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.qk f289938f;

    public ek(int i17, android.view.View view, com.p314xaae8f345.mm.ui.qk qkVar) {
        this.f289936d = i17;
        this.f289937e = view;
        this.f289938f = qkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.DisplayCutout displayCutout;
        java.util.List<android.graphics.Rect> boundingRects;
        synchronized (com.p314xaae8f345.mm.ui.bk.f279515e) {
            com.p314xaae8f345.mm.ui.bk.f279513c.put(this.f289936d, this.f289937e.getRootWindowInsets());
            if (this.f289937e.getRootWindowInsets() != null && (displayCutout = this.f289937e.getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && boundingRects.size() > 0) {
                com.p314xaae8f345.mm.ui.bk.f279512b = true;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("has_cutout", com.p314xaae8f345.mm.ui.bk.f279512b);
            }
        }
        this.f289938f.d(this);
        return windowInsets;
    }
}
