package mi1;

/* loaded from: classes7.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f408200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f408201e;

    public q2(mi1.n2 n2Var, int i17) {
        this.f408201e = n2Var;
        this.f408200d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context r07;
        mi1.n2 n2Var = this.f408201e;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = ((mi1.g) n2Var.f408175o).f408088e;
            try {
                r07 = c11510xdd90c2f2.x0().m52169xfdaa7672().mo14682x9dee9c37().r1().getContext();
            } catch (java.lang.NullPointerException unused) {
                r07 = c11510xdd90c2f2.r0();
            }
            n2Var.b(r07.getResources().getString(this.f408200d));
        } catch (android.content.res.Resources.NotFoundException unused2) {
            n2Var.b(null);
        }
    }
}
