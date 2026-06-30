package g61;

/* loaded from: classes9.dex */
public class d0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5876x5f8aac60 c5876x5f8aac60 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5876x5f8aac60) abstractC20979x809547d1;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(c5876x5f8aac60.f136184g.f89454b == null);
        objArr[1] = java.lang.Integer.valueOf(c5876x5f8aac60.f136184g.f89453a);
        am.sp spVar = c5876x5f8aac60.f136184g;
        objArr[2] = spVar.f89455c;
        objArr[3] = spVar.f89456d;
        objArr[4] = spVar.f89457e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReceiveAANewXmlEventListener", "receiveAANewXmlEventListener, content==null: %s, type: %s, fromUser: %s, toUser: %s, paymsgid: %s", objArr);
        am.sp spVar2 = c5876x5f8aac60.f136184g;
        int i17 = spVar2.f89453a;
        if (i17 == 18) {
            h61.o.c(spVar2.f89454b, spVar2.f89456d, c5876x5f8aac60);
        } else if (i17 == 19) {
            java.lang.String str = spVar2.f89454b;
            java.lang.String str2 = spVar2.f89456d;
            java.lang.String str3 = spVar2.f89457e;
            synchronized (h61.o.class) {
                try {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, chatroom: %s, payMsgId: %s", str2, str3);
                        java.lang.String replace = str.replace("\"#037AFF\"", "\"" + (com.p314xaae8f345.mm.ui.bk.C() ? "#7D90A9" : "#576B95") + "\"");
                        j61.a y07 = e61.e.Bi().y0(str3);
                        if (y07 != null && y07.f65822x83b3e923) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(y07.f65821x737db1d8, y07.f65823x297eb4f7);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, update old one, msgId: %s, dbMsginfo.id: %s", java.lang.Long.valueOf(y07.f65823x297eb4f7), java.lang.Long.valueOf(Li.m124847x74d37ac6()));
                            Li.d1(replace);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(y07.f65823x297eb4f7, Li, true);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, insert new msg");
                        h61.o.n(replace, str2, y07, str3, false);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AAUtil", "checkIfInsertPaySysMsg error: %s", e17.getMessage());
                }
            }
        } else if (i17 == 21) {
            java.lang.String str4 = spVar2.f89454b;
            java.lang.String str5 = spVar2.f89456d;
            java.lang.String str6 = spVar2.f89457e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAUtil", "insertUrgePaySysMsg, toUser: %s, paymsgid: %s", str5, str6);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                j61.a y08 = e61.e.Bi().y0(str6);
                if (y08 == null || !y08.f65822x83b3e923) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAUtil", "insert new urge msg");
                    h61.o.n(str4, str5, y08, str6, true);
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(y08.f65821x737db1d8, y08.f65823x297eb4f7);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAUtil", "update old one, msgId: %s, dbMsginfo.id: %s", java.lang.Long.valueOf(y08.f65823x297eb4f7), java.lang.Long.valueOf(Li2.m124847x74d37ac6()));
                    Li2.d1(str4);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(y08.f65823x297eb4f7, Li2, true);
                }
            }
        }
        return false;
    }
}
