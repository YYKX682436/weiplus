package hc3;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final hc3.c f361889a = new hc3.c();

    public final r45.qg7 a(org.json.JSONObject jSONObject) {
        long optLong = jSONObject != null ? jSONObject.optLong("expiresIn", 0L) : 0L;
        int optInt = jSONObject != null ? jSONObject.optInt("quota", 0) : 0;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("packetId", "") : null;
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("channel", "") : null;
        java.lang.String str = optString2 != null ? optString2 : "";
        java.lang.String str2 = gm0.j1.b().j() + '_' + java.util.UUID.randomUUID();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[assembleData] expiresIn: " + optLong + "、quota: " + optInt + "、packetId：" + optString + "、channel、：" + str + "、token：" + str2);
        if (optLong <= 0) {
            optLong = 3600;
        }
        if (optInt <= 0) {
            optInt = 1;
        }
        long a17 = c01.id.a() + (optLong * 1000);
        r45.qg7 qg7Var = new r45.qg7();
        qg7Var.f465510d = str2;
        qg7Var.f465511e = a17;
        qg7Var.f465512f = optInt;
        qg7Var.f465513g = 0;
        qg7Var.f465514h = optString;
        qg7Var.f465515i = str;
        return qg7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.qg7 b(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc3.c.b(java.lang.String):r45.qg7");
    }

    public final void c(r45.qg7 qg7Var) {
        if (qg7Var == null) {
            return;
        }
        try {
            byte[] mo14344x5f01b1f6 = qg7Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ISO_8859_1, "ISO_8859_1");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_YUANBAO_TOKEN_DATA_STRING_SYNC, new java.lang.String(mo14344x5f01b1f6, ISO_8859_1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[setSaveTokenData] success，tokenData: " + qg7Var.f465510d + "、expiredTime: " + qg7Var.f465511e + "、packetId: " + qg7Var.f465514h + "、quota: " + qg7Var.f465512f + "、quotaUsed: " + qg7Var.f465513g + "、channel: " + qg7Var.f465515i);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HongbaoVsYuanBaoLogic", "[setSaveTokenData] failed :%s", e17.getMessage());
        }
    }
}
