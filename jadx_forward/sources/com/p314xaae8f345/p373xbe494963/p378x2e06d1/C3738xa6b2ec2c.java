package com.p314xaae8f345.p373xbe494963.p378x2e06d1;

/* renamed from: com.tencent.liteav.base.JNIUtils */
/* loaded from: classes.dex */
public class C3738xa6b2ec2c {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f14599x7118e671 = false;

    /* renamed from: sJniClassLoader */
    private static java.lang.ClassLoader f14600x76291619;

    /* renamed from: sSelectiveJniRegistrationEnabled */
    private static java.lang.Boolean f14601x759c7aec;

    /* renamed from: enableSelectiveJniRegistration */
    public static void m29248xfb82fba5() {
        f14601x759c7aec = java.lang.Boolean.TRUE;
    }

    /* renamed from: getClassLoader */
    public static java.lang.Object m29249xa0bf1275() {
        java.lang.ClassLoader classLoader = f14600x76291619;
        return classLoader == null ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3738xa6b2ec2c.class.getClassLoader() : classLoader;
    }

    /* renamed from: isSelectiveJniRegistrationEnabled */
    public static boolean m29250x13189755() {
        if (f14601x759c7aec == null) {
            f14601x759c7aec = java.lang.Boolean.FALSE;
        }
        return f14601x759c7aec.booleanValue();
    }

    /* renamed from: setClassLoader */
    public static void m29251x372485e9(java.lang.ClassLoader classLoader) {
        f14600x76291619 = classLoader;
    }
}
