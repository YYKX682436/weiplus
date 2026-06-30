package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.CronetLoggerFactory */
/* loaded from: classes13.dex */
public final class C29604x48d9c87d {

    /* renamed from: CRONET_LOGGER_IMPL_CLASS */
    private static final java.lang.String f74595x20e7cc86 = "com.google.net.cronet.telemetry.CronetLoggerImpl";

    /* renamed from: SAMPLE_RATE_PER_SECOND */
    private static final int f74596xe314a20 = 1;
    private static final java.lang.String TAG = "CronetLoggerFactory";

    /* renamed from: sDefaultLogger */
    private static final org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd f74597xd40e057e = new org.p3343x72743996.net.p3358x316220.C29624x73403fd2();

    /* renamed from: sTestingLogger */
    private static org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd f74598x9a2b0a0d;

    /* renamed from: org.chromium.net.impl.CronetLoggerFactory$SwapLoggerForTesting */
    /* loaded from: classes13.dex */
    public static class SwapLoggerForTesting implements java.lang.AutoCloseable {
        public SwapLoggerForTesting(org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd abstractC29603x6ebc0fcd) {
            org.p3343x72743996.net.p3358x316220.C29604x48d9c87d.m154126xffda1339(abstractC29603x6ebc0fcd);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            org.p3343x72743996.net.p3358x316220.C29604x48d9c87d.m154126xffda1339(null);
        }
    }

    private C29604x48d9c87d() {
    }

    /* renamed from: createLogger */
    public static org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd m154123x4f4cd5ac(android.content.Context context, org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource cronetSource) {
        org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd abstractC29603x6ebc0fcd = f74598x9a2b0a0d;
        if (abstractC29603x6ebc0fcd != null) {
            return abstractC29603x6ebc0fcd;
        }
        if (!org.p3343x72743996.net.p3358x316220.C29605x3f4fad2c.m154128xcc2c67d0(context, cronetSource) || android.os.Build.VERSION.SDK_INT < 30) {
            return f74597xd40e057e;
        }
        java.lang.Class<? extends org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd> m154125xeb7b3d6e = m154125xeb7b3d6e();
        if (m154125xeb7b3d6e == null) {
            return f74597xd40e057e;
        }
        try {
            return m154125xeb7b3d6e.getConstructor(java.lang.Integer.TYPE).newInstance(1);
        } catch (java.lang.Exception unused) {
            return f74597xd40e057e;
        }
    }

    /* renamed from: createNoOpLogger */
    public static org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd m154124x693dd5ce() {
        return f74597xd40e057e;
    }

    /* renamed from: fetchLoggerImplClass */
    private static java.lang.Class<? extends org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd> m154125xeb7b3d6e() {
        try {
            return org.p3343x72743996.net.p3358x316220.C29604x48d9c87d.class.getClassLoader().loadClass(f74595x20e7cc86).asSubclass(org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.class);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setLoggerForTesting */
    public static void m154126xffda1339(org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd abstractC29603x6ebc0fcd) {
        f74598x9a2b0a0d = abstractC29603x6ebc0fcd;
    }
}
