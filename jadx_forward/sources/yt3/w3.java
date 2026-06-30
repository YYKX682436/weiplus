package yt3;

/* loaded from: classes10.dex */
public final class w3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f547241d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e f547242e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16549xbfc1cbdb f547243f;

    /* renamed from: g, reason: collision with root package name */
    public long f547244g;

    public w3(android.view.View view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547241d = view;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.b6q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e c16545x39e5705e = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e) findViewById;
        this.f547242e = c16545x39e5705e;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.b6u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16549xbfc1cbdb c16549xbfc1cbdb = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16549xbfc1cbdb) findViewById2;
        this.f547243f = c16549xbfc1cbdb;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f547244g = android.os.SystemClock.elapsedRealtime();
        int b17 = i65.a.b(view.getContext(), 120);
        c16545x39e5705e.b(b17, b17);
        c16549xbfc1cbdb.m66959x73ebd762(new yt3.v3(this, status));
    }
}
