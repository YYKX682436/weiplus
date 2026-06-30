package c61;

@j95.b
/* loaded from: classes14.dex */
public final class ec extends i95.w implements qk.x7 {
    public void Ai(java.lang.String chatRoomId) {
        boolean z17;
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryPlugin", "deleteImageStorageByChatRoomId>>  roomId: ".concat(chatRoomId));
        bm5.t0 t0Var = bm5.t0.f22738a;
        if (t0Var.a() && t0Var.b()) {
            if (aq.o.f12922c == null) {
                aq.o.f12922c = new aq.n();
                com.tencent.mm.storage.s8.f195314a.a();
            }
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "deleteMsgRoom >> roomId: ".concat(chatRoomId));
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.storage.p8(chatRoomId, null), 2, null);
        }
    }

    public void Bi(int i17) {
        boolean z17 = (c01.z1.i() & 1) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z17);
        f65.o.f259929r = z17 ^ true ? 1 : 2;
        f65.o.f259912a.b(i17);
    }

    public void Di(int i17) {
        bm5.t0 t0Var = bm5.t0.f22738a;
        boolean z17 = (c01.z1.i() & 1) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryPlugin", "doImageQueryTecReport >> action: " + i17 + ", switch: " + z17);
        f65.p.f259953t = z17 ? 1L : 2L;
        if (i17 == 9) {
            boolean z18 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Global_ShowImageQuery_Int, 0) == 1;
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_image_query_entrance_v2, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryEntranceConfig", "getImageQueryEntranceConfig >> result: " + fj6 + ", repairConfig: " + z18);
            f65.p.f259954u = fj6 || z18 ? 1L : 2L;
            f65.p.f259955v = t0Var.b() ? 1L : 2L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryTecReporter", "report: >> action: " + i17 + ", " + f65.p.f259956w);
        com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct imageQueryTecLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct();
        imageQueryTecLogStruct.f58468d = (long) i17;
        imageQueryTecLogStruct.G = imageQueryTecLogStruct.b("SessionId", f65.p.f259956w, true);
        imageQueryTecLogStruct.B = f65.p.f259954u;
        imageQueryTecLogStruct.C = f65.p.f259955v;
        imageQueryTecLogStruct.f58469e = f65.p.f259953t;
        imageQueryTecLogStruct.k();
    }

    public boolean Ni() {
        bm5.t0 t0Var = bm5.t0.f22738a;
        return t0Var.a() && t0Var.b();
    }

    public boolean Ri() {
        boolean z17 = (c01.z1.i() & 1) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z17);
        return z17;
    }

    public void Ui() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryTecReporter", "restTecReporter");
        f65.p.f259956w = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        f65.p.f259935b = 0L;
        f65.p.f259936c = "";
        f65.p.f259937d = "";
        f65.p.f259938e = 0L;
        f65.p.f259939f = 0L;
        f65.p.f259940g = 0L;
        f65.p.f259941h = 0L;
        f65.p.f259942i = 0L;
        f65.p.f259943j = 0L;
        f65.p.f259944k = 0L;
        f65.p.f259945l = "";
        f65.p.f259946m = 0L;
        f65.p.f259947n = 0L;
        f65.p.f259948o = "";
        f65.p.f259949p = "";
        f65.p.f259950q = 0L;
        f65.p.f259951r = "";
        f65.p.f259952s = 0L;
        f65.p.f259953t = 0L;
        f65.p.f259954u = 0L;
        f65.p.f259955v = 0L;
        f65.p.f259957x = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "resetReporter");
        f65.o.f259914c = "";
        f65.o.f259913b = "";
        f65.o.f259915d = 0;
        f65.o.f259917f = "";
        f65.o.f259918g = "";
        f65.o.f259919h = 0;
        f65.o.f259920i = 0;
        f65.o.f259921j = "";
        f65.o.f259922k = 0;
        f65.o.f259923l = 0;
        f65.o.f259924m = 0;
        f65.o.f259925n = 0L;
        f65.o.f259926o = 2;
        f65.o.f259930s = 0L;
        f65.o.f259931t = false;
        f65.o.f259932u = false;
        f65.o.f259927p = 0;
        f65.o.f259928q = 0;
        f65.o.f259929r = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "reset");
        f65.m.f259897b = 0L;
        f65.m.f259898c = 0L;
        f65.m.f259899d = 0L;
        f65.m.f259900e = 0L;
        f65.m.f259901f = 0L;
        f65.m.f259902g = 0L;
        f65.m.f259903h = 0L;
        f65.m.f259904i = 0L;
        f65.m.f259906k = 0L;
        f65.m.f259905j = 0L;
        f65.m.f259907l = false;
        f65.o.f259914c = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    public void Vi(android.content.Context context, qk.q7 platformOp) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(platformOp, "platformOp");
        aq.p.f12930b = platformOp;
        aq.o.f12921b = nc5.b.f336190b;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.view.activity.ImageQueryMainUI.class);
        intent.putExtra("KEY_SUG_QUERY_TEXT", nc5.b.f336191c);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ImageQueryPlugin", "startImageQueryMainActivity", "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/ImageQueryPlugin", "startImageQueryMainActivity", "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Zi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryPlugin", "stopPreIdentify");
        aq.n nVar = aq.o.f12922c;
        if (nVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "stopIdentify");
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new aq.m(nVar, null), 3, null);
        }
    }

    public java.util.ArrayList aj() {
        com.tencent.mm.storage.s8 s8Var;
        int i17;
        java.lang.String str;
        java.lang.String str2 = aq.o.f12921b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        try {
            cl0.e eVar = new cl0.e("[[12, 15], [14, 115], [13], [17], [2, 18], [4,27,28], [5], [6,80], [32, 223], [33], [7], [8, 89, 373, 446], [93, 403], [94, 414]]");
            int length = eVar.length();
            for (int i18 = 0; i18 < length; i18++) {
                cl0.e a17 = eVar.a(i18);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int length2 = a17.length();
                for (int i19 = 0; i19 < length2; i19++) {
                    arrayList3.add(java.lang.String.valueOf(a17.getInt(i19)));
                }
                arrayList2.add(arrayList3);
            }
        } catch (cl0.f unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SugListDataManager", "parse json error");
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.util.ArrayList arrayList4 = (java.util.ArrayList) it.next();
            aq.r0 r0Var = aq.r0.f12940a;
            java.lang.Object obj = arrayList4.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            int parseInt = java.lang.Integer.parseInt((java.lang.String) obj);
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
            ny4.e eVar2 = aq.r0.f12942c;
            if (eVar2 != null) {
                kotlin.jvm.internal.o.d(d17);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.SugListDataManager", "result: " + arrayList.size());
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        if (!arrayList.isEmpty()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            int i27 = 0;
            while (true) {
                s8Var = com.tencent.mm.storage.s8.f195314a;
                if (i27 >= 6) {
                    break;
                }
                java.util.ArrayList arrayList7 = (java.util.ArrayList) ((android.util.Pair) arrayList.get(i27)).second;
                kotlin.jvm.internal.o.d(arrayList7);
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
            java.util.TreeMap treeMap = new java.util.TreeMap(aq.y0.f13007d);
            int size = arrayList.size();
            for (i17 = 6; i17 < size; i17++) {
                java.util.ArrayList arrayList9 = (java.util.ArrayList) ((android.util.Pair) arrayList.get(i17)).second;
                kotlin.jvm.internal.o.d(arrayList9);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryEntranceConfig", "switch image query change : open = " + z17);
        long j17 = z17 ? i17 | 1 : i17 & (-2);
        int i18 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 75;
        p53Var.f382762e = i18;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
    }

    public void wi(java.lang.String roomId) {
        kotlin.jvm.internal.o.g(roomId, "roomId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryPlugin", "checkPluginEnv");
        aq.o.f12921b = roomId;
        bm5.t0 t0Var = bm5.t0.f22738a;
        if (!t0Var.a() || !t0Var.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
        } else if (aq.o.f12922c == null) {
            aq.o.f12922c = new aq.n();
            com.tencent.mm.storage.s8.f195314a.a();
        }
        aq.r0.f12940a.d();
    }
}
