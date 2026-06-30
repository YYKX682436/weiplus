package com.p159x477cd522.p160x333422;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.eclipsesource.mmv8.V8ContextWrapper */
/* loaded from: classes7.dex */
public class C1473x72398726 implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String TAG = "V8ContextWrapper";

    /* renamed from: multiContextV8 */
    private final com.p159x477cd522.p160x333422.C1460x397c7778 f4796x7535ab58;

    /* renamed from: proxy */
    private final com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad f4797x65fca6e;

    /* renamed from: v8ContextImpl */
    private final com.p159x477cd522.p160x333422.C1473x72398726.V8ContextImpl f4798xfc84708d;

    /* renamed from: v8ContextPtr */
    private final long f4799xa50ca2e1;

    /* renamed from: com.eclipsesource.mmv8.V8ContextWrapper$V8ContextImpl */
    /* loaded from: classes7.dex */
    public final class V8ContextImpl extends com.p159x477cd522.p160x333422.C1477x4679881 implements com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad {
        private final long ptr;

        public V8ContextImpl(long j17) {
            super(com.p159x477cd522.p160x333422.C1473x72398726.this.f4796x7535ab58.m15874x5db1c78());
            this.f4856x9fca5247 = this.f125529v8.m16204x31ca9f38();
            this.ptr = j17;
        }

        /* renamed from: shareObjectImpl */
        private void m16419x6109e33e(java.lang.String str, com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, java.lang.String str2) {
            m16472x6f109a65();
            this.f125529v8.m16140x2edbf932();
            if (str == null || str.isEmpty() || interfaceC1471x242ee8ad == null) {
                return;
            }
            com.p159x477cd522.p160x333422.C1477x4679881 mo16330x2817c635 = mo16330x2817c635(str);
            if (str2 != null && !str2.isEmpty()) {
                str = str2;
            }
            interfaceC1471x242ee8ad.add(str, mo16330x2817c635);
            mo16330x2817c635.mo15825x41012807();
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: batchCompileAndGenCodeCacheForScripts */
        public void mo16344x45b0ad22(java.util.ArrayList<com.p159x477cd522.p160x333422.C1481x17e6a5e9> arrayList, java.lang.String str) {
            this.f125529v8.m16134x45b0ad22(arrayList, str);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: batchExecuteScripts */
        public java.lang.Object mo16345x723501ad(java.util.ArrayList<com.p159x477cd522.p160x333422.C1481x17e6a5e9> arrayList, java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16136x723501ad(arrayList, str, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeArrayScript */
        public com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16348x152dcf(java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16159x152dcf(str, null, 0, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeBooleanScript */
        public boolean mo16352x110b299e(java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16164x110b299e(str, null, 0, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeDebugScript */
        public java.lang.String mo16355x7828ee49(java.lang.String str, java.lang.String str2) {
            return this.f125529v8.m16165x7828ee49(str, str2);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeDoubleScript */
        public double mo16357x21bc1c11(java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16170x21bc1c11(str, null, 0, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeFileScript */
        public java.lang.Object mo16360x799b6abc(com.p159x477cd522.p160x333422.C1484x78647178 c1484x78647178, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16172x799b6abc(c1484x78647178, str, i17, str2, str3, i18, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeIntegerScript */
        public int mo16363x650a9634(java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16179x650a9634(str, null, 0, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeObjectScript */
        public com.p159x477cd522.p160x333422.C1477x4679881 mo16369x96f978ff(java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16182x96f978ff(str, null, 0, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeScript */
        public java.lang.Object mo16372x330788a0(java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16186x330788a0(str, null, 0, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeStringScript */
        public java.lang.String mo16376xe82dd051(java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16191xe82dd051(str, null, 0, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeVoidScript */
        public void mo16380xcb4354d4(java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            this.f125529v8.m16196xcb4354d4(str, null, 0, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: getGlobalObject */
        public com.p159x477cd522.p160x333422.C1477x4679881 mo16386x31ca9f38() {
            return this;
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: getPtr */
        public long mo16390xb58863b8() {
            return this.ptr;
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: newSharedV8ArrayBuffer */
        public com.p159x477cd522.p160x333422.C1466x7b8b3792 mo16394xed94e9f2(com.p159x477cd522.p160x333422.C1455x795052ca c1455x795052ca) {
            com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
            java.nio.ByteBuffer m15823x4471cd3a = c1455x795052ca.m15823x4471cd3a();
            java.util.Objects.requireNonNull(m15823x4471cd3a);
            return new com.p159x477cd522.p160x333422.C1466x7b8b3792(v86, m15823x4471cd3a);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: newV8Array */
        public com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16396xe8eb0f37() {
            return new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f125529v8);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: newV8ArrayBuffer */
        public com.p159x477cd522.p160x333422.C1470x40840ff7 mo16397x9edb0a57(int i17) {
            return new com.p159x477cd522.p160x333422.C1470x40840ff7(this.f125529v8, i17);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: newV8Function */
        public com.p159x477cd522.p160x333422.C1474xd5ce209a mo16399x9180423a(com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 interfaceC1456x656040a7) {
            return new com.p159x477cd522.p160x333422.C1474xd5ce209a(this.f125529v8, interfaceC1456x656040a7);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: newV8Object */
        public com.p159x477cd522.p160x333422.C1477x4679881 mo16400x4b75a221() {
            return new com.p159x477cd522.p160x333422.C1477x4679881(this.f125529v8);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: newV8TypedArray */
        public com.p159x477cd522.p160x333422.C1487x63ed6051 mo16401xfb9d99f1(com.p159x477cd522.p160x333422.C1470x40840ff7 c1470x40840ff7, int i17, int i18, int i19) {
            return new com.p159x477cd522.p160x333422.C1487x63ed6051(this.f125529v8, c1470x40840ff7, i17, i18, i19);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: precompile */
        public void mo16402x1b18fa30(java.lang.String str, java.lang.String str2) {
            this.f125529v8.m16246x1b18fa30(str, str2);
        }

        @Override // com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
        /* renamed from: release */
        public void mo15825x41012807() {
            if (mo16335xafdb8087()) {
                return;
            }
            this.f125529v8.m16259xb4340f03(this);
            com.p159x477cd522.p160x333422.C1473x72398726.this.f4796x7535ab58.m15879x6df9dfa8(com.p159x477cd522.p160x333422.C1473x72398726.this);
            this.f4857xdf23d93d = true;
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: saveEntryPagePathToCachePath */
        public void mo16408xeeaa8763() {
            this.f125529v8.m16265xeeaa8763();
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: shareObject */
        public void mo16409xfc013bfe(java.lang.String str, com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad) {
            m16419x6109e33e(str, interfaceC1471x242ee8ad, null);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeArrayScript */
        public com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16349x152dcf(java.lang.String str, java.lang.String str2, int i17, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16159x152dcf(str, str2, i17, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeBooleanScript */
        public boolean mo16353x110b299e(java.lang.String str, java.lang.String str2, int i17, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16164x110b299e(str, str2, i17, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeDoubleScript */
        public double mo16358x21bc1c11(java.lang.String str, java.lang.String str2, int i17, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16170x21bc1c11(str, str2, i17, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeIntegerScript */
        public int mo16364x650a9634(java.lang.String str, java.lang.String str2, int i17, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16179x650a9634(str, str2, i17, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeObjectScript */
        public com.p159x477cd522.p160x333422.C1477x4679881 mo16370x96f978ff(java.lang.String str, java.lang.String str2, int i17, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16182x96f978ff(str, str2, i17, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeScript */
        public java.lang.Object mo16373x330788a0(java.lang.String str, java.lang.String str2, int i17, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16186x330788a0(str, str2, i17, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeStringScript */
        public java.lang.String mo16377xe82dd051(java.lang.String str, java.lang.String str2, int i17, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16191xe82dd051(str, str2, i17, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeVoidScript */
        public void mo16381xcb4354d4(java.lang.String str, java.lang.String str2, int i17, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            this.f125529v8.m16196xcb4354d4(str, str2, i17, null, null, 0, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: newSharedV8ArrayBuffer */
        public com.p159x477cd522.p160x333422.C1466x7b8b3792 mo16395xed94e9f2(com.p159x477cd522.p160x333422.C1470x40840ff7 c1470x40840ff7) {
            return new com.p159x477cd522.p160x333422.C1466x7b8b3792(this.f125529v8, c1470x40840ff7.m16341x3970ce7c());
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: newV8ArrayBuffer */
        public com.p159x477cd522.p160x333422.C1470x40840ff7 mo16398x9edb0a57(java.nio.ByteBuffer byteBuffer) {
            return new com.p159x477cd522.p160x333422.C1470x40840ff7(this.f125529v8, byteBuffer);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: shareObject */
        public void mo16410xfc013bfe(java.lang.String str, com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad interfaceC1471x242ee8ad, java.lang.String str2) {
            m16419x6109e33e(str, interfaceC1471x242ee8ad, str2);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeArrayScript */
        public com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16350x152dcf(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16159x152dcf(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeBooleanScript */
        public boolean mo16354x110b299e(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16164x110b299e(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeDoubleScript */
        public double mo16359x21bc1c11(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16170x21bc1c11(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeIntegerScript */
        public int mo16365x650a9634(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16179x650a9634(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeObjectScript */
        public com.p159x477cd522.p160x333422.C1477x4679881 mo16371x96f978ff(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16182x96f978ff(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeScript */
        public java.lang.Object mo16374x330788a0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16186x330788a0(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeStringScript */
        public java.lang.String mo16378xe82dd051(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            return this.f125529v8.m16191xe82dd051(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad
        /* renamed from: executeVoidScript */
        public void mo16382xcb4354d4(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
            this.f125529v8.m16196xcb4354d4(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        }
    }

    public C1473x72398726(com.p159x477cd522.p160x333422.C1460x397c7778 c1460x397c7778, long j17) {
        this.f4796x7535ab58 = c1460x397c7778;
        this.f4799xa50ca2e1 = j17;
        m16414x11d7e3b7();
        this.f4798xfc84708d = new com.p159x477cd522.p160x333422.C1473x72398726.V8ContextImpl(j17);
        this.f4797x65fca6e = (com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad) java.lang.reflect.Proxy.newProxyInstance(com.p159x477cd522.p160x333422.C1473x72398726.class.getClassLoader(), new java.lang.Class[]{com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad.class}, this);
    }

    /* renamed from: enterContext */
    private void m16414x11d7e3b7() {
        this.f4796x7535ab58.m15871x11d7e3b7(this);
    }

    /* renamed from: context */
    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad m16415x38b735af() {
        return this.f4797x65fca6e;
    }

    /* renamed from: equals */
    public boolean m16416xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f4799xa50ca2e1 == ((com.p159x477cd522.p160x333422.C1473x72398726) obj).f4799xa50ca2e1;
    }

    /* renamed from: getPtr */
    public long m16417xb58863b8() {
        return this.f4799xa50ca2e1;
    }

    /* renamed from: hashCode */
    public int m16418x8cdac1b() {
        long j17 = this.f4799xa50ca2e1;
        return (int) (j17 ^ (j17 >>> 32));
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (!method.getName().equals("isReleased")) {
            this.f4798xfc84708d.m16472x6f109a65();
            m16414x11d7e3b7();
        }
        try {
            return method.invoke(this.f4798xfc84708d, objArr);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw e17.getCause();
        }
    }
}
