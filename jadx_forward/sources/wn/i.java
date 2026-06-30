package wn;

/* loaded from: classes10.dex */
public final class i extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951 f528908a;

    public i(com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951 abstractC10387x3396a951) {
        this.f528908a = abstractC10387x3396a951;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951 abstractC10387x3396a951 = this.f528908a;
        java.util.List a17 = abstractC10387x3396a951.z0().a(abstractC10387x3396a951.w0().mo1894x7e414b06());
        ym5.s3 s3Var = new ym5.s3(1);
        s3Var.f545055g = false;
        s3Var.f545054f = true ^ a17.isEmpty();
        s3Var.f545056h = a17.size();
        abstractC10387x3396a951.w0().y(false, a17);
        abstractC10387x3396a951.x0().mo56054xc12c74c0(s3Var);
        abstractC10387x3396a951.s0();
    }
}
