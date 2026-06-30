package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class j0 extends zx2.y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f210712a;

    public j0(java.lang.ref.WeakReference rTabUIc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rTabUIc, "rTabUIc");
        this.f210712a = rTabUIc;
    }

    @Override // zx2.y, zx2.z
    public void a(android.content.Context context, zx2.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        super.a(context, tab);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0) this.f210712a.get();
        if (m0Var != null) {
            yz5.l lVar = m0Var.f210723x;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Integer.valueOf(tab.f558573a));
            }
            m0Var.f210722w = tab.f558573a;
        }
    }
}
