package of1;

/* loaded from: classes7.dex */
public final class i1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 {

    /* renamed from: d, reason: collision with root package name */
    public int f426471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f426472e;

    public i1(of1.w1 w1Var) {
        this.f426472e = w1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void a(boolean z17) {
        of1.w1 w1Var = this.f426472e;
        of1.x1 m151222x143f1b92 = w1Var.m151222x143f1b92();
        int i17 = this.f426471d;
        nw4.n g07 = ((of1.v0) m151222x143f1b92).g0();
        int i18 = 0;
        if (!z17) {
            i17 = 0;
        }
        g07.L(i17, 0);
        if (w1Var.f426571i && z17) {
            if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_html_webview_adjust_resize_for_keyboard, 1)) {
                i18 = this.f426471d;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = w1Var.f426578s;
        c22633x83752a59.setPadding(c22633x83752a59.getPaddingLeft(), w1Var.f426578s.getPaddingTop(), w1Var.f426578s.getPaddingRight(), i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void d(int i17) {
        this.f426471d = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    /* renamed from: getHeight */
    public int mo53489x1c4fb41d() {
        return this.f426471d;
    }
}
