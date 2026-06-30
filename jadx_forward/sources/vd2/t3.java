package vd2;

/* loaded from: classes3.dex */
public final class t3 implements vd2.h5 {

    /* renamed from: a, reason: collision with root package name */
    public static final vd2.t3 f517454a = new vd2.t3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f517455b = new java.util.concurrent.ConcurrentHashMap();

    public static /* synthetic */ void k(vd2.t3 t3Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str, java.lang.String str2, vd2.g5 g5Var, java.lang.String str3, long j17, vd2.g5 g5Var2, java.lang.String str4, java.lang.String str5, r45.u32 u32Var, long j18, android.content.Intent intent, java.util.Map map, java.lang.String str6, int i17, java.lang.Object obj) {
        t3Var.j(c19792x256d2725, str, str2, g5Var, str3, j17, g5Var2, str4, (i17 & 256) != 0 ? "" : str5, (i17 & 512) != 0 ? null : u32Var, (i17 & 1024) != 0 ? 0L : j18, (i17 & 2048) != 0 ? null : intent, (i17 & 4096) != 0 ? null : map, (i17 & 8192) != 0 ? null : str6);
    }

    public void a(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        if (context != null) {
            if (str == null || str.length() == 0) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_USERNAME", str);
            intent.putExtra("KEY_NICKNAME", str2);
            intent.putExtra("KEY_COMMENT_SCENE", i17);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(14, 2, i17, intent);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Ck(context, intent);
        }
    }

