package a35;

/* loaded from: classes5.dex */
public final class q implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        if (gm0.j1.a()) {
            boolean z17 = false;
            r45.j4 j4Var = addMsgInfo.f152259a;
            if (j4Var != null && j4Var.f459093g == 10002) {
                z17 = true;
            }
            if (z17) {
                java.lang.String g17 = x51.j1.g(j4Var.f459094h);
                w15.c cVar = new w15.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
                cVar.m126728xdc93280d(g17);
                w15.b j17 = cVar.j();
                if (j17 != null) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), j17.m173115xdd380867()) ? j17.m173114xc0914d16() : j17.m173115xdd380867(), j17.j());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileUploadFinishStaticSysCmdMsgNewXmlListener", "uploadfinishmsg, svrid:" + j17.j() + ", msgId:" + o27.m124847x74d37ac6() + ", from:" + j17.m173114xc0914d16() + ", to:" + j17.m173115xdd380867());
                    if (o27.m124847x74d37ac6() > 0) {
                        l15.c cVar2 = new l15.c();
                        java.lang.String j18 = o27.j();
                        if (j18 == null) {
                            j18 = "";
                        }
                        cVar2.m126728xdc93280d(j18);
                        v05.b k17 = cVar2.k();
                        v05.a aVar = k17 != null ? (v05.a) k17.m75936x14adae67(k17.f513848e + 8) : null;
                        if (aVar != null) {
                            aVar.T(2);
                        }
                        java.lang.String V1 = o27.V1();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(V1)) {
                            str = cVar2.m126747x696739c();
                        } else {
                            str = V1 + ":\n" + cVar2.m126747x696739c();
                        }
                        o27.d1(str);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.m124847x74d37ac6(), o27, true);
                    }
                }
            }
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }
}
