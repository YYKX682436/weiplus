package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f76137a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object[] f76138b;

    static {
        com.tencent.mm.plugin.appbrand.appstorage.z1[] z1VarArr = com.tencent.mm.plugin.appbrand.appstorage.z1.f76336d;
        f76137a = 4;
        f76138b = new java.lang.Object[]{com.tencent.mm.plugin.appbrand.appstorage.o1.NO_SUCH_KEY};
    }

    public static final void a(java.lang.String appId, int i17, yz5.l getter, yz5.p setter) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(getter, "getter");
        kotlin.jvm.internal.o.g(setter, "setter");
        int[] f17 = f(appId, getter, setter);
        if (kz5.z.F(f17, i17)) {
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) kz5.v.e(f17));
        jSONArray.put(i17);
        java.lang.String d17 = d(appId, "@@@TOTAL@STORAGE@ID@@@");
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        setter.invoke(d17, jSONArray2);
    }

    public static final int b(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        if (str2 == null) {
            str2 = "";
        }
        return length + str2.length();
    }

    public static final boolean c(int i17) {
        return i17 < 0 || i17 > f76137a;
    }

    public static final java.lang.String d(java.lang.String appId, java.lang.String key) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(key, "key");
        return e(0, appId, key, "++");
    }

    public static final java.lang.String e(int i17, java.lang.String appId, java.lang.String key, java.lang.String separator) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(separator, "separator");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 > 0) {
            sb6.append(i17);
            sb6.append(separator);
        }
        sb6.append(appId);
        sb6.append(separator);
        sb6.append(key);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final int[] f(java.lang.String appId, yz5.l getter, yz5.p setter) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(getter, "getter");
        kotlin.jvm.internal.o.g(setter, "setter");
        java.lang.String d17 = d(appId, "@@@TOTAL@STORAGE@ID@@@");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return new int[]{0};
        }
        java.lang.String str = (java.lang.String) getter.invoke(d17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return new int[]{0};
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray(str);
        if (jSONArray.length() <= 0) {
            return new int[]{0};
        }
        int length = jSONArray.length();
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i17 = 0; i17 < length; i17++) {
            arrayList.add(java.lang.Integer.valueOf(jSONArray.getInt(i17)));
        }
        if (!arrayList.contains(0)) {
            arrayList.add(0);
        }
        return kz5.n0.R0(arrayList);
    }

    public static final int g(int i17, java.lang.String appId) {
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(appId, "appId");
        if (kotlin.jvm.internal.o.b("wxGlobal", appId)) {
            return com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77214n;
        }
        k91.v5 v5Var = null;
        if (i17 == 0 || i17 == 2) {
            k91.f1 f1Var = k91.g1.f305588d;
            f1Var.getClass();
            if (android.text.TextUtils.isEmpty(appId)) {
                i18 = -1;
            } else {
                synchronized (f1Var.f305580a) {
                    i18 = f1Var.f305580a.get(appId.hashCode(), -1);
                }
            }
            if (i18 <= 0) {
                try {
                    v5Var = k91.w5.f305813b.b(appId, "dynamicInfo");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppServiceSettingsResolver", e17, "queryWithAppId(%s)", appId);
                }
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = appId;
                objArr[1] = java.lang.Integer.valueOf(v5Var != null ? v5Var.v0().f305706a.f77409d : -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppServiceSettingsResolver", "readAppFileStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", objArr);
                i19 = v5Var != null ? v5Var.v0().f305706a.f77409d : 5;
                k91.f1 f1Var2 = k91.g1.f305588d;
                f1Var2.getClass();
                if (!android.text.TextUtils.isEmpty(appId)) {
                    synchronized (f1Var2.f305580a) {
                        f1Var2.f305580a.put(appId.hashCode(), i19);
                    }
                }
                i18 = i19;
            }
            return i18 * 1048576;
        }
        k91.f1 f1Var3 = k91.g1.f305589e;
        f1Var3.getClass();
        if (android.text.TextUtils.isEmpty(appId)) {
            i18 = -1;
        } else {
            synchronized (f1Var3.f305580a) {
                i18 = f1Var3.f305580a.get(appId.hashCode(), -1);
            }
        }
        if (i18 <= 0) {
            try {
                v5Var = k91.w5.f305813b.b(appId, "dynamicInfo");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppServiceSettingsResolver", e18, "queryWithAppId(%s)", appId);
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = appId;
            objArr2[1] = java.lang.Integer.valueOf(v5Var != null ? v5Var.v0().f305706a.f77410e : -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppServiceSettingsResolver", "readAppOpendataLocalStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", objArr2);
            i19 = v5Var != null ? v5Var.v0().f305706a.f77410e : 5;
            k91.f1 f1Var4 = k91.g1.f305589e;
            f1Var4.getClass();
            if (!android.text.TextUtils.isEmpty(appId)) {
                synchronized (f1Var4.f305580a) {
                    f1Var4.f305580a.put(appId.hashCode(), i19);
                }
            }
            i18 = i19;
        }
        return i18 * 1048576;
    }

    public static final void h(java.lang.String appId, int i17, yz5.l getter, yz5.p setter) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(getter, "getter");
        kotlin.jvm.internal.o.g(setter, "setter");
        java.util.List B0 = kz5.z.B0(f(appId, getter, setter));
        ((java.util.ArrayList) B0).remove(java.lang.Integer.valueOf(i17));
        java.lang.String d17 = d(appId, "@@@TOTAL@STORAGE@ID@@@");
        java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) B0).toString();
        kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
        setter.invoke(d17, jSONArray);
    }
}
