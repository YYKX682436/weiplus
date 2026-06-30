package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public abstract class c {
    public static final boolean a(java.lang.String username, bi4.o0 o0Var, mj4.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (com.p314xaae8f345.mm.vfs.w6.j(bk4.n.f103046a.g("thumb", hVar != null ? ((mj4.k) hVar).l() : null, hVar != null ? ((mj4.k) hVar).i() : null))) {
            return true;
        }
        return !c(hVar, o0Var);
    }

    public static final boolean b(pj4.o0 o0Var, pj4.o0 o0Var2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        if (o0Var2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wi4.a.d(o0Var), wi4.a.d(o0Var2))) {
            return false;
        }
        java.util.LinkedList linkedList = o0Var2.f436749g;
        if (linkedList != null && wi4.f.a(linkedList, o0Var.f436749g)) {
            return wi4.f.a(wi4.a.b(o0Var2), wi4.a.b(o0Var));
        }
        return false;
    }

    public static final boolean c(mj4.h hVar, bi4.o0 o0Var) {
        if (o0Var != null && o0Var.j()) {
            return false;
        }
        return hVar != null && android.text.TextUtils.isEmpty(((mj4.k) hVar).i());
    }

    public static final boolean d(mj4.h hVar, bi4.o0 o0Var) {
        return !a(hVar != null ? ((mj4.k) hVar).o() : "", o0Var, hVar);
    }
}
