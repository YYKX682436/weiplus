package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.JNIUtils */
/* loaded from: classes7.dex */
public class C29312xa6b2ec2c {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73297x7118e671 = false;
    private static final java.lang.String TAG = "JNIUtils";

    /* renamed from: sJniClassLoader */
    private static java.lang.ClassLoader f73298x76291619;

    /* renamed from: getSplitClassLoader */
    private static java.lang.ClassLoader m152441x107daba7(java.lang.String str) {
        if (!str.isEmpty()) {
            boolean m152258x18c158c3 = org.p3343x72743996.p3344x2e06d1.C29286x5442992f.m152258x18c158c3(str);
            org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "Init JNI Classloader for %s. isInstalled=%b", str, java.lang.Boolean.valueOf(m152258x18c158c3));
            if (m152258x18c158c3) {
                return org.p3343x72743996.p3344x2e06d1.C29286x5442992f.m152250xbbde2086(str);
            }
        }
        java.lang.ClassLoader classLoader = f73298x76291619;
        return classLoader != null ? classLoader : org.p3343x72743996.p3344x2e06d1.C29312xa6b2ec2c.class.getClassLoader();
    }

    /* renamed from: setClassLoader */
    public static void m152442x372485e9(java.lang.ClassLoader classLoader) {
        f73298x76291619 = classLoader;
    }

    /* renamed from: splitMap */
    public static <K, V> void m152443x8d2a03e2(java.util.Map<K, V> map, K[] kArr, V[] vArr) {
        int i17 = 0;
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            kArr[i17] = entry.getKey();
            vArr[i17] = entry.getValue();
            i17++;
        }
    }
}
