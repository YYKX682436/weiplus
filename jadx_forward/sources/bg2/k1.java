package bg2;

/* loaded from: classes3.dex */
public final class k1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf f101775d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf c14207x67cb93cf) {
        this.f101775d = c14207x67cb93cf;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101775d.f193156e, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = k0Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) k0Var2 : null;
        if (!(c14353xe7c1f419 != null ? c14353xe7c1f419.getIsPresentedInTimeLineUI() : false) || (k0Var = dk2.ef.f314913e) == null) {
            return;
        }
        k0Var.m57706xa21faa77(i17 > 0, i17);
    }
}
