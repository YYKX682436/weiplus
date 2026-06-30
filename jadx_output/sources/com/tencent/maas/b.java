package com.tencent.maas;

/* loaded from: classes13.dex */
public class b implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.c f47798a;

    public b(com.tencent.maas.c cVar) {
        this.f47798a = cVar;
    }

    @Override // a8.b
    public boolean a(java.lang.String str, int i17) {
        java.lang.String str2;
        java.lang.String str3;
        ((az0.j2) this.f47798a).getClass();
        if (kotlin.jvm.internal.o.b(str, "MaasSDK")) {
            cz0.y yVar = cz0.y.f224969a;
            java.util.concurrent.locks.ReentrantLock reentrantLock = cz0.y.f224973e;
            reentrantLock.lock();
            try {
                yVar.i();
            } finally {
                reentrantLock.unlock();
            }
        } else {
            java.util.Set set = ds.b.f242772a;
            ds.b.class.getClassLoader();
            java.lang.ClassLoader classLoader = ds.b.class.getClassLoader();
            java.lang.ClassLoader classLoader2 = (java.lang.ClassLoader) ((java.util.concurrent.ConcurrentHashMap) ds.b.f242774c).get(str);
            java.lang.String str4 = null;
            if (classLoader2 == null) {
                java.lang.String str5 = com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH + str + ".so";
                java.util.Set set2 = ds.b.f242772a;
                synchronized (set2) {
                    java.util.Iterator it = ((java.util.TreeSet) set2).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = null;
                            break;
                        }
                        java.io.File file = new java.io.File((java.lang.String) it.next(), str5);
                        if (!file.isDirectory() && file.canRead()) {
                            str2 = file.getAbsolutePath();
                            break;
                        }
                    }
                }
                if (str2 != null) {
                    try {
                        com.tencent.cso.CsoLoader.f(java.lang.Runtime.getRuntime(), str2);
                        ds.b.b(2, "MicroMsg.LoadLibrary", "[+] Library [%s] was loaded, path: %s", str, str2);
                        ds.b.a(str, str2, classLoader);
                    } catch (java.lang.UnsatisfiedLinkError unused) {
                        try {
                            java.lang.Thread.sleep(50L);
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.tencent.cso.CsoLoader.f(java.lang.Runtime.getRuntime(), str2);
                        ds.b.b(2, "MicroMsg.LoadLibrary", "[+] [RE] Library [%s] was loaded, path: %s", str, str2);
                        ds.b.a(str, str2, classLoader);
                    }
                } else {
                    ds.b.b(2, "MicroMsg.LoadLibrary", "[+] Try to load library [%s] with cl: %s", str, classLoader);
                    java.lang.reflect.Method[] methodArr = ds.b.f242776e;
                    synchronized (methodArr) {
                        try {
                            java.lang.reflect.Method method = methodArr[0];
                            if (method == null) {
                                method = java.lang.ClassLoader.class.getDeclaredMethod("findLibrary", java.lang.String.class);
                                method.setAccessible(true);
                                methodArr[0] = method;
                            }
                            str3 = (java.lang.String) method.invoke(classLoader, str);
                        } catch (java.lang.Throwable unused3) {
                            java.lang.String str6 = "[-] Fail to find library in classloader: " + classLoader;
                            java.lang.Object[] objArr = new java.lang.Object[0];
                            java.lang.ThreadLocal threadLocal = ds.b.f242778g;
                            java.lang.Boolean bool = (java.lang.Boolean) threadLocal.get();
                            if (bool == null || !bool.booleanValue()) {
                                threadLocal.set(java.lang.Boolean.TRUE);
                                kd.c.b("MicroMsg.LoadLibrary", str6, objArr);
                                threadLocal.set(java.lang.Boolean.FALSE);
                            }
                        }
                    }
                    str4 = str3;
                    if (str4 != null) {
                        try {
                            com.tencent.cso.CsoLoader.f(java.lang.Runtime.getRuntime(), str4);
                            ds.b.b(2, "MicroMsg.LoadLibrary", "[+] Library [%s] was loaded, path: %s", str, str4);
                            ds.b.a(str, str4, classLoader);
                        } catch (java.lang.UnsatisfiedLinkError unused4) {
                            try {
                                java.lang.Thread.sleep(5L);
                            } catch (java.lang.Throwable unused5) {
                            }
                            try {
                                com.tencent.cso.CsoLoader.f(java.lang.Runtime.getRuntime(), str4);
                                ds.b.b(2, "MicroMsg.LoadLibrary", "[+] [RE] Library [%s] was loaded, path: %s", str, str4);
                                ds.b.a(str, str4, classLoader);
                            } catch (java.lang.UnsatisfiedLinkError unused6) {
                            }
                        }
                    }
                }
                ((java.util.concurrent.ConcurrentHashMap) ds.b.f242774c).put(str, classLoader);
            } else if (classLoader2 != classLoader) {
                java.lang.UnsatisfiedLinkError unsatisfiedLinkError = new java.lang.UnsatisfiedLinkError("Library " + str + "to be loaded by classloader: " + classLoader + " has already loaded by classloader: " + classLoader2);
                java.util.List list = ds.b.f242773b;
                synchronized (list) {
                    java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                    if (!it6.hasNext()) {
                        throw unsatisfiedLinkError;
                    }
                    android.support.v4.media.f.a(it6.next());
                    throw null;
                }
            }
        }
        return true;
    }
}
