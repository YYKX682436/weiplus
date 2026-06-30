package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342;

/* renamed from: com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig */
/* loaded from: classes16.dex */
public class C26466xe7648225 {

    /* renamed from: cacheDir */
    public java.lang.String f53868xe62915ab;

    /* renamed from: dataDir */
    public java.lang.String f53869x56050483;

    /* renamed from: initConfig */
    public java.lang.String f53870xf3d9c872;

    /* renamed from: maxUseMemoryMB */
    public long f53871xb028b8f9;

    /* renamed from: maxUseStorageMB */
    public long f53872x52ae3f0d;

    /* renamed from: serviceType */
    public int f53874x8d0f678f;

    /* renamed from: vodCachedEnable */
    public boolean f53875xc995b5b0 = false;

    /* renamed from: reportEnable */
    public boolean f53873xbb6afd7 = true;

    /* renamed from: com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig$Helper */
    /* loaded from: classes16.dex */
    public static final class Helper {
        /* renamed from: bufferTimeSecJsonConfig */
        public static java.lang.String m103107xa2647b4e(long j17) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("VodEmergencyTimeMax", j17);
                jSONObject.put("VodSafePlayTimeMax", j17);
                jSONObject.put("FileVodEmergencyTimeMax", j17);
                jSONObject.put("FileVodSafePlayTimeMax", j17);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }

        /* renamed from: clone */
        public static com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103108x5a5dd5d(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe7648225) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe76482252 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225();
            c26466xe76482252.f53874x8d0f678f = c26466xe7648225.f53874x8d0f678f;
            c26466xe76482252.f53868xe62915ab = c26466xe7648225.f53868xe62915ab;
            c26466xe76482252.f53869x56050483 = c26466xe7648225.f53869x56050483;
            c26466xe76482252.f53871xb028b8f9 = c26466xe7648225.f53871xb028b8f9;
            c26466xe76482252.f53872x52ae3f0d = c26466xe7648225.f53872x52ae3f0d;
            c26466xe76482252.f53875xc995b5b0 = c26466xe7648225.f53875xc995b5b0;
            c26466xe76482252.f53873xbb6afd7 = c26466xe7648225.f53873xbb6afd7;
            c26466xe76482252.f53870xf3d9c872 = c26466xe7648225.f53870xf3d9c872;
            return c26466xe76482252;
        }

        /* renamed from: jsonConfig */
        public static java.lang.String m103109xff5b0e4a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe7648225) {
            if (!android.text.TextUtils.isEmpty(c26466xe7648225.f53870xf3d9c872)) {
                return c26466xe7648225.f53870xf3d9c872;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("EnableReport", c26466xe7648225.f53873xbb6afd7);
                jSONObject.put("VodCacheEnable", c26466xe7648225.f53875xc995b5b0);
                long j17 = c26466xe7648225.f53871xb028b8f9;
                if (j17 > 0) {
                    jSONObject.put("MaxUseMemoryLevel1MB", j17);
                    jSONObject.put("MaxUseMemoryLevel2MB", c26466xe7648225.f53871xb028b8f9);
                    jSONObject.put("MaxUseMemoryMB", c26466xe7648225.f53871xb028b8f9);
                }
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }

        /* renamed from: maxUseMemoryMBJsonConfig */
        public static java.lang.String m103110x47418023(long j17) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("MaxUseMemoryLevel1MB", j17);
                jSONObject.put("MaxUseMemoryLevel2MB", j17);
                jSONObject.put("MaxUseMemoryMB", j17);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }

        /* renamed from: reportEnableJsonConfig */
        public static java.lang.String m103111x38a6f981(boolean z17) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("EnableReport", z17);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }

        /* renamed from: vodCachedEnableJsonConfig */
        public static java.lang.String m103112x191f441a(boolean z17) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("VodCacheEnable", z17);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }
    }
}
