package aw1;

/* loaded from: classes12.dex */
public final class a1 {
    public a1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().u("accSizeDetailedInfoJson", ""));
        return kz5.c0.i(java.lang.Long.valueOf(jSONObject.optLong("mediaSum", -1L)), java.lang.Long.valueOf(jSONObject.optLong("sizePerMsg", -1L)), java.lang.Long.valueOf(jSONObject.optLong("realMsgCount", -1L)), java.lang.Long.valueOf(jSONObject.optLong("otherAccountSize", -1L)), java.lang.Long.valueOf(jSONObject.optLong("specialSize", -1L)), java.lang.Long.valueOf(jSONObject.optLong("otherSize", -1L)));
    }

    public final boolean b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("ReportStorageDetailedTask_TO_RUN", false);
    }
}
