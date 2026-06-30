package j00;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j00.d f378272a = new j00.d();

    public final void a(int i17, int i18, boolean z17, bw5.x7 jumpInfo, org.json.JSONObject extraData, long j17) {
        bw5.s8 c17;
        java.util.LinkedList<bw5.l7> linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        java.util.LinkedList linkedList2 = jumpInfo.b().f111630d;
        int i19 = 0;
        if (!(linkedList2 == null || linkedList2.isEmpty())) {
            if (!z17 && (linkedList = jumpInfo.b().f111630d) != null) {
                for (bw5.l7 l7Var : linkedList) {
                    java.lang.String str = l7Var.f111206g[1] ? l7Var.f111203d : "";
                    if (str != null && r26.i0.y(str, "mmecpreload_14", false)) {
                        boolean[] zArr = l7Var.f111206g;
                        java.lang.String str2 = zArr[1] ? l7Var.f111203d : "";
                        if (!(str2 == null || str2.length() == 0)) {
                            str2 = str2 + '_' + (i17 == 0 ? 1 : i17);
                        }
                        l7Var.f111203d = str2;
                        zArr[1] = true;
                    }
                }
            }
            if (z17) {
                c17 = n00.g.f415354a.b().b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getGroupEntrance(...)");
            } else {
                c17 = n00.g.f415354a.b().c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getSingleEntrance(...)");
            }
            if ((c17.f114389t & ((long) i18)) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsGiftPreloadHelper", "on gift button preload " + i18);
                bw5.d6 d6Var = new bw5.d6();
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(extraData.toString());
                boolean[] zArr2 = d6Var.f107872f;
                if (!K0) {
                    d6Var.f107871e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(extraData.toString());
                    zArr2[2] = true;
                }
                if (i18 == 1) {
                    i19 = 1;
                } else if (i18 == 2) {
                    i19 = 2;
                }
                d6Var.f107870d = i19;
                zArr2[1] = true;
                if (j17 > 0 && i18 == 2) {
                    ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("EcsGiftPreloadCost", (int) (android.os.SystemClock.elapsedRealtime() - j17), "0");
                }
                y02.p0 a17 = y02.r0.f540159d.a();
                if (a17 != null) {
                    bw5.m7 b17 = jumpInfo.b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getCgiPreloadInfo(...)");
                    ((y02.r0) a17).e(b17, d6Var);
                }
            }
        }
    }

    public final org.json.JSONObject b(c00.j3 sender, boolean z17, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sender, "sender");
        if (!z17) {
            i17 = 1;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str2 = sender.f118526b.f118500a;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("group_name", str2);
        jSONObject.put("group_uv", i17);
        jSONObject.put("chat_type", z17 ? 1 : 0);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        jSONObject.put("ecs_svr_ticket", str);
        jSONObject.put("general_recommend_scene", z17 ? 1004 : 1001);
        return jSONObject;
    }
}
