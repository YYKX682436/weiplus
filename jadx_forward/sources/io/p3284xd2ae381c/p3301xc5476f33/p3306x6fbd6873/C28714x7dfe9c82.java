package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.PlatformOverlayView */
/* loaded from: classes15.dex */
public class C28714x7dfe9c82 extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04 {

    /* renamed from: accessibilityDelegate */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c f71780x7184d4f3;

    public C28714x7dfe9c82(android.content.Context context, int i17, int i18, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c c28705xcb1b0e8c) {
        super(context, i17, i18, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.overlay);
        this.f71780x7184d4f3 = c28705xcb1b0e8c;
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c c28705xcb1b0e8c = this.f71780x7184d4f3;
        if (c28705xcb1b0e8c == null || !c28705xcb1b0e8c.m138577x32e691cd(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }

    public C28714x7dfe9c82(android.content.Context context) {
        this(context, 1, 1, null);
    }

    public C28714x7dfe9c82(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, 1, 1, null);
    }
}
