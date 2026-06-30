package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f100918a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f100919b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f100920c = new java.util.ArrayList();

    public f1(com.tencent.mm.plugin.fav.ui.gallery.c1 c1Var) {
    }

    public void a(com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        if (b1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGallerySelectedHandle", "add : %s", b1Var);
        java.util.ArrayList arrayList = this.f100918a;
        arrayList.remove(b1Var);
        arrayList.remove(c(b1Var.f100898b.T));
        arrayList.add(b1Var);
        java.util.Iterator it = this.f100920c.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fav.ui.gallery.l2) ((com.tencent.mm.plugin.fav.ui.gallery.e1) it.next())).f100999g = true;
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGallerySelectedHandle", "clear..");
        this.f100918a.clear();
        java.util.Iterator it = this.f100920c.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fav.ui.gallery.e1) it.next()).getClass();
        }
    }

    public com.tencent.mm.plugin.fav.ui.gallery.b1 c(java.lang.String str) {
        java.util.Iterator it = this.f100918a.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = (com.tencent.mm.plugin.fav.ui.gallery.b1) it.next();
            if (b1Var.f100898b.T.equals(str)) {
                return b1Var;
            }
        }
        return null;
    }

    public boolean d(com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        if (b1Var == null) {
            return false;
        }
        java.util.Iterator it = this.f100918a.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.fav.ui.gallery.b1) it.next()).f100898b.T.equals(b1Var.f100898b.T)) {
                return true;
            }
        }
        return false;
    }
}
