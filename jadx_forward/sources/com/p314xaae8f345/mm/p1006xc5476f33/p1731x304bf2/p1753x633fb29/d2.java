package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f221791a = {103, 97, 109, 101, 99, 101, 110, 116, 101, 114, 0, 3, 22, 10, 15, -11, -45, 1, 114, 101, 100, 100, 111, 116};

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f221792b = {51, 97, 10, 0, 93, 101, 110, 115};

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f221793c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f221794d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f221795e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f221796f;

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d2() {
        /*
            r12 = this;
            r12.<init>()
            r0 = 24
            byte[] r1 = new byte[r0]
            r1 = {x00c6: FILL_ARRAY_DATA , data: [103, 97, 109, 101, 99, 101, 110, 116, 101, 114, 0, 3, 22, 10, 15, -11, -45, 1, 114, 101, 100, 100, 111, 116} // fill-array
            r12.f221791a = r1
            r1 = 8
            byte[] r1 = new byte[r1]
            r1 = {x00d6: FILL_ARRAY_DATA , data: [51, 97, 10, 0, 93, 101, 110, 115} // fill-array
            r12.f221792b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r12.f221793c = r1
            r1 = 0
            r12.f221794d = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r12.f221795e = r2
            r3 = 0
            r12.f221796f = r3
            java.lang.String r4 = "game_redot"
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r4)
            if (r4 != 0) goto L33
            goto Lc4
        L33:
            java.lang.String r5 = "gamecenter.reddot.signatureConfigCount"
            int r5 = r4.o(r5, r1)
            if (r5 > 0) goto L3d
            goto Lc4
        L3d:
            r2.clear()
        L40:
            java.lang.String r6 = "MicroMsg.GameReddotMsgVerify"
            if (r1 >= r5) goto La7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "gamecenter.reddot.signatureConfigItem_%d"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            byte[] r7 = r4.j(r7)
            if (r7 != 0) goto L59
            goto L9e
        L59:
            byte[] r8 = r12.f221791a
            int r9 = r8.length
            if (r9 == r0) goto L5f
            goto L89
        L5f:
            javax.crypto.spec.DESedeKeySpec r9 = new javax.crypto.spec.DESedeKeySpec     // Catch: java.lang.Exception -> L84
            r9.<init>(r8)     // Catch: java.lang.Exception -> L84
            java.lang.String r8 = "DESede"
            javax.crypto.SecretKeyFactory r8 = javax.crypto.SecretKeyFactory.getInstance(r8)     // Catch: java.lang.Exception -> L84
            javax.crypto.SecretKey r8 = r8.generateSecret(r9)     // Catch: java.lang.Exception -> L84
            java.lang.String r9 = "DESede/CBC/PKCS5Padding"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r9)     // Catch: java.lang.Exception -> L84
            javax.crypto.spec.IvParameterSpec r10 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L84
            byte[] r11 = r12.f221792b     // Catch: java.lang.Exception -> L84
            r10.<init>(r11)     // Catch: java.lang.Exception -> L84
            r11 = 2
            r9.init(r11, r8, r10)     // Catch: java.lang.Exception -> L84
            byte[] r7 = r9.doFinal(r7)     // Catch: java.lang.Exception -> L84
            goto L8a
        L84:
            java.lang.String r7 = "gamelog.reddot, verify, decrypt, failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r7)
        L89:
            r7 = r3
        L8a:
            if (r7 == 0) goto L9e
            int r8 = r7.length
            if (r8 != 0) goto L90
            goto L9e
        L90:
            m53.e5 r8 = new m53.e5     // Catch: java.io.IOException -> L99
            r8.<init>()     // Catch: java.io.IOException -> L99
            r8.mo11468x92b714fd(r7)     // Catch: java.io.IOException -> L99
            goto L9f
        L99:
            java.lang.String r7 = "gamelog.reddot, verify, loadConfItem, parse conf failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r7)
        L9e:
            r8 = r3
        L9f:
            if (r8 == 0) goto La4
            r2.add(r8)
        La4:
            int r1 = r1 + 1
            goto L40
        La7:
            int r0 = r2.size()
            if (r0 != 0) goto Lb3
            java.lang.String r0 = "gamelog.reddot, verify, loadSignatureConfig failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0)
            goto Lc4
        Lb3:
            int r0 = r2.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "gamelog.reddot, verify, loadSignatureConfig success, record count:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1, r0)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d2.<init>():void");
    }

    public final void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        java.lang.ref.WeakReference weakReference = this.f221796f;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, delegate is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.j2) this.f221796f.get());
        if (z17) {
            i1Var.u(e1Var);
            return;
        }
        i1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "gamelog.reddot, msg verify signature failed! msgId:%s", e1Var.f68458xd54c6aa5);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().e(e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n1.GAME_REDDOT_EXIT_VERIFY_FAILED);
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, boolean z17) {
        int i17;
        if (e1Var == null) {
            return;
        }
        m53.c4 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.n();
        boolean z18 = false;
        int i18 = n17 != null ? n17.f405136d : 0;
        if (i18 > 2) {
            i18 = 2;
        }
        if (i18 == 0) {
            if (z17) {
                a(true, e1Var);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x0 x0Var = e1Var.Q2;
        if (x0Var == null || (i17 = x0Var.f222047d) == 0) {
            if (z17) {
                a(false, e1Var);
            }
            e(e1Var, 14);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, no verify info, msgId:%s", e1Var.f68458xd54c6aa5);
            return;
        }
        java.util.List list = this.f221795e;
        if (i17 != 0) {
            int i19 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i19 >= arrayList.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, checkSigVer failed! ver:%d, msgId:%s", java.lang.Integer.valueOf(i17), e1Var.f68458xd54c6aa5);
                    break;
                } else {
                    if (((m53.e5) arrayList.get(i19)).f405193f == i17) {
                        z18 = true;
                        break;
                    }
                    i19++;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, msg.verifyInfo.ver is 0");
        }
        if (z18) {
            boolean c17 = c(e1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, checkSignature ret:%b, msgId:%s", java.lang.Boolean.valueOf(c17), e1Var.f68458xd54c6aa5);
            if (z17) {
                a(c17, e1Var);
                return;
            }
            return;
        }
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c2();
        c2Var.f221782a = e1Var;
        c2Var.f221783b = z17;
        ((java.util.ArrayList) this.f221793c).add(c2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, add msg task, msgId:%s", e1Var.f68458xd54c6aa5);
        f();
    }

    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        m53.e5 e5Var;
        java.lang.String str;
        if (e1Var == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x0 x0Var = e1Var.Q2;
        if (x0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, no verify info, msgId:%s", e1Var.f68458xd54c6aa5);
            return false;
        }
        if (x0Var.f222047d == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f222044a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f222045b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f222046c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, verify info error, msgId:%s", e1Var.f68458xd54c6aa5);
            e(e1Var, 18);
            return false;
        }
        int i17 = x0Var.f222047d;
        if (i17 != 0) {
            int i18 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f221795e;
                if (i18 >= arrayList.size()) {
                    break;
                }
                e5Var = (m53.e5) arrayList.get(i18);
                if (i17 == e5Var.f405193f) {
                    break;
                }
                i18++;
            }
        }
        e5Var = null;
        if (e5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, can not find version:%d, msgId:%s", java.lang.Integer.valueOf(x0Var.f222047d), e1Var.f68458xd54c6aa5);
            e(e1Var, 19);
            return false;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(e1Var.f68473xde9f9b4, "sysmsg", null);
        if (d17 == null || d17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, reddot xml parse failed, msgId:%s", e1Var.f68458xd54c6aa5);
            return false;
        }
        java.util.LinkedList linkedList = e5Var.f405191d;
        java.lang.String str2 = e5Var.f405192e;
        java.lang.String str3 = "";
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg." + ((java.lang.String) linkedList.get(i19)));
            java.lang.String replace = str4 == null ? "" : str4.replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "\"").replace("&apos;", "'").replace("&#039;", "'").replace("&#034;", "\"").replace("&amp;", "&");
            if (replace == null) {
                replace = "";
            }
            str3 = str3 + replace + "\n";
        }
        java.lang.String format = java.lang.String.format("%s%s\n%s\n", str3, x0Var.f222045b, x0Var.f222046c);
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            mac.init(new javax.crypto.spec.SecretKeySpec(str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), "HmacSHA256"));
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(mac.doFinal(format.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, HmacSha256, failed");
            str = null;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.b("GameDebugID.ForceSignatureVerifyFail")) {
            str = "debug";
        }
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase(x0Var.f222044a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, msg verify ok! , msgId:%s", e1Var.f68458xd54c6aa5);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, msg verify failed! , msgId:%s", e1Var.f68458xd54c6aa5);
        e(e1Var, 18);
        return false;
    }

    public void d(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, reportSecurityCheck, errType:%d, desc:%s", java.lang.Integer.valueOf(i17), str);
        n53.a.c(1500, 0L, i17, str, 0);
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, int i17) {
        java.lang.String str;
        if (e1Var == null || (str = e1Var.f68458xd54c6aa5) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, reportSecurityCheck, msgId:%s, reason:%d", str, java.lang.Integer.valueOf(i17));
        n53.a.c(1500, 0L, i17, e1Var.f68458xd54c6aa5, 0);
    }

    public void f() {
        if (this.f221794d) {
            return;
        }
        this.f221794d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, requestSignatureConfig start");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new m53.o2();
        lVar.f152198b = new m53.p2();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamemsgpushappsvr/getreddotsignatureconf";
        lVar.f152205i = 15000;
        lVar.f152200d = 15433;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b2(this, new java.lang.ref.WeakReference(this), currentTimeMillis), false);
    }
}
