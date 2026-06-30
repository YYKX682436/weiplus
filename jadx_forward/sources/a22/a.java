package a22;

/* loaded from: classes12.dex */
public class a implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        long j17;
        r45.j4 j4Var = p0Var.f152259a;
        int i17 = j4Var.f459093g;
        if (i17 != 10002) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "not new xml type:%d ", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "msg content is null");
            return;
        }
        java.util.ArrayList arrayList = null;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 == null || d17.size() <= 0) {
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "empty type");
            return;
        }
        boolean equalsIgnoreCase = str.equalsIgnoreCase("EmojiBackup");
        ot5.h hVar = ot5.h.f430410a;
        if (equalsIgnoreCase) {
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".sysmsg.EmojiBackup.OpCode"), 0);
            if (hVar.a((java.lang.String) d17.get(".sysmsg.EmojiBackup.DeviceID"), wo.w0.k(), "EmojiBackup", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
                return;
            }
            java.util.ArrayList a17 = a22.c.a(g17);
            if (D1 == 1) {
                if (a17 == null || a17.size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. buckupList:%d", java.lang.Integer.valueOf(a17.size()));
                    b(0, a17);
                    return;
                }
            }
            if (D1 != 2) {
                if (D1 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "set batch emoji download time to 0. ");
                    new pr.t(0, null, false).a();
                    return;
                }
                return;
            }
            if (a17 == null || a17.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (a17.size() > 0) {
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    r45.ri0 ri0Var = (r45.ri0) it.next();
                    if (ri0Var != null) {
                        arrayList2.add(ri0Var.f466419d);
                    }
                }
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().k1(arrayList2);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN, java.lang.Boolean.FALSE);
            return;
        }
        if (!str.equalsIgnoreCase("EmotionBackup")) {
            if (!str.equalsIgnoreCase("SelfieEmojiBackup")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "not emoji message type :".concat(str));
                return;
            }
            if (hVar.a((java.lang.String) d17.get(".sysmsg.SelfieEmojiBackup.DeviceID"), wo.w0.k(), "SelfieEmojiBackup", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
                return;
            }
            int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".sysmsg.SelfieEmojiBackup.OpCode"), 0);
            java.util.ArrayList a18 = a22.c.a(g17);
            if (a18 == null || a18.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: empty list opCode %s", java.lang.Integer.valueOf(D12));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: opCode %s, size %s", java.lang.Integer.valueOf(D12), java.lang.Integer.valueOf(a18.size()));
            if (D12 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: add capture %s", java.lang.Integer.valueOf(a18.size()));
                b(1, a18);
                return;
            }
            if (D12 != 2) {
                if (D12 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: move to top %s ", java.lang.Integer.valueOf(a18.size()));
                    new pr.t(1, null, false).a();
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "back up capture: delete capture %s", java.lang.Integer.valueOf(a18.size()));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = a18.iterator();
            while (it6.hasNext()) {
                r45.ri0 ri0Var2 = (r45.ri0) it6.next();
                if (ri0Var2 != null) {
                    arrayList3.add(ri0Var2.f466419d);
                }
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().i1(arrayList3);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN, java.lang.Boolean.FALSE);
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.EmotionBackup.OpCode"), 0);
        if (hVar.a((java.lang.String) d17.get(".sysmsg.EmotionBackup.DeviceID"), wo.w0.k(), "EmotionBackup", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "same devices operate ignore.");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiBackupXMLParser", "[backup emotion parser] parse xml faild. xml is null.");
        } else {
            try {
                org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(g17.getBytes())));
                parse.normalize();
                org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("ProductID");
                if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    int length = elementsByTagName.getLength();
                    for (int i18 = 0; i18 < length; i18++) {
                        arrayList4.add(elementsByTagName.item(i18).getTextContent());
                    }
                    arrayList = arrayList4;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBackupXMLParser", "[parser] parseXML exception:%s", e17.toString());
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "xml syn list is null.");
            return;
        }
        if (P == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. add buckupList:%d", java.lang.Integer.valueOf(arrayList.size()));
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                arrayList5.add(new b22.a((java.lang.String) arrayList.get(i19)));
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.b(arrayList5);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.f();
            return;
        }
        if (P == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBackupSysCmdMsgListener", "try to sync emoji from newxml. delete buckupList:%d", java.lang.Integer.valueOf(arrayList.size()));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            z85.d b17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b();
            l75.k0 k0Var = b17.f552321d;
            if (k0Var != null) {
                j17 = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround deleteByGroupIdList in a transaction, ticket = %d", java.lang.Long.valueOf(j17));
            } else {
                j17 = -1;
            }
            if (arrayList.size() > 0) {
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    b17.L0((java.lang.String) it7.next());
                }
            }
            if (k0Var != null) {
                k0Var.w(java.lang.Long.valueOf(j17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end deleteByGroupIdList transaction");
            }
        }
    }

    public final void b(int i17, java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r45.ri0 ri0Var = (r45.ri0) it.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(ri0Var.f466419d);
            if (u17 == null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                n22.m.a(ri0Var, c21053xdbf1e5f4);
                if (i17 == 1) {
                    c21053xdbf1e5f4.f68663x861009b5 = "capture";
                } else {
                    c21053xdbf1e5f4.f68653x95b20dd4 = 81;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9(c21053xdbf1e5f4);
            } else {
                if (i17 == 1) {
                    u17.f68663x861009b5 = "capture";
                } else {
                    l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
                    u17.f68653x95b20dd4 = 81;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(u17);
            }
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
