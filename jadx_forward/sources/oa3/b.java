package oa3;

/* loaded from: classes9.dex */
public final class b extends bi4.o0 {
    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var;
        if (context == null || (j0Var = this.f102607b) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "17")) {
            return false;
        }
        byte[] decode = android.util.Base64.decode(j0Var.f436675g, 0);
        ta3.a aVar = new ta3.a();
        aVar.mo11468x92b714fd(decode);
        q80.d0 d0Var = new q80.d0();
        java.lang.String str = aVar.f498231f;
        if (str == null || str.length() == 0) {
            d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea;
            d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f498231f, "modal")) {
            d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0;
            d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f498231f, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63)) {
            d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea;
            d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed;
        }
        d0Var.f442182a = aVar.f498229d;
        d0Var.f442183b = aVar.f498230e;
        d0Var.f442190i = aVar.f498232g ? 1 : 0;
        d0Var.f442185d = java.lang.Boolean.valueOf(aVar.f498234i);
        d0Var.f442191j = aVar.f498233h;
        d0Var.f442187f = aVar.f498235m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppStatusProvider", "doJumpSource appId:" + d0Var.f442182a + " page:" + d0Var.f442183b);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new oa3.a());
        return true;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void n() {
    }
}
