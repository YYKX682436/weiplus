package com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d;

/* renamed from: com.tencent.wechat.aff.cara.CaraFoundationNativeImplOnLoader */
/* loaded from: classes16.dex */
public class C27158x69bfaea9 {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27158x69bfaea9 f59462x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27158x69bfaea9();

    /* renamed from: caraUserContextRegistedClass */
    private static java.lang.Class<?> f59461x7a6b230c = null;

    /* renamed from: caraNativeAppRegistedClass */
    private static java.lang.Class<?> f59459xce6788e6 = null;

    /* renamed from: caraAndroidSoRegistedClass */
    private static java.lang.Class<?> f59458x8245be5 = null;

    /* renamed from: caraNativeDeviceRegistedClass */
    private static java.lang.Class<?> f59460xb4272509 = null;

    /* renamed from: createCaraAndroidSo */
    public static void m111413x203d2d02(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 c27692x3687e131 = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = f59458x8245be5.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            c27692x3687e131.mo73242x8aebc093(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    /* renamed from: createCaraNativeApp */
    public static void m111414xa0aff261(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 c27692x3687e131 = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = f59459xce6788e6.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            c27692x3687e131.mo73242x8aebc093(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    /* renamed from: createCaraNativeDevice */
    public static void m111415x5fa6be16(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 c27692x3687e131 = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = f59460xb4272509.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            c27692x3687e131.mo73242x8aebc093(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    /* renamed from: createCaraUserContext */
    public static void m111416xf47e497b(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 c27692x3687e131 = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = f59461x7a6b230c.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            c27692x3687e131.mo73242x8aebc093(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27158x69bfaea9 m111417x9cf0d20b() {
        return f59462x21169495;
    }

    /* renamed from: onLoader */
    public void m111418x4d8a06d2() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: registerCaraAndroidSo */
    public <T> void m111419xc84246bb(java.lang.Class<T> cls) {
        f59458x8245be5 = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: registerCaraNativeApp */
    public <T> void m111420x48b50c1a(java.lang.Class<T> cls) {
        f59459xce6788e6 = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: registerCaraNativeDevice */
    public <T> void m111421x9331dbd(java.lang.Class<T> cls) {
        f59460xb4272509 = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: registerCaraUserContext */
    public <T> void m111422xafa3d8f4(java.lang.Class<T> cls) {
        f59461x7a6b230c = cls;
    }
}
