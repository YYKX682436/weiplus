package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class s1 {
    public static void a(boolean z17, int i17, int i18, java.util.HashMap hashMap) {
        by5.c4.f("XWebAudioHAid", "initAudioHAidConfig, enable: " + z17 + ", haidType: " + i17 + ", haidDevice: " + i18);
        android.content.SharedPreferences a17 = by5.d4.a("xweb_audio_haid_config", false);
        if (a17 == null) {
            by5.c4.c("XWebAudioHAid", "initAudioHAidConfig, sharedPreferences is null");
            return;
        }
        android.content.SharedPreferences.Editor edit = a17.edit();
        edit.putBoolean("audio_haid_enable", z17);
        edit.putInt("audio_haid_type", i17);
        edit.putInt("audio_haid_device", i18);
        if (hashMap != null) {
            edit.putString("audio_haid_extras", new org.json.JSONObject(hashMap).toString());
        } else {
            edit.putString("audio_haid_extras", "{}");
        }
        edit.commit();
    }

    public static void b(boolean z17, int i17, int i18, java.util.HashMap hashMap) {
        if (!z17) {
            by5.c4.c("XWebAudioHAid", "setAudioHAidConfig disabled.");
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("enable", z17);
            jSONObject.put("haidType", i17);
            jSONObject.put("haidDevice", i18);
            if (hashMap != null && !hashMap.isEmpty()) {
                by5.c4.b("XWebAudioHAid", "setAudioHAidConfig, extraParams: " + hashMap);
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
            }
        } catch (org.json.JSONException e17) {
            by5.c4.d("XWebAudioHAid", "setAudioHAidConfig, JSON creation error:", e17);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        by5.c4.f("XWebAudioHAid", "setAudioHAidConfig, configString: " + jSONObject2);
        if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q) {
            by5.c4.f("XWebAudioHAid", "setAudioHAidConfig, may not have finished initializing.");
            android.os.Bundle bundle = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429512l;
            synchronized (bundle) {
                bundle.putString("audioHAidConfig", jSONObject2);
            }
            return;
        }
        try {
            if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0()) {
                com.p314xaae8f345.p3210x3857dc.q2.c("audio-haid-config", jSONObject2);
            } else {
                by5.c4.f("XWebAudioHAid", "setAudioHAidConfig, Sys webview only need update ProfileStore.");
            }
        } catch (java.lang.Exception e18) {
            by5.c4.d("XWebAudioHAid", "setAudioHAidConfig, XWeb error:", e18);
        }
    }
}
