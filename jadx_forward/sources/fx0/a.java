package fx0;

/* loaded from: classes10.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.h70 a(java.lang.String originPath, java.lang.String outputPath, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originPath, "originPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParams, "videoParams");
        android.graphics.Rect rect = new android.graphics.Rect();
        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(originPath, true);
        if (Ai == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostProcessMediaLogic", "getVideoInfo failed. path:".concat(originPath));
            return null;
        }
        i95.m c17 = i95.n0.c(bg0.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0 Z2 = bg0.v.Z2((bg0.v) c17, originPath, false, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) Z2;
        long j17 = Ai.f442899d;
        i1Var.c(j17);
        i1Var.a(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k0 Bi = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Bi(kz5.b0.c(Z2));
        int i17 = Ai.f442896a;
        int i18 = Ai.f442897b;
        int i19 = Ai.f442901f;
        if (i19 == 90 || i19 == 270) {
            i18 = i17;
            i17 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var.f257157i;
        yVar.f257320d.set(0, 0, i17, i18);
        yVar.f257318b.set(0, 0, i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1) Bi;
        h1Var.u(i17, i18);
        rect.set(0, 0, i17, i18);
        h1Var.t(rect);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p) ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).wi(Bi);
        pVar.e(outputPath, videoParams, new android.util.Size(i17, i18), rect, false, true);
        r45.h70 f17 = pVar.f();
        r45.i70 i70Var = f17.f457435i;
        i70Var.f458308d = outputPath;
        i70Var.f458325x = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ui(false, h1Var.g());
        r45.g70 g70Var = f17.f457437n;
        r45.vl5 vl5Var = new r45.vl5();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(rect.left));
        linkedList.add(java.lang.Integer.valueOf(rect.top));
        linkedList.add(java.lang.Integer.valueOf(rect.right));
        linkedList.add(java.lang.Integer.valueOf(rect.bottom));
        vl5Var.f469883d = linkedList;
        g70Var.f456471d = vl5Var;
        r45.g70 g70Var2 = f17.f457437n;
        r45.vl5 vl5Var2 = new r45.vl5();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(java.lang.Integer.valueOf(rect.left));
        linkedList2.add(java.lang.Integer.valueOf(rect.top));
        linkedList2.add(java.lang.Integer.valueOf(rect.right));
        linkedList2.add(java.lang.Integer.valueOf(rect.bottom));
        vl5Var2.f469883d = linkedList2;
        g70Var2.f456474g = vl5Var2;
        return f17;
    }
}
