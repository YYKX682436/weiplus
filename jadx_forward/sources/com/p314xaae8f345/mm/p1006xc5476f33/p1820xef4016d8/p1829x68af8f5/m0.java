package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 f227428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 f227429e;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var) {
        this.f227429e = c16346x4deb5237;
        this.f227428d = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.f227334o;
        this.f227429e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = this.f227428d;
        if (b1Var.f227367n.getTop() < 0 || b1Var.f227367n.getTop() > com.p314xaae8f345.mm.ui.bk.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            ((android.widget.RelativeLayout.LayoutParams) b1Var.f227370q.getLayoutParams()).topMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        } else {
            ((android.widget.RelativeLayout.LayoutParams) b1Var.f227370q.getLayoutParams()).topMargin = (com.p314xaae8f345.mm.ui.bk.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) - b1Var.f227367n.getTop()) + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        }
        b1Var.f227370q.requestLayout();
    }
}
