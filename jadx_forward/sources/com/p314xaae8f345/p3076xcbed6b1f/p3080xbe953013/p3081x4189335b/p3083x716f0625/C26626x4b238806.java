package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625;

/* renamed from: com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor */
/* loaded from: classes13.dex */
public class C26626x4b238806 extends com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05<android.os.IBinder> {
    private static final java.lang.String TAG = "Tinker.SvcBndrIntrcptr";

    /* renamed from: sGetServiceMethod */
    private static java.lang.reflect.Method f55593x413ca2d3;

    /* renamed from: sSCacheField */
    private static java.lang.reflect.Field f55594x321b7cf8;

    /* renamed from: sServiceManagerClazz */
    private static java.lang.Class<?> f55595xcd42368d;

    /* renamed from: mBaseContext */
    private final android.content.Context f55596x6bf1baf1;

    /* renamed from: mBinderInvocationHandler */
    private final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler f55597xbd8554e3;

    /* renamed from: mServiceName */
    private final java.lang.String f55598x37196433;

    /* renamed from: com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor$BinderInvocationHandler */
    /* loaded from: classes13.dex */
    public interface BinderInvocationHandler {
        /* renamed from: invoke */
        java.lang.Object mo104588xb9724478(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr);
    }

    /* renamed from: com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor$FakeClientBinderHandler */
    /* loaded from: classes13.dex */
    public static class FakeClientBinderHandler implements java.lang.reflect.InvocationHandler {

        /* renamed from: mBinderInvocationHandler */
        private final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler f55600xbd8554e3;

        /* renamed from: mOriginalClientBinder */
        private final android.os.IBinder f55601x6e5319d3;

        public FakeClientBinderHandler(android.os.IBinder iBinder, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler binderInvocationHandler) {
            this.f55601x6e5319d3 = iBinder;
            this.f55600xbd8554e3 = binderInvocationHandler;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            if (!"queryLocalInterface".equals(method.getName())) {
                return method.invoke(this.f55601x6e5319d3, objArr);
            }
            java.lang.String interfaceDescriptor = this.f55601x6e5319d3.getInterfaceDescriptor();
            android.os.IInterface iInterface = (android.os.IInterface) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa(java.lang.Class.forName(interfaceDescriptor.equals("android.app.IActivityManager") ? "android.app.ActivityManagerNative" : interfaceDescriptor.concat("$Stub")), "asInterface", (java.lang.Class<?>[]) new java.lang.Class[]{android.os.IBinder.class}).invoke(null, this.f55601x6e5319d3);
            return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.m104605xe1c076d2(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.m104608x4b2cabda(iInterface.getClass()), new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.FakeInterfaceHandler(iInterface, (android.os.IBinder) obj, this.f55600xbd8554e3));
        }
    }

    /* renamed from: com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor$FakeInterfaceHandler */
    /* loaded from: classes13.dex */
    public static class FakeInterfaceHandler implements java.lang.reflect.InvocationHandler {

        /* renamed from: mBinderInvocationHandler */
        private final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler f55602xbd8554e3;

        /* renamed from: mOriginalClientBinder */
        private final android.os.IBinder f55603x6e5319d3;

        /* renamed from: mOriginalInterface */
        private final android.os.IInterface f55604xf5d6057b;

        public FakeInterfaceHandler(android.os.IInterface iInterface, android.os.IBinder iBinder, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler binderInvocationHandler) {
            this.f55604xf5d6057b = iInterface;
            this.f55603x6e5319d3 = iBinder;
            this.f55602xbd8554e3 = binderInvocationHandler;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            return "asBinder".equals(method.getName()) ? this.f55603x6e5319d3 : this.f55602xbd8554e3.mo104588xb9724478(this.f55604xf5d6057b, method, objArr);
        }
    }

