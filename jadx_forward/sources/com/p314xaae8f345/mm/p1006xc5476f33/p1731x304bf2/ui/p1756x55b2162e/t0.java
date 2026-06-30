package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb f222846e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb, java.lang.String str) {
        this.f222846e = c16009xd65d32cb;
        this.f222845d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f222845d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f222846e.f222726n).iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) && str.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) view.getTag()).f222689d)) {
                view.performClick();
                return;
            }
        }
    }
}
