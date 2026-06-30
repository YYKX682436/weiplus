package aq1;

/* loaded from: classes12.dex */
public class y0 implements a25.r {
    @Override // a25.r
    public void g(com.p314xaae8f345.mm.p642xad8b531f.y0 y0Var, int i17, byte[] bArr, byte[] bArr2, r45.cx4 cx4Var) {
        switch (i17) {
            case 10:
                o45.jh jhVar = new o45.jh();
                jhVar.f424504c = wo.w0.k();
                try {
                    if (new com.p314xaae8f345.mm.p944x882e457a.y2(jhVar, 10).Zd(10, bArr, null, 0L)) {
                        c01.d9.e().mo815x76e0bfae(0, 0, "", new com.p314xaae8f345.mm.p957x53236a1b.g0(jhVar));
                        return;
                    }
                    return;
                } catch (android.os.RemoteException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NotifyReceiverCallbackImpl", e17, "", new java.lang.Object[0]);
                    return;
                }
            case 102:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify MM_VOIP_CS_PUSHTYPE_SYN do VoipSync");
                return;
            case 120:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "voipInviteInspect notify");
                y0Var.a(5000L, "NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
                c6154xe47ae2d0.f136416g.f89116a = true;
                c6154xe47ae2d0.e();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6154xe47ae2d0.f136417h.f89204a)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d02 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
                    c6154xe47ae2d02.f136416g.f89117b = true;
                    c6154xe47ae2d02.e();
                }
                if (bArr == null || bArr.length <= 0) {
                    return;
                }
                byte b17 = bArr[0];
                if (b17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "voipInviteInspect publish event");
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                    am.y00 y00Var = c6231x4f3054ba.f136478g;
                    y00Var.f89948b = 3;
                    y00Var.f89949c = bArr;
                    com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.d(c6231x4f3054ba, true);
                    return;
                }
                if (b17 == 101) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5646xf9912267 c5646xf9912267 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5646xf9912267();
                    c5646xf9912267.f135973g.f89153a = bArr;
                    c5646xf9912267.e();
                    return;
                }
                if (b17 == 3) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                    am.y00 y00Var2 = c6231x4f3054ba2.f136478g;
                    y00Var2.f89948b = 9;
                    y00Var2.f89949c = bArr;
                    c6231x4f3054ba2.e();
                    return;
                }
                if (b17 == 2) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                    am.y00 y00Var3 = c6231x4f3054ba3.f136478g;
                    y00Var3.f89948b = 10;
                    y00Var3.f89949c = bArr;
                    c6231x4f3054ba3.e();
                    return;
                }
                if (b17 == 110) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                    am.y00 y00Var4 = c6231x4f3054ba4.f136478g;
                    y00Var4.f89948b = 12;
                    y00Var4.f89949c = bArr;
                    com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.d(c6231x4f3054ba4, true);
                    return;
                }
                return;
            case 174:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify MMFunc_VoipSync do VoipSync");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                am.y00 y00Var5 = c6231x4f3054ba5.f136478g;
                y00Var5.f89948b = 6;
                y00Var5.f89949c = bArr;
                c6231x4f3054ba5.e();
                return;
            case 192:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5428xa84a8ad6 c5428xa84a8ad6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5428xa84a8ad6();
                c5428xa84a8ad6.f135772g.f89717a = bArr;
                c5428xa84a8ad6.e();
                return;
            case 241:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "jacks do voice notify UI");
                if (bArr.length < 8) {
                    return;
                }
                byte[] bArr3 = new byte[4];
                byte[] bArr4 = new byte[4];
                java.lang.System.arraycopy(bArr, 0, bArr3, 0, 4);
                java.lang.System.arraycopy(bArr, 4, bArr4, 0, 4);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5749x1a41b43c c5749x1a41b43c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5749x1a41b43c();
                int a17 = kk.u.a(bArr3, 0);
                am.il ilVar = c5749x1a41b43c.f136070g;
                ilVar.f88491a = a17;
                ilVar.f88492b = kk.u.a(bArr4, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "notifyId: %d, sequence: %d", java.lang.Integer.valueOf(ilVar.f88491a), java.lang.Integer.valueOf(ilVar.f88492b));
                c5749x1a41b43c.e();
                return;
            case zc1.b.f77555x366c91de /* 271 */:
                r45.zc6 zc6Var = new r45.zc6();
                try {
                    zc6Var.mo11468x92b714fd(bArr);
                    gm0.j1.n().f354821b.g(new c41.a(zc6Var.f473443d, zc6Var.f473447h, zc6Var.f473448i, zc6Var.f473449m, zc6Var.f473450n, zc6Var.f473452p, zc6Var.f473451o, zc6Var.f473444e));
                    return;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyReceiverCallbackImpl", "speed test parse data failed. e: " + e18.getMessage());
                    return;
                }
            case qf1.f.f76475x366c91de /* 318 */:
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY notify respBuf len[%d]", objArr);
                jx3.f.INSTANCE.mo68477x336bdfd8(403L, 38L, 1L, false);
                byte[] bArr5 = null;
                if (bArr != null) {
                    r45.fy5 fy5Var = new r45.fy5();
                    try {
                        fy5Var.mo11468x92b714fd(bArr);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData[%d, %d, %d, %d, %d, %d]", java.lang.Integer.valueOf(fy5Var.f456264d), java.lang.Integer.valueOf(fy5Var.f456265e), java.lang.Integer.valueOf(fy5Var.f456266f), java.lang.Integer.valueOf(fy5Var.f456267g), java.lang.Integer.valueOf(fy5Var.f456268h), java.lang.Integer.valueOf(fy5Var.f456269i));
                        int i18 = fy5Var.f456264d;
                        if (i18 == 13) {
                            gm0.j1.i();
                            byte[] c17 = gm0.j1.n().c(3);
                            bArr5 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46285x1906568c(c17, fy5Var.f456271n.f273689a);
                            java.lang.Object[] objArr2 = new java.lang.Object[2];
                            objArr2[0] = java.lang.Integer.valueOf(c17 == null ? -1 : c17.length);
                            if (bArr5 != null) {
                                r11 = bArr5.length;
                            }
                            objArr2[1] = java.lang.Integer.valueOf(r11);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY AES_GCM_ENCRYPT serverSession[%s] data[%s]", objArr2);
                        } else {
                            bArr5 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75983x2e40f778(bArr2, i18, fy5Var.f456265e, fy5Var.f456266f, fy5Var.f456267g, fy5Var.f456268h, fy5Var.f456269i, fy5Var.f456270m, fy5Var.f456271n.f273689a);
                        }
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData parseFrom e: " + e19.getMessage());
                        jx3.f.INSTANCE.mo68477x336bdfd8(403L, 39L, 1L, false);
                    }
                }
                if (bArr5 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY data is null");
                    jx3.f.INSTANCE.mo68477x336bdfd8(403L, 40L, 1L, false);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY data len:%d", java.lang.Integer.valueOf(bArr5.length));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190 c6029xbb3f0190 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190();
                    c6029xbb3f0190.f136319g.f89671a = bArr5;
                    c6029xbb3f0190.e();
                    return;
                }
            case 319:
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                objArr3[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_BYP_NOTIFY notify respBuf len[%d]", objArr3);
                if (bArr != null) {
                    r45.nr nrVar = new r45.nr();
                    try {
                        nrVar.mo11468x92b714fd(bArr);
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5220x4ef22038 c5220x4ef22038 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5220x4ef22038();
                        c5220x4ef22038.f135553g.f88648a = nrVar;
                        c5220x4ef22038.e();
                        return;
                    } catch (java.lang.Exception e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_BYP_NOTIFY secureData parseFrom e: " + e27.getMessage());
                        return;
                    }
                }
                return;
            case com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e /* 320 */:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "MM_PKT_BYP_NOTIFY_ACTION_EVENT_BYPASS_SYNC received");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 c5219x1606f522 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522();
                am.j1 j1Var = c5219x1606f522.f135552g;
                j1Var.f88525a = 2L;
                j1Var.f88526b = bArr;
                c5219x1606f522.e();
                return;
            case 322:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 c5219x1606f5222 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522();
                am.j1 j1Var2 = c5219x1606f5222.f135552g;
                j1Var2.f88525a = 4L;
                j1Var2.f88526b = bArr;
                c5219x1606f5222.e();
                return;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe.f35014x366c91de /* 323 */:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 c5219x1606f5223 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522();
                am.j1 j1Var3 = c5219x1606f5223.f135552g;
                j1Var3.f88525a = 7L;
                j1Var3.f88526b = bArr;
                c5219x1606f5223.e();
                return;
            case 326:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 c5219x1606f5224 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522();
                am.j1 j1Var4 = c5219x1606f5224.f135552g;
                j1Var4.f88525a = 8L;
                j1Var4.f88526b = bArr;
                c5219x1606f5224.e();
                return;
            case 327:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 c5219x1606f5225 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522();
                am.j1 j1Var5 = c5219x1606f5225.f135552g;
                j1Var5.f88525a = 9L;
                j1Var5.f88526b = bArr;
                c5219x1606f5225.e();
                return;
            case 328:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 c5219x1606f5226 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522();
                am.j1 j1Var6 = c5219x1606f5226.f135552g;
                j1Var6.f88525a = 11L;
                j1Var6.f88526b = bArr;
                c5219x1606f5226.e();
                return;
            case 3941:
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.x());
                return;
            case 6238:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiverCallbackImpl", "do netid request");
                if (t31.a.f496932f.get()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotifyReceiverCallbackImpl", "netid is requesting ,wait a minute");
                    return;
                } else {
                    gm0.j1.n().f354821b.g(new t31.a());
                    return;
                }
            case 10098:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("weaknet_tag", bArr[0] == 1);
                return;
            case 100017:
                o45.oi oiVar = new o45.oi();
                try {
                    if (new com.p314xaae8f345.mm.p944x882e457a.y2(oiVar, 100017).Zd(100017, bArr, null, 0L)) {
                        c01.d9.e().mo815x76e0bfae(0, 0, "", new com.p314xaae8f345.mm.p957x53236a1b.k1(oiVar));
                        return;
                    }
                    return;
                } catch (android.os.RemoteException e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NotifyReceiverCallbackImpl", e28, "", new java.lang.Object[0]);
                    return;
                }
            case 268369923:
                y0Var.a(5000L, "NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                    return;
                }
                java.lang.String str = new java.lang.String(bArr);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679 c5206xdf10b679 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679();
                am.c1 c1Var = c5206xdf10b679.f135545g;
                c1Var.f87831a = 4;
                c1Var.f87832b = str;
                c5206xdf10b679.e();
                return;
            default:
                return;
        }
    }
}
