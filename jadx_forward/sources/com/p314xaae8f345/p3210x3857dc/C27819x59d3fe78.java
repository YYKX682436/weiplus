package com.p314xaae8f345.p3210x3857dc;

/* renamed from: com.tencent.xweb.XWebCoreWrapper */
/* loaded from: classes13.dex */
public class C27819x59d3fe78 implements tx5.h {
    public static final java.lang.String TAG = "XWebCoreWrapper";

    /* renamed from: getBridgeClass */
    public java.lang.Class<?> m120198xfefc2a39(java.lang.String str) {
        try {
            java.lang.ClassLoader mo120202xd8834429 = mo120202xd8834429();
            if (mo120202xd8834429 == null) {
                return null;
            }
            return mo120202xd8834429.loadClass(mo120200x5633bbf2() + "." + str);
        } catch (java.lang.Throwable th6) {
            by5.c4.g(TAG, "getBridgeClass failed, class:" + str + ", error:" + th6);
            return null;
        }
    }

    /* renamed from: getBridgeObject */
    public java.lang.Object m120199xf47a3a9e(java.lang.Object obj) {
        try {
            return new by5.i0(obj, "getBridge", new java.lang.Class[0]).b(new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.g(TAG, "getBridgeObject failed, object:" + obj + ", error:" + th6);
            return null;
        }
    }

    /* renamed from: getBridgePackageName */
    public java.lang.String mo120200x5633bbf2() {
        return null;
    }

    /* renamed from: getClass */
    public java.lang.Class<?> m120201x74434fc2(java.lang.String str) {
        try {
            java.lang.ClassLoader mo120202xd8834429 = mo120202xd8834429();
            if (mo120202xd8834429 != null) {
                return mo120202xd8834429.loadClass(str);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            by5.c4.g(TAG, "getClass failed, class:" + str + ", error:" + th6);
            return null;
        }
    }

    /* renamed from: getWebViewCoreClassLoader */
    public java.lang.ClassLoader mo120202xd8834429() {
        return null;
    }

    @Override // tx5.h
    /* renamed from: hasFeature */
    public boolean mo120203x3ec63efc(int i17) {
        return false;
    }

    @Override // tx5.h
    /* renamed from: invokeNativeChannel */
    public boolean mo120204x9bf4bb54(int i17, java.lang.Object[] objArr) {
        return false;
    }

    @Override // tx5.h
    /* renamed from: invokeRuntimeChannel */
    public java.lang.Object mo120205xb04520a3(int i17, java.lang.Object[] objArr) {
        return null;
    }
}
