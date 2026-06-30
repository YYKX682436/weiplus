package j62;

/* loaded from: classes8.dex */
public class c extends dm.c3 implements j62.f {
    public static final l75.e0 I = dm.c3.m124837x3593deb(dm.c3.class);
    public java.util.HashMap H = null;

    public java.lang.String A0() {
        java.lang.String str = "MicroMsg.ExptItem";
        java.lang.String str2 = "";
        if (!w0()) {
            return "";
        }
        java.util.HashMap hashMap = this.H;
        if (hashMap == null || hashMap.size() <= 0) {
            E();
        }
        java.util.HashMap hashMap2 = this.H;
        if (hashMap2 != null && hashMap2.size() > 0) {
            java.lang.String str3 = "jsoncfg_param_" + this.f66062xf8fc5057 + "_";
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) hashMap2.get(str3 + "size"), 0);
            if (P <= 0) {
                return "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < P; i17++) {
                sb6.append((java.lang.String) hashMap2.get(str3 + i17));
            }
            java.lang.String sb7 = sb6.toString();
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) hashMap2.get(str3 + "decompress"), 0) > 0) {
                    java.lang.String u07 = u0(sb7);
                    java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(u07);
                    java.lang.String str4 = (java.lang.String) hashMap2.get(str3 + "md5");
                    if (a17 == null || !a17.equalsIgnoreCase(str4)) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(863L, 12L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptItem", "to session config but md5 not right deJson[%s] json[%s]", u07, sb7);
                    } else {
                        str2 = u07;
                    }
                } else {
                    str = sb6.toString();
                    str2 = str;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "tosession config e[%s]", e17.toString());
            }
        }
        return str2;
    }

    @Override // j62.f
    public java.util.HashMap E() {
        java.util.HashMap hashMap = this.H;
        if (hashMap != null) {
            return hashMap;
        }
        java.util.HashMap hashMap2 = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f66061x384f96bd)) {
            try {
                java.lang.Object obj = new org.json.JSONObject(this.f66061x384f96bd).get("Args");
                if (obj == null) {
                    return null;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                try {
                    if (obj instanceof org.json.JSONArray) {
                        org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                            v0(hashMap3, jSONArray.getJSONObject(i17), true);
                        }
                    } else if (obj instanceof org.json.JSONObject) {
                        v0(hashMap3, (org.json.JSONObject) obj, true);
                    }
                    hashMap2 = hashMap3;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    hashMap2 = hashMap3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptItem", "get expt item error [%s] exptId[%d]", e.toString(), java.lang.Integer.valueOf(this.f66062xf8fc5057));
                    this.H = hashMap2;
                    return hashMap2;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        }
        this.H = hashMap2;
        return hashMap2;
    }

    @Override // j62.f
    public java.lang.String O(java.lang.String str, java.lang.String str2) {
        return java.lang.String.format("%d,%d,%d,%d,%d,%s,%s,%d", java.lang.Integer.valueOf(this.f66062xf8fc5057), java.lang.Integer.valueOf(this.f66065x861009b5), java.lang.Integer.valueOf(this.f66063x268de0a3), java.lang.Long.valueOf(this.f66067x1bb3b54a), java.lang.Long.valueOf(this.f66059x14c61803), str, str2, java.lang.Long.valueOf(this.f66058x81ee695));
    }

    @Override // j62.f
    public int e0() {
        return this.f66062xf8fc5057;
    }

    @Override // j62.f
    public boolean g0() {
        int i17 = this.f66064xab2ef376;
        if (i17 == 4 || i17 == 10) {
            return false;
        }
        return i17 == 2 || i17 == 130 || (i17 & 2) != 0;
    }

    @Override // dm.c3, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return I;
    }

    @Override // j62.f
    /* renamed from: getGroupId */
    public int mo140409x4f4a97c4() {
        return this.f66065x861009b5;
    }

    public boolean t0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            m140412x9616526c();
            this.f66061x384f96bd = str;
            this.f66062xf8fc5057 = jSONObject.optInt("ExptId");
            this.f66065x861009b5 = jSONObject.optInt("GroupId");
            this.f66063x268de0a3 = jSONObject.optInt("ExptSequence");
            this.f66067x1bb3b54a = jSONObject.optLong("StartTime");
            this.f66059x14c61803 = jSONObject.optLong("EndTime");
            this.f66064xab2ef376 = jSONObject.optInt("ExptType");
            this.f66060x4f0eca5f = jSONObject.optString("ExptCheckSum");
            this.f66058x81ee695 = jSONObject.optLong("BucketSrc");
            E();
            java.util.HashMap hashMap = this.H;
            if (hashMap != null) {
                if (hashMap.containsKey("jsoncfg_param_" + this.f66062xf8fc5057 + "_subtype")) {
                    this.f66068x5334f55 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) this.H.get("jsoncfg_param_" + this.f66062xf8fc5057 + "_subtype"), 0);
                    m140412x9616526c();
                    return true;
                }
            }
            this.f66068x5334f55 = 0;
            m140412x9616526c();
            return true;
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(863L, 5L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptItem", "%d convertFrom [%s] error [%s]", java.lang.Integer.valueOf(hashCode()), str, e17.toString());
            return false;
        }
    }

    /* renamed from: toString */
    public java.lang.String m140412x9616526c() {
        return "{ Id: " + this.f66062xf8fc5057 + " group: " + this.f66065x861009b5 + " seq: " + this.f66063x268de0a3 + " checksum: " + this.f66060x4f0eca5f + " startTime: " + this.f66067x1bb3b54a + " endTime: " + this.f66059x14c61803 + " content: " + this.f66061x384f96bd + " type: " + this.f66064xab2ef376 + " subtype: " + this.f66068x5334f55 + " bucketSrc: " + this.f66058x81ee695 + " }";
    }

    public final java.lang.String u0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(8192);
        int length = str.length();
        int i17 = 0;
        while (i17 < length) {
            char charAt = str.charAt(i17);
            if (charAt != '^') {
                sb6.append(charAt);
                i17++;
            } else {
                int i18 = i17 + 1;
                if (str.charAt(i18) != '^') {
                    int i19 = i17 + 3;
                    java.lang.String substring = str.substring(i18, i19);
                    int i27 = 0;
                    for (int i28 = 0; i28 < 2; i28++) {
                        i27 *= 64;
                        int charAt2 = substring.charAt(i28);
                        if (charAt2 < 32 || charAt2 > 95) {
                            break;
                        }
                        i27 += charAt2 - 32;
                    }
                    java.lang.String str2 = str.charAt(i19) + "";
                    int i29 = 0;
                    for (int i37 = 0; i37 < 1; i37++) {
                        i29 *= 64;
                        int charAt3 = str2.charAt(i37);
                        if (charAt3 < 32 || charAt3 > 95) {
                            break;
                        }
                        i29 += charAt3 - 32;
                    }
                    int i38 = i29 + 5;
                    int length2 = (sb6.length() - i27) - i38;
                    sb6.append((java.lang.CharSequence) sb6, length2, i38 + length2);
                    i17 += 4;
                } else {
                    sb6.append("^");
                    i17 += 2;
                }
            }
        }
        return sb6.toString();
    }

    public final void v0(java.util.HashMap hashMap, org.json.JSONObject jSONObject, boolean z17) {
        byte[] decode;
        if (jSONObject == null || hashMap == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("Key");
        java.lang.String optString2 = jSONObject.optString("Val");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            return;
        }
        if (z17 && (decode = android.util.Base64.decode(optString2, 0)) != null && decode.length > 0) {
            if (decode.length <= 1048576) {
                try {
                    java.nio.CharBuffer decode2 = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c).decode(java.nio.ByteBuffer.wrap(decode));
                    optString2 = java.lang.String.valueOf(decode2.array(), 0, decode2.limit());
                } catch (java.lang.Error | java.lang.Exception unused) {
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptItem", "data length more 1M don't parse, reset value. key[%s]", optString);
                jx3.f.INSTANCE.mo68477x336bdfd8(863L, 16L, 1L, false);
                optString2 = "";
            }
        }
        hashMap.put(optString, optString2);
    }

    public boolean w0() {
        int i17 = this.f66068x5334f55;
        if (!(i17 == 1)) {
            if (!(i17 == 2)) {
                if (!(i17 == 3)) {
                    if (!(i17 == 4)) {
                        if (!(i17 == 5)) {
                            if (!(i17 == 6)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean y0() {
        if (this.f66063x268de0a3 < 0) {
            return false;
        }
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (i17 < this.f66067x1bb3b54a) {
            return false;
        }
        long j17 = this.f66059x14c61803;
        return j17 <= 0 || i17 <= j17;
    }

    public boolean z0() {
        java.util.HashMap hashMap = this.H;
        if (hashMap == null || hashMap.size() <= 0) {
            return false;
        }
        java.util.HashMap hashMap2 = this.H;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jsoncfg_param_");
        sb6.append(this.f66062xf8fc5057);
        sb6.append("_report");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) hashMap2.get(sb6.toString()), 0) > 0;
    }
}
