package cl4;

/* loaded from: classes11.dex */
public final class l extends jk3.v {
    public static void c0(cl4.l lVar, bw5.v70 listenItem, boolean z17, boolean z18, android.graphics.Rect rect, android.graphics.Bitmap bitmap, boolean z19, int i17, java.lang.Object obj) {
        r45.lr4 v07;
        ak3.c cVar;
        if ((i17 & 32) != 0) {
            z19 = false;
        }
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItem, "listenItem");
        lVar.y(z18 ? 23 : 24, listenItem.m13170xcc16feb8());
        if (rect != null && bitmap != null && (cVar = lVar.f381644d) != null) {
            ((ak3.i) cVar).s(rect, bitmap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = lVar.f381610a;
        if (c16601x7ed0e40c != null) {
            bw5.zo0 zo0Var = new bw5.zo0();
            zo0Var.f117607d = listenItem;
            zo0Var.f117608e[1] = true;
            c16601x7ed0e40c.f66790x225a93cf = zo0Var.mo14344x5f01b1f6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = lVar.f381610a;
        if (c16601x7ed0e40c2 != null && (v07 = c16601x7ed0e40c2.v0()) != null) {
            v07.set(1, listenItem.m13171x7531c8a2());
            v07.set(0, listenItem.c());
            v07.set(5, listenItem.d().b());
            v07.set(2, listenItem.f());
        }
        lVar.V(!z17, z19 ? 8 : 9, jk3.c.f381614e);
    }
}
