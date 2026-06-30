package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes4.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e f272419d;

    public l(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e) {
        this.f272419d = abstractC19633xb84f839e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e = this.f272419d;
        android.widget.LinearLayout linearLayout = abstractC19633xb84f839e.f271278n;
        if (linearLayout == null || linearLayout.getVisibility() == 0) {
            return;
        }
        abstractC19633xb84f839e.f271278n.setVisibility(0);
    }
}
