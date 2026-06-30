package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f182451a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f182452b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f182453c = new java.util.ArrayList();

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.c1 c1Var) {
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var) {
        if (b1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGallerySelectedHandle", "add : %s", b1Var);
        java.util.ArrayList arrayList = this.f182451a;
        arrayList.remove(b1Var);
        arrayList.remove(c(b1Var.f182431b.T));
        arrayList.add(b1Var);
        java.util.Iterator it = this.f182453c.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.e1) it.next())).f182532g = true;
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGallerySelectedHandle", "clear..");
        this.f182451a.clear();
        java.util.Iterator it = this.f182453c.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.e1) it.next()).getClass();
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 c(java.lang.String str) {
        java.util.Iterator it = this.f182451a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next();
            if (b1Var.f182431b.T.equals(str)) {
                return b1Var;
            }
        }
        return null;
    }

    public boolean d(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var) {
        if (b1Var == null) {
            return false;
        }
        java.util.Iterator it = this.f182451a.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next()).f182431b.T.equals(b1Var.f182431b.T)) {
                return true;
            }
        }
        return false;
    }
}
