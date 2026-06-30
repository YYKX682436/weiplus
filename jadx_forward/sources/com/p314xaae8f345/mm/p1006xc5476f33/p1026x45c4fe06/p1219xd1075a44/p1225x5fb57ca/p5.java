package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class p5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 f173134d;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var) {
        this.f173134d = q5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var = this.f173134d;
        if (q5Var.f173159b != null) {
            android.graphics.Rect rect = q5Var.f173161d;
            int i17 = rect.bottom;
            q5Var.f173162e.getWindowVisibleDisplayFrame(rect);
            if (q5Var.f173161d.bottom != i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "onGlobalLayout: %s, %s", java.lang.Integer.valueOf(i17), q5Var.f173161d.toShortString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5.a(q5Var);
            }
        }
    }
}
