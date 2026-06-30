package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes14.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 f286393d;

    public u(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006) {
        this.f286393d = c22100x47612006;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a aVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006 = this.f286393d;
        if (!c22100x47612006.f286254v || c22100x47612006.f286256x || c22100x47612006.f286255w) {
            return;
        }
        c22100x47612006.f286255w = true;
        if (!c22100x47612006.f286257y) {
            c22100x47612006.f286257y = true;
            z01.v m48328xa0ab20ce = c22100x47612006.m48328xa0ab20ce();
            if (m48328xa0ab20ce != null && (aVar = m48328xa0ab20ce.f550705m) != null) {
                aVar.mo152xb9724478();
            }
        }
        c22100x47612006.performLongClick();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006.g(c22100x47612006);
    }
}
