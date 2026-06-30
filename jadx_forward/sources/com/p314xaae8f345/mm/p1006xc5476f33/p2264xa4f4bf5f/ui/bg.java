package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class bg implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18666x4f101031 f255289d;

    public bg(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18666x4f101031 c18666x4f101031) {
        this.f255289d = c18666x4f101031;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusRecentUseView", "onItemLongClick() called with: adapter = " + adapter + ", view = " + view + ", position = " + i17 + ", holder = " + holder);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18666x4f101031 c18666x4f101031 = this.f255289d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c18666x4f101031.f255221f;
        if (c1163xf1deaba4 != null) {
            java.lang.Object obj = c18666x4f101031.f255222g.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            ej4.k kVar = (ej4.k) obj;
            rl5.r rVar = c18666x4f101031.f255225m;
            if (rVar != null) {
                rVar.a();
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            android.view.View mo7935xa188593e = layoutManager != null ? layoutManager.mo7935xa188593e(i17) : null;
            if (mo7935xa188593e != null) {
                rl5.r rVar2 = new rl5.r(mo7935xa188593e.getContext());
                rVar2.D = true;
                rVar2.L = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.cg(c18666x4f101031);
                c18666x4f101031.f255225m = rVar2;
                int[] iArr = {0, 0};
                mo7935xa188593e.getLocationInWindow(iArr);
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.dg dgVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.dg(kVar, c18666x4f101031, i17, c1163xf1deaba4);
                rl5.r rVar3 = c18666x4f101031.f255225m;
                if (rVar3 != null) {
                    int width = (int) (iArr[0] + (mo7935xa188593e.getWidth() / 2.0f));
                    int i18 = iArr[1];
                    rVar3.f478887x = dgVar;
                    rVar3.f478871f = mo7935xa188593e;
                    if (!(mo7935xa188593e instanceof android.widget.TextView) && (width == 0 || i18 == 0)) {
                        rVar3.l();
                    }
                    rVar3.f478889z.clear();
                    rVar3.f478889z.a(0, com.p314xaae8f345.mm.R.C30867xcad56011.jwq);
                    if (width == 0 && i18 == 0) {
                        rVar3.m();
                    } else {
                        rVar3.n(width, i18);
                    }
                }
            }
        }
        return true;
    }
}
