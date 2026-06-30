package qh;

/* loaded from: classes12.dex */
public class h implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f444887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f444888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.u f444889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f444890d;

    public h(qh.t tVar, rh.o2 o2Var, wh.n1 n1Var, qh.u uVar, long j17) {
        this.f444887a = o2Var;
        this.f444888b = n1Var;
        this.f444889c = uVar;
        this.f444890d = j17;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        rh.o2 o2Var2 = this.f444887a;
        rh.f1 f1Var = (rh.f1) o2Var2.f477017a;
        long longValue = ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477017a).f134094g.f477085a).longValue();
        wh.n1 n1Var = this.f444888b;
        double c17 = f1Var.c(n1Var, longValue);
        double c18 = ((rh.f1) o2Var2.f477018b).c(n1Var, ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477018b).f134094g.f477085a).longValue());
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String format = java.lang.String.format(locale, "%.2f(mAh)/min", java.lang.Double.valueOf((c18 - c17) / this.f444890d));
        qh.u uVar = this.f444889c;
        uVar.h("inc_prc_sip", format);
        uVar.h("cur_prc_sip", java.lang.String.format(locale, "%.2f(mAh)", java.lang.Double.valueOf(c18)));
    }
}
