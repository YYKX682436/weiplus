package j00;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final j00.n f378370a = new j00.n();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f378371b = jz5.h.b(j00.m.f378363d);

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(c00.j3 sender, boolean z17, int i17, bw5.x7 x7Var, java.lang.String str, int i18, long j17) {
        bw5.s8 c17;
        java.util.LinkedList linkedList = x7Var.b().f111630d;
        int i19 = 0;
        if ((linkedList == null || linkedList.isEmpty()) ^ true) {
            if (z17) {
                c17 = n00.g.f415354a.b().b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getGroupEntrance(...)");
            } else {
                c17 = n00.g.f415354a.b().c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getSingleEntrance(...)");
            }
            if (((c17.f114389t & ((long) i18)) > 0) == true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftEntrancePreloadLogicNew", "performPreload: timing=" + i18 + ", ticket=" + str);
                if (j17 > 0 && i18 == 2) {
                    ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("EcsGiftPreloadCost", (int) (android.os.SystemClock.elapsedRealtime() - j17), "1");
                }
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
                bw5.d6 d6Var = new bw5.d6();
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.toString());
                boolean[] zArr = d6Var.f107872f;
                if (!K0) {
                    d6Var.f107871e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(jSONObject.toString());
                    zArr[2] = true;
                }
                if (i18 == 1) {
                    i19 = 1;
                } else if (i18 == 2) {
                    i19 = 2;
                }
                d6Var.f107870d = i19;
                zArr[1] = true;
                y02.p0 a17 = y02.r0.f540159d.a();
                if (a17 != null) {
                    bw5.m7 b17 = x7Var.b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getCgiPreloadInfo(...)");
                    ((y02.r0) a17).e(b17, d6Var);
                }
            }
        }
    }
}
