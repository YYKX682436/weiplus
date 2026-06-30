package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class q4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.i f211920d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f211921e;

    public q4(jv2.i commentItem, java.lang.String feedUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        this.f211920d = commentItem;
        this.f211921e = feedUsername;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.lang.String str = this.f211921e;
        if (hc2.l.g(str)) {
            boolean z17 = false;
            menu.a(0, com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr);
            jv2.i iVar = this.f211920d;
            java.lang.String L0 = iVar.f383756d.L0();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L0, xy2.c.e(context)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f383756d.L0(), c01.z1.r())) {
                z17 = true;
            }
            if (z17) {
                menu.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571927tr);
            }
            menu.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
            if (z17 && hc2.l.g(str)) {
                if (!iVar.f383756d.P0()) {
                    menu.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.cki);
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.i()) {
                    menu.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.cki);
                }
            }
        }
    }
}
