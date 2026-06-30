package ri3;

@j95.b
/* loaded from: classes5.dex */
public class e extends i95.w implements aa0.e {

    /* renamed from: d, reason: collision with root package name */
    public ui3.a f477620d = null;

    public r15.b Ai(java.lang.String str, long j17) {
        ui3.b Ni = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Ni(str, j17);
        if (Ni != null) {
            return ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Bi(Ni, false);
        }
        return null;
    }

    public r15.b Bi(ui3.b bVar, boolean z17) {
        java.util.Map d17;
        java.lang.String str = null;
        if (bVar == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(bVar.f66420x66425b6d, bVar.f66418xb3e44c2f);
        if (z17 && f27 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.PluginMsgQuote", "onlyForQuoteMsgExist referMsg not found! referMsgId: %d, referMsgTalker: %s", java.lang.Long.valueOf(bVar.f66418xb3e44c2f), bVar.f66420x66425b6d);
            return null;
        }
        r15.b bVar2 = new r15.b();
        r15.i iVar = new r15.i();
        iVar.r(bVar.f66419x34d46056);
        if (f27 != null) {
            java.lang.String t17 = c01.ia.t(f27.G);
            if (t17 == null) {
                t17 = "";
            }
            iVar.q(t17);
            iVar.n(f27.mo78012x3fdd41df() / 1000);
            java.lang.String str2 = f27.G;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, "msgsource", null)) != null) {
                str = (java.lang.String) d17.get(".msgsource.signature");
            }
            iVar.p(str != null ? str : "");
        }
        bVar2.q(iVar);
        return bVar2;
    }

    public final ui3.a Di() {
        gm0.j1.b().c();
        if (this.f477620d == null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            gm0.j1.i();
            this.f477620d = new ui3.a(gm0.j1.u().f354686f, ui3.a.f509643f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.PluginMsgQuote", "create msgQuote called cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        return this.f477620d;
    }

    public ui3.b Ni(java.lang.String str, long j17) {
        return Di().y0(str, j17);
    }

    public java.util.List Ri(int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76;
        ui3.a Di = Di();
        Di.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l75.k0 k0Var = Di.f509645d;
        if (k0Var instanceof d95.b0) {
            interfaceC26872x78faff76 = ((d95.b0) k0Var).P().m107707x66f18c8(false, "MsgQuote", ui3.b.f509646x.f398487c, "quotedMsgTalker IS NULL", new java.lang.String[0], null, null, null, i17 + "", c26987xeef691ab);
        } else {
            interfaceC26872x78faff76 = null;
        }
        if (interfaceC26872x78faff76 == null) {
            return null;
        }
        while (interfaceC26872x78faff76.moveToNext()) {
            ui3.b bVar = new ui3.b();
            bVar.mo9015xbf5d97fd(interfaceC26872x78faff76);
            arrayList.add(bVar);
        }
        interfaceC26872x78faff76.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.MsgQuoteStorage", "getNonTalkers, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", size = " + arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void Ui(long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        ui3.b y07 = Di().y0(str, j17);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.PluginMsgQuote", "handleQuoteMsgSendResuld() msgId:%s msgSvrId:%s, msgQuote is null", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        y07.f66417xd09be28e = j18;
        boolean P0 = Di().P0(y07);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(y07.f66420x66425b6d, y07.f66418xb3e44c2f);
        switch (Li.mo78013xfb85f7b0()) {
            case -2130706383:
            case -2113929167:
                ((j00.o1) ((c00.f3) i95.n0.c(c00.f3.class))).getClass();
                l15.c cVar = new l15.c();
                java.lang.String j19 = Li.j();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j19, "getContent(...)");
                cVar.m126728xdc93280d(j19);
                v05.b k17 = cVar.k();
                w05.d dVar = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
                if (dVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftReportService", "reportGiftMsgQuoteSend, ecsGiftAppMsgInfo is null");
                } else if (dVar.s().isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftReportService", "reportGiftMsgQuoteSend, gift list empty");
                } else {
                    java.lang.Object obj = dVar.s().get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("ecs_gift_quote_msg_send", "view_clk", kz5.b1.e(new jz5.l("order_id", ((w05.e) obj).n())), 12, false);
                }
                ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ui(c16565x9bc03d4e, null, j18, str);
                break;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
            case 1048625:
            case 419430449:
            case 436207665:
            case 754974769:
            case 771751985:
            case 805306417:
            case 822083633:
            case 855638065:
            case 939524145:
            case 973078577:
            case 975175729:
            case 1040187441:
            case 1090519089:
            case 1157627953:
            case 1174405169:
            case 1224736817:
            case 1241514033:
                ot0.q v17 = ot0.q.v(Li.j());
                if (v17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.PluginMsgQuote", "appMsgContent is null");
                    break;
                } else {
                    ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ui(c16565x9bc03d4e, java.lang.Integer.valueOf(v17.f430199i), j18, str);
                    break;
                }
            default:
                ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ui(c16565x9bc03d4e, null, j18, str);
                break;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleQuoteMsgSendResuld() msgId:%s msgSvrId:%s result:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(P0));
    }

    public void Vi(long j17, long j18, java.lang.String str, long j19) {
        if (j19 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.PluginMsgQuote", "quotedMsgSvrid is illegal, msgId:%s msgSvrid:%s talker:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str);
            return;
        }
        ui3.b bVar = new ui3.b();
        bVar.f66416x297eb4f7 = j17;
        bVar.f66417xd09be28e = j18;
        bVar.f66419x34d46056 = j19;
        bVar.f66420x66425b6d = str;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, j19);
        if (o27 != null) {
            bVar.f66418xb3e44c2f = o27.m124847x74d37ac6();
        }
        if (o27 == null || !(o27.W2() || o27.V2())) {
            bVar.f66421x10a0fed7 = 0;
        } else {
            bVar.f66421x10a0fed7 = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleReceivedQuoteMsg(), fix revoke status");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleReceivedQuoteMsg() msgId:%s msgSvrid:%s talker:%s quotedMsgSvrid:%s result:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str, java.lang.Long.valueOf(j19), java.lang.Boolean.valueOf(Di().L0(bVar)));
    }

    public void Zi(java.lang.String str, long j17, long j18) {
        ui3.b z07 = Di().z0(str, j17);
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySelf msgId:%s, msgSvrId:%s, msgQuote is null", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        z07.f66421x10a0fed7 = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySelf() msgId:%s msgSvrId:%s result:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(Di().P0(z07)));
    }

    public boolean wi(java.lang.String str, long j17) {
        ui3.a Di = Di();
        Di.getClass();
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "deleteMsgQuoteByMsgId:%s", java.lang.Long.valueOf(j17));
            return false;
        }
        l75.k0 k0Var = Di.f509645d;
        int mo70514xb06685ab = k0Var.mo70514xb06685ab("MsgQuote", "msgId=? and quotedMsgTalker=? ", new java.lang.String[]{j17 + "", str});
        if (mo70514xb06685ab < 0) {
            if (!pt0.p.B3("MsgQuote")) {
                mo70514xb06685ab = k0Var.mo70514xb06685ab("MsgQuote", "msgId=? ", new java.lang.String[]{j17 + ""});
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "deleteMsgQuoteByMsgId failed, msgId:%s, result:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(mo70514xb06685ab));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.MsgQuoteStorage", "deleteMsgQuoteByMsgId, msgId:%s, result:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(mo70514xb06685ab));
        }
        return mo70514xb06685ab >= 0;
    }
}
