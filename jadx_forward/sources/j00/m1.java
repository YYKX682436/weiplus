package j00;

/* loaded from: classes9.dex */
public final class m1 implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        int D1;
        boolean mo880xb970c2b9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "mmec_gift_msg")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "consumeNewXml, subType: " + str);
            java.lang.String str2 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.subtype");
            boolean z17 = true;
            if (str2 == null || str2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "giftXmlSubType is null");
                D1 = 0;
            } else {
                D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
            }
            if (D1 == 1) {
                java.lang.String str3 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.gift_msgid");
                if (str3 == null || str3.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, giftMsgId is empty");
                    return null;
                }
                java.lang.String str4 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.gift_msg_xml");
                if (str4 == null || str4.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, msgXml is empty");
                    return null;
                }
                byte[] decode = android.util.Base64.decode(str4, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
                java.lang.String str5 = new java.lang.String(decode, r26.c.f450398a);
                n00.e y07 = n00.d.f415348a.a().y0(str3);
                long j17 = y07.f67884x9a279b8a;
                java.lang.String str6 = y07.f67885x3e123854;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, giftMsgId:" + str3 + ", msgId:" + j17 + ", talker:" + str6);
                pt0.e0 e0Var = pt0.f0.f439742b1;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(str6, j17);
                if (k17 != null) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = e0Var.k(str6, j17);
                    java.lang.String hj6 = ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).hj(k17, str5);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, newMsgXml:".concat(hj6));
                    k17.d1(hj6);
                    c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k18);
                    if (!((j00.k1) e3Var).Ni(k18, k17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, do not update msg");
                        return null;
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, k17, true);
                    if (((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).aj()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, check red digest start");
                        c00.e3 e3Var2 = (c00.e3) i95.n0.c(c00.e3.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
                        j00.k1 k1Var = (j00.k1) e3Var2;
                        k1Var.getClass();
                        if (k1Var.Ri(str6)) {
                            l15.c cVar = new l15.c();
                            java.lang.String j18 = k17.j();
                            if (j18 == null) {
                                j18 = "";
                            }
                            cVar.m126728xdc93280d(j18);
                            v05.b k19 = cVar.k();
                            w05.d dVar = k19 != null ? (w05.d) k19.m75936x14adae67(k19.f513848e + 66) : null;
                            if (dVar == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, ecsGiftAppMsgInfo is null");
                            } else if (dVar.s().size() <= 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, gift msg list is empty");
                            } else {
                                java.lang.Object obj = dVar.s().get(0);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                                w05.e eVar = (w05.e) obj;
                                if (eVar.l() == 2 || eVar.l() == 4) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, gift invalid, start check digest");
                                    if (dVar.B() != 2 || k1Var.nj(dVar.z())) {
                                        w20.f y08 = ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi().y0(str6);
                                        long j19 = y08 != null ? y08.f67777x6d297bba : 0L;
                                        long mo78012x3fdd41df = k17.mo78012x3fdd41df();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, orderId:" + dVar.t() + ", last handle:" + j19 + ", msg create time:" + mo78012x3fdd41df);
                                        if (j19 > mo78012x3fdd41df) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, this msg has been read, invalid do nothing");
                                        } else {
                                            int i17 = y08 != null ? y08.f67776xbdb2116c : 0;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, talker:" + str6 + ", unhandledCnt:" + i17 + ", ret:" + (i17 <= 0 ? ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi().D0(str6, 0) : ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi().D0(str6, i17 - 1)));
                                            if (i17 <= 1) {
                                                com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str6);
                                                p17.e2(4096);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, update conv ret:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str6, true, true));
                                            }
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, is exclusive gift but not exclusive receiver");
                                    }
                                }
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, not handle conv");
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeGiftStatus, get msg null");
                }
            } else if (D1 == 2) {
                java.lang.String str7 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.to_username");
                if (str7 == null || str7.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeBackupMsg, to username is empty");
                    return null;
                }
                java.lang.String str8 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.gift_msg_xml");
                if (str8 != null && str8.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeBackupMsg, msgXml is empty");
                    return null;
                }
                byte[] decode2 = android.util.Base64.decode(str8, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode2);
                java.lang.String str9 = new java.lang.String(decode2, r26.c.f450398a);
                java.lang.String str10 = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.msgsvrid");
                java.lang.Long valueOf = str10 != null ? java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(str10)) : null;
                if (valueOf != null && valueOf.longValue() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeBackupMsg, msg svr id is empty");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeBackupMsg, msgXml: " + str9 + ", toUserName: " + str7);
                j00.k1 k1Var2 = (j00.k1) ((c00.e3) i95.n0.c(c00.e3.class));
                k1Var2.getClass();
                ((ku5.t0) ku5.t0.f394148d).h(new j00.e1(k1Var2, str9, str7, false, valueOf), "MicroMsg.EcsGiftMsgService");
            } else if (D1 == 3) {
                if (!((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).aj()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeLotteryDraw, toggle close, not show red digest");
                    return null;
                }
                java.lang.String talker = (java.lang.String) values.get(".sysmsg.mmec_gift_msg.to_username");
                if (talker == null || talker.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeLotteryDraw, to username is empty");
                    return null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftNewXmlConsumer", "SubTypeLotteryDraw, check digest, talker is " + talker);
                j00.k1 k1Var3 = (j00.k1) ((c00.e3) i95.n0.c(c00.e3.class));
                k1Var3.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
                if (k1Var3.Ri(talker)) {
                    w20.g wi6 = ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi();
                    wi6.getClass();
                    if (wi6.J0(talker)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "insertOrUpdateEcsGiftRedLabelType, talker:" + talker + ", red label type:2");
                        mo880xb970c2b9 = wi6.m145253xb158737d("EcsConversationRecord", "UPDATE EcsConversationRecord SET ecsGiftRedLabelType=2 WHERE talker='" + talker + '\'');
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "updateEcsRedLabelType, talker:" + talker + ", unhandled count:2, ret:" + mo880xb970c2b9);
                    } else {
                        w20.f fVar = new w20.f();
                        fVar.f67778x114ef53e = talker;
                        fVar.f67776xbdb2116c = 0;
                        fVar.f67775xc4d9c6fd = 2;
                        mo880xb970c2b9 = wi6.mo880xb970c2b9(fVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "insertOrUpdateEcsGiftRedLabelType, insert new, talker:" + talker + ", red label type:2");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "markEcsGiftRedLabelLotteryDraw, talker:" + talker + ", ret:" + mo880xb970c2b9);
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 p18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(talker);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "get(...)");
                    p18.j1(p18.u0() | 4096);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "markEcsGiftRedLabelLotteryDraw, update conv ret:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p18, talker, true, true));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "markEcsGiftRedLabelLotteryDraw, not handle conv");
                }
            }
        }
        return null;
    }
}
