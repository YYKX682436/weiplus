package ku;

/* loaded from: classes9.dex */
public final class k extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 1, g17);
        java.lang.String b17 = b(simpleMsgInfo);
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(b17);
        jz5.f0 f0Var = null;
        if (h17 != null) {
            recordDataItem.set(i17 + 2, 4);
            i95.m c17 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String Af = tg3.u0.Af((tg3.u0) c17, simpleMsgInfo, bm5.f0.f104104s, b17, false, 8, null);
            if (!com.p314xaae8f345.mm.vfs.w6.j(Af)) {
                if (((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Vi(simpleMsgInfo.m75942xfb822ef2(simpleMsgInfo.f427150d + 2)) <= 0) {
                    recordDataItem.set(i17 + 2, 1);
                }
            }
            if (recordDataItem.m75939xb282bd08(i17 + 2) == 4) {
                java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(Af);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                    n17 = d61.c.a(Af) ? "mp4" : "";
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                }
                recordDataItem.j0(n17);
                java.lang.String str = h17.F;
                recordDataItem.X0(str != null ? str : "");
                y15.d dVar = new y15.d();
                java.lang.String g18 = h17.g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getRecvXml(...)");
                dVar.m126728xdc93280d(g18);
                y15.c n18 = dVar.n();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(n18.m75939xb282bd08(n18.f540455d + 10));
                boolean z17 = false;
                java.lang.Integer num = java.lang.Boolean.valueOf(valueOf.intValue() > 0).booleanValue() ? valueOf : null;
                recordDataItem.o0(num != null ? num.intValue() : h17.f496548m);
                y15.c n19 = dVar.n();
                if (n19.m75945x2fec8307(n19.f540455d + 4) != null && (!r26.n0.N(r2))) {
                    z17 = true;
                }
                if (z17) {
                    y15.c n27 = dVar.n();
                    recordDataItem.set(i17 + 11, java.lang.Long.valueOf(n27.m75939xb282bd08(n27.f540455d + 9)));
                    y15.c n28 = dVar.n();
                    recordDataItem.set(i17 + 7, java.lang.Long.valueOf(n28.m75939xb282bd08(n28.f540455d + 12)));
                    y15.c n29 = dVar.n();
                    recordDataItem.e1(n29.m75939xb282bd08(n29.f540455d + 15));
                    y15.c n37 = dVar.n();
                    recordDataItem.d1(n37.m75939xb282bd08(n37.f540455d + 16));
                } else {
                    recordDataItem.set(i17 + 11, java.lang.Long.valueOf(h17.f496541f));
                    y15.c n38 = dVar.n();
                    recordDataItem.set(i17 + 7, java.lang.Long.valueOf(n38.m75939xb282bd08(n38.f540455d + 11)));
                    y15.c n39 = dVar.n();
                    recordDataItem.e1(n39.m75939xb282bd08(n39.f540455d + 13));
                    y15.c n47 = dVar.n();
                    recordDataItem.d1(n47.m75939xb282bd08(n47.f540455d + 14));
                }
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            recordDataItem.set(i17 + 2, 1);
        }
        return true;
    }
}
