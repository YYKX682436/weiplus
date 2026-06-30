package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.ClientInvoker */
/* loaded from: classes15.dex */
public class C27684xbd82548f {
    private static final java.lang.String TAG = "ClientInvoker";

    /* renamed from: idIndex */
    private static java.util.concurrent.atomic.AtomicLong f60593x614b2477 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.Destructor f60595x5751f3f9;

    /* renamed from: zidlCreateName */
    private java.lang.String f60600x11bb50fe;

    /* renamed from: methodInvokeDispatcher */
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface> f60596x19633840 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: taskIdConvertor */
    public com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116 f60599xed126936 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116();

    /* renamed from: clientId */
    private java.lang.String f60594x36253646 = "";

    /* renamed from: serverId */
    private java.lang.String f60598x523373be = "";

    /* renamed from: nativeHandler */
    public long f60597xf042a733 = 0;

    /* renamed from: com.tencent.wechat.zidl2.ClientInvoker$Destructor */
    /* loaded from: classes11.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {

        /* renamed from: nativePointer */
        private long f60601xaf168e26;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            this.f60601xaf168e26 = j17;
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.TAG, "Destructor():   nativePointer: " + j17, new java.lang.Object[0]);
        }

        /* renamed from: jniDestroyClientInvoker */
        public static native void m119459x1ee1861a(long j17);

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.TAG, "Destructor():   nativePointer: " + this.f60601xaf168e26, new java.lang.Object[0]);
            m119459x1ee1861a(this.f60601xaf168e26);
            this.f60601xaf168e26 = 0L;
        }
    }

    /* renamed from: com.tencent.wechat.zidl2.ClientInvoker$InvokerInterface */
    /* loaded from: classes11.dex */
    public interface InvokerInterface {
        /* renamed from: invoke */
        void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48);
    }

    /* renamed from: jniCreateClientInvoker */
    private native void m119445x57c0a52e(java.lang.String str);

    /* renamed from: jniCreateClientInvoker */
    private native void m119446x57c0a52e(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: jniInvoke */
    private native byte[] m119447x3c5cbc7d(byte[] bArr, int i17, long j17);

    /* renamed from: bytesToHexString */
    public java.lang.String m119448x8fa91166(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < bArr.length; i17++) {
            sb6.append(java.lang.String.format("%02X", java.lang.Byte.valueOf(bArr[i17])));
            if (i17 < bArr.length - 1) {
                sb6.append(" ");
            }
        }
        return sb6.toString();
    }

    /* renamed from: createClientInvoker */
    public void m119449xee932d13(java.lang.String str) {
        this.f60600x11bb50fe = str;
        java.lang.String str2 = this.f60594x36253646;
        if (str2 == null || str2.isEmpty()) {
            this.f60594x36253646 = java.lang.String.format("%s.direct.client.java", str);
        }
        java.lang.String str3 = this.f60598x523373be;
        if (str3 == null || str3.isEmpty()) {
            this.f60598x523373be = java.lang.String.format("%s.direct.server.java", str);
        }
        m119445x57c0a52e(str);
        this.f60595x5751f3f9 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.Destructor(this, this.f60597xf042a733);
    }

    /* renamed from: createInnerManager */
    public java.lang.Object mo113464xe6b30793(java.lang.String str) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "CreatePropManager unimplemented...name:" + str, new java.lang.Object[0]);
        return null;
    }

    /* renamed from: dispatchInvoke */
    public void m119451x9285b192(java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "dispatchInvoke:" + byteBuffer.remaining(), new java.lang.Object[0]);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(byteBuffer);
        java.lang.String m119485xe22f9d47 = c27686x63f3cf48.m119485xe22f9d47();
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface invokerInterface = this.f60596x19633840.get(m119485xe22f9d47);
        if (invokerInterface != null) {
            invokerInterface.mo9211xb9724478(c27686x63f3cf48);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.d(hw5.a.WARN, TAG, "dispatchInvoke method name not found name:" + m119485xe22f9d47, new java.lang.Object[0]);
    }

    /* renamed from: finalize */
    public void m119452xd764dc1e() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, " finalize(): " + this + " name: " + this.f60600x11bb50fe, new java.lang.Object[0]);
        super.finalize();
    }

    /* renamed from: getClientId */
    public java.lang.String m119453xb1ff73bc() {
        return this.f60594x36253646;
    }

    /* renamed from: getSeverId */
    public java.lang.String m119454xb441c4d6() {
        return this.f60598x523373be;
    }

    /* renamed from: getZidlCreateName */
    public java.lang.String m119455x531df4() {
        return this.f60600x11bb50fe;
    }

    /* renamed from: invoke */
    public java.nio.ByteBuffer m119456xb9724478(java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, java.lang.String.format("invoke info saved limit:%d, arrayoffset:%d, position:%d cap:%d remain:%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(byteBuffer.arrayOffset()), java.lang.Integer.valueOf(byteBuffer.position()), java.lang.Integer.valueOf(byteBuffer.capacity()), java.lang.Integer.valueOf(byteBuffer.remaining())), new java.lang.Object[0]);
        return java.nio.ByteBuffer.wrap(m119447x3c5cbc7d(byteBuffer.array(), byteBuffer.arrayOffset(), this.f60597xf042a733));
    }

    /* renamed from: setClientId */
    public void m119457xacb7d4c8(java.lang.String str) {
        this.f60594x36253646 = str;
    }

    /* renamed from: setServerId */
    public void m119458xc8c61240(java.lang.String str) {
        this.f60598x523373be = str;
    }

    /* renamed from: createClientInvoker */
    public void m119450xee932d13(java.lang.String str, java.lang.String str2) {
        this.f60600x11bb50fe = str;
        long andIncrement = f60593x614b2477.getAndIncrement();
        java.lang.String str3 = this.f60594x36253646;
        if (str3 == null || str3.isEmpty()) {
            this.f60594x36253646 = java.lang.String.format("%s.direct.client.java.%d", str, java.lang.Long.valueOf(andIncrement));
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = java.lang.String.format("%s.direct.server.java.%d", str, java.lang.Long.valueOf(andIncrement));
        }
        this.f60598x523373be = str2;
        m119446x57c0a52e(str, this.f60594x36253646, str2);
        this.f60595x5751f3f9 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.Destructor(this, this.f60597xf042a733);
    }
}
