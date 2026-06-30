package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class g4 {
    public g4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final java.util.List a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g4 g4Var, java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.LinkedList linkedList;
        g4Var.getClass();
        if (jSONObject != null) {
            try {
                try {
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject(str);
                    if (optJSONObject != null) {
                        linkedList = new java.util.LinkedList();
                        try {
                            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("busi_type");
                            int length = optJSONArray != null ? optJSONArray.length() : 0;
                            for (int i17 = 0; i17 < length; i17++) {
                                java.lang.Object obj = optJSONArray != null ? optJSONArray.get(i17) : null;
                                java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                                int intValue = num != null ? num.intValue() : 0;
                                if (intValue > 0) {
                                    linkedList.add(java.lang.Integer.valueOf(intValue));
                                }
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    } else {
                        linkedList = null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqControlHandler", "get " + str + " businessType list=" + linkedList + '!');
                    return linkedList;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotFreqControlHandler", "getBusinessTypeList " + e17.getMessage());
                    return null;
                }
            } catch (java.lang.Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    public static org.json.JSONObject f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g4 g4Var, e42.c0 c0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = "";
        }
        g4Var.getClass();
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(c0Var, str, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqControlHandler", "getServerConfig " + c0Var + ':' + Zi);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                return null;
            }
            return new org.json.JSONObject(Zi);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotFreqControlHandler", e17.getMessage());
            return null;
        }
    }

    public final java.lang.String b(java.lang.String path, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return path + '_' + i17;
    }

    public final java.lang.String c(java.lang.String path, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5.L.contains(path)) {
            return path;
        }
        if (jbVar == null) {
            return "";
        }
        int R0 = jbVar.R0(path);
        return R0 != 0 ? b(path, R0) : path;
    }

    public final java.util.HashMap d() {
        return (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5.K.mo141623x754a37bb();
    }

    public final java.util.List e() {
        return (java.util.List) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5.I).mo141623x754a37bb();
    }
}
