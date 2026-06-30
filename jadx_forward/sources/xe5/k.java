package xe5;

/* loaded from: classes3.dex */
public final class k implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f535592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f535593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f535594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535595g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535596h;

    public k(boolean z17, boolean z18, xe5.g0 g0Var, java.lang.String str, java.lang.String str2) {
        this.f535592d = z17;
        this.f535593e = z18;
        this.f535594f = g0Var;
        this.f535595g = str;
        this.f535596h = str2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        if (this.f535592d) {
            boolean z17 = this.f535593e;
            xe5.g0 g0Var = this.f535594f;
            if (z17) {
                g0Var.getClass();
                java.lang.String str = this.f535595g;
                if (str.length() == 0) {
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.axd);
                }
                g4Var.add(0, 3, 0, str);
                ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).wk(false, false);
                return;
            }
            g0Var.getClass();
            int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
            java.lang.String str2 = this.f535596h;
            if (str2.length() == 0) {
                str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.axb);
            }
            g4Var.d(2, color, str2);
            ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).wk(false, true);
        }
    }
}
