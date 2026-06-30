package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f271441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e f271442e;

    public c(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e, int i17) {
        this.f271442e = abstractC19633xb84f839e;
        this.f271441d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e = this.f271442e;
        abstractC19633xb84f839e.D = true;
        int i17 = this.f271441d;
        abstractC19633xb84f839e.W(i17);
        abstractC19633xb84f839e.a(i17, true);
        abstractC19633xb84f839e.D = false;
    }
}
