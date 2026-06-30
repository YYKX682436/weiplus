package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final y1.l f92068a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f92069b;

    public d0(y1.y semanticsNode, java.util.Map currentSemanticsNodes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semanticsNode, "semanticsNode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentSemanticsNodes, "currentSemanticsNodes");
        this.f92068a = semanticsNode.f540332e;
        this.f92069b = new java.util.LinkedHashSet();
        java.util.List h17 = semanticsNode.h();
        int size = h17.size();
        for (int i17 = 0; i17 < size; i17++) {
            y1.y yVar = (y1.y) h17.get(i17);
            if (currentSemanticsNodes.containsKey(java.lang.Integer.valueOf(yVar.f540333f))) {
                this.f92069b.add(java.lang.Integer.valueOf(yVar.f540333f));
            }
        }
    }
}
