package zw1;

/* loaded from: classes8.dex */
public final class m2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uk4 f558256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw1.n2 f558257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f558258f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(r45.uk4 uk4Var, zw1.n2 n2Var, int i17) {
        super(false);
        this.f558256d = uk4Var;
        this.f558257e = n2Var;
        this.f558258f = i17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.uk4 uk4Var = this.f558256d;
        objArr[0] = uk4Var != null ? java.lang.Integer.valueOf(uk4Var.f468964d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[refresh]  onClick item, type:%s", objArr);
        zw1.n2 n2Var = this.f558257e;
        android.widget.TextView textView = (android.widget.TextView) n2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565331sv2);
        boolean z17 = textView != null && textView.getVisibility() == 0;
        int i17 = this.f558258f;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 22, java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 23, java.lang.Integer.valueOf(i17));
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_QR_CODE_BOTTOM_NEW_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) n2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565333sv4);
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di = rn3.i.Di();
            if (Di != null) {
                Di.a(60);
            }
        }
        n2Var.O6(n2Var.f558269d);
        java.lang.Integer valueOf = uk4Var != null ? java.lang.Integer.valueOf(uk4Var.f468964d) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(n2Var.m80379x76847179(), uk4Var.f468966f, false);
            return;
        }
        if (valueOf == null || valueOf.intValue() != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[refresh] unknow type");
            return;
        }
        java.lang.String str = uk4Var.f468967g;
        java.lang.String str2 = uk4Var.f468968h;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(str, str2, 0, 1072);
    }
}
