package im2;

/* loaded from: classes3.dex */
public final class a7 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3 f373784d;

    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3 c14385xe1b728f3) {
        this.f373784d = c14385xe1b728f3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3 c14385xe1b728f3 = this.f373784d;
        c14385xe1b728f3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[keyboardChange], show:" + z18 + ", height:" + i17 + ", lastKeyBoardHeight:" + c14385xe1b728f3.f198533e);
        if (c14385xe1b728f3.f198532d == z18 && c14385xe1b728f3.f198533e == i17) {
            return;
        }
        c14385xe1b728f3.f198533e = i17;
        c14385xe1b728f3.f198532d = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = c14385xe1b728f3.f198540o;
        if (c14167x40aca97c == null || (c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e) == null) {
            return;
        }
        c14353xe7c1f419.m57706xa21faa77(z18, i17);
    }
}
