package j0;

/* loaded from: classes14.dex */
public abstract class r4 {
    public static final d1.g a(p2.f fVar, int i17, g2.r0 r0Var, a2.k1 k1Var, boolean z17, int i18) {
        d1.g gVar;
        if (k1Var != null) {
            ((g2.t) r0Var.f349278b).getClass();
            gVar = k1Var.c(i17);
        } else {
            gVar = d1.g.f307161e;
        }
        int G = fVar.G(j0.q3.f378051a);
        float f17 = gVar.f307162a;
        return new d1.g(z17 ? (i18 - f17) - G : f17, gVar.f307163b, z17 ? i18 - f17 : G + f17, gVar.f307165d);
    }
}
