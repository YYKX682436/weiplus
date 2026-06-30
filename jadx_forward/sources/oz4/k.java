package oz4;

/* loaded from: classes12.dex */
public class k extends oz4.p<java.lang.Boolean, oz4.l> {

    /* renamed from: a, reason: collision with root package name */
    public final oz4.r f431812a = new oz4.r();

    @Override // oz4.v
    public int b() {
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [oz4.r] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7, types: [oz4.m, oz4.p] */
    /* JADX WARN: Type inference failed for: r7v8, types: [oz4.c, oz4.p] */
    @Override // oz4.p
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, mz4.t tVar, java.lang.Object obj) {
        boolean z17;
        oz4.k kVar = this;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.text.Editable text = c19515x154ec45a.getText();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        ?? r37 = kVar.f431812a;
        r37.f431831a.clear();
        java.util.ArrayList<oz4.o> m74967xa1cbb = c19515x154ec45a.m74967xa1cbb();
        int size = m74967xa1cbb.size();
        ?? r76 = 0;
        int i17 = 0;
        oz4.l lVar = null;
        while (i17 < size) {
            oz4.o oVar = m74967xa1cbb.get(i17);
            ?? d17 = kVar.d(text, oVar, oz4.u.SPAN_FLAGS);
            r37.b(d17, oVar);
            oz4.l lVar2 = (d17.isEmpty() || !(d17.get(r76) instanceof oz4.l)) ? null : (oz4.l) d17.get(r76);
            boolean z18 = (lVar2 == null || !lVar2.f431818i) ? r76 : true;
            boolean z19 = (lVar != null && lVar == lVar2 && z18) ? r76 : z18;
            boolean z27 = !d17.isEmpty();
            boolean booleanValue = (i17 <= 0 || oVar.c() != 1 || m74967xa1cbb.get(i17 + (-1)).c() != 1 || bool.booleanValue()) ? r76 : true ? r76 : oVar.d(tVar) ? bool.booleanValue() : z27;
            if (booleanValue) {
                z17 = false;
                r37.f431831a.add(new oz4.q(new oz4.l(z19, mz4.b.b(), oVar.a(), oVar.f431826f, oVar.f431827g), oVar, false));
                oz4.w.f431852e.g(text, oVar, r37);
                oz4.w.f431851d.g(text, oVar, r37);
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
            lVar = lVar2;
            kVar = this;
        }
        r37.a(text);
    }
}
