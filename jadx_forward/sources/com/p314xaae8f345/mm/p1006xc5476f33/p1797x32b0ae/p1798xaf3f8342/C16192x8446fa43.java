package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342;

/* renamed from: com.tencent.mm.plugin.lite.config.LiteAppConfigMgr */
/* loaded from: classes15.dex */
public class C16192x8446fa43 {

    /* renamed from: KEY_LITE_APP_COMMON */
    public static final java.lang.String f37327x9334b81a = "common";

    /* renamed from: KEY_LITE_APP_CONFIG_INFO */
    public static final java.lang.String f37328xee7e42bc = "LiteAppConfigInfo";

    /* renamed from: KEY_LITE_APP_CONFIG_INFO_LIST */
    public static final java.lang.String f37329x56487441 = "LiteAppConfigInfoList";

    /* renamed from: KEY_LITE_APP_SAMPLING_CONFIG_INFO */
    public static final java.lang.String f37330xd999ef22 = "LiteAppSamplingConfigInfo";

    /* renamed from: LITE_APP_GLOBAL_CONFIG */
    public static final java.lang.String f37331xb922ec4f = "wxaliteglobalconfig";
    static final java.lang.String TAG = "LiteApp.LiteAppConfigMgr";

    /* renamed from: instance */
    private static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43 f37332x21169495;

    /* renamed from: com.tencent.mm.plugin.lite.config.LiteAppConfigMgr$LiteAppConfigType */
    /* loaded from: classes15.dex */
    public enum LiteAppConfigType {
        AppConfig,
        EngineConfig,
        SamplingConfig
    }

