package tf5;

/* loaded from: classes11.dex */
public final class x implements com.p314xaae8f345.mm.ui.p2690x38b72420.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500551a;

    public x(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598) {
        this.f500551a = c22342xca74f598;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.e8
    public final void a(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598 = this.f500551a;
        com.p314xaae8f345.mm.ui.p2690x38b72420.g8 g8Var = c22342xca74f598.f288146z;
        if (g8Var == null || c22342xca74f598.f288140t == null) {
            return;
        }
        if (i17 <= 0) {
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8 c22287x2d5af6c8 = c22342xca74f598.f288140t;
            if (c22287x2d5af6c8 != null) {
                c22287x2d5af6c8.c(true);
                return;
            }
            return;
        }
        if (g8Var != null) {
            g8Var.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8 c22287x2d5af6c82 = c22342xca74f598.f288140t;
        if (c22287x2d5af6c82 != null) {
            c22287x2d5af6c82.c(false);
        }
    }
}
