package androidx.window.layout;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends kotlin.jvm.internal.m implements yz5.l {
    public WindowMetricsCalculator$Companion$overrideDecorator$1(java.lang.Object obj) {
        super(1, obj, androidx.window.layout.WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // yz5.l
    public final androidx.window.layout.WindowMetricsCalculator invoke(androidx.window.layout.WindowMetricsCalculator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        return ((androidx.window.layout.WindowMetricsCalculatorDecorator) this.receiver).decorate(p07);
    }
}
