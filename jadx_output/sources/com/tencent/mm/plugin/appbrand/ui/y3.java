package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class y3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.y3 f90345d = new com.tencent.mm.plugin.appbrand.ui.y3();

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            jf.q.f299342a.c(1);
        } else if (i17 == 1) {
            jf.q.f299342a.c(2);
        } else {
            if (i17 != 2) {
                return;
            }
            jf.q.f299342a.c(0);
        }
    }
}
