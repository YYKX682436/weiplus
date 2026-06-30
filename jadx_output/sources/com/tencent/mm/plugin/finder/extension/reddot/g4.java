package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class g4 {
    public g4(kotlin.jvm.internal.i iVar) {
    }

    public static final java.util.List a(com.tencent.mm.plugin.finder.extension.reddot.g4 g4Var, java.lang.String str, org.json.JSONObject jSONObject) {
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
                    com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "get " + str + " businessType list=" + linkedList + '!');
                    return linkedList;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("Finder.RedDotFreqControlHandler", "getBusinessTypeList " + e17.getMessage());
                    return null;
                }
            } catch (java.lang.Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    public static org.json.JSONObject f(com.tencent.mm.plugin.finder.extension.reddot.g4 g4Var, e42.c0 c0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = "";
        }
        g4Var.getClass();
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(c0Var, str, true);
            kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "getServerConfig " + c0Var + ':' + Zi);
            if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                return null;
            }
            return new org.json.JSONObject(Zi);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotFreqControlHandler", e17.getMessage());
            return null;
        }
    }

    public final java.lang.String b(java.lang.String path, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        return path + '_' + i17;
    }

    public final java.lang.String c(java.lang.String path, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        kotlin.jvm.internal.o.g(path, "path");
        if (!com.tencent.mm.plugin.finder.extension.reddot.l5.L.contains(path)) {
            return path;
        }
        if (jbVar == null) {
            return "";
        }
        int R0 = jbVar.R0(path);
        return R0 != 0 ? b(path, R0) : path;
    }

    public final java.util.HashMap d() {
        return (java.util.HashMap) com.tencent.mm.plugin.finder.extension.reddot.l5.K.getValue();
    }

    public final java.util.List e() {
        return (java.util.List) ((jz5.n) com.tencent.mm.plugin.finder.extension.reddot.l5.I).getValue();
    }
}
