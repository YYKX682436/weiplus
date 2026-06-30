package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes9.dex */
public abstract class i2 {
    public static final qd5.b a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        qd5.a aVar;
        if (!(k3Var instanceof qd5.e) || (aVar = ((qd5.e) k3Var).f443440o) == null) {
            return null;
        }
        java.lang.Object tag = k3Var.f3639x46306858.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) tag : null;
        if (g0Var == null) {
            return null;
        }
        return aVar.a(g0Var);
    }

    public static final qd5.g b(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        qd5.f fVar;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905;
        z01.w wVar;
        java.util.Map map = null;
        if (!(k3Var instanceof qd5.e) || (fVar = ((qd5.e) k3Var).f443439n) == null) {
            return null;
        }
        java.lang.Object tag = k3Var.f3639x46306858.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) tag : null;
        if (g0Var == null) {
            return null;
        }
        ye5.a0 a0Var = (ye5.a0) fVar;
        ze5.n8 n8Var = g0Var instanceof ze5.n8 ? (ze5.n8) g0Var : null;
        if (n8Var == null || (abstractC11172x705e5905 = n8Var.f553644c) == null) {
            return null;
        }
        java.lang.String b17 = ic5.f.f371970c.b(a0Var.f542773a.f475787d.f526833b);
        z01.v vVar = (z01.v) abstractC11172x705e5905.m48328xa0ab20ce();
        if (vVar != null && (wVar = vVar.f550702g) != null) {
            yz5.a aVar = wVar.f550706a;
            java.util.List list = aVar != null ? (java.util.List) aVar.mo152xb9724478() : null;
            if (list != null) {
                map = d75.b.d(list, ye5.z.f542823d);
            }
        }
        return new qd5.g(b17, map);
    }

    public static final void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, java.lang.String groupId, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c1163xf1deaba4.m7949x5701d990();
        boolean z17 = false;
        if (m7949x5701d990 != null && m7949x5701d990.o()) {
            z17 = true;
        }
        if (z17) {
            if (lVar != null) {
                lVar.mo146xb9724478(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.a.f284402d);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaGroupFoldItemAnimator", "[armMediaFoldOnce] already running!");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d9902 = c1163xf1deaba4.m7949x5701d990();
        if (m7949x5701d9902 != null) {
            m7949x5701d9902.k();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2(groupId);
        e2Var.f284460x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.f2(lVar, c1163xf1deaba4, e2Var);
        if (lVar != null) {
            lVar.mo146xb9724478(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.a.f284403e);
        }
        c1163xf1deaba4.m7964x8d4ad49c(e2Var);
    }

    public static final void d(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewGroup) {
            d(viewGroup, (android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        android.graphics.Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }
}
