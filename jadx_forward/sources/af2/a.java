package af2;

/* loaded from: classes3.dex */
public final class a extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f86051a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f86052b;

    public a(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f86051a = liveContext;
        this.f86052b = "LiveMsgExtFlagInterceptor";
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        gk2.e eVar;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f526747a;
        if (r71Var != null && (eVar = this.f86051a) != null) {
            int i17 = 11;
            if (((mm2.c1) eVar.a(mm2.c1.class)).Q1 != r71Var.m75939xb282bd08(11)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[heartbeat] checkAnchorAlive isAnchor:");
                sb6.append(dk2.ef.f314917g);
                sb6.append(" localLiveExtFlag:");
                sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).Q1);
                sb6.append(" liveExtFlag:");
                sb6.append(r71Var.m75939xb282bd08(11));
                sb6.append(", filterAnchorExtFlag:");
                boolean z17 = dk2.ef.S;
                sb6.append(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", sb6.toString());
                if (!z17 && !dk2.ef.f314917g) {
                    if (!d(((mm2.c1) eVar.a(mm2.c1.class)).Q1) && d(r71Var.m75939xb282bd08(11))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "[heartbeat] checkAnchorAlive anchor alive expired:true");
                        no0.g gVar = no0.k.f420262a;
                        if (gVar != null) {
                            gVar.mo57716xe4f3d5c2(false);
                        }
                    } else if (d(((mm2.c1) eVar.a(mm2.c1.class)).Q1) && !d(r71Var.m75939xb282bd08(11))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f86052b, "[heartbeat] checkAnchorAlive anchor alive expired:false");
                        no0.g gVar2 = no0.k.f420262a;
                        if (gVar2 != null) {
                            gVar2.mo57716xe4f3d5c2(true);
                        }
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[heartbeat] checkLinkMicEnable isAnchor:");
                dk2.ef efVar = dk2.ef.f314905a;
                sb7.append(dk2.ef.f314917g);
                sb7.append(" localLiveExtFlag:");
                sb7.append(((mm2.c1) eVar.a(mm2.c1.class)).Q1);
                sb7.append(" liveExtFlag:");
                sb7.append(r71Var.m75939xb282bd08(11));
                sb7.append(" localEnableLinkMicFun:");
                sb7.append(((mm2.o4) eVar.a(mm2.o4.class)).I);
                sb7.append(" localEnableLinkMic:");
                sb7.append(((mm2.o4) eVar.a(mm2.o4.class)).k7());
                sb7.append(" localEnableLinkMicAntispam:");
                sb7.append(((mm2.o4) eVar.a(mm2.o4.class)).f410843J);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", sb7.toString());
                boolean z18 = dk2.ef.f314917g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a;
                if (!z18) {
                    str = " localLiveExtFlag:";
                    if (!pm0.v.z(r71Var.m75939xb282bd08(11), 4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "[heartbeat] checkLinkMicEnable disableLinkMic");
                        ((mm2.o4) eVar.a(mm2.o4.class)).I = false;
                        ((mm2.c1) eVar.a(mm2.c1.class)).p8(((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q) & (-65));
                        ((mm2.o4) eVar.a(mm2.o4.class)).F = 0;
                        n2Var.e("checkLinkMicEnable2", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
                    }
                } else if (pm0.v.z(r71Var.m75939xb282bd08(11), 4)) {
                    str = " localLiveExtFlag:";
                    ((mm2.o4) eVar.a(mm2.o4.class)).f410843J = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "[heartbeat] checkLinkMicEnable disableLinkMic");
                    ((mm2.o4) eVar.a(mm2.o4.class)).f410843J = false;
                    ((mm2.o4) eVar.a(mm2.o4.class)).F = 0;
                    str = " localLiveExtFlag:";
                    ((mm2.c1) eVar.a(mm2.c1.class)).p8(((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q) & (-65));
                    n2Var.e("checkLinkMicEnable", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
                    dk2.xf k17 = efVar.k(eVar);
                    if (k17 != null) {
                        dk2.xf.h(k17, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.c1) eVar.a(mm2.c1.class)).f410399q, 64L, 0, null, 48, null);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "[heartbeat] checkGiftEnable isAnchor:" + dk2.ef.f314917g + str + ((mm2.c1) eVar.a(mm2.c1.class)).Q1 + " liveExtFlag:" + r71Var.m75939xb282bd08(11) + " localEnableGiftFun:" + ((mm2.c1) eVar.a(mm2.c1.class)).f410395p3 + " localEnableGift:" + ((mm2.c1) eVar.a(mm2.c1.class)).m7() + " localEnableGiftAntispam:" + ((mm2.c1) eVar.a(mm2.c1.class)).f410407r3);
                if (dk2.ef.f314917g) {
                    if (pm0.v.z(r71Var.m75939xb282bd08(11), 2)) {
                        ((mm2.c1) eVar.a(mm2.c1.class)).f410407r3 = true;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "[heartbeat] checkGiftEnable disableGift");
                        ((mm2.c1) eVar.a(mm2.c1.class)).f410407r3 = false;
                        ((mm2.c1) eVar.a(mm2.c1.class)).f410387o3 = 0;
                        ((mm2.c1) eVar.a(mm2.c1.class)).p8(((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q) & (-129));
                        n2Var.e("checkGiftEnable", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
                        dk2.xf k18 = efVar.k(eVar);
                        if (k18 != null) {
                            dk2.xf.h(k18, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.c1) eVar.a(mm2.c1.class)).f410399q, 128L, 0, null, 48, null);
                        }
                    }
                } else if (!((mm2.c1) eVar.a(mm2.c1.class)).T) {
                    if (!(((mm2.n0) eVar.a(mm2.n0.class)).f410806r) && !pm0.v.z(r71Var.m75939xb282bd08(11), 2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "[heartbeat] checkGiftEnable disableGift");
                        ((mm2.c1) eVar.a(mm2.c1.class)).f410395p3 = false;
                        ((mm2.c1) eVar.a(mm2.c1.class)).p8(((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q) & (-129));
                        ((mm2.c1) eVar.a(mm2.c1.class)).f410387o3 = 0;
                        n2Var.e("checkGiftEnable", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
                    }
                }
                if (dk2.ef.f314917g) {
                    i17 = 11;
                } else {
                    i17 = 11;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0.f183953a.e("getlivemsg", r71Var.m75939xb282bd08(11), eVar);
                }
                ((mm2.c1) eVar.a(mm2.c1.class)).V6("getlivemsg", r71Var.m75939xb282bd08(i17));
                ((mm2.c1) eVar.a(mm2.c1.class)).W6("getlivemsg", r71Var.m75939xb282bd08(i17));
                ((mm2.c1) eVar.a(mm2.c1.class)).T6("getlivemsg", r71Var.m75939xb282bd08(i17));
                pm0.v.z(r71Var.m75939xb282bd08(i17), 8);
                ((mm2.c1) eVar.a(mm2.c1.class)).Q1 = r71Var.m75939xb282bd08(i17);
                ((on2.z2) eVar.a(on2.z2.class)).f7();
            }
            ((mm2.c1) eVar.a(mm2.c1.class)).X6(r71Var.m75939xb282bd08(i17));
        }
        return true;
    }

    public final boolean d(int i17) {
        return i17 != -1 && pm0.v.z(i17, 1);
    }
}
