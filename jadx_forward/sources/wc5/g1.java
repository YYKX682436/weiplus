package wc5;

/* loaded from: classes10.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f526106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(wc5.k1 k1Var) {
        super(1);
        this.f526106d = k1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        em.d2 d2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        wc5.k1 k1Var = this.f526106d;
        if (booleanValue) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 i76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).i7();
            if (i76 != null && (d2Var = i76.f283265f) != null) {
                d2Var.d().clearFocus();
                i76.b();
            }
            com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b.g7((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6(), kz5.c1.k(new jz5.l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1.class, 8), new jz5.l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21817xf8653721.class, 8), new jz5.l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941.class, 0)), false, null, 6, null);
        } else {
            com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b.g7((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6(), kz5.c1.k(new jz5.l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1.class, 0), new jz5.l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21817xf8653721.class, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).y7())), new jz5.l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941.class, 8)), false, null, 6, null);
        }
        xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).m7());
        if (b17 != null) {
            ym3.f fVar = b17.I.f233590d;
            uc5.y yVar = fVar instanceof uc5.y ? (uc5.y) fVar : null;
            if (yVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGallerySelectionUIC", "updateDataSourceSelectingState: dataSource is null");
            } else {
                yVar.f508093o = booleanValue;
            }
            wc5.k1.T6(k1Var, b17, booleanValue ? new uc5.b(false) : uc5.a.f508002a);
            if (!booleanValue && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).q7()) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).n7().X6();
            }
            k1Var.f526125e = k1Var.U6().size();
            k1Var.X6();
        }
        return jz5.f0.f384359a;
    }
}
