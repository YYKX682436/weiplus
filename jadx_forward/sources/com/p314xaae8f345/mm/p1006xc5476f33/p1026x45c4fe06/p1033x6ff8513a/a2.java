package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f157670a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object[] f157671b;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.z1[] z1VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.z1.f157869d;
        f157670a = 4;
        f157671b = new java.lang.Object[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NO_SUCH_KEY};
    }

    public static final void a(java.lang.String appId, int i17, yz5.l getter, yz5.p setter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getter, "getter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setter, "setter");
        int[] f17 = f(appId, getter, setter);
        if (kz5.z.F(f17, i17)) {
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) kz5.v.e(f17));
        jSONArray.put(i17);
        java.lang.String d17 = d(appId, "@@@TOTAL@STORAGE@ID@@@");
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        setter.mo149xb9724478(d17, jSONArray2);
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
        return i17 < 0 || i17 > f157670a;
    }

    public static final java.lang.String d(java.lang.String appId, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return e(0, appId, key, "++");
    }

    public static final java.lang.String e(int i17, java.lang.String appId, java.lang.String key, java.lang.String separator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(separator, "separator");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 > 0) {
            sb6.append(i17);
            sb6.append(separator);
        }
        sb6.append(appId);
        sb6.append(separator);
        sb6.append(key);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final int[] f(java.lang.String appId, yz5.l getter, yz5.p setter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getter, "getter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setter, "setter");
        java.lang.String d17 = d(appId, "@@@TOTAL@STORAGE@ID@@@");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return new int[]{0};
        }
        java.lang.String str = (java.lang.String) getter.mo146xb9724478(d17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wxGlobal", appId)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158747n;
        }
        k91.v5 v5Var = null;
        if (i17 == 0 || i17 == 2) {
            k91.f1 f1Var = k91.g1.f387121d;
            f1Var.getClass();
            if (android.text.TextUtils.isEmpty(appId)) {
                i18 = -1;
            } else {
                synchronized (f1Var.f387113a) {
                    i18 = f1Var.f387113a.get(appId.hashCode(), -1);
                }
            }
            if (i18 <= 0) {
                try {
                    v5Var = k91.w5.f387346b.b(appId, "dynamicInfo");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppServiceSettingsResolver", e17, "queryWithAppId(%s)", appId);
                }
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = appId;
                objArr[1] = java.lang.Integer.valueOf(v5Var != null ? v5Var.v0().f387239a.f158942d : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppServiceSettingsResolver", "readAppFileStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", objArr);
                i19 = v5Var != null ? v5Var.v0().f387239a.f158942d : 5;
                k91.f1 f1Var2 = k91.g1.f387121d;
                f1Var2.getClass();
                if (!android.text.TextUtils.isEmpty(appId)) {
                    synchronized (f1Var2.f387113a) {
                        f1Var2.f387113a.put(appId.hashCode(), i19);
                    }
                }
                i18 = i19;
            }
            return i18 * 1048576;
        }
        k91.f1 f1Var3 = k91.g1.f387122e;
        f1Var3.getClass();
        if (android.text.TextUtils.isEmpty(appId)) {
            i18 = -1;
        } else {
            synchronized (f1Var3.f387113a) {
                i18 = f1Var3.f387113a.get(appId.hashCode(), -1);
            }
        }
        if (i18 <= 0) {
            try {
                v5Var = k91.w5.f387346b.b(appId, "dynamicInfo");
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppServiceSettingsResolver", e18, "queryWithAppId(%s)", appId);
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = appId;
            objArr2[1] = java.lang.Integer.valueOf(v5Var != null ? v5Var.v0().f387239a.f158943e : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppServiceSettingsResolver", "readAppOpendataLocalStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", objArr2);
            i19 = v5Var != null ? v5Var.v0().f387239a.f158943e : 5;
            k91.f1 f1Var4 = k91.g1.f387122e;
            f1Var4.getClass();
            if (!android.text.TextUtils.isEmpty(appId)) {
                synchronized (f1Var4.f387113a) {
                    f1Var4.f387113a.put(appId.hashCode(), i19);
                }
            }
            i18 = i19;
        }
        return i18 * 1048576;
    }

    public static final void h(java.lang.String appId, int i17, yz5.l getter, yz5.p setter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getter, "getter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setter, "setter");
        java.util.List B0 = kz5.z.B0(f(appId, getter, setter));
        ((java.util.ArrayList) B0).remove(java.lang.Integer.valueOf(i17));
        java.lang.String d17 = d(appId, "@@@TOTAL@STORAGE@ID@@@");
        java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) B0).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "toString(...)");
        setter.mo149xb9724478(d17, jSONArray);
    }
}
