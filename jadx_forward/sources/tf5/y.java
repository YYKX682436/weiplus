package tf5;

/* loaded from: classes11.dex */
public final class y implements com.p314xaae8f345.mm.ui.p2690x38b72420.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500552a;

    public y(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598) {
        this.f500552a = c22342xca74f598;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p3
    public final void a(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.q3 q3Var = this.f500552a.A;
        if (q3Var == null) {
            return;
        }
        if (i17 <= 0) {
            if (q3Var == null) {
                return;
            }
            q3Var.setVisibility(8);
        } else {
            if (q3Var == null) {
                return;
            }
            q3Var.setVisibility(0);
        }
    }
}
