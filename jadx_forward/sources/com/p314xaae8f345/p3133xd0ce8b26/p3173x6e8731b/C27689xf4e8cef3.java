package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.ServerInvokerFactory */
/* loaded from: classes15.dex */
public class C27689xf4e8cef3 {
    private static final java.lang.String TAG = "ServerInvokerFactory";

    /* renamed from: invokerCreator */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.CreatorInfo> f60619xb7cf5fd2 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: singletonObjectMap */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> f60618xfc4bd1d2 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3 f60617x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3();

    /* renamed from: com.tencent.wechat.zidl2.ServerInvokerFactory$CreatorInfo */
    /* loaded from: classes15.dex */
    public class CreatorInfo {

        /* renamed from: invoker */
        public java.lang.String f60620x74d64afa;

        /* renamed from: stub */
        public java.lang.String f60621x3608ae;

        public CreatorInfo(java.lang.String str, java.lang.String str2) {
            this.f60620x74d64afa = str;
            this.f60621x3608ae = str2;
        }
    }

    /* renamed from: createInvoker */
    public static java.lang.Object m119521xfabd6e5e(java.lang.String str, java.lang.String str2) {
        try {
            if (!str.endsWith("@Get")) {
                com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, java.lang.String.format("createInvoker singleton: %s, %s", str, str2), new java.lang.Object[0]);
                return m119522x9cf0d20b().m119525x67a5e59e(str, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, java.lang.String.format("createInvoker singleton: %s, %s", str, str2), new java.lang.Object[0]);
            synchronized (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.class) {
                if (!f60618xfc4bd1d2.containsKey(str)) {
                    com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217 m119525x67a5e59e = m119522x9cf0d20b().m119525x67a5e59e(str, str2);
                    f60618xfc4bd1d2.put(str, m119525x67a5e59e);
                    return m119525x67a5e59e;
                }
                com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.d(hw5.a.WARN, TAG, "createInvoker return singleton instance already created.", new java.lang.Object[0]);
                return f60618xfc4bd1d2.get(str);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.d(hw5.a.WARN, TAG, "createInvoker " + str + "error:" + e17, new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3 m119522x9cf0d20b() {
        return f60617x21169495;
    }

    /* renamed from: jniRegisterInvoker */
    private native void m119523xc2ee4472(java.lang.String str);

    /* renamed from: jniRegisterInvokerV2 */
    private native void m119524xc06efa8e(java.lang.String str);

    /* renamed from: createInvokerImpl */
    public com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217 m119525x67a5e59e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.CreatorInfo creatorInfo = this.f60619xb7cf5fd2.get(str);
        java.lang.Object m119570xe5df2226 = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119570xe5df2226(creatorInfo.f60621x3608ae);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217 c27688xde97c217 = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119570xe5df2226(creatorInfo.f60620x74d64afa);
        c27688xde97c217.f60614x337a8b = str;
        c27688xde97c217.f60615x523373be = str2;
        c27688xde97c217.mo112761x8aebc093(m119570xe5df2226);
        return c27688xde97c217;
    }

    /* renamed from: registerInvoker */
    public <TInvoker, TStub> void m119526x6c2286d7(java.lang.String str, java.lang.Class<TInvoker> cls, java.lang.Class<TStub> cls2) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.CreatorInfo creatorInfo = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.CreatorInfo(cls.getName(), cls2.getName());
        java.lang.String name = cls.getName();
        creatorInfo.f60620x74d64afa = name;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, java.lang.String.format("createInvoker invoker: %s stub:%s", name, creatorInfo.f60621x3608ae), new java.lang.Object[0]);
        this.f60619xb7cf5fd2.put(str, creatorInfo);
        m119523xc2ee4472(str);
    }

    /* renamed from: registerInvokerV2 */
    public <TInvoker, TStub> void m119527xed9c37b3(java.lang.String str, java.lang.Class<TInvoker> cls, java.lang.Class<TStub> cls2) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.CreatorInfo creatorInfo = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.CreatorInfo(cls.getName(), cls2.getName());
        java.lang.String name = cls.getName();
        creatorInfo.f60620x74d64afa = name;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, java.lang.String.format("createInvoker invoker: %s stub:%s", name, creatorInfo.f60621x3608ae), new java.lang.Object[0]);
        this.f60619xb7cf5fd2.put(str, creatorInfo);
        m119524xc06efa8e(str);
    }
}
