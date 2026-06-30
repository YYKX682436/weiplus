package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class r4 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.i f211930d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f211931e;

    public r4(jv2.i commentItem, java.lang.String feedUsername, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        this.f211930d = commentItem;
        this.f211931e = feedUsername;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr);
            jv2.i iVar = this.f211930d;
            java.lang.String L0 = iVar.f383756d.L0();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            boolean z17 = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L0, xy2.c.e(context)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f383756d.L0(), c01.z1.r())) ? false : true;
            if (z17) {
                contextMenu.add(0, 2, 1, com.p314xaae8f345.mm.R.C30867xcad56011.f571927tr);
            }
            jv2.c cVar = iVar.f383756d;
            cVar.getClass();
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xy2.c.e(context2), cVar.L0()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), cVar.L0());
            java.lang.String str = this.f211931e;
            if (z18 || hc2.l.g(str)) {
                contextMenu.add(0, 1, 2, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
            }
            if (z17 && hc2.l.g(str)) {
                if (!iVar.f383756d.P0()) {
                    contextMenu.add(0, 3, 3, com.p314xaae8f345.mm.R.C30867xcad56011.cki);
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.i()) {
                    contextMenu.add(0, 3, 3, com.p314xaae8f345.mm.R.C30867xcad56011.cki);
                }
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
    }
}
