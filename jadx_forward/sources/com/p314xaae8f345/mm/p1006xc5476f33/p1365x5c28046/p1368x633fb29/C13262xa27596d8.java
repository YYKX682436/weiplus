package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* renamed from: com.tencent.mm.plugin.emoji.model.EmojiLogic */
/* loaded from: classes12.dex */
public class C13262xa27596d8 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f179066a = 0;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r9.a();
    }

    public static boolean a() {
        if (android.text.TextUtils.isEmpty((java.lang.String) gm0.j1.u().c().l(274436, null)) ? false : !"CN".equalsIgnoreCase(r0)) {
            return false;
        }
        return (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_new_emoji_store_ui, 0) == 1 || bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2528x5c28046.C20133xf526fb34()) == 1) && t().booleanValue();
    }

    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 b() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726();
        c6419xd51df726.f137616q = u().booleanValue() ? 1 : 0;
        return c6419xd51df726;
    }

    public static java.lang.String c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5) {
        if (i17 <= 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<xml>");
        sb6.append("<tid>" + i17 + "</tid>");
        sb6.append("<title>" + u46.k.c(str) + "</title>");
        sb6.append("<desc>" + u46.k.c(str2) + "</desc>");
        sb6.append("<iconUrl>" + u46.k.c(str3) + "</iconUrl>");
        sb6.append("<secondUrl>" + u46.k.c(str4) + "</secondUrl>");
        sb6.append("<pageType>" + i18 + "</pageType>");
        sb6.append("<setKey>" + str5 + "</setKey>");
        sb6.append("</xml>");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", sb7);
        return sb7;
    }

    public static int d(java.lang.String str) {
        try {
            return kk.v.b((java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "xml", null).get(".xml.designeruin"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getDesignerUINBySnsObjData exception. %s", e17.toString());
            return 0;
        }
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 e(java.lang.String str, int i17, java.lang.String str2, float f17, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        if (z17) {
            java.lang.String o17 = o(n22.m.g(), str, str2);
            boolean z18 = false;
            if (com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o17);
                if (r6Var.m()) {
                    if (r6Var.C() < 1) {
                        r6Var.l();
                    } else {
                        c21053xdbf1e5f4.f68689x2262335f = n22.m.h(com.p314xaae8f345.mm.vfs.w6.N(o17, 0, 10));
                        z18 = true;
                    }
                }
            }
            if (!z18) {
                return null;
            }
        } else if (!com.p314xaae8f345.mm.vfs.w6.j(o(n22.m.g(), str, str2))) {
            return null;
        }
        c21053xdbf1e5f4.f68671x4b6e68b9 = q(str, str2);
        c21053xdbf1e5f4.f68653x95b20dd4 = i17 != 2 ? i17 != 4 ? i17 != 8 ? 17 : 84 : 83 : 82;
        c21053xdbf1e5f4.f68663x861009b5 = str;
        c21053xdbf1e5f4.f68685x2261e7f9 = 1;
        return c21053xdbf1e5f4;
    }

    /* renamed from: extractForeground */
    public static native boolean m54776x99a834a4(int[] iArr, int i17, int i18);

    public static java.lang.String f(java.lang.String str) {
        try {
            return (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "xml", null).get(".xml.desc");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageDesc exception. %s", e17.toString());
            return "";
        }
    }

    public static java.lang.String g(java.lang.String str) {
        try {
            return (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "xml", null).get(".xml.iconUrl");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageIconUrl exception. %s", e17.toString());
            return "";
        }
    }

    /* renamed from: gifToMMAni */
    public static native boolean m54777x9aac5e1d(byte[] bArr, com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1, int i17);

    public static java.lang.String h(java.lang.String str) {
        try {
            java.lang.String str2 = (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "xml", null).get(".xml.secondUrl");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return str2 == null ? "" : str2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageSecondUrl exception. %s", e17.toString());
            return "";
        }
    }

    public static int i(java.lang.String str) {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "xml", null).get(".xml.tid"), 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageTid exception. %s", e17.toString());
            return 0;
        }
    }

    public static java.lang.String j(java.lang.String str) {
        try {
            return (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "xml", null).get(".xml.title");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageTitle exception. %s", e17.toString());
            return "";
        }
    }

    public static int k(java.lang.String str) {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "xml", null).get(".xml.pageType"), 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getEmojiPageType exception. %s", e17.toString());
            return 0;
        }
    }

    public static int l(r45.tj0 tj0Var) {
        if (tj0Var == null) {
            return 0;
        }
        return tj0Var.f468035n;
    }

    public static java.lang.String m(r45.tj0 tj0Var) {
        java.lang.String str;
        return (tj0Var == null || (str = tj0Var.f468034m) == null) ? "" : str.replace(",", ";");
    }

    public static int n(r45.tj0 tj0Var) {
        if (tj0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tj0Var.f468030f)) {
            return 0;
        }
        return tj0Var.f468028d == 0 ? 2 : 1;
    }

    public static java.lang.String o(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and url are null.");
            return null;
        }
        java.lang.String q17 = q(str2, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q17)) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str + q17;
        }
        return str + str2 + "/" + q17;
    }

    public static java.lang.String p(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and md5 are null.");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str + str3;
        }
        return str + str2 + "/" + str3;
    }

    public static java.lang.String q(java.lang.String str, java.lang.String str2) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? kk.k.g(str.getBytes()) : kk.k.g(str2.getBytes());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "[cpan] product id and url are null.");
        return null;
    }

    public static java.lang.String r(java.lang.String str) {
        try {
            return (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "xml", null).get(".xml.productid");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "getProductIdBySnsObjData exception. %s", e17.toString());
            return "";
        }
    }

    public static void s(android.content.Context context, byte[] bArr, java.lang.String str, byte[] bArr2, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 W0;
        android.graphics.Bitmap G;
        int i17;
        if (str == null && bArr2 == null) {
            return;
        }
        java.lang.String g17 = n22.m.g();
        com.p314xaae8f345.mm.vfs.w6.S(g17 + str, bArr2, 0, bArr2.length);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.d(bArr2)) {
            z85.l c17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c();
            l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            W0 = c17.W0(str, "", 65, 10, bArr2.length, null, str2, "");
        } else {
            z85.l c18 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c();
            l75.e0 e0Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            W0 = c18.W0(str, "", 65, 11, bArr2.length, null, str2, "");
        }
        if (bArr != null) {
            G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
        } else if (W0 == null) {
            return;
        } else {
            G = W0.W(context);
        }
        if (G != null) {
            int i18 = 300;
            if (G.getWidth() > 300 || G.getHeight() > 300) {
                int width = G.getWidth();
                int height = G.getHeight();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLogic", "cpan app msg width:%d height:%d", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
                if (width > height) {
                    i17 = (int) ((height / width) * 300.0f);
                } else {
                    i18 = (int) ((width / height) * 300.0f);
                    i17 = 300;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLogic", "cpan app msg new width:%d new height:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(G, i17, i18, false, true);
            }
        }
        if (G != null) {
            try {
                if (G.getByteCount() > 65536) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(G, 80, android.graphics.Bitmap.CompressFormat.JPEG, g17 + str + "_thumb", true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is over size. save as jpg. size :%d", java.lang.Integer.valueOf(G.getByteCount()));
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(G, 100, android.graphics.Bitmap.CompressFormat.PNG, g17 + str + "_thumb", true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is in normal size. sav as png. size :%d", java.lang.Integer.valueOf(G.getByteCount()));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiLogic", e17, "insertEmoji Error", new java.lang.Object[0]);
            }
        }
    }

    public static java.lang.Boolean t() {
        return java.lang.Boolean.valueOf(((uh4.c0) i95.n0.c(uh4.c0.class)).ag() == 1);
    }

    public static java.lang.Boolean u() {
        return java.lang.Boolean.valueOf(((uh4.c0) i95.n0.c(uh4.c0.class)).ag() == 0);
    }

    public static boolean v(r45.tj0 tj0Var) {
        return (tj0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tj0Var.f468030f) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tj0Var.f468029e)) ? false : true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:220|221|222|223|(5:(4:225|226|227|(16:229|230|231|232|233|234|235|236|(3:238|239|(8:241|242|243|244|245|246|(2:250|251)|254))|276|243|244|245|246|(3:248|250|251)|254))(1:295)|245|246|(0)|254)|289|234|235|236|(0)|276|243|244) */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0507, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0508, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0504, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0505, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0301 A[Catch: all -> 0x01a0, Exception -> 0x01a2, TRY_ENTER, TRY_LEAVE, TryCatch #49 {Exception -> 0x01a2, all -> 0x01a0, blocks: (B:81:0x0185, B:82:0x01b4, B:86:0x01cf, B:88:0x01d9, B:89:0x01f3, B:92:0x0200, B:94:0x0216, B:95:0x021f, B:98:0x0247, B:100:0x026a, B:103:0x0271, B:106:0x027c, B:108:0x0301, B:113:0x0237, B:116:0x0242, B:142:0x0299, B:144:0x02a5), top: B:80:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04e8 A[Catch: all -> 0x04fe, Exception -> 0x0501, TRY_LEAVE, TryCatch #34 {Exception -> 0x0501, all -> 0x04fe, blocks: (B:246:0x04da, B:248:0x04e8, B:251:0x04ef, B:254:0x04fa), top: B:245:0x04da }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0570 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0582 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0216 A[Catch: all -> 0x01a0, Exception -> 0x01a2, TryCatch #49 {Exception -> 0x01a2, all -> 0x01a0, blocks: (B:81:0x0185, B:82:0x01b4, B:86:0x01cf, B:88:0x01d9, B:89:0x01f3, B:92:0x0200, B:94:0x0216, B:95:0x021f, B:98:0x0247, B:100:0x026a, B:103:0x0271, B:106:0x027c, B:108:0x0301, B:113:0x0237, B:116:0x0242, B:142:0x0299, B:144:0x02a5), top: B:80:0x0185 }] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean w(java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 r35) {
        /*
            Method dump skipped, instructions count: 1811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.w(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.storage.emotion.EmojiGroupInfo):boolean");
    }
}
