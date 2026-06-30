package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class u6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e, xg3.h0 {
    /* JADX WARN: Removed duplicated region for block: B:158:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0569  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u6 r40, java.lang.String r41, boolean r42, uc0.t r43) {
        /*
            Method dump skipped, instructions count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u6.m0(com.tencent.mm.ui.chatting.component.u6, java.lang.String, boolean, uc0.t):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        boolean n07 = n0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingRecommendRemarkComponent", "onChattingEnterAnimEnd() called isSingleChat:" + n07 + " talker:" + this.f280113d.u().d1() + ' ');
        if (!n07) {
            gc0.f3.f351705a.b(this.f280113d.x(), false);
            return;
        }
        java.lang.String x17 = this.f280113d.x();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i17 = this.f280113d.i();
        if (i17 != null) {
            v65.i.b(i17, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.j6(x17, this, null), 1, null);
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).n0(this, android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this);
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        boolean z17;
        java.lang.Object obj;
        if (l0Var != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var.f535943a, this.f280113d.x()) && n0()) {
                java.util.ArrayList msgList = l0Var.f535945c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
                boolean z18 = false;
                if (!msgList.isEmpty()) {
                    java.util.Iterator it = msgList.iterator();
                    while (it.hasNext()) {
                        if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).A0() == 0) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    java.lang.String str = l0Var.f535944b;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "delete")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingRecommendRemarkComponent", "onNotifyChange() called hit delete msg case");
                    } else {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "update")) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
                            java.util.Iterator it6 = msgList.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it6.next();
                                    if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).W2()) {
                                        break;
                                    }
                                }
                            }
                            if (obj != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingRecommendRemarkComponent", "onNotifyChange() called hit revoke msg case");
                            }
                        }
                        z18 = true;
                    }
                    java.lang.String x17 = this.f280113d.x();
                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i17 = this.f280113d.i();
                    if (i17 != null) {
                        v65.i.b(i17, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k6(x17, z18, this, null), 1, null);
                    }
                }
            }
        }
    }

    public final boolean n0() {
        return (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(this.f280113d.x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.x()) || this.f280113d.u().k2()) ? false : true;
    }
}
