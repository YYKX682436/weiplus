package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class v3 {
    public static java.nio.ByteBuffer a(java.nio.ByteBuffer byteBuffer) {
        return (byteBuffer == null || byteBuffer.isDirect() || !byteBuffer.hasArray()) ? byteBuffer : e(byteBuffer.array());
    }

    public static void b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "convert native buffer parameter fail, event=" + str + ", error=native buffer exceed size limit");
        hashMap.put("stack", "");
        lVar.g("onError", new org.json.JSONObject(hashMap).toString());
    }

    public static final com.tencent.mm.plugin.appbrand.utils.u3 c(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.utils.t3 t3Var) {
        com.tencent.mm.plugin.appbrand.utils.u3 u3Var = com.tencent.mm.plugin.appbrand.utils.u3.OK;
        if (tVar == null || jSONObject == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(tVar == null);
            objArr[1] = java.lang.Boolean.valueOf(jSONObject == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.NativeBufferUtil", "processNativeBufferToJs fail, invalid argument, jsruntime is null:[%b], data is null:[%b]", objArr);
            return u3Var;
        }
        if (t3Var == null) {
            t3Var = new com.tencent.mm.plugin.appbrand.utils.t3();
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(t3Var.f90562d);
        if (optJSONArray == null) {
            return u3Var;
        }
        jSONObject.remove(t3Var.f90562d);
        int length = optJSONArray.length();
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString(t3Var.f90563e);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    int optInt = optJSONObject.optInt(t3Var.f90564f, -1);
                    if (optInt == -1) {
                        try {
                            java.lang.String optString2 = optJSONObject.optString(t3Var.f90565g, "");
                            if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs base64 is null");
                                jSONObject.put(optString, java.nio.ByteBuffer.allocate(0));
                            } else {
                                jSONObject.put(optString, java.nio.ByteBuffer.wrap(android.util.Base64.decode(optString2.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)), 2)));
                            }
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs JSONException :%s", e17.getMessage());
                        }
                    } else {
                        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = (com.tencent.mm.plugin.appbrand.jsruntime.v) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.v.class);
                        if (vVar == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferAddon is null, not support");
                        } else {
                            java.nio.ByteBuffer j07 = k0Var == null ? vVar.j0(optInt, false) : k0Var.y(optString, vVar, optInt);
                            if (j07 == null) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs byteBuffer is null");
                            } else {
                                j07.position(0);
                                jSONObject.put(optString, j07);
                                i17 += j07.capacity();
                            }
                        }
                    }
                }
            }
        }
        if (i17 <= t3Var.f90566h) {
            return u3Var;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs fail, size exceed limit, bufferSize = %d, limit = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(t3Var.f90566h));
        return com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT;
    }

    public static final com.tencent.mm.plugin.appbrand.utils.u3 d(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, java.util.Map map, com.tencent.mm.plugin.appbrand.utils.t3 t3Var) {
        int K;
        com.tencent.mm.plugin.appbrand.utils.u3 u3Var = com.tencent.mm.plugin.appbrand.utils.u3.OK;
        int i17 = 0;
        if (tVar == null || map == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(tVar == null);
            objArr[1] = java.lang.Boolean.valueOf(map == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.NativeBufferUtil", "processNativeBufferToJs fail, invalid argument, jsruntime is null:[%b], map is null:[%b]", objArr);
            return u3Var;
        }
        if (t3Var == null) {
            t3Var = new com.tencent.mm.plugin.appbrand.utils.t3();
        }
        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = (com.tencent.mm.plugin.appbrand.jsruntime.v) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.v.class);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = map.entrySet().iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && (value instanceof java.nio.ByteBuffer)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(t3Var.f90563e, str);
                    if (vVar == null || (K = vVar.K()) == -1) {
                        jSONObject.put(t3Var.f90565g, new java.lang.String(android.util.Base64.encode(ik1.f.a((java.nio.ByteBuffer) value), 2), java.nio.charset.StandardCharsets.UTF_8));
                    } else {
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
                        vVar.U(K, byteBuffer);
                        jSONObject.put(t3Var.f90564f, K);
                        i17 += byteBuffer.capacity();
                    }
                    jSONArray.put(jSONObject);
                    z17 = true;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NativeBufferUtil", "processNativeBuffer JSONException :%s", e17.getMessage());
                    z17 = z17;
                }
                it.remove();
            }
        }
        if (i17 > t3Var.f90566h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NativeBufferUtil", "bufferSize exceed the limit, bufferSize = %d, limit = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(t3Var.f90566h));
            return com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT;
        }
        if (z17) {
            map.put(t3Var.f90562d, jSONArray);
        }
        return u3Var;
    }

    public static java.nio.ByteBuffer e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr, 0, bArr.length);
        allocateDirect.rewind();
        return allocateDirect;
    }
}
