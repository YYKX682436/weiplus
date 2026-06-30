package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B/\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/EmbeddingRule;", "minWidth", "", "minSmallestWidth", "splitRatio", "", "layoutDirection", "(IIFI)V", "getLayoutDirection", "()I", "getMinSmallestWidth", "getMinWidth", "getSplitRatio", "()F", "checkParentMetrics", "", "parentMetrics", "Landroid/view/WindowMetrics;", "equals", "other", "", "hashCode", "Api30Impl", "LayoutDir", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.SplitRule */
/* loaded from: classes14.dex */
public class C1222x8f8b2916 extends p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3 {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/SplitRule$Api30Impl;", "", "()V", "getBounds", "Landroid/graphics/Rect;", "windowMetrics", "Landroid/view/WindowMetrics;", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.window.embedding.SplitRule$Api30Impl */
    /* loaded from: classes14.dex */
    public static final class Api30Impl {

        /* renamed from: INSTANCE */
        public static final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916.Api30Impl f3850x4fbc8495 = new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916.Api30Impl();

        private Api30Impl() {
        }

        /* renamed from: getBounds */
        public final android.graphics.Rect m8505x12a519ab(android.view.WindowMetrics windowMetrics) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowMetrics, "windowMetrics");
            android.graphics.Rect bounds = windowMetrics.getBounds();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/SplitRule$LayoutDir;", "", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.window.embedding.SplitRule$LayoutDir */
    /* loaded from: classes6.dex */
    public @interface LayoutDir {
    }

    public C1222x8f8b2916() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    /* renamed from: checkParentMetrics */
    public final boolean m8499x753ad491(android.view.WindowMetrics parentMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentMetrics, "parentMetrics");
        if (android.os.Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        android.graphics.Rect m8505x12a519ab = p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916.Api30Impl.f3850x4fbc8495.m8505x12a519ab(parentMetrics);
        return (this.minWidth == 0 || m8505x12a519ab.width() >= this.minWidth) && (this.minSmallestWidth == 0 || java.lang.Math.min(m8505x12a519ab.width(), m8505x12a519ab.height()) >= this.minSmallestWidth);
    }

    /* renamed from: equals */
    public boolean mo8489xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916)) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916 c1222x8f8b2916 = (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1222x8f8b2916) other;
        if (this.minWidth == c1222x8f8b2916.minWidth && this.minSmallestWidth == c1222x8f8b2916.minSmallestWidth) {
            return ((this.splitRatio > c1222x8f8b2916.splitRatio ? 1 : (this.splitRatio == c1222x8f8b2916.splitRatio ? 0 : -1)) == 0) && this.layoutDirection == c1222x8f8b2916.layoutDirection;
        }
        return false;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    /* renamed from: hashCode */
    public int mo8494x8cdac1b() {
        return (((((this.minWidth * 31) + this.minSmallestWidth) * 31) + java.lang.Float.hashCode(this.splitRatio)) * 31) + this.layoutDirection;
    }

    public /* synthetic */ C1222x8f8b2916(int i17, int i18, float f17, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i27 & 1) != 0 ? 0 : i17, (i27 & 2) != 0 ? 0 : i18, (i27 & 4) != 0 ? 0.5f : f17, (i27 & 8) != 0 ? 3 : i19);
    }

    public C1222x8f8b2916(int i17, int i18, float f17, int i19) {
        this.minWidth = i17;
        this.minSmallestWidth = i18;
        this.splitRatio = f17;
        this.layoutDirection = i19;
    }
}
