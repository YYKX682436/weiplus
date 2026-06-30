package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class p1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.d f211885d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f211886e;

    public p1(jv2.d commentItem, java.lang.String feedUsername, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        this.f211885d = commentItem;
        this.f211886e = feedUsername;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr);
            jv2.a aVar = this.f211885d.f383740d;
            aVar.getClass();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), aVar.D0()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f211886e, en1.a.a())) {
                contextMenu.add(0, 1, 2, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
            }
        }
    }
}
