package com.tencent.live.utils;

/* loaded from: classes16.dex */
public class Logger {
    private static final java.lang.String KEY_API = "api";
    private static final java.lang.String KEY_LEVEL = "level";
    private static final java.lang.String KEY_MESSAGE = "message";
    private static final java.lang.String KEY_PARAMS = "params";
    private static final java.lang.String KEY_PRINT_LOG = "printLog";
    private static final java.lang.String LOG_PREFIX = "[Flutter]";

    private static org.json.JSONObject createLogJson(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("level", i17);
        jSONObject.put("message", "[Flutter] " + str);
        return jSONObject;
    }

    public static void playerPrint(com.tencent.live2.V2TXLivePlayer v2TXLivePlayer, int i17, java.lang.String str) {
        if (v2TXLivePlayer == null) {
            return;
        }
        try {
            v2TXLivePlayer.setProperty(KEY_PRINT_LOG, createLogJson(i17, str).toString());
        } catch (java.lang.Exception unused) {
        }
    }

    public static void premierPrint(int i17, java.lang.String str) {
        try {
            org.json.JSONObject createLogJson = createLogJson(i17, str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(KEY_API, KEY_PRINT_LOG);
            jSONObject.put(KEY_PARAMS, createLogJson);
            com.tencent.live2.V2TXLivePremier.callExperimentalAPI(jSONObject.toString());
        } catch (java.lang.Exception unused) {
        }
    }

    public static void pusherPrint(com.tencent.live2.V2TXLivePusher v2TXLivePusher, int i17, java.lang.String str) {
        if (v2TXLivePusher == null) {
            return;
        }
        try {
            v2TXLivePusher.setProperty(KEY_PRINT_LOG, createLogJson(i17, str).toString());
        } catch (java.lang.Exception unused) {
        }
    }
}