    private C16192x8446fa43() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43 m65649x9cf0d20b() {
        if (f37332x21169495 == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.class) {
                if (f37332x21169495 == null) {
                    f37332x21169495 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43();
                }
            }
        }
        return f37332x21169495;
    }

    /* renamed from: mergeConfigJson */
    private org.json.JSONObject m65650x14570da2(org.json.JSONObject... jSONObjectArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (org.json.JSONObject jSONObject2 : jSONObjectArr) {
            jSONObject = m65651xc7114bb4(jSONObject, jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: mergeJsonObjects */
    private org.json.JSONObject m65651xc7114bb4(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONObject.toString());
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject2.get(next);
                if (jSONObject3.has(next)) {
                    java.lang.Object obj2 = jSONObject3.get(next);
                    if ((obj2 instanceof org.json.JSONObject) && (obj instanceof org.json.JSONObject)) {
                        jSONObject3.put(next, m65651xc7114bb4((org.json.JSONObject) obj2, (org.json.JSONObject) obj));
                    }
                } else {
                    jSONObject3.put(next, obj);
                }
            }
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mergeJsonObjects exception " + e17.toString());
            return null;
        }
    }

    /* renamed from: getAllConfigModel */
    public java.util.HashMap<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094> m65652xc54e9d9c() {
        java.util.HashMap<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094> hashMap = new java.util.HashMap<>();
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3> m65656xa8b1938b = m65656xa8b1938b();
        if (m65656xa8b1938b == null) {
            return hashMap;
        }
        java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3> it = m65656xa8b1938b.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 next = it.next();
            try {
                hashMap.put(next.f37422x28d45f97, (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094) new com.p176xb6135e39.p280x308fcb.i().b(next.f37423xeab2a7af, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094.class));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.toString());
                m65667x47d335df(next.f37422x28d45f97);
            }
        }
        return hashMap;
    }

    /* renamed from: getConfigModel */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094 m65653xd9e187d1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65655x6d06dd4d = m65655x6d06dd4d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094 c16193x8e74f094 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094();
        if (m65655x6d06dd4d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65655x6d06dd4d.f37423xeab2a7af)) {
            return c16193x8e74f094;
        }
        try {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094) new com.p176xb6135e39.p280x308fcb.i().b(m65655x6d06dd4d.f37423xeab2a7af, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.toString());
            m65667x47d335df(m65655x6d06dd4d.f37422x28d45f97);
            return c16193x8e74f094;
        }
    }

    /* renamed from: getEngineConfigModel */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16194x54c26332 m65654xc6fdd8af() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16194x54c26332 c16194x54c26332 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16194x54c26332();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65657xb5d4e76f = m65657xb5d4e76f();
            return (m65657xb5d4e76f == null || m65657xb5d4e76f.f37423xeab2a7af == null) ? c16194x54c26332 : (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16194x54c26332) new com.p176xb6135e39.p280x308fcb.i().b(m65657xb5d4e76f.f37423xeab2a7af, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16194x54c26332.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getEngineConfigModel error. " + e17.toString());
            return c16194x54c26332;
        }
    }

    /* renamed from: getLiteAppConfigInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65655x6d06dd4d(java.lang.String str) {
        try {
            android.os.Bundle a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppConfigInfo", str, null);
            if (a17 != null) {
                a17.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3.class.getClassLoader());
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3) a17.getParcelable(f37328xee7e42bc);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getLiteAppConfigInfo error: " + e17.toString());
        }
        return null;
    }

    /* renamed from: getLiteAppConfigInfoList */
    public java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3> m65656xa8b1938b() {
        try {
            android.os.Bundle a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppConfigList", null, null);
            if (a17 != null) {
                return a17.getParcelableArrayList(f37329x56487441);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getLiteAppConfigInfoList error. " + e17.toString());
        }
        return new java.util.ArrayList<>();
    }

    /* renamed from: getLiteAppEngineConfigInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65657xb5d4e76f() {
        try {
            android.os.Bundle a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppConfigInfo", "engineConfig", null);
            if (a17 != null) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3) a17.getParcelable(f37328xee7e42bc);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getLiteAppEngineConfigInfo error. " + e17.toString());
        }
        return null;
    }

    /* renamed from: getLiteAppGlobalConfigInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65658xfcd66b90() {
        try {
            android.os.Bundle a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppConfigInfo", f37331xb922ec4f, null);
            if (a17 != null) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3) a17.getParcelable(f37328xee7e42bc);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getLiteAppGlobalConfigInfo error. " + e17.toString());
        }
        return null;
    }

    /* renamed from: getLiteAppGlobalSamplingConfigInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a m65659xdf0722d7() {
        try {
            android.os.Bundle a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppSamplingConfigInfo", f37331xb922ec4f, null);
            if (a17 != null) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a) a17.getParcelable(f37330xd999ef22);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getLiteAppGlobalSamplingConfigInfo error. " + e17.toString());
        }
        return null;
    }

    /* renamed from: getLiteAppSamplingConfigInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a m65660xcabc8794(java.lang.String str) {
        try {
            android.os.Bundle a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppSamplingConfigInfo", str, null);
            if (a17 != null) {
                a17.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a.class.getClassLoader());
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a) a17.getParcelable(f37330xd999ef22);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getLiteAppSamplingConfigInfo error: " + e17.toString());
        }
        return null;
    }

    /* renamed from: getSamplingConfigJson */
    public java.lang.String m65661x48610c87(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a m65660xcabc8794 = m65660xcabc8794(str);
        if (m65660xcabc8794 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65660xcabc8794.f37444xeab2a7af) && !m65660xcabc8794.f37444xeab2a7af.equals("{}")) {
            return m65660xcabc8794.f37444xeab2a7af;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a m65660xcabc87942 = m65660xcabc8794("common");
        return (m65660xcabc87942 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65660xcabc87942.f37444xeab2a7af) || m65660xcabc87942.f37444xeab2a7af.equals("{}")) ? "" : m65660xcabc87942.f37444xeab2a7af;
    }

    /* renamed from: insertLiteAppConfigInfo */
    public void m65662xf3ee7c4a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 c16232x49695e3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(f37328xee7e42bc, c16232x49695e3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("insertLiteAppConfigInfo", c16232x49695e3.f37422x28d45f97, bundle);
    }

    /* renamed from: insertLiteAppSamplingConfigInfo */
    public void m65663x3ec7d991(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a c16234x732d4a2a) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(f37330xd999ef22, c16234x732d4a2a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("insertLiteAppSamplingConfigInfo", c16234x732d4a2a.f37443x28d45f97, bundle);
    }

    /* renamed from: mergeConfig */
    public void m65664xefe6099a(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65658xfcd66b90 = m65658xfcd66b90();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (m65658xfcd66b90 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65658xfcd66b90.f37424xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(m65658xfcd66b90.f37424xfa022421)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(m65658xfcd66b90.f37424xfa022421));
                jSONObject = jSONObject2.has(str) ? jSONObject2.getJSONObject(str) : new org.json.JSONObject();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65655x6d06dd4d = m65655x6d06dd4d(str);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            if (m65655x6d06dd4d == null) {
                m65655x6d06dd4d = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3();
                m65655x6d06dd4d.f37422x28d45f97 = str;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65655x6d06dd4d.f37424xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(m65655x6d06dd4d.f37424xfa022421)) {
                jSONObject4 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(m65655x6d06dd4d.f37424xfa022421));
            }
            if (y17 != null) {
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.e(str, y17.f14368xd0d13783, y17.f127552md5) + "/pkg/config.json";
                if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                    m65655x6d06dd4d.f37427x7ec9db68 = str2;
                    jSONObject3 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(str2));
                }
            }
            m65655x6d06dd4d.f37423xeab2a7af = m65650x14570da2(jSONObject4, jSONObject, jSONObject3).toString();
            m65662xf3ee7c4a(m65655x6d06dd4d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mergeConfig exception: " + e17.toString());
        }
    }

    /* renamed from: mergeGlobalConfig */
    public void m65665x1b65511d() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65658xfcd66b90 = m65658xfcd66b90();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (m65658xfcd66b90 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65658xfcd66b90.f37424xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(m65658xfcd66b90.f37424xfa022421)) {
                jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(m65658xfcd66b90.f37424xfa022421));
            }
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3 m65655x6d06dd4d = m65655x6d06dd4d(next);
                com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(next, null);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                if (m65655x6d06dd4d == null) {
                    m65655x6d06dd4d = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3();
                    m65655x6d06dd4d.f37422x28d45f97 = next;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65655x6d06dd4d.f37424xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(m65655x6d06dd4d.f37424xfa022421)) {
                    jSONObject4 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(m65655x6d06dd4d.f37424xfa022421));
                }
                if (y17 != null) {
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.e(next, y17.f14368xd0d13783, y17.f127552md5) + "/pkg/config.json";
                    if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        m65655x6d06dd4d.f37427x7ec9db68 = str;
                        jSONObject3 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(str));
                    }
                }
                m65655x6d06dd4d.f37423xeab2a7af = m65650x14570da2(jSONObject4, jSONObject2, jSONObject3).toString();
                m65662xf3ee7c4a(m65655x6d06dd4d);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mergeConfig exception: " + e17.toString());
        }
    }

    /* renamed from: mergeSamplingConfig */
    public void m65666x88542461(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a m65659xdf0722d7 = m65659xdf0722d7();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (m65659xdf0722d7 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65659xdf0722d7.f37445xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(m65659xdf0722d7.f37445xfa022421)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(m65659xdf0722d7.f37445xfa022421));
                jSONObject = jSONObject2.has(str) ? jSONObject2.getJSONObject(str) : new org.json.JSONObject();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a m65660xcabc8794 = m65660xcabc8794(str);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            if (m65660xcabc8794 == null) {
                m65660xcabc8794 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a();
                m65660xcabc8794.f37443x28d45f97 = str;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65660xcabc8794.f37445xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(m65660xcabc8794.f37445xfa022421)) {
                jSONObject3 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(m65660xcabc8794.f37445xfa022421));
            }
            m65660xcabc8794.f37444xeab2a7af = m65650x14570da2(jSONObject3, jSONObject).toString();
            m65663x3ec7d991(m65660xcabc8794);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mergeSamplingConfig exception: " + e17.toString());
        }
    }

    /* renamed from: removeLiteAppConfigInfo */
    public void m65667x47d335df(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("removeLiteAppConfigInfo", str, null);
    }

    /* renamed from: removeLiteAppSamplingConfigInfo */
    public void m65668x2eb82e26(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("removeLiteAppSamplingConfigInfo", str, null);
    }

    /* renamed from: updateGlobalSamplingConfig */
    public void m65669xef02daf5(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a c16234x732d4a2a, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a c16234x732d4a2a2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (c16234x732d4a2a != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16234x732d4a2a.f37445xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(c16234x732d4a2a.f37445xfa022421)) {
                jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(c16234x732d4a2a.f37445xfa022421));
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (c16234x732d4a2a2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16234x732d4a2a2.f37445xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(c16234x732d4a2a2.f37445xfa022421)) {
                jSONObject2 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(c16234x732d4a2a2.f37445xfa022421));
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
            java.util.Iterator<java.lang.String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                hashSet.add(keys2.next());
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                if (jSONObject.has(str)) {
                    jSONObject3 = jSONObject.getJSONObject(str);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a m65660xcabc8794 = m65660xcabc8794(str);
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                if (m65660xcabc8794 == null) {
                    m65660xcabc8794 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a();
                    m65660xcabc8794.f37443x28d45f97 = str;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65660xcabc8794.f37445xfa022421) && com.p314xaae8f345.mm.vfs.w6.j(m65660xcabc8794.f37445xfa022421)) {
                    jSONObject4 = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(m65660xcabc8794.f37445xfa022421));
                }
                m65660xcabc8794.f37444xeab2a7af = m65650x14570da2(jSONObject4, jSONObject3).toString();
                m65663x3ec7d991(m65660xcabc8794);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "updateGlobalSamplingConfig exception: " + e17.toString());
        }
    }
}
