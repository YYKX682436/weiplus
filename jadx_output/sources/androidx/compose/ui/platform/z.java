package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class z {
    public static final void a(o3.l info, y1.y semanticsNode) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(semanticsNode, "semanticsNode");
        if (androidx.compose.ui.platform.h0.a(semanticsNode)) {
            y1.o0 o0Var = y1.k.f458749a;
            y1.a aVar = (y1.a) y1.m.a(semanticsNode.f458799e, y1.k.f458754f);
            if (aVar != null) {
                info.b(new o3.f(android.R.id.accessibilityActionSetProgress, aVar.f458692a));
            }
        }
    }
}
