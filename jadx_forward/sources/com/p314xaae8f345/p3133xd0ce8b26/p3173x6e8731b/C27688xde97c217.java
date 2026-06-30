package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.ServerInvoker */
/* loaded from: classes15.dex */
public class C27688xde97c217 {
    private static final java.lang.String TAG = "ServerInvoker";

    /* renamed from: methodInvokeDispatcher */
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217.InvokerInterface> f60613x19633840 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: taskIdConvertor */
    public com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116 f60616xed126936 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27690xb1a52116();

    /* renamed from: name */
    java.lang.String f60614x337a8b = "";

    /* renamed from: serverId */
    java.lang.String f60615x523373be = "";

    /* renamed from: com.tencent.wechat.zidl2.ServerInvoker$InvokerInterface */
    /* loaded from: classes15.dex */
    public interface InvokerInterface {
        /* renamed from: invoke */
        java.nio.ByteBuffer mo9210xb9724478(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48);
    }

    /* renamed from: jniInvoke */
    private native java.nio.ByteBuffer m119516x3c5cbc7d(java.lang.String str, java.nio.ByteBuffer byteBuffer);

    /* renamed from: attachStub */
    public void mo112761x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "AttachStub unimplemented", new java.lang.Object[0]);
    }

    /* renamed from: bytesToHexString */
    public java.lang.String m119517x8fa91166(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < bArr.length; i17++) {
            sb6.append(java.lang.String.format("%02X", java.lang.Byte.valueOf(bArr[i17])));
            if (i17 < bArr.length - 1) {
                sb6.append(" ");
            }
        }
        return sb6.toString();
    }

    /* renamed from: dispatchInvoke */
    public java.nio.ByteBuffer m119518x9285b192(java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(byteBuffer);
        java.lang.String m119485xe22f9d47 = c27686x63f3cf48.m119485xe22f9d47();
        java.lang.String m119485xe22f9d472 = c27686x63f3cf48.m119485xe22f9d47();
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "dispatchInvoke " + m119485xe22f9d472, new java.lang.Object[0]);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27688xde97c217.InvokerInterface invokerInterface = this.f60613x19633840.get(m119485xe22f9d472);
        if (invokerInterface != null) {
            return invokerInterface.mo9210xb9724478(m119485xe22f9d47, c27686x63f3cf48);
        }
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.d(hw5.a.WARN, TAG, "dispatchInvoke method name not found name:" + m119485xe22f9d472, new java.lang.Object[0]);
        return null;
    }

    /* renamed from: invoke */
    public java.nio.ByteBuffer m119519xb9724478(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        byteBuffer.limit();
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, java.lang.String.format("saved limit:%d, arrayoffset:%d, position:%d cap:%d remain:%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(byteBuffer.arrayOffset()), java.lang.Integer.valueOf(byteBuffer.position()), java.lang.Integer.valueOf(byteBuffer.capacity()), java.lang.Integer.valueOf(byteBuffer.remaining())), new java.lang.Object[0]);
        return m119516x3c5cbc7d(str, byteBuffer);
    }
}
