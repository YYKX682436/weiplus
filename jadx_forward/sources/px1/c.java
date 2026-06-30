package px1;

/* loaded from: classes12.dex */
public class c extends px1.m<java.lang.Boolean, px1.d> {

    /* renamed from: a, reason: collision with root package name */
    public final px1.o f440352a = new px1.o();

    @Override // px1.u
    public int b() {
        return 1;
    }

    @Override // px1.m
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a, nx1.p pVar, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.text.Spannable text = c13158x154ec45a.getText();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        px1.o oVar = this.f440352a;
        oVar.f440368a.clear();
        java.util.ArrayList<px1.l> m54590xa1cbb = c13158x154ec45a.m54590xa1cbb();
        int size = m54590xa1cbb.size();
        int i17 = 0;
        while (i17 < size) {
            px1.l lVar = m54590xa1cbb.get(i17);
            java.util.ArrayList d17 = d(text, lVar, px1.r.SPAN_FLAGS);
            oVar.b(d17, lVar);
            boolean z17 = !d17.isEmpty();
            if (lVar.c(pVar)) {
                z17 = bool.booleanValue();
            }
            if (i17 > 0 && lVar.b() == 1 && m54590xa1cbb.get(i17 + (-1)).b() == 1 && !bool.booleanValue()) {
                z17 = false;
            }
            if (z17) {
                oVar.f440368a.add(new px1.n(new px1.d(nx1.q.b(), lVar.a(), lVar.f440363f, lVar.f440364g), lVar, false));
                px1.v.f440396d.g(text, lVar, oVar);
                px1.v.f440394b.g(text, lVar, oVar);
            }
            i17++;
        }
        oVar.a(text);
    }
}
