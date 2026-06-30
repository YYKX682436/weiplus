package px1;

/* loaded from: classes12.dex */
public class s extends px1.m<java.lang.Boolean, px1.t> {

    /* renamed from: a, reason: collision with root package name */
    public final px1.o f440385a = new px1.o();

    @Override // px1.u
    public int b() {
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [px1.o] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7, types: [px1.j, px1.m] */
    /* JADX WARN: Type inference failed for: r7v8, types: [px1.m, px1.c] */
    @Override // px1.m
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a, nx1.p pVar, java.lang.Object obj) {
        boolean z17;
        px1.s sVar = this;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.text.Editable text = c13158x154ec45a.getText();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        ?? r37 = sVar.f440385a;
        r37.f440368a.clear();
        java.util.ArrayList<px1.l> m54590xa1cbb = c13158x154ec45a.m54590xa1cbb();
        int size = m54590xa1cbb.size();
        ?? r76 = 0;
        int i17 = 0;
        px1.t tVar = null;
        while (i17 < size) {
            px1.l lVar = m54590xa1cbb.get(i17);
            ?? d17 = sVar.d(text, lVar, px1.r.SPAN_FLAGS);
            r37.b(d17, lVar);
            px1.t tVar2 = (d17.isEmpty() || !(d17.get(r76) instanceof px1.t)) ? null : (px1.t) d17.get(r76);
            boolean z18 = (tVar2 == null || !tVar2.f440391i) ? r76 : true;
            boolean z19 = (tVar != null && tVar == tVar2 && z18) ? r76 : z18;
            boolean z27 = !d17.isEmpty();
            boolean booleanValue = (i17 <= 0 || lVar.b() != 1 || m54590xa1cbb.get(i17 + (-1)).b() != 1 || bool.booleanValue()) ? r76 : true ? r76 : lVar.c(pVar) ? bool.booleanValue() : z27;
            if (booleanValue) {
                z17 = false;
                r37.f440368a.add(new px1.n(new px1.t(z19, nx1.q.b(), lVar.a(), lVar.f440363f, lVar.f440364g), lVar, false));
                px1.v.f440396d.g(text, lVar, r37);
                px1.v.f440395c.g(text, lVar, r37);
            } else {
                z17 = r76;
            }
            if (!booleanValue && z27) {
                java.util.Iterator it = d17.iterator();
                while (it.hasNext()) {
                    text.removeSpan(it.next());
                }
            }
            i17++;
            r76 = z17;
            tVar = tVar2;
            sVar = this;
        }
        r37.a(text);
    }
}
