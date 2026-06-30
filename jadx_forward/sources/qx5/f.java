package qx5;

/* loaded from: classes13.dex */
public class f {
    public boolean a(android.content.Context context, qx5.l lVar, boolean z17) {
        if (lVar != null) {
            lVar.e(context, z17 ? qx5.a.b() : qx5.a.a());
        }
        return z17;
    }

    public void b(p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb, p012xc85e97e9.p100xa8fcbcdb.o oVar) {
        if ((c1146x1fce98fb instanceof p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2) || (c1146x1fce98fb instanceof p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839)) {
            c1146x1fce98fb.f93284h = oVar;
            return;
        }
        if (c1146x1fce98fb instanceof p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) {
            p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed244 = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) c1146x1fce98fb;
            for (int i17 = 0; i17 < abstractC1150xa1fed244.O(); i17++) {
                b(abstractC1150xa1fed244.N(i17), oVar);
            }
        }
    }
}
