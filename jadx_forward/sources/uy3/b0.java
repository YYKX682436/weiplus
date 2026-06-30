package uy3;

/* loaded from: classes8.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f513461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(uy3.j0 j0Var) {
        super(3);
        this.f513461d = j0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((java.lang.Boolean) obj3).booleanValue();
        uy3.k0 k0Var = this.f513461d.f513488p;
        if (k0Var != null) {
            uy3.m0 m0Var = (uy3.m0) k0Var;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            uy3.l0 l0Var = m0Var.f513516f;
            if (l0Var != null) {
                l0Var.f513501a = booleanValue;
                l0Var.f513502b = booleanValue2;
                l0Var.f513503c = booleanValue3;
                l0Var.f513504d = currentTimeMillis - m0Var.f513514d;
            }
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = m0Var.f513511a;
            objArr[1] = java.lang.Boolean.valueOf(booleanValue);
            objArr[2] = java.lang.Boolean.valueOf(booleanValue3);
            uy3.l0 l0Var2 = m0Var.f513516f;
            objArr[3] = l0Var2 != null ? java.lang.Long.valueOf(l0Var2.f513504d) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialogViewListenerImpl", "onCreateBoxWebViewAfter session: %s, enablePreload: %b, useCache: %b, cost: %s", objArr);
            uy3.l0 l0Var3 = m0Var.f513516f;
            if (l0Var3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.A(1259, l0Var3.f513501a ? 130 : 150);
                if (!l0Var3.f513501a) {
                    g0Var.C(1259L, 151L, l0Var3.f513504d);
                } else if (l0Var3.f513503c) {
                    g0Var.A(1259, 132);
                } else {
                    g0Var.A(1259, 131);
                    g0Var.C(1259L, 133L, l0Var3.f513504d);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
