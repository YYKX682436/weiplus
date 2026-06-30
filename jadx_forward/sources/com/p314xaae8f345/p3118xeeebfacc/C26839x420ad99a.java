package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0087 J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\f\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J&\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0003R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/unit_rc/ProguardConfig;", "", "", "className", "Ljava/lang/Class;", "clazz", "Ljz5/f0;", "register", "registerClass", "findClass", "methodName", "signature", "findMethod", "findMethodInternal", "", "classMap", "Ljava/util/Map;", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.unit_rc.ProguardConfig */
/* loaded from: classes13.dex */
public final class C26839x420ad99a {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p3118xeeebfacc.C26839x420ad99a f57669x4fbc8495 = new com.p314xaae8f345.p3118xeeebfacc.C26839x420ad99a();
    private static final java.util.Map<java.lang.String, java.lang.String> classMap = new java.util.LinkedHashMap();

    private C26839x420ad99a() {
    }

    /* renamed from: findClass */
    public static final synchronized java.lang.String m106022x18146f3f(java.lang.String className) {
        java.lang.String str;
        synchronized (com.p314xaae8f345.p3118xeeebfacc.C26839x420ad99a.class) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(className, "className");
            com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("findClass ".concat(className));
            str = classMap.get(className);
            com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("foundClass " + className + ' ' + str);
            if (str == null) {
                throw new java.lang.IllegalStateException("Class " + className + " not found");
            }
        }
        return str;
    }

    /* renamed from: findMethod */
    public static final java.lang.String m106023xfb2fc3fa(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.String signature) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodName, "methodName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("findMethod " + clazz + ' ' + methodName + ' ' + signature);
        java.lang.String m106024x6d6b54d7 = m106024x6d6b54d7(clazz, methodName, signature);
        if (m106024x6d6b54d7 != null) {
            com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("foundMethod " + m106024x6d6b54d7 + ", " + methodName + " in " + clazz);
            return m106024x6d6b54d7;
        }
        java.lang.Class<?>[] interfaces = clazz.getInterfaces();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interfaces, "clazz.interfaces");
        for (java.lang.Class<?> inf : interfaces) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inf, "inf");
            java.lang.String m106024x6d6b54d72 = m106024x6d6b54d7(inf, methodName, signature);
            if (m106024x6d6b54d72 != null) {
                com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("foundMethod " + m106024x6d6b54d72 + ", " + methodName + " in " + inf);
                return m106024x6d6b54d72;
            }
        }
        throw new java.lang.IllegalStateException("Method " + methodName + " not found");
    }

    /* renamed from: findMethodInternal */
    private static final java.lang.String m106024x6d6b54d7(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.String signature) {
        java.lang.reflect.Method method;
        boolean z17;
        java.lang.reflect.Method[] declaredMethods = clazz.getDeclaredMethods();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethods, "clazz.declaredMethods");
        int length = declaredMethods.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i17];
            com.p314xaae8f345.p3118xeeebfacc.InterfaceC26843x3e8227ad interfaceC26843x3e8227ad = (com.p314xaae8f345.p3118xeeebfacc.InterfaceC26843x3e8227ad) method.getAnnotation(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26843x3e8227ad.class);
            if (interfaceC26843x3e8227ad != null) {
                java.lang.String m106044x337a8b = interfaceC26843x3e8227ad.m106044x337a8b();
                z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(interfaceC26843x3e8227ad.m106045x3ffd98b8(), signature) & p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m106044x337a8b, methodName);
            } else {
                z17 = false;
            }
            if (z17) {
                break;
            }
            i17++;
        }
        if (method != null) {
            return method.getName();
        }
        return null;
    }

    /* renamed from: register */
    public static final synchronized void m106025xd6dc2ea3(java.lang.String className, java.lang.Class<?> clazz) {
        synchronized (com.p314xaae8f345.p3118xeeebfacc.C26839x420ad99a.class) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(className, "className");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.Package r37 = clazz.getPackage();
            java.lang.String name = r37 != null ? r37.getName() : null;
            if (name == null) {
                name = "";
            }
            sb6.append(name);
            sb6.append('.');
            sb6.append(clazz.getSimpleName());
            java.lang.String v17 = r26.i0.v(sb6.toString(), ".", "/", false, 4, null);
            com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("register " + className + ", " + v17);
            classMap.put(className, v17);
            m106026xab993895(v17, clazz);
        }
    }

    /* renamed from: registerClass */
    public static final native void m106026xab993895(java.lang.String str, java.lang.Class<?> cls);
}
