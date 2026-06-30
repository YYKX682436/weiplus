package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final y1.l f10535a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f10536b;

    public d0(y1.y semanticsNode, java.util.Map currentSemanticsNodes) {
        kotlin.jvm.internal.o.g(semanticsNode, "semanticsNode");
        kotlin.jvm.internal.o.g(currentSemanticsNodes, "currentSemanticsNodes");
        this.f10535a = semanticsNode.f458799e;
        this.f10536b = new java.util.LinkedHashSet();
        java.util.List h17 = semanticsNode.h();
        int size = h17.size();
        for (int i17 = 0; i17 < size; i17++) {
            y1.y yVar = (y1.y) h17.get(i17);
            if (currentSemanticsNodes.containsKey(java.lang.Integer.valueOf(yVar.f458800f))) {
                this.f10536b.add(java.lang.Integer.valueOf(yVar.f458800f));
            }
        }
    }
}
