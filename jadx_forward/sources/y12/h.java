package y12;

/* loaded from: classes12.dex */
public class h implements s25.a {
    public static void G(long j17, ot0.q qVar) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(qVar.f430231q);
        if (u17 == null) {
            java.lang.String str = qVar.f430231q;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMgrImpl", "md5 is null.");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            c21053xdbf1e5f4.f68671x4b6e68b9 = str;
            c21053xdbf1e5f4.f68643xf1b7e6de = qVar.f430179d;
            c21053xdbf1e5f4.f68653x95b20dd4 = 65;
            c21053xdbf1e5f4.f68679x22618426 = (int) qVar.f430215m;
            c21053xdbf1e5f4.f68685x2261e7f9 = 1;
            c21053xdbf1e5f4.f68682x29d3a50c = 8;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9(c21053xdbf1e5f4);
            u17 = c21053xdbf1e5f4;
        }
        T(u17.f68671x4b6e68b9, 0, 0);
        zq.h.f556505a.f(u17, true, new y12.g(u17.f68671x4b6e68b9));
    }

    public static void T(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5171x6c1e5751 c5171x6c1e5751 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5171x6c1e5751();
        am.a0 a0Var = c5171x6c1e5751.f135520g;
        a0Var.f87643a = str;
        a0Var.f87645c = i18;
        a0Var.f87644b = i17;
        c5171x6c1e5751.e();
    }

    public static void X(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (str.equals("-1")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(str);
        if (u17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
            return;
        }
        qk.u uVar = new qk.u(str, u17);
        if (str2 != null) {
            uVar.f445538g = str2;
        } else {
            java.lang.String str7 = u17.f68643xf1b7e6de;
            if (str7 == null) {
                str7 = "";
            }
            uVar.f445538g = str7;
        }
        if (str3 == null) {
            str3 = "";
        }
        uVar.f445539h = str3;
        uVar.f445541j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1(java.lang.Long.valueOf(j17));
        uVar.f445542k = str5 == null ? "" : str5;
        if (str4 == null) {
            str4 = "";
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str4)) {
            str4 = c01.w9.s(str5);
            if (str6 == null) {
                str6 = "";
            }
            uVar.f445544m = str6;
        }
        uVar.f445540i = str4 != null ? str4 : "";
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMgrImpl", "emoticon liteapp service not found");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(context, uVar);
        }
    }

    @Override // s25.b
    public java.lang.String A() {
        y12.j.e().getClass();
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EmotionPanelConfigName");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ? (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEW_PANEL_NAME_STRING, "emojipanel-config.xml") : d17;
    }

    public java.util.ArrayList B(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z4 Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Bi();
        if (!Bi.f277925a) {
            Bi.g();
        }
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (!Bi.f277925a) {
            Bi.g();
        }
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(str) > 32) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "input text over checkout limit.");
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && Bi.f277930f != null) {
            java.lang.String i17 = Bi.i(str);
            java.util.HashMap hashMap = Bi.f277929e;
            if (hashMap.containsKey(i17)) {
                java.util.List list = (java.util.List) Bi.f277928d.get((java.lang.String) hashMap.get(i17));
                if (list != null) {
                    arrayList3.addAll(list);
                }
            } else {
                arrayList3.add(i17);
            }
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            java.util.ArrayList arrayList4 = (java.util.ArrayList) Bi.f277930f.get((java.lang.String) it.next());
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList.addAll(arrayList4);
            }
        }
        java.lang.String i18 = Bi.i(str);
        if (Bi.f(i18)) {
            synchronized (Bi) {
                for (java.util.Map.Entry entry : Bi.f277931g.entrySet()) {
                    if (((java.lang.String) entry.getKey()).contains(i18)) {
                        arrayList.addAll((java.util.Collection) entry.getValue());
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "changeText: %s, %s", java.lang.Integer.valueOf(arrayList3.size()), java.lang.Integer.valueOf(arrayList.size()));
        if (!arrayList.isEmpty()) {
            try {
                java.util.Collections.sort(arrayList, Bi.f277933i);
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiDescNewMgr", e17, "failed to sort emojis", new java.lang.Object[0]);
            }
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                arrayList2.add(((com.p314xaae8f345.mm.p2621x8fb0427b.c5) arrayList.get(i19)).f275345a);
            }
        }
        java.lang.System.currentTimeMillis();
        return arrayList2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:209|210|211|(5:213|214|215|216|217)|222|214|215|216|217) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ae, code lost:
    
        if (r10 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01d9, code lost:
    
        if (r9.size() <= 0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01db, code lost:
    
        r0 = r9.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01e0, code lost:
    
        if (r10 >= r0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e2, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCommandMgr", "i:%d group info:%s", java.lang.Integer.valueOf(r10), ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) r9.get(r10)).m77991x9616526c());
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fc, code lost:
    
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        r9 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo78085xb5882a6b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0211, code lost:
    
        if (r9 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0238, code lost:
    
        if (r9 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0248, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCommandMgr", "end dump emoji db info:");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0245, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0217, code lost:
    
        if (r9.moveToFirst() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0219, code lost:
    
        r0 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        r0.mo9015xbf5d97fd(r9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCommandMgr", "emoji info:%s", r0.m77996x9616526c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0232, code lost:
    
        if (r9.moveToNext() != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0243, code lost:
    
        if (r9 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0235, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0236, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x023c, code lost:
    
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023e, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0241, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0242, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x023b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01d2, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0198, code lost:
    
        if (r10.moveToFirst() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x019a, code lost:
    
        r0 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247();
        r0.mo9015xbf5d97fd(r10);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01a9, code lost:
    
        if (r10.moveToNext() != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01d0, code lost:
    
        if (r10 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0374, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0375, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCommandMgr", "storeunique make failed " + r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 2113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y12.h.C(java.lang.String):void");
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 D(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        return com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().b1(str, str2, i17, i18, i19, str3, str4, str5, str6, 1);
    }

    public byte[] E(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N;
        int i17;
        if (c21053xdbf1e5f4 != null && (N = N(c21053xdbf1e5f4.f68671x4b6e68b9)) != null && (i17 = N.f68678x13320507) != c21053xdbf1e5f4.f68678x13320507) {
            c21053xdbf1e5f4.f68678x13320507 = i17;
        }
        byte[] c17 = wq.a.f().c(c21053xdbf1e5f4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(c17)) {
            return c17;
        }
        byte[] m64995x4dcf8e25 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64995x4dcf8e25(c17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(m64995x4dcf8e25)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiMgrImpl", "decodeAsGif: wxam to gif error");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMgrImpl", "decodeAsGif: %s, %s", java.lang.Integer.valueOf(c17.length), java.lang.Integer.valueOf(m64995x4dcf8e25.length));
        }
        return m64995x4dcf8e25;
    }

    public void F(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMgrImpl", "deleteCaptureEmoji md: " + str);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().f1(str);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo145247xf35bbb4("delete_emoji_info_notify");
    }

    public boolean H(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        if (z65.c.a()) {
            return true;
        }
        return (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ShowEmoticonCameraEntrance", 3) & 2) > 0;
    }

    public java.lang.String I(android.content.Context context, java.lang.String str) {
        int k17;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f179066a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str)) <= 0) {
            return null;
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, k17);
        java.lang.String g17 = kk.k.g(N);
        if (g17 == null && N == null) {
            return g17;
        }
        com.p314xaae8f345.mm.vfs.w6.S(n22.m.g() + g17, N, 0, N.length);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.d(N)) {
            z85.l c17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c();
            l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            c17.W0(g17, "", 65, 2, N.length, null, "", "");
            return g17;
        }
        z85.l c18 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c();
        l75.e0 e0Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
        c18.W0(g17, "", 65, 1, N.length, null, "", "");
        return g17;
    }

    public java.lang.String J(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str) {
        int k17;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f179066a;
        if (c11286x34a5504.m48467xfb85f7b0() != 8) {
            return null;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984 c11276x643df984 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984) c11286x34a5504.f33122xe4128443;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c11276x643df984.f33076x647d5110)) {
            byte[] bArr = c11276x643df984.f33076x647d5110;
            int length = bArr.length;
            java.lang.String g17 = kk.k.g(bArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.s(context, c11286x34a5504.f33128x4f3b3aa0, g17, c11276x643df984.f33076x647d5110, str);
            return g17;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11276x643df984.f33077x6482c58b) || (k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(c11276x643df984.f33077x6482c58b)) <= 0) {
            return null;
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(c11276x643df984.f33077x6482c58b, 0, k17);
        java.lang.String g18 = kk.k.g(N);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.s(context, c11286x34a5504.f33128x4f3b3aa0, g18, N, str);
        return g18;
    }

    public f21.g K() {
        return y12.j.e().d();
    }

    public int L(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, boolean z17) {
        java.lang.String str;
        return z17 || (c21053xdbf1e5f4 != null && (str = c21053xdbf1e5f4.f68641x3342accf) != null && str.startsWith("Selfie:")) ? ip.c.a() : ip.c.b();
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 M(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        return com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(f9Var.z0());
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N(java.lang.String str) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        return com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(str);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.g5 O(java.lang.String str, java.lang.String str2) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiMgrImpl", "get from xml, but attrs is null");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.g5 a17 = com.p314xaae8f345.mm.p2621x8fb0427b.g5.a(d17, str2, str, "");
        if (a17 != null) {
            return a17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiMgrImpl", "parserEmojiXml error " + str);
        return null;
    }

    public java.lang.String P(java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f179066a;
        if (!android.text.TextUtils.isEmpty(str)) {
            if (str.startsWith("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/emoticonstore/")) {
                return str.substring(str.lastIndexOf("/") + 1);
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r11.moveToFirst() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df();
        r0.mo9015xbf5d97fd(r11);
        r0.f67255x4a55a2ce = -1;
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r11.moveToNext() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r11 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r11 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList Q() {
        /*
            r12 = this;
            java.lang.Class<com.tencent.mm.feature.emoji.b0> r0 = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.feature.emoji.b0 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) r0
            r0.getClass()
            com.tencent.mm.storage.n5 r0 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f()
            boolean[] r1 = r0.f276696a
            monitor-enter(r1)
            z85.b0 r0 = r0.f276706k     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r5 = "flag=?"
            java.lang.String r2 = "0"
            java.lang.String[] r6 = new java.lang.String[]{r2}
            r11 = 0
            l75.k0 r2 = r0.f552319d     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r3 = "SmileyInfo"
            java.lang.String[] r4 = z85.b0.f552318f     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r11 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r11 == 0) goto L50
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r0 == 0) goto L50
        L3c:
            com.tencent.mm.storage.emotion.SmileyInfo r0 = new com.tencent.mm.storage.emotion.SmileyInfo     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.mo9015xbf5d97fd(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r2 = -1
            r0.f67255x4a55a2ce = r2     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r1.add(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r0 = r11.moveToNext()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r0 != 0) goto L3c
        L50:
            if (r11 == 0) goto L66
            goto L63
        L53:
            r0 = move-exception
            goto L67
        L55:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.emoji.NewSmileyInfoStorage"
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r0)     // Catch: java.lang.Throwable -> L53
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L66
        L63:
            r11.close()
        L66:
            return r1
        L67:
            if (r11 == 0) goto L6c
            r11.close()
        L6c:
            throw r0
        L6d:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y12.h.Q():java.util.ArrayList");
    }

    public java.lang.String R() {
        return "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0";
    }

    public boolean S(java.lang.String str) {
        if (str != null && str.equals("capture")) {
            return true;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        return com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().D0(str);
    }

    public boolean U(android.content.Context context, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, int i17, java.lang.String str) {
        return V(context, interfaceC4987x84e327cb, i17, str, -1, true, false, false, null, null, null, false);
    }

    public boolean V(android.content.Context context, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, int i17, java.lang.String str, int i18, boolean z17, boolean z18, boolean z19, java.lang.String str2, java.util.ArrayList arrayList, java.lang.String str3, boolean z27) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. context is null");
            return false;
        }
        if (interfaceC4987x84e327cb == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. emoji is null");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.class);
        intent.putExtra("extra_id", interfaceC4987x84e327cb.mo42933xb5885648());
        intent.putExtra("extra_scence", i17);
        intent.putExtra("extra_move_to_top", z17);
        intent.putExtra("extra_username", str);
        intent.putExtra("extra_current", z18);
        intent.putExtra("key_is_selfie", z19);
        intent.putExtra("key_attached_text", str2);
        intent.putExtra("key_attached_emoji_md5", arrayList);
        intent.putExtra("key_imitate_md5", str3);
        intent.putExtra("hide_added_toast", z27);
        intent.addFlags(65536);
        if (i18 <= 0 || !(context instanceof android.app.Activity)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiMgrImpl", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/api/IEmojiInfo;ILjava/lang/String;IZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/emoji/mgr/EmojiMgrImpl", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/api/IEmojiInfo;ILjava/lang/String;IZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiMgrImpl", "saveCustomEmoji", "(Landroid/content/Context;Lcom/tencent/mm/api/IEmojiInfo;ILjava/lang/String;IZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Z)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean W(android.content.Context r10, java.lang.String r11, java.lang.String r12, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 r13, int r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y12.h.W(android.content.Context, java.lang.String, java.lang.String, com.tencent.mm.plugin.msg.MsgIdTalker, int):boolean");
    }

    public void Y(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r15.b bVar, int i17) {
        if (c21053xdbf1e5f4 == null && f9Var == null) {
            return;
        }
        if (c21053xdbf1e5f4 == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            c21053xdbf1e5f4 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(f9Var.z0());
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = c21053xdbf1e5f4;
        boolean K3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(str);
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g;
        if (K3) {
            ((g30.e) i95.n0.c(g30.e.class)).Ai(str, c21053xdbf1e5f42, f9Var, c16564xb55e1d5);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).mj(str, c21053xdbf1e5f42, f9Var, c16564xb55e1d5, bVar, i17);
        }
    }

    @Override // s25.b
    public void a() {
        z85.f0 f0Var;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
        synchronized (f17.f276696a) {
            f0Var = f17.f276709n;
        }
        java.util.List m07 = f0Var.m0();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = ((java.util.ArrayList) m07).iterator();
        while (it.hasNext()) {
            z85.e0 e0Var = (z85.e0) it.next();
            if (e0Var.a() != null) {
                jSONArray.put(e0Var.a());
                if (jSONArray.length() >= 9) {
                    break;
                }
            }
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_SMILEY_STRING, jSONArray.toString());
    }

    @Override // s25.b
    public void b(l75.q0 q0Var) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().add(q0Var);
    }

    @Override // s25.b
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = N(str);
        if (N != null) {
            qr.a0.f447532a.a(N);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiMgrImpl", "addCaptureEmojiUploadTask: emojiInfo null by md5 %s", str);
        }
    }

    @Override // s25.b
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 d(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        if (n22.m.l(c21053xdbf1e5f4)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            android.database.Cursor S1 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().S1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(c21053xdbf1e5f4.j(), 0));
            if (S1 != null && S1.getCount() > 1) {
                int R = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(S1.getCount() - 1, 0);
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                S1.moveToPosition(R);
                c21053xdbf1e5f42.mo9015xbf5d97fd(S1);
                c21053xdbf1e5f4 = c21053xdbf1e5f42;
            }
            if (S1 != null) {
                S1.close();
            }
        }
        return c21053xdbf1e5f4;
    }

    @Override // s25.b
    public boolean e() {
        return gr.z.b();
    }

    @Override // s25.b
    public void f(l75.q0 q0Var) {
        if (((km0.c) gm0.j1.p().a()).a()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().add(q0Var);
        }
    }

    @Override // s25.b
    public void g(java.lang.String str) {
        z85.f0 f0Var;
        z85.e0 e0Var;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
        synchronized (f17.f276696a) {
            f0Var = f17.f276709n;
        }
        f0Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        synchronized (f0Var.f552329d) {
            int i17 = 0;
            while (true) {
                if (i17 >= f0Var.f552329d.size()) {
                    e0Var = null;
                    i17 = -1;
                    break;
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((z85.e0) f0Var.f552329d.get(i17)).f552326a, str)) {
                        e0Var = (z85.e0) f0Var.f552329d.get(i17);
                        break;
                    }
                    i17++;
                }
            }
            if (e0Var == null) {
                e0Var = new z85.e0();
                e0Var.f552326a = str;
            } else {
                f0Var.f552329d.remove(i17);
            }
            e0Var.f552327b++;
            e0Var.f552328c = java.lang.System.currentTimeMillis();
            f0Var.f552329d.add(0, e0Var);
            if (f0Var.f552329d.size() > 9) {
                f0Var.f552329d.remove(r9.size() - 1);
            }
        }
        f0Var.mo142179xf35bbb4("event_update_recent", 0, java.lang.Integer.valueOf(f0Var.f552329d.size()));
    }

    @Override // s25.b
    public boolean h() {
        return gr.z.c();
    }

    @Override // s25.b
    public void i(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        c21053xdbf1e5f4.f68663x861009b5 = "capture";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c21053xdbf1e5f4.mo42933xb5885648());
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().y2(1, arrayList);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(c21053xdbf1e5f4);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5 c5326x794c50e5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5();
        c5326x794c50e5.f135638g.f89332a = 2;
        c5326x794c50e5.e();
        if (c5326x794c50e5.f135639h.f89402a) {
            return;
        }
        r45.x66 D0 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().e().D0();
        if (D0 != null) {
            java.util.Iterator it = D0.f471367d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.y66 y66Var = (r45.y66) it.next();
                if (y66Var.f472360d.equals("capture")) {
                    y66Var.f472361e = 0;
                    break;
                }
            }
        }
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().e().L0(D0);
        h65.c.f360853b.a(-29414086, "capture");
    }

    @Override // s25.b
    public java.util.List j() {
        z85.f0 f0Var;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
        synchronized (f17.f276696a) {
            f0Var = f17.f276709n;
        }
        return f0Var.m0();
    }

    @Override // s25.b
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 k(java.lang.String str) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().f276712q.y0(str);
    }

    @Override // s25.b
    public java.lang.Object l(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, java.lang.Object obj) {
        return gm0.j1.u().c().m(u3Var, obj);
    }

    @Override // s25.b
    public void m(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(c21053xdbf1e5f4);
    }

    @Override // s25.b
    public boolean n(java.lang.String str) {
        try {
            int[] iArr = new com.p314xaae8f345.mm.p1006xc5476f33.gif.o(str).f223712a;
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
            if ((k17 == 0 || k17 <= ip.c.a()) && iArr[0] <= ip.c.c()) {
                return iArr[1] <= ip.c.c();
            }
            return false;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMgrImpl", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return false;
        }
    }

    @Override // s25.b
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 o(java.lang.String str, int i17, int i18, int i19) {
        return D(str, "", i17, i18, i19, null, null, null, "");
    }

    @Override // s25.b
    /* renamed from: onDestroy */
    public void mo132987xac79a11b() {
    }

    @Override // s25.b
    public boolean p() {
        if (z65.c.a()) {
            return true;
        }
        return (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ShowEmoticonCameraEntrance", 3) & 1) > 0;
    }

    @Override // s25.b
    public void q(l75.q0 q0Var) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo49775xc84af884(q0Var);
    }

    @Override // s25.b
    public boolean r(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, int i17, int i18, boolean z17, boolean z18, java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2) {
        return V(context, c21053xdbf1e5f4, i17, null, i18, z17, true, z18, str, arrayList, str2, false);
    }

    @Override // s25.b
    public boolean s(java.lang.String str) {
        try {
            int[] iArr = new com.p314xaae8f345.mm.p1006xc5476f33.gif.o(str).f223712a;
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
            if ((k17 == 0 || k17 <= ip.c.e()) && iArr[0] <= ip.c.c()) {
                return iArr[1] <= ip.c.c();
            }
            return false;
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMgrImpl", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            return false;
        }
    }

    @Override // s25.b
    public void t(l75.q0 q0Var) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().mo49775xc84af884(q0Var);
    }

    @Override // s25.b
    public void u(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, java.lang.Object obj) {
        gm0.j1.u().c().x(u3Var, obj);
    }

    @Override // s25.b
    public java.lang.String v(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Bi().c(str);
    }

    @Override // s25.b
    public java.lang.String w() {
        return gm0.j1.u().d();
    }

    @Override // s25.b
    public boolean x() {
        boolean z17 = !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_CAPTURE_TAB_RED_DOT_BOOLEAN, true);
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_spring_festival, 0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EmotionSpringFestivalPendantSwitch", 0);
        return z17;
    }

    @Override // s25.b
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 y(java.lang.String str) {
        return N(str);
    }

    @Override // s25.b
    public byte[] z(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N;
        int i17;
        if (c21053xdbf1e5f4 != null && (N = N(c21053xdbf1e5f4.f68671x4b6e68b9)) != null && (i17 = N.f68678x13320507) != c21053xdbf1e5f4.f68678x13320507) {
            c21053xdbf1e5f4.f68678x13320507 = i17;
        }
        return wq.a.f().c(c21053xdbf1e5f4);
    }
}
