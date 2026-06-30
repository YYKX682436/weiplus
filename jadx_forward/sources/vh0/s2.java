package vh0;

/* loaded from: classes.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f518496d;

    public s2(vh0.f3 f3Var) {
        this.f518496d = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotRoutineService", "start updateChatBotFromServer!");
        this.f518496d.getClass();
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_update_chatbot_username_list_android, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        if (Zi.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotRoutineService", "skip due to usernameListJsonStr is empty");
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(Zi);
            if (jSONArray.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotRoutineService", "skip due to updateUsernameList is empty");
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = M.getLong("SP_CHAT_BOT_AUTO_GET_CONTACT", 0L);
            if (currentTimeMillis - j17 < com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotRoutineService", "skip due to time limit, pre:" + j17 + ", now:" + currentTimeMillis);
                return;
            }
            int length = jSONArray.length();
            while (i17 < length) {
                java.lang.String string = jSONArray.getString(i17);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(string, true);
                if (!n17.r2()) {
                    i17 = (n17.m124896xfb85f7b0() & 2) != 0 ? 0 : i17 + 1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotRoutineService", "try to get contact for:" + string);
                ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(string, 12, vh0.e3.f518386a);
            }
            M.putLong("SP_CHAT_BOT_AUTO_GET_CONTACT", currentTimeMillis);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotRoutineService", th6, "", new java.lang.Object[0]);
        }
    }
}
