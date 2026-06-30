package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class q0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f274869d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f274870e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f274871f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f274872g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f274873h;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2614xca6eae71.g0 f274874a = new com.p314xaae8f345.mm.p2614xca6eae71.g0();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2614xca6eae71.k0 f274875b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f274876c;

    static {
        java.lang.String str = lp0.b.X() + "app_font";
        f274870e = str;
        f274871f = str + "/color_emoji_new";
        f274872g = str + "/color_emoji";
        f274873h = jz5.h.b(com.p314xaae8f345.mm.p2614xca6eae71.h0.f274798d);
    }

    public q0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final com.p314xaae8f345.mm.p2614xca6eae71.q0 g() {
        return com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a;
    }

    public final void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f274870e);
        if (r6Var.A()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String str2 = f274871f;
        com.p314xaae8f345.mm.vfs.w6.c(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiResProcessor", "copyColorEmojiFile from " + str + " to " + str2 + ", tryReCheck=[" + z17 + ']');
        if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiResProcessor", "copyColorEmojiFile: try checkEntireCurrentEmojiFile");
            java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(37, 8);
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Ni, p17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiResProcessor", "checkEntireCurrentEmojiFile: md5 match success");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiResProcessor", "checkEntireCurrentEmojiFile: md5 match failed, originMd5:" + Ni + ", currentMd5:" + p17);
            a(((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(37, 8), false);
        }
    }

    public final void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f274870e);
        if (r6Var.A()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.p314xaae8f345.mm.vfs.w6.c("assets:///color_emoji", f274872g);
        this.f274876c = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiResProcessor", "copyOldColorEmojiFileFromAsset from asset. use time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public final com.p314xaae8f345.mm.p2614xca6eae71.k0 c(java.io.DataInputStream dis) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dis, "dis");
        return new com.p314xaae8f345.mm.p2614xca6eae71.k0(dis.readInt(), dis.readLong(), dis.readInt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p2614xca6eae71.k0 d(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.EmojiResProcessor"
            java.lang.String r2 = "filePath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r2)
            boolean r2 = com.p314xaae8f345.mm.vfs.w6.j(r11)
            r3 = 0
            if (r2 == 0) goto L7b
            r2 = 0
            java.io.InputStream r11 = com.p314xaae8f345.mm.vfs.w6.E(r11)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b java.io.IOException -> L5f
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.IOException -> L43
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.IOException -> L43
            int r2 = r4.readInt()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            long r5 = r4.readLong()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            int r7 = r4.readInt()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            com.tencent.mm.smiley.k0 r8 = new com.tencent.mm.smiley.k0     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            r8.<init>(r2, r5, r7)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            if (r11 == 0) goto L30
            r11.close()
        L30:
            r4.close()
            return r8
        L34:
            r0 = move-exception
            goto L3c
        L36:
            r2 = move-exception
            goto L4f
        L38:
            r2 = move-exception
            goto L63
        L3a:
            r0 = move-exception
            r4 = r2
        L3c:
            r2 = r11
            goto L70
        L3e:
            r4 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
            goto L4f
        L43:
            r4 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
            goto L63
        L48:
            r0 = move-exception
            r4 = r2
            goto L70
        L4b:
            r11 = move-exception
            r4 = r2
            r2 = r11
            r11 = r4
        L4f:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L59
            r11.close()
        L59:
            if (r4 == 0) goto L7b
        L5b:
            r4.close()
            goto L7b
        L5f:
            r11 = move-exception
            r4 = r2
            r2 = r11
            r11 = r4
        L63:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L6d
            r11.close()
        L6d:
            if (r4 == 0) goto L7b
            goto L5b
        L70:
            if (r2 == 0) goto L75
            r2.close()
        L75:
            if (r4 == 0) goto L7a
            r4.close()
        L7a:
            throw r0
        L7b:
            com.tencent.mm.smiley.k0 r11 = new com.tencent.mm.smiley.k0
            r0 = 0
            r11.<init>(r3, r0, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2614xca6eae71.q0.d(java.lang.String):com.tencent.mm.smiley.k0");
    }

    public final com.p314xaae8f345.mm.p2614xca6eae71.b2 e(int i17) {
        boolean z17 = false;
        if (57345 <= i17 && i17 < 58680) {
            z17 = true;
        }
        if (!z17) {
            return null;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.c1 c1Var = (com.p314xaae8f345.mm.p2614xca6eae71.c1) com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a.f274862e.f274750b.get(i17, null);
        com.p314xaae8f345.mm.p2614xca6eae71.a1 a1Var = c1Var != null ? ((com.p314xaae8f345.mm.p2614xca6eae71.b) c1Var).f274749a : null;
        if (a1Var instanceof com.p314xaae8f345.mm.p2614xca6eae71.b2) {
            return (com.p314xaae8f345.mm.p2614xca6eae71.b2) a1Var;
        }
        return null;
    }

    public final long f() {
        com.p314xaae8f345.mm.p2614xca6eae71.k0 k0Var = this.f274875b;
        if (k0Var != null) {
            return k0Var.f274835b;
        }
        return 0L;
    }

    public final int h(java.lang.String str, int i17, int i18) {
        if (((java.lang.Boolean) ((jz5.n) f274873h).mo141623x754a37bb()).booleanValue()) {
            if (!f274869d) {
                return i18;
            }
            if ((str == null || str.length() == 0) || i17 < 0 || i18 <= 0) {
                return 0;
            }
            if (str.length() <= i18) {
                return str.length();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var.f391649d = -1;
            com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a.a(str, i17, str.length(), new com.p314xaae8f345.mm.p2614xca6eae71.n0(i18, f0Var));
            if (f0Var.f391649d == -1) {
                f0Var.f391649d = i18;
            }
            return f0Var.f391649d + 1;
        }
        if (!f274869d) {
            return i18;
        }
        if (str != null) {
            if (!(str.length() == 0) && i17 >= 0 && i18 > 0) {
                if (str.length() <= i18) {
                    return str.length();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                f0Var2.f391649d = i17;
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                f0Var3.f391649d = -1;
                while (true) {
                    int i19 = f0Var2.f391649d;
                    if (i19 >= i18) {
                        break;
                    }
                    com.p314xaae8f345.mm.p2614xca6eae71.p pVar = com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a;
                    if (pVar.f274862e.f274750b.get(str.codePointAt(i19)) != null) {
                        pVar.a(str, f0Var2.f391649d, str.length(), new com.p314xaae8f345.mm.p2614xca6eae71.m0(i18, f0Var3, f0Var2));
                    } else {
                        f0Var3.f391649d = f0Var2.f391649d;
                    }
                    f0Var2.f391649d++;
                }
                if (f0Var3.f391649d == -1) {
                    f0Var3.f391649d = i17 + 1;
                }
                return f0Var3.f391649d + 1;
            }
        }
        return 0;
    }

    public final boolean i(java.io.DataInputStream dataInputStream, com.p314xaae8f345.mm.p2614xca6eae71.k0 k0Var, boolean z17) {
        int i17 = k0Var != null ? k0Var.f274836c : 0;
        if (k0Var == null || i17 <= 0) {
            return false;
        }
        byte[] bArr = new byte[i17];
        dataInputStream.read(bArr);
        if (this.f274876c) {
            com.p314xaae8f345.mm.p2614xca6eae71.f fVar = new com.p314xaae8f345.mm.p2614xca6eae71.f();
            fVar.mo11468x92b714fd(bArr);
            java.util.LinkedList linkedList = fVar.f274782e;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2614xca6eae71.k kVar = (com.p314xaae8f345.mm.p2614xca6eae71.k) it.next();
                com.p314xaae8f345.mm.p2614xca6eae71.c cVar = new com.p314xaae8f345.mm.p2614xca6eae71.c();
                int size = linkedList2.size();
                int i18 = kVar.f274827d;
                java.util.LinkedList linkedList5 = cVar.f274756d;
                if (i18 != 0) {
                    linkedList5.add(java.lang.Integer.valueOf(i18));
                }
                int i19 = kVar.f274828e;
                if (i19 != 0) {
                    linkedList5.add(java.lang.Integer.valueOf(i19));
                }
                com.p314xaae8f345.mm.p2614xca6eae71.g1 g1Var = new com.p314xaae8f345.mm.p2614xca6eae71.g1();
                g1Var.f274792d = kVar.f274832i;
                g1Var.f274793e = kVar.f274833m;
                g1Var.f274794f = 64;
                g1Var.f274795g = 64;
                cVar.f274757e = g1Var;
                if (kVar.f274829f != 0) {
                    com.p314xaae8f345.mm.p2614xca6eae71.a2 a2Var = new com.p314xaae8f345.mm.p2614xca6eae71.a2();
                    a2Var.f274747d = kVar.f274829f;
                    a2Var.f274748e = size;
                    linkedList3.add(a2Var);
                }
                if (kVar.f274830g != -1) {
                    com.p314xaae8f345.mm.p2614xca6eae71.f1 f1Var = new com.p314xaae8f345.mm.p2614xca6eae71.f1();
                    f1Var.f274784d = kVar.f274830g;
                    f1Var.f274785e = size;
                    linkedList4.add(f1Var);
                }
                linkedList2.add(cVar);
            }
            com.p314xaae8f345.mm.p2614xca6eae71.g0 g0Var = new com.p314xaae8f345.mm.p2614xca6eae71.g0();
            g0Var.f274789d = linkedList2;
            g0Var.f274791f = linkedList4;
            g0Var.f274790e = linkedList3;
            this.f274874a = g0Var;
        } else {
            this.f274874a.mo11468x92b714fd(bArr);
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p2614xca6eae71.c> emojiDataItems = this.f274874a.f274789d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiDataItems, "emojiDataItems");
        if (emojiDataItems.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiResProcessor", "constructIndex failed , emoji items is empty.");
        } else {
            for (com.p314xaae8f345.mm.p2614xca6eae71.c cVar2 : emojiDataItems) {
                java.util.LinkedList codePoints = cVar2.f274756d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(codePoints, "codePoints");
                com.p314xaae8f345.mm.p2614xca6eae71.g1 picItem = cVar2.f274757e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(picItem, "picItem");
                com.p314xaae8f345.mm.p2614xca6eae71.b2 b2Var = new com.p314xaae8f345.mm.p2614xca6eae71.b2(codePoints, picItem, false);
                com.p314xaae8f345.mm.p2614xca6eae71.p pVar = com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a;
                pVar.getClass();
                pVar.f274862e.b(b2Var, 0, com.p314xaae8f345.mm.p2614xca6eae71.n.f274848d);
            }
            java.util.LinkedList<com.p314xaae8f345.mm.p2614xca6eae71.a2> softbankEmojiItems = this.f274874a.f274790e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(softbankEmojiItems, "softbankEmojiItems");
            for (com.p314xaae8f345.mm.p2614xca6eae71.a2 a2Var2 : softbankEmojiItems) {
                com.p314xaae8f345.mm.p2614xca6eae71.p pVar2 = com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a2Var2);
                pVar2.getClass();
                com.p314xaae8f345.mm.p2614xca6eae71.c cVar3 = (com.p314xaae8f345.mm.p2614xca6eae71.c) kz5.n0.a0(emojiDataItems, a2Var2.f274748e);
                if (cVar3 != null) {
                    java.util.LinkedList codePoints2 = cVar3.f274756d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(codePoints2, "codePoints");
                    com.p314xaae8f345.mm.p2614xca6eae71.g1 picItem2 = cVar3.f274757e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(picItem2, "picItem");
                    com.p314xaae8f345.mm.p2614xca6eae71.b2 b2Var2 = new com.p314xaae8f345.mm.p2614xca6eae71.b2(codePoints2, picItem2, true);
                    com.p314xaae8f345.mm.p2614xca6eae71.w1 w1Var = pVar2.f274862e;
                    int i27 = a2Var2.f274747d;
                    w1Var.getClass();
                    com.p314xaae8f345.mm.p2614xca6eae71.b a17 = w1Var.a();
                    a17.f274749a = b2Var2;
                    synchronized (w1Var.f274750b) {
                        w1Var.f274750b.put(i27, a17);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p2614xca6eae71.g0 g0Var2 = this.f274874a;
        java.util.LinkedList linkedList6 = g0Var2.f274790e;
        java.util.LinkedList linkedList7 = g0Var2.f274791f;
        java.util.LinkedList linkedList8 = g0Var2.f274789d;
        java.util.Iterator it6 = linkedList6.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p2614xca6eae71.a2 a2Var3 = (com.p314xaae8f345.mm.p2614xca6eae71.a2) it6.next();
            com.p314xaae8f345.mm.p2614xca6eae71.p pVar3 = com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a;
            pVar3.f274858a.append(a2Var3.f274747d, a2Var3);
            pVar3.f274859b.append(((com.p314xaae8f345.mm.p2614xca6eae71.c) linkedList8.get(a2Var3.f274748e)).f274757e.f274792d, a2Var3);
        }
        java.util.Iterator it7 = linkedList7.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.mm.p2614xca6eae71.f1 f1Var2 = (com.p314xaae8f345.mm.p2614xca6eae71.f1) it7.next();
            com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a.f274860c.append(f1Var2.f274784d, f1Var2);
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(1:5)(1:162))(1:163)|6|(8:7|8|(1:10)|11|12|13|14|15)|(13:20|21|22|(1:24)|26|(3:28|(1:30)|31)|32|33|(1:35)(1:42)|36|(1:38)|39|40)|61|62|21|22|(0)|26|(0)|32|33|(0)(0)|36|(0)|39|40|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0270, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0159, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiResProcessor", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        r5 = java.lang.System.currentTimeMillis() - r5;
        r7 = !r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
    
        r5 = java.lang.System.currentTimeMillis() - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        if (r17 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        com.p314xaae8f345.mm.p2614xca6eae71.j0.a(r4, r5, r7, f(), r19.f274874a.f274789d.size(), false, 16, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0089, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008a, code lost:
    
        r9 = r7 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b1, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() == false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: all -> 0x0089, IOException -> 0x008c, TRY_LEAVE, TryCatch #18 {IOException -> 0x008c, all -> 0x0089, blocks: (B:22:0x006f, B:24:0x0074), top: B:21:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0233 A[Catch: all -> 0x022d, IOException -> 0x022f, TRY_LEAVE, TryCatch #17 {IOException -> 0x022f, all -> 0x022d, blocks: (B:120:0x0229, B:96:0x0233), top: B:119:0x0229 }] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [int] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2614xca6eae71.q0.j():boolean");
    }
}
