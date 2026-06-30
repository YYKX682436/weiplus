package ik1;

/* loaded from: classes7.dex */
public abstract class a0 {
    public static java.lang.Object a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        ik1.z zVar = new ik1.z(rVar, c22633x83752a59);
        c22633x83752a59.D0(new ik1.y(rVar, c22633x83752a59, zVar));
        c22633x83752a59.mo120158xfb86a31b().scrollBy(i17, i18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(zVar, 200L);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public static void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = c22633x83752a59.getScrollX();
        }
        if ((i19 & 2) != 0) {
            i18 = c22633x83752a59.getScrollY();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22633x83752a59, "<this>");
        c22633x83752a59.mo120158xfb86a31b().scrollTo(i17, i18);
    }
}
