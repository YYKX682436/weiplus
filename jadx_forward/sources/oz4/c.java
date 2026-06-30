package oz4;

/* loaded from: classes12.dex */
public class c extends oz4.p<java.lang.Boolean, oz4.d> {

    /* renamed from: a, reason: collision with root package name */
    public final oz4.r f431808a = new oz4.r();

    @Override // oz4.v
    public int b() {
        return 1;
    }

    @Override // oz4.p
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, mz4.t tVar, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.text.Spannable text = c19515x154ec45a.getText();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        oz4.r rVar = this.f431808a;
        rVar.f431831a.clear();
        java.util.ArrayList<oz4.o> m74967xa1cbb = c19515x154ec45a.m74967xa1cbb();
        int size = m74967xa1cbb.size();
        int i17 = 0;
        while (i17 < size) {
            oz4.o oVar = m74967xa1cbb.get(i17);
            java.util.ArrayList d17 = d(text, oVar, oz4.u.SPAN_FLAGS);
            rVar.b(d17, oVar);
            boolean z17 = !d17.isEmpty();
            if (oVar.d(tVar)) {
                z17 = bool.booleanValue();
            }
            if (i17 > 0 && oVar.c() == 1 && m74967xa1cbb.get(i17 + (-1)).c() == 1 && !bool.booleanValue()) {
                z17 = false;
            }
            if (z17) {
                rVar.f431831a.add(new oz4.q(new oz4.d(mz4.b.b(), oVar.a(), oVar.f431826f, oVar.f431827g), oVar, false));
                oz4.w.f431852e.g(text, oVar, rVar);
                oz4.w.f431850c.g(text, oVar, rVar);
            }
            i17++;
        }
        rVar.a(text);
    }
}
