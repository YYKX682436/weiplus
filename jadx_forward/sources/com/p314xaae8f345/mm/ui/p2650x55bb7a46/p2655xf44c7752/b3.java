package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b3 f282343a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b3();

    public final boolean a(com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256, boolean z17) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1 d1Var;
        if (c11126xa77ef256 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryImgSourceHelper", "resolveImgSource, failed: sourceImgInfo is null");
            return false;
        }
        java.lang.Iterable all = ((fs.c) fs.g.f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1.class)).all();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(all, "all(...)");
        java.util.Iterator it = all.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1 d1Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1) ((fs.q) obj).get();
            if (d1Var2 != null ? d1Var2.Fc(c11126xa77ef256) : false) {
                break;
            }
        }
        fs.q qVar = (fs.q) obj;
        if (qVar == null || (d1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d1) qVar.get()) == null) {
            return false;
        }
        d1Var.Ob(c11126xa77ef256, z17);
        return true;
    }
}
