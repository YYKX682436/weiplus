package c61;

@j95.b
/* loaded from: classes14.dex */
public final class ec extends i95.w implements qk.x7 {
    public void Ai(java.lang.String chatRoomId) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryPlugin", "deleteImageStorageByChatRoomId>>  roomId: ".concat(chatRoomId));
        bm5.t0 t0Var = bm5.t0.f104271a;
        if (t0Var.a() && t0Var.b()) {
            if (aq.o.f94455c == null) {
                aq.o.f94455c = new aq.n();
                com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.a();
            }
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "deleteMsgRoom >> roomId: ".concat(chatRoomId));
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p2621x8fb0427b.p8(chatRoomId, null), 2, null);
        }
    }

    public void Bi(int i17) {
        boolean z17 = (c01.z1.i() & 1) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z17);
        f65.o.f341462r = z17 ^ true ? 1 : 2;
        f65.o.f341445a.b(i17);
    }

    public void Di(int i17) {
        bm5.t0 t0Var = bm5.t0.f104271a;
        boolean z17 = (c01.z1.i() & 1) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryPlugin", "doImageQueryTecReport >> action: " + i17 + ", switch: " + z17);
        f65.p.f341486t = z17 ? 1L : 2L;
        if (i17 == 9) {
            boolean z18 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Global_ShowImageQuery_Int, 0) == 1;
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_image_query_entrance_v2, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryEntranceConfig", "getImageQueryEntranceConfig >> result: " + fj6 + ", repairConfig: " + z18);
            f65.p.f341487u = fj6 || z18 ? 1L : 2L;
            f65.p.f341488v = t0Var.b() ? 1L : 2L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryTecReporter", "report: >> action: " + i17 + ", " + f65.p.f341489w);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6655xd5183134 c6655xd5183134 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6655xd5183134();
        c6655xd5183134.f140001d = (long) i17;
        c6655xd5183134.G = c6655xd5183134.b("SessionId", f65.p.f341489w, true);
        c6655xd5183134.B = f65.p.f341487u;
        c6655xd5183134.C = f65.p.f341488v;
        c6655xd5183134.f140002e = f65.p.f341486t;
        c6655xd5183134.k();
    }

    public boolean Ni() {
        bm5.t0 t0Var = bm5.t0.f104271a;
        return t0Var.a() && t0Var.b();
    }

    public boolean Ri() {
        boolean z17 = (c01.z1.i() & 1) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z17);
        return z17;
    }

    public void Ui() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryTecReporter", "restTecReporter");
        f65.p.f341489w = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        f65.p.f341468b = 0L;
        f65.p.f341469c = "";
        f65.p.f341470d = "";
        f65.p.f341471e = 0L;
        f65.p.f341472f = 0L;
        f65.p.f341473g = 0L;
        f65.p.f341474h = 0L;
        f65.p.f341475i = 0L;
        f65.p.f341476j = 0L;
        f65.p.f341477k = 0L;
        f65.p.f341478l = "";
        f65.p.f341479m = 0L;
        f65.p.f341480n = 0L;
        f65.p.f341481o = "";
        f65.p.f341482p = "";
        f65.p.f341483q = 0L;
        f65.p.f341484r = "";
        f65.p.f341485s = 0L;
        f65.p.f341486t = 0L;
        f65.p.f341487u = 0L;
        f65.p.f341488v = 0L;
        f65.p.f341490x = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "resetReporter");
        f65.o.f341447c = "";
        f65.o.f341446b = "";
        f65.o.f341448d = 0;
        f65.o.f341450f = "";
        f65.o.f341451g = "";
        f65.o.f341452h = 0;
        f65.o.f341453i = 0;
        f65.o.f341454j = "";
        f65.o.f341455k = 0;
        f65.o.f341456l = 0;
        f65.o.f341457m = 0;
        f65.o.f341458n = 0L;
        f65.o.f341459o = 2;
        f65.o.f341463s = 0L;
        f65.o.f341464t = false;
        f65.o.f341465u = false;
        f65.o.f341460p = 0;
        f65.o.f341461q = 0;
        f65.o.f341462r = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "reset");
        f65.m.f341430b = 0L;
        f65.m.f341431c = 0L;
        f65.m.f341432d = 0L;
        f65.m.f341433e = 0L;
        f65.m.f341434f = 0L;
        f65.m.f341435g = 0L;
        f65.m.f341436h = 0L;
        f65.m.f341437i = 0L;
        f65.m.f341439k = 0L;
        f65.m.f341438j = 0L;
        f65.m.f341440l = false;
        f65.o.f341447c = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    public void Vi(android.content.Context context, qk.q7 platformOp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(platformOp, "platformOp");
        aq.p.f94463b = platformOp;
        aq.o.f94454b = nc5.b.f417723b;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2776x373aa5.p2777x9d4bf30f.ActivityC22818x36ce40ba.class);
        intent.putExtra("KEY_SUG_QUERY_TEXT", nc5.b.f417724c);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ImageQueryPlugin", "startImageQueryMainActivity", "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/ImageQueryPlugin", "startImageQueryMainActivity", "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Zi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryPlugin", "stopPreIdentify");
        aq.n nVar = aq.o.f94455c;
        if (nVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "stopIdentify");
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new aq.m(nVar, null), 3, null);
        }
    }

    public java.util.ArrayList aj() {
        com.p314xaae8f345.mm.p2621x8fb0427b.s8 s8Var;
        int i17;
        java.lang.String str;
        java.lang.String str2 = aq.o.f94454b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        try {
            cl0.e eVar = new cl0.e("[[12, 15], [14, 115], [13], [17], [2, 18], [4,27,28], [5], [6,80], [32, 223], [33], [7], [8, 89, 373, 446], [93, 403], [94, 414]]");
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            for (int i18 = 0; i18 < mo15056xbe0e3ae6; i18++) {
                cl0.e a17 = eVar.a(i18);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int mo15056xbe0e3ae62 = a17.mo15056xbe0e3ae6();
                for (int i19 = 0; i19 < mo15056xbe0e3ae62; i19++) {
                    arrayList3.add(java.lang.String.valueOf(a17.mo15052xb58848b9(i19)));
                }
                arrayList2.add(arrayList3);
            }
        } catch (cl0.f unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SugListDataManager", "parse json error");
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.util.ArrayList arrayList4 = (java.util.ArrayList) it.next();
            aq.r0 r0Var = aq.r0.f94473a;
            java.lang.Object obj = arrayList4.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            int parseInt = java.lang.Integer.parseInt((java.lang.String) obj);
            java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
            ny4.e eVar2 = aq.r0.f94475c;
            if (eVar2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
                str = eVar2.d(parseInt, d17);
            } else {
                str = null;
            }
            if (str == null) {
                break;
            }
            if (str.length() > 0) {
                arrayList.add(new android.util.Pair(str, arrayList4));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SugListDataManager", "result: " + arrayList.size());
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        if (!arrayList.isEmpty()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            int i27 = 0;
            while (true) {
                s8Var = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a;
                if (i27 >= 6) {
                    break;
                }
                java.util.ArrayList arrayList7 = (java.util.ArrayList) ((android.util.Pair) arrayList.get(i27)).second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList7);
                java.util.Iterator it6 = arrayList7.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (((java.util.ArrayList) s8Var.e((java.lang.String) it6.next(), str2)).size() > 0) {
                        arrayList6.add(arrayList.get(i27));
                        break;
                    }
                }
                i27++;
            }
            arrayList5.addAll(arrayList6);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.util.TreeMap treeMap = new java.util.TreeMap(aq.y0.f94540d);
            int size = arrayList.size();
            for (i17 = 6; i17 < size; i17++) {
                java.util.ArrayList arrayList9 = (java.util.ArrayList) ((android.util.Pair) arrayList.get(i17)).second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList9);
                java.util.Iterator it7 = arrayList9.iterator();
                int i28 = 0;
                while (it7.hasNext()) {
                    i28 += ((java.util.ArrayList) s8Var.e((java.lang.String) it7.next(), str2)).size();
                }
                if (i28 != 0) {
                    if (treeMap.containsKey(java.lang.Integer.valueOf(i28))) {
                        java.util.ArrayList arrayList10 = (java.util.ArrayList) treeMap.get(java.lang.Integer.valueOf(i28));
                        if (arrayList10 != null) {
                            arrayList10.add(arrayList.get(i17));
                        }
                    } else {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i28);
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        arrayList11.add(arrayList.get(i17));
                        treeMap.put(valueOf, arrayList11);
                    }
                }
            }
            java.util.Iterator it8 = treeMap.entrySet().iterator();
            while (it8.hasNext()) {
                java.util.Iterator it9 = ((java.lang.Iterable) ((java.util.Map.Entry) it8.next()).getValue()).iterator();
                while (it9.hasNext()) {
                    arrayList8.add((android.util.Pair) it9.next());
                }
            }
            arrayList5.addAll(arrayList8);
        }
        return arrayList5;
    }

    public void bj(boolean z17) {
        long i17 = c01.z1.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryEntranceConfig", "switch image query change : open = " + z17);
        long j17 = z17 ? i17 | 1 : i17 & (-2);
        int i18 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 75;
        p53Var.f464295e = i18;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
    }

    public void wi(java.lang.String roomId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryPlugin", "checkPluginEnv");
        aq.o.f94454b = roomId;
        bm5.t0 t0Var = bm5.t0.f104271a;
        if (!t0Var.a() || !t0Var.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
        } else if (aq.o.f94455c == null) {
            aq.o.f94455c = new aq.n();
            com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.a();
        }
        aq.r0.f94473a.d();
    }
}
