package a0;

/* loaded from: classes14.dex */
public abstract class j {
    public static final z0.t a(z0.t tVar, a0.k border, e1.a1 shape) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(border, "border");
        kotlin.jvm.internal.o.g(shape, "shape");
        return b(tVar, border.f192a, border.f193b, shape);
    }

    public static final z0.t b(z0.t border, float f17, e1.r brush, e1.a1 shape) {
        kotlin.jvm.internal.o.g(border, "$this$border");
        kotlin.jvm.internal.o.g(brush, "brush");
        kotlin.jvm.internal.o.g(shape, "shape");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(border, androidx.compose.ui.platform.e3.f10553d, new a0.e(f17, shape, brush));
    }

    public static final long c(long j17, float f17) {
        return d1.b.a(java.lang.Math.max(0.0f, d1.a.b(j17) - f17), java.lang.Math.max(0.0f, d1.a.c(j17) - f17));
    }
}
