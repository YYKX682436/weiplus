package com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a;

/* renamed from: com.tencent.tav.decoder.factory.AVResampleFactory */
/* loaded from: classes16.dex */
public class C25794x2670fbb8 {
    private static final java.lang.String TAG = "AVResampleFactory";

    /* renamed from: instance */
    private static com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8 f48368x21169495;

    /* renamed from: tavResampleEnable */
    private boolean f48369xd195e989;

    public C25794x2670fbb8() {
        this.f48369xd195e989 = false;
        try {
            java.lang.Class.forName("com.tencent.tavkit.resample.TAVResample");
            this.f48369xd195e989 = true;
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(TAG, "newAVResample: " + e17);
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8 m97805x9cf0d20b() {
        com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8 c25794x2670fbb8;
        synchronized (com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8.class) {
            if (f48368x21169495 == null) {
                f48368x21169495 = new com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8();
            }
            c25794x2670fbb8 = f48368x21169495;
        }
        return c25794x2670fbb8;
    }

    /* renamed from: setInstance */
    public static synchronized void m97806x97a93317(com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8 c25794x2670fbb8) {
        synchronized (com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8.class) {
            f48368x21169495 = c25794x2670fbb8;
        }
    }

    /* renamed from: isResampleEnable */
    public boolean m97807x439a014a() {
        return this.f48369xd195e989;
    }

    /* renamed from: newAVResample */
    public com.p314xaae8f345.tav.p2957xa228aba5.InterfaceC25741x399731fb m97808x80125a92(int i17, int i18, int i19, int i27) {
        return null;
    }
}
