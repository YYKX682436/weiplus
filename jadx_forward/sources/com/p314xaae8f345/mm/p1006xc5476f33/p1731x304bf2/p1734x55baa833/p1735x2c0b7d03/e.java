package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a f220282d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a c15840x9669df9a) {
        this.f220282d = c15840x9669df9a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a c15840x9669df9a = this.f220282d;
        boolean z17 = s33.y.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) c15840x9669df9a.f220258d) && s33.y.g();
        c15840x9669df9a.f220263i.setVisibility(z17 ? 0 : 8);
        if (z17 && c15840x9669df9a.f220263i.getTag() == null) {
            c15840x9669df9a.f220263i.setTag(1);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.g(20L, 1L, c15840x9669df9a.f220260f, c15840x9669df9a.f220259e, 0L, "", 0L, 0);
        }
    }
}
