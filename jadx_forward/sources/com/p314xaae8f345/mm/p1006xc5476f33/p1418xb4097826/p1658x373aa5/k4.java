package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f214011e;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b, so2.n1 n1Var) {
        this.f214010d = c15260x406bbe1b;
        this.f214011e = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f214010d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c15260x406bbe1b.m61759x4905e9fa().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int i17 = -1;
        if (c15260x406bbe1b.e(this.f214011e)) {
            if (c1162x665295de != null) {
                i17 = c1162x665295de.y();
            }
        } else if (c1162x665295de != null) {
            i17 = c1162x665295de.t();
        }
        if (i17 == c15260x406bbe1b.getLastSnappedPosition()) {
            ey2.u uVar = c15260x406bbe1b.f212447r;
            if (uVar != null && uVar.f339065n) {
                return;
            }
            if (uVar != null && uVar.f339064m) {
                c15260x406bbe1b.m61758xcc04d8cb().setVisibility(8);
                android.content.Context context = c15260x406bbe1b.getContext();
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.njo);
                e4Var.c();
            }
        }
    }
}
