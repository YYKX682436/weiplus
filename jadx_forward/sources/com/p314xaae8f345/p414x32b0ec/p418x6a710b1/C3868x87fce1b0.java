package com.p314xaae8f345.p414x32b0ec.p418x6a710b1;

/* renamed from: com.tencent.live.utils.Logger */
/* loaded from: classes16.dex */
public class C3868x87fce1b0 {

    /* renamed from: KEY_API */
    private static final java.lang.String f15256xfa4417fa = "api";

    /* renamed from: KEY_LEVEL */
    private static final java.lang.String f15257x7a343d64 = "level";

    /* renamed from: KEY_MESSAGE */
    private static final java.lang.String f15258xf2dca5e7 = "message";

    /* renamed from: KEY_PARAMS */
    private static final java.lang.String f15259xd2ec9386 = "params";

    /* renamed from: KEY_PRINT_LOG */
    private static final java.lang.String f15260x99179c72 = "printLog";

    /* renamed from: LOG_PREFIX */
    private static final java.lang.String f15261x44f6ec0d = "[Flutter]";

    /* renamed from: createLogJson */
    private static org.json.JSONObject m31838x9a40e5b0(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("level", i17);
        jSONObject.put("message", "[Flutter] " + str);
        return jSONObject;
    }

    /* renamed from: playerPrint */
    public static void m31839x2060cc4c(com.p314xaae8f345.p420x6236cc6.AbstractC3875xd023692d abstractC3875xd023692d, int i17, java.lang.String str) {
        if (abstractC3875xd023692d == null) {
            return;
        }
        try {
            abstractC3875xd023692d.mo30018x3b607c57(f15260x99179c72, m31838x9a40e5b0(i17, str).toString());
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: premierPrint */
    public static void m31840x6f02d9a1(int i17, java.lang.String str) {
        try {
            org.json.JSONObject m31838x9a40e5b0 = m31838x9a40e5b0(i17, str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(f15256xfa4417fa, f15260x99179c72);
            jSONObject.put(f15259xd2ec9386, m31838x9a40e5b0);
            com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31898xd33a8dd4(jSONObject.toString());
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: pusherPrint */
    public static void m31841x3dd199a6(com.p314xaae8f345.p420x6236cc6.AbstractC3878xd0aa2b93 abstractC3878xd0aa2b93, int i17, java.lang.String str) {
        if (abstractC3878xd0aa2b93 == null) {
            return;
        }
        try {
            abstractC3878xd0aa2b93.mo30156x3b607c57(f15260x99179c72, m31838x9a40e5b0(i17, str).toString());
        } catch (java.lang.Exception unused) {
        }
    }
}
