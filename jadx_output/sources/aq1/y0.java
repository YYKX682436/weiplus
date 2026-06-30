package aq1;

/* loaded from: classes12.dex */
public class y0 implements a25.r {
    @Override // a25.r
    public void g(com.tencent.mm.booter.y0 y0Var, int i17, byte[] bArr, byte[] bArr2, r45.cx4 cx4Var) {
        switch (i17) {
            case 10:
                o45.jh jhVar = new o45.jh();
                jhVar.f342971c = wo.w0.k();
                try {
                    if (new com.tencent.mm.modelbase.y2(jhVar, 10).Zd(10, bArr, null, 0L)) {
                        c01.d9.e().onSceneEnd(0, 0, "", new com.tencent.mm.modelsimple.g0(jhVar));
                        return;
                    }
                    return;
                } catch (android.os.RemoteException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotifyReceiverCallbackImpl", e17, "", new java.lang.Object[0]);
                    return;
                }
            case 102:
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify MM_VOIP_CS_PUSHTYPE_SYN do VoipSync");
                return;
            case 120:
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "voipInviteInspect notify");
                y0Var.a(5000L, "NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ");
                com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
                talkRoomServerEvent.f54883g.f7583a = true;
                talkRoomServerEvent.e();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(talkRoomServerEvent.f54884h.f7671a)) {
                    com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent2 = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
                    talkRoomServerEvent2.f54883g.f7584b = true;
                    talkRoomServerEvent2.e();
                }
                if (bArr == null || bArr.length <= 0) {
                    return;
                }
                byte b17 = bArr[0];
                if (b17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "voipInviteInspect publish event");
                    com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
                    am.y00 y00Var = voipEvent.f54945g;
                    y00Var.f8415b = 3;
                    y00Var.f8416c = bArr;
                    com.tencent.mm.sdk.event.d.f192370d.d(voipEvent, true);
                    return;
                }
                if (b17 == 101) {
                    com.tencent.mm.autogen.events.IPCallSvrNotifyEvent iPCallSvrNotifyEvent = new com.tencent.mm.autogen.events.IPCallSvrNotifyEvent();
                    iPCallSvrNotifyEvent.f54440g.f7620a = bArr;
                    iPCallSvrNotifyEvent.e();
                    return;
                }
                if (b17 == 3) {
                    com.tencent.mm.autogen.events.VoipEvent voipEvent2 = new com.tencent.mm.autogen.events.VoipEvent();
                    am.y00 y00Var2 = voipEvent2.f54945g;
                    y00Var2.f8415b = 9;
                    y00Var2.f8416c = bArr;
                    voipEvent2.e();
                    return;
                }
                if (b17 == 2) {
                    com.tencent.mm.autogen.events.VoipEvent voipEvent3 = new com.tencent.mm.autogen.events.VoipEvent();
                    am.y00 y00Var3 = voipEvent3.f54945g;
                    y00Var3.f8415b = 10;
                    y00Var3.f8416c = bArr;
                    voipEvent3.e();
                    return;
                }
                if (b17 == 110) {
                    com.tencent.mm.autogen.events.VoipEvent voipEvent4 = new com.tencent.mm.autogen.events.VoipEvent();
                    am.y00 y00Var4 = voipEvent4.f54945g;
                    y00Var4.f8415b = 12;
                    y00Var4.f8416c = bArr;
                    com.tencent.mm.sdk.event.d.f192370d.d(voipEvent4, true);
                    return;
                }
                return;
            case 174:
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify MMFunc_VoipSync do VoipSync");
                com.tencent.mm.autogen.events.VoipEvent voipEvent5 = new com.tencent.mm.autogen.events.VoipEvent();
                am.y00 y00Var5 = voipEvent5.f54945g;
                y00Var5.f8415b = 6;
                y00Var5.f8416c = bArr;
                voipEvent5.e();
                return;
            case 192:
                com.tencent.mm.autogen.events.FavNotifyEvent favNotifyEvent = new com.tencent.mm.autogen.events.FavNotifyEvent();
                favNotifyEvent.f54239g.f8184a = bArr;
                favNotifyEvent.e();
                return;
            case 241:
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "jacks do voice notify UI");
                if (bArr.length < 8) {
                    return;
                }
                byte[] bArr3 = new byte[4];
                byte[] bArr4 = new byte[4];
                java.lang.System.arraycopy(bArr, 0, bArr3, 0, 4);
                java.lang.System.arraycopy(bArr, 4, bArr4, 0, 4);
                com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent notifyCanPullVoiceTransResEvent = new com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent();
                int a17 = kk.u.a(bArr3, 0);
                am.il ilVar = notifyCanPullVoiceTransResEvent.f54537g;
                ilVar.f6958a = a17;
                ilVar.f6959b = kk.u.a(bArr4, 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "notifyId: %d, sequence: %d", java.lang.Integer.valueOf(ilVar.f6958a), java.lang.Integer.valueOf(ilVar.f6959b));
                notifyCanPullVoiceTransResEvent.e();
                return;
            case zc1.b.CTRL_INDEX /* 271 */:
                r45.zc6 zc6Var = new r45.zc6();
                try {
                    zc6Var.parseFrom(bArr);
                    gm0.j1.n().f273288b.g(new c41.a(zc6Var.f391910d, zc6Var.f391914h, zc6Var.f391915i, zc6Var.f391916m, zc6Var.f391917n, zc6Var.f391919p, zc6Var.f391918o, zc6Var.f391911e));
                    return;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiverCallbackImpl", "speed test parse data failed. e: " + e18.getMessage());
                    return;
                }
            case qf1.f.CTRL_INDEX /* 318 */:
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY notify respBuf len[%d]", objArr);
                jx3.f.INSTANCE.idkeyStat(403L, 38L, 1L, false);
                byte[] bArr5 = null;
                if (bArr != null) {
                    r45.fy5 fy5Var = new r45.fy5();
                    try {
                        fy5Var.parseFrom(bArr);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData[%d, %d, %d, %d, %d, %d]", java.lang.Integer.valueOf(fy5Var.f374731d), java.lang.Integer.valueOf(fy5Var.f374732e), java.lang.Integer.valueOf(fy5Var.f374733f), java.lang.Integer.valueOf(fy5Var.f374734g), java.lang.Integer.valueOf(fy5Var.f374735h), java.lang.Integer.valueOf(fy5Var.f374736i));
                        int i18 = fy5Var.f374731d;
                        if (i18 == 13) {
                            gm0.j1.i();
                            byte[] c17 = gm0.j1.n().c(3);
                            bArr5 = com.tencent.mm.jni.utils.UtilsJni.AesGcmDecryptWithUncompress(c17, fy5Var.f374738n.f192156a);
                            java.lang.Object[] objArr2 = new java.lang.Object[2];
                            objArr2[0] = java.lang.Integer.valueOf(c17 == null ? -1 : c17.length);
                            if (bArr5 != null) {
                                r11 = bArr5.length;
                            }
                            objArr2[1] = java.lang.Integer.valueOf(r11);
                            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY AES_GCM_ENCRYPT serverSession[%s] data[%s]", objArr2);
                        } else {
                            bArr5 = com.tencent.mm.protocal.MMProtocalJni.decodeSecureNotifyData(bArr2, i18, fy5Var.f374732e, fy5Var.f374733f, fy5Var.f374734g, fy5Var.f374735h, fy5Var.f374736i, fy5Var.f374737m, fy5Var.f374738n.f192156a);
                        }
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData parseFrom e: " + e19.getMessage());
                        jx3.f.INSTANCE.idkeyStat(403L, 39L, 1L, false);
                    }
                }
                if (bArr5 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY data is null");
                    jx3.f.INSTANCE.idkeyStat(403L, 40L, 1L, false);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY data len:%d", java.lang.Integer.valueOf(bArr5.length));
                    com.tencent.mm.autogen.events.SilenceNotifyEvent silenceNotifyEvent = new com.tencent.mm.autogen.events.SilenceNotifyEvent();
                    silenceNotifyEvent.f54786g.f8138a = bArr5;
                    silenceNotifyEvent.e();
                    return;
                }
            case 319:
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                objArr3[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_BYP_NOTIFY notify respBuf len[%d]", objArr3);
                if (bArr != null) {
                    r45.nr nrVar = new r45.nr();
                    try {
                        nrVar.parseFrom(bArr);
                        com.tencent.mm.autogen.events.BypNotifyEvent bypNotifyEvent = new com.tencent.mm.autogen.events.BypNotifyEvent();
                        bypNotifyEvent.f54020g.f7115a = nrVar;
                        bypNotifyEvent.e();
                        return;
                    } catch (java.lang.Exception e27) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_BYP_NOTIFY secureData parseFrom e: " + e27.getMessage());
                        return;
                    }
                }
                return;
            case com.tencent.mapsdk.internal.km.f50100e /* 320 */:
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "MM_PKT_BYP_NOTIFY_ACTION_EVENT_BYPASS_SYNC received");
                com.tencent.mm.autogen.events.BypNotifyActionEvent bypNotifyActionEvent = new com.tencent.mm.autogen.events.BypNotifyActionEvent();
                am.j1 j1Var = bypNotifyActionEvent.f54019g;
                j1Var.f6992a = 2L;
                j1Var.f6993b = bArr;
                bypNotifyActionEvent.e();
                return;
            case 322:
                com.tencent.mm.autogen.events.BypNotifyActionEvent bypNotifyActionEvent2 = new com.tencent.mm.autogen.events.BypNotifyActionEvent();
                am.j1 j1Var2 = bypNotifyActionEvent2.f54019g;
                j1Var2.f6992a = 4L;
                j1Var2.f6993b = bArr;
                bypNotifyActionEvent2.e();
                return;
            case com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX /* 323 */:
                com.tencent.mm.autogen.events.BypNotifyActionEvent bypNotifyActionEvent3 = new com.tencent.mm.autogen.events.BypNotifyActionEvent();
                am.j1 j1Var3 = bypNotifyActionEvent3.f54019g;
                j1Var3.f6992a = 7L;
                j1Var3.f6993b = bArr;
                bypNotifyActionEvent3.e();
                return;
            case 326:
                com.tencent.mm.autogen.events.BypNotifyActionEvent bypNotifyActionEvent4 = new com.tencent.mm.autogen.events.BypNotifyActionEvent();
                am.j1 j1Var4 = bypNotifyActionEvent4.f54019g;
                j1Var4.f6992a = 8L;
                j1Var4.f6993b = bArr;
                bypNotifyActionEvent4.e();
                return;
            case 327:
                com.tencent.mm.autogen.events.BypNotifyActionEvent bypNotifyActionEvent5 = new com.tencent.mm.autogen.events.BypNotifyActionEvent();
                am.j1 j1Var5 = bypNotifyActionEvent5.f54019g;
                j1Var5.f6992a = 9L;
                j1Var5.f6993b = bArr;
                bypNotifyActionEvent5.e();
                return;
            case 328:
                com.tencent.mm.autogen.events.BypNotifyActionEvent bypNotifyActionEvent6 = new com.tencent.mm.autogen.events.BypNotifyActionEvent();
                am.j1 j1Var6 = bypNotifyActionEvent6.f54019g;
                j1Var6.f6992a = 11L;
                j1Var6.f6993b = bArr;
                bypNotifyActionEvent6.e();
                return;
            case 3941:
                gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.x());
                return;
            case 6238:
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "do netid request");
                if (t31.a.f415399f.get()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NotifyReceiverCallbackImpl", "netid is requesting ,wait a minute");
                    return;
                } else {
                    gm0.j1.n().f273288b.g(new t31.a());
                    return;
                }
            case 10098:
                com.tencent.mm.sdk.platformtools.o4.L().putBoolean("weaknet_tag", bArr[0] == 1);
                return;
            case 100017:
                o45.oi oiVar = new o45.oi();
                try {
                    if (new com.tencent.mm.modelbase.y2(oiVar, 100017).Zd(100017, bArr, null, 0L)) {
                        c01.d9.e().onSceneEnd(0, 0, "", new com.tencent.mm.modelsimple.k1(oiVar));
                        return;
                    }
                    return;
                } catch (android.os.RemoteException e28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NotifyReceiverCallbackImpl", e28, "", new java.lang.Object[0]);
                    return;
                }
            case 268369923:
                y0Var.a(5000L, "NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ");
                if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                    return;
                }
                java.lang.String str = new java.lang.String(bArr);
                com.tencent.mm.autogen.events.BroadcastEvent broadcastEvent = new com.tencent.mm.autogen.events.BroadcastEvent();
                am.c1 c1Var = broadcastEvent.f54012g;
                c1Var.f6298a = 4;
                c1Var.f6299b = str;
                broadcastEvent.e();
                return;
            default:
                return;
        }
    }
}