    static {
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.class) {
            if (f55595xcd42368d == null) {
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("android.os.ServiceManager");
                    f55595xcd42368d = cls;
                    f55594x321b7cf8 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls, "sCache");
                    f55593x413ca2d3 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa(f55595xcd42368d, "getService", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "unexpected exception.", th6);
                }
            }
        }
    }

    public C26626x4b238806(android.content.Context context, java.lang.String str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.BinderInvocationHandler binderInvocationHandler) {
        while (context != null && (context instanceof android.content.ContextWrapper)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        this.f55596x6bf1baf1 = context;
        this.f55598x37196433 = str;
        this.f55597xbd8554e3 = binderInvocationHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createProxy */
    public static <T> T m104605xe1c076d2(java.lang.Class<?>[] clsArr, java.lang.reflect.InvocationHandler invocationHandler) {
        int length = clsArr.length + 1;
        java.lang.Class[] clsArr2 = new java.lang.Class[length];
        java.lang.System.arraycopy(clsArr, 0, clsArr2, 0, clsArr.length);
        clsArr2[clsArr.length] = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class;
        try {
            return (T) java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), clsArr2, invocationHandler);
        } catch (java.lang.Throwable th6) {
            final java.util.HashSet hashSet = new java.util.HashSet(4);
            for (int i17 = 0; i17 < length; i17++) {
                hashSet.add(clsArr2[i17].getClassLoader());
            }
            java.lang.ClassLoader classLoader = hashSet.size() == 1 ? (java.lang.ClassLoader) hashSet.iterator().next() : new java.lang.ClassLoader() { // from class: com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.1
                @Override // java.lang.ClassLoader
                public java.lang.Class<?> loadClass(java.lang.String str, boolean z17) {
                    java.util.Iterator it = hashSet.iterator();
                    java.lang.Class<?> cls = null;
                    while (it.hasNext()) {
                        try {
                            cls = ((java.lang.ClassLoader) it.next()).loadClass(str);
                        } catch (java.lang.Throwable unused) {
                        }
                        if (cls != null) {
                            return cls;
                        }
                    }
                    throw new java.lang.ClassNotFoundException("cannot find class: " + str);
                }
            };
            return (T) java.lang.reflect.Proxy.newProxyInstance(classLoader, clsArr2, invocationHandler);
        }
    }

    /* renamed from: fixAMSBinderCache */
    private static void m104606xe05c5326(android.os.IBinder iBinder) {
        java.lang.Object obj;
        try {
            obj = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(java.lang.Class.forName("android.app.ActivityManagerNative"), "gDefault").get(null);
        } catch (java.lang.Throwable unused) {
            obj = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(java.lang.Class.forName("android.app.ActivityManager"), "IActivityManagerSingleton").get(null);
        }
        java.lang.reflect.Field m104703x183d66c1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj, "mInstance");
        android.os.IInterface iInterface = (android.os.IInterface) m104703x183d66c1.get(obj);
        if (iInterface == null || com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class.isAssignableFrom(iInterface.getClass())) {
            return;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
        if (queryLocalInterface != null && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class.isAssignableFrom(queryLocalInterface.getClass())) {
            m104703x183d66c1.set(obj, queryLocalInterface);
            return;
        }
        throw new java.lang.IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface);
    }

    /* renamed from: fixPMSBinderCache */
    private static void m104607x1c5b2377(android.content.Context context, android.os.IBinder iBinder) {
        java.lang.reflect.Field m104702x183d66c1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(java.lang.Class.forName("android.app.ActivityThread"), "sPackageManager");
        android.os.IInterface iInterface = (android.os.IInterface) m104702x183d66c1.get(null);
        if (iInterface != null && !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class.isAssignableFrom(iInterface.getClass())) {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
            if (queryLocalInterface == null || !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class.isAssignableFrom(queryLocalInterface.getClass())) {
                throw new java.lang.IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface);
            }
            m104702x183d66c1.set(null, queryLocalInterface);
        }
        java.lang.reflect.Field m104702x183d66c12 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(java.lang.Class.forName("android.app.ApplicationPackageManager"), "mPM");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.os.IInterface iInterface2 = (android.os.IInterface) m104702x183d66c12.get(packageManager);
        if (iInterface2 == null || com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class.isAssignableFrom(iInterface2.getClass())) {
            return;
        }
        android.os.IInterface queryLocalInterface2 = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
        if (queryLocalInterface2 != null && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class.isAssignableFrom(queryLocalInterface2.getClass())) {
            m104702x183d66c12.set(packageManager, queryLocalInterface2);
            return;
        }
        throw new java.lang.IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAllInterfacesThroughDeriveChain */
    public static java.lang.Class<?>[] m104608x4b2cabda(java.lang.Class<?> cls) {
        if (cls == null) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet(10);
        while (!java.lang.Object.class.equals(cls)) {
            hashSet.addAll(java.util.Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }
        return (java.lang.Class[]) hashSet.toArray(new java.lang.Class[hashSet.size()]);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05
    /* renamed from: decorate, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public android.os.IBinder mo104597x220c2b0d(android.os.IBinder iBinder) {
        if (iBinder != null) {
            return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class.isAssignableFrom(iBinder.getClass()) ? iBinder : (android.os.IBinder) m104605xe1c076d2(m104608x4b2cabda(iBinder.getClass()), new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806.FakeClientBinderHandler(iBinder, this.f55597xbd8554e3));
        }
        throw new java.lang.IllegalStateException("target is null.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05
    /* renamed from: fetchTarget */
    public android.os.IBinder mo104598x219af0eb() {
        return (android.os.IBinder) f55593x413ca2d3.invoke(null, this.f55598x37196433);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05
    /* renamed from: inject, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo104599xb96ca991(android.os.IBinder iBinder) {
        ((java.util.Map) f55594x321b7cf8.get(null)).put(this.f55598x37196433, iBinder);
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100.equals(this.f55598x37196433)) {
            m104606xe05c5326(iBinder);
        } else if ("package".equals(this.f55598x37196433)) {
            m104607x1c5b2377(this.f55596x6bf1baf1, iBinder);
        }
    }
}