    public android.content.Intent b(android.content.Intent intent, java.lang.String str, int i17) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_PAGE_TYPE", str);
        intent.putExtra("KEY_PAGE_SUB_TYPE", i17);
        return intent;
    }

    public void c(java.lang.String str, java.lang.String str2, vd2.g5 g5Var, vd2.g5 g5Var2) {
        java.lang.Boolean bool;
        if (str == null || str2 == null) {
            if (g5Var2 != null) {
                g5Var2.a(-1000);
                return;
            }
            return;
        }
        vd2.j1 j1Var = (vd2.j1) ((zy2.x7) i95.n0.c(zy2.x7.class));
        j1Var.getClass();
        vd2.i1 i1Var = (vd2.i1) j1Var.f517304e.get(new vd2.h1(str, str2));
        if (i1Var == null || c01.id.e() - i1Var.f517295b >= j1Var.f517303d) {
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(i1Var.f517294a.m75939xb282bd08(1) == 0);
        }
        if (bool == null) {
            new db2.o(str, str2, null).l().K(new vd2.n3(str, str2, g5Var, g5Var2));
        } else if (g5Var != null) {
            g5Var.a(bool);
        }
    }

    public void d(android.content.Context context, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.util.Map map, vd2.g5 g5Var, vd2.g5 g5Var2) {
        if (str2 == null) {
            if (g5Var2 != null) {
                g5Var2.a(-1000);
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        if ((map != null && map.containsKey("is_from_ad")) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(map.get("is_from_ad"), java.lang.Boolean.TRUE)) {
            c0Var.f391645d = true;
        }
        if (h(j17)) {
            if (c0Var.f391645d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1837L, 1L, 1L);
            }
            new db2.g4(0L, str3, 65, 2, "", true, null, null, 0L, null, false, false, str2 == null ? "" : str2, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536825792, null).l().K(new vd2.o3(j17, c0Var, str, "", g5Var, g5Var2));
        } else if (g5Var != null) {
            g5Var.a(null);
        }
    }

    public boolean e() {
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk()) {
            return false;
        }
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.I2).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public boolean f() {
        return c92.g.f121271a.b();
    }

    public boolean g() {
        ae2.in inVar = ae2.in.f85221a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85467z1).mo141623x754a37bb()).r()).intValue() == 1;
        boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderNearbyLiveSwitch", 1) == 1;
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85440w1).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtilApi", "isEnableNearbyLiveFriends isValidUser:" + z18 + " hasFinder:" + el6 + " isEnableNearbyLiveFriends:" + z19);
        return z17 || (z18 && el6 && z19);
    }

    public final boolean h(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f517455b;
        if (!concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            return true;
        }
        jz5.l lVar = (jz5.l) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        long longValue = lVar != null ? ((java.lang.Number) lVar.f384366d).longValue() : 0L;
        ae2.in inVar = ae2.in.f85221a;
        return java.lang.System.currentTimeMillis() - longValue > ((long) (ae2.in.f85295h3 * 1000));
    }

    public void i(int i17, android.content.Intent intent, java.lang.String feedExportId, long j17, java.lang.String str, java.lang.String str2, java.lang.String reportExtraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedExportId, "feedExportId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExtraInfo, "reportExtraInfo");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        intent2.putExtra("KEY_PARAMS_DO_ACTION", i17);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.pk0 pk0Var = new r45.pk0();
        pk0Var.set(0, feedExportId);
        pk0Var.set(1, "");
        pk0Var.set(2, java.lang.Long.valueOf(j17));
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, str2 == null ? "" : str2);
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, -1);
        vd2.q3 q3Var = new vd2.q3(j17, str, reportExtraInfo, str2);
        vd2.f1 f1Var = (vd2.f1) e0Var;
        f1Var.getClass();
        java.lang.String m75945x2fec8307 = pk0Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f517258d, "enterLiveD encryptedObjectId invalid");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDataTransferUtil", "EncryptedLiveFeedInfo.logInfo enterLiveD, encryptedObjectId: " + pk0Var.m75945x2fec8307(0) + ", nonceId: " + pk0Var.m75945x2fec8307(1) + ", liveId: " + pm0.v.u(pk0Var.m75942xfb822ef2(2)) + ", ");
        zl2.l lVar = zl2.l.f555398a;
        lVar.f(wk0Var);
        lVar.g(wk0Var, "enterLiveD");
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        java.lang.String m75945x2fec83072 = pk0Var.m75945x2fec8307(1);
        c61.yb.W3(ybVar, 0L, m75945x2fec83072 == null ? "" : m75945x2fec83072, 65, 2, "", true, null, null, 0L, null, false, false, m75945x2fec8307, null, 0, null, 53184, null).l().K(new vd2.d1(q3Var, f1Var, context, intent2, wk0Var));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:10|(1:243)(1:14)|(1:242)(1:18)|19|(1:241)(1:23)|(1:25)|26|(2:28|(38:30|(4:32|(1:34)(1:39)|(1:36)(1:38)|37)|(1:41)(1:238)|42|(1:44)(1:237)|(1:46)(1:236)|(1:48)(1:235)|49|(1:51)(1:234)|(1:53)|54|55|56|(2:58|59)(1:231)|60|61|(1:63)(1:227)|(1:65)|66|67|(1:225)(1:71)|(2:220|221)|(1:74)|75|(1:77)(1:219)|78|(1:80)(1:218)|(1:82)(1:217)|83|(1:85)(1:216)|(1:87)(1:215)|88|(1:90)(1:214)|(1:92)(1:(1:211)(1:(1:213)))|93|(1:209)(1:97)|(1:99)|(25:108|(1:110)|(1:112)|113|(2:115|(1:117)(17:207|(1:120)(1:206)|121|(1:205)(1:125)|126|(1:128)(1:(1:204))|129|(1:131)|(1:137)|138|(1:202)(1:142)|(1:144)(1:201)|(5:(1:199)(1:149)|150|(3:152|(1:154)|155)|156|(3:(2:159|(2:161|(1:163)(5:175|(1:177)|178|(1:180)|181)))(1:183)|182|(0)(0))(8:184|(1:186)(1:198)|187|(1:189)(1:197)|(1:191)|192|(1:194)(1:196)|195))(1:200)|(1:174)(1:167)|(1:171)|172|173))(1:208)|118|(0)(0)|121|(1:123)|205|126|(0)(0)|129|(0)|(3:133|135|137)|138|(1:140)|202|(0)(0)|(0)(0)|(1:165)|174|(2:169|171)|172|173)(4:102|(1:104)(1:107)|105|106)))(1:240)|239|(0)|(0)(0)|42|(0)(0)|(0)(0)|(0)(0)|49|(0)(0)|(0)|54|55|56|(0)(0)|60|61|(0)(0)|(0)|66|67|(1:69)|225|(0)|(0)|75|(0)(0)|78|(0)(0)|(0)(0)|83|(0)(0)|(0)(0)|88|(0)(0)|(0)(0)|93|(1:95)|209|(0)|(0)|108|(0)|(0)|113|(0)(0)|118|(0)(0)|121|(0)|205|126|(0)(0)|129|(0)|(0)|138|(0)|202|(0)(0)|(0)(0)|(0)|174|(0)|172|173) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x012f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0136, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderUtilApi", r0, "parse snsUxInfo failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0131, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0132, code lost:
    
        r22 = "key_extra_info";
        r51 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed A[Catch: all -> 0x0131, TRY_LEAVE, TryCatch #0 {all -> 0x0131, blocks: (B:56:0x00e9, B:58:0x00ed), top: B:55:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103 A[Catch: all -> 0x012f, TryCatch #2 {all -> 0x012f, blocks: (B:61:0x00ff, B:63:0x0103, B:66:0x010b), top: B:60:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r55, java.lang.String r56, java.lang.String r57, vd2.g5 r58, java.lang.String r59, long r60, vd2.g5 r62, java.lang.String r63, java.lang.String r64, r45.u32 r65, long r66, android.content.Intent r68, java.util.Map r69, java.lang.String r70) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.t3.j(com.tencent.mm.protocal.protobuf.FinderObject, java.lang.String, java.lang.String, vd2.g5, java.lang.String, long, vd2.g5, java.lang.String, java.lang.String, r45.u32, long, android.content.Intent, java.util.Map, java.lang.String):void");
    }

    public java.lang.String l(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str != null) {
            jSONObject.put("commentscene", str);
        }
        if (str4 == null || str4.length() == 0) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (i17 >= 0) {
                jSONObject2.put("source_type", i17);
            }
            if (str2 != null) {
                jSONObject2.put("ref_page_type", str2);
            }
            if (str3 != null) {
                jSONObject2.put("page_type", str3);
            }
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, jSONObject2);
        } else {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str4);
        }
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public void m(android.content.Context context, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.util.Map map, vd2.g5 g5Var, vd2.g5 g5Var2) {
        java.lang.Object obj = map != null ? map.get("key_enter_scene") : null;
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 4;
        java.lang.Object obj2 = map != null ? map.get("key_card_type") : null;
        java.lang.Integer num2 = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
        k(this, null, str, str2, g5Var2, str3, j17, g5Var, ((c61.l7) i95.n0.c(c61.l7.class)).Gj(intValue, num2 != null ? num2.intValue() : 4, 65), null, null, 0L, null, map, null, 12032, null);
    }
}
