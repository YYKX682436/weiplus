package a0;

/* loaded from: classes14.dex */
public abstract class b {
    public static z0.t a(z0.t tVar, e1.r brush, e1.a1 a1Var, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            a1Var = e1.v0.f246289a;
        }
        e1.a1 shape = a1Var;
        if ((i17 & 4) != 0) {
            f17 = 1.0f;
        }
        float f18 = f17;
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(brush, "brush");
        kotlin.jvm.internal.o.g(shape, "shape");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return tVar.k(new a0.a(null, brush, f18, shape, androidx.compose.ui.platform.e3.f10553d, 1, null));
    }

    public static final z0.t b(z0.t background, long j17, e1.a1 shape) {
        kotlin.jvm.internal.o.g(background, "$this$background");
        kotlin.jvm.internal.o.g(shape, "shape");
        e1.y yVar = new e1.y(j17);
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return background.k(new a0.a(yVar, null, 0.0f, shape, androidx.compose.ui.platform.e3.f10553d, 6, null));
    }

    public static /* synthetic */ z0.t c(z0.t tVar, long j17, e1.a1 a1Var, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            a1Var = e1.v0.f246289a;
        }
        return b(tVar, j17, a1Var);
    }
}
