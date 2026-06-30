package z53;

/* loaded from: classes8.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u53.z f551795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u53.z zVar) {
        super(2);
        this.f551795d = zVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        java.util.List<z53.i> result = (java.util.List) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        u53.z zVar = this.f551795d;
        if (zVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w) zVar;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(result)) {
                for (z53.i iVar : result) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a0(wVar.f222857a, null);
                    a0Var.f222765d = iVar.f67672xa783a79b / 1000;
                    a0Var.f222766e = iVar;
                    linkedList.add(a0Var);
                }
            }
            int size = linkedList.size();
            java.util.Collections.sort(linkedList);
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.v(wVar, size, linkedList));
        }
        return jz5.f0.f384359a;
    }
}
