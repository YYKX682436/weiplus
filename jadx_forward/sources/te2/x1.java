package te2;

/* loaded from: classes3.dex */
public final class x1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328 f500057d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328 c14186x18d3b328) {
        this.f500057d = c14186x18d3b328;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328 c14186x18d3b328 = this.f500057d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14186x18d3b328.f193085d, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        if (c14186x18d3b328.f193086e == z18) {
            return;
        }
        c14186x18d3b328.f193086e = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = c14186x18d3b328.f193087f;
        if (k0Var != null) {
            k0Var.m57706xa21faa77(z18, i17);
        }
    }
}
