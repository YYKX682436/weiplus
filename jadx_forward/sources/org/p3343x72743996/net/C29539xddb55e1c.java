package org.p3343x72743996.net;

/* renamed from: org.chromium.net.NetworkTrafficAnnotationTag */
/* loaded from: classes.dex */
public class C29539xddb55e1c {

    /* renamed from: mHashCode */
    private final int f74212x2dcb53a8;

    /* renamed from: NO_TRAFFIC_ANNOTATION_YET */
    public static final org.p3343x72743996.net.C29539xddb55e1c f74210xc34f4498 = m153442x13427a55("undefined", "Nothing here yet.");

    /* renamed from: MISSING_TRAFFIC_ANNOTATION */
    public static final org.p3343x72743996.net.C29539xddb55e1c f74209xbe7bda6a = m153442x13427a55("undefined", "Function called without traffic annotation.");

    /* renamed from: TRAFFIC_ANNOTATION_FOR_TESTS */
    public static final org.p3343x72743996.net.C29539xddb55e1c f74211xbe6b72fd = m153442x13427a55("test", "Traffic annotation for unit, browser and other tests");

    private C29539xddb55e1c(java.lang.String str) {
        this.f74212x2dcb53a8 = m153443x989d865b(str);
    }

    /* renamed from: createComplete */
    public static org.p3343x72743996.net.C29539xddb55e1c m153442x13427a55(java.lang.String str, java.lang.String str2) {
        return new org.p3343x72743996.net.C29539xddb55e1c(str);
    }

    /* renamed from: iterativeHash */
    public static int m153443x989d865b(java.lang.String str) {
        long j17 = 0;
        for (int i17 = 0; i17 < str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length; i17++) {
            j17 = ((j17 * 31) + r7[i17]) % 138003713;
        }
        return (int) j17;
    }

    /* renamed from: getHashCode */
    public int m153444x84a7e991() {
        return this.f74212x2dcb53a8;
    }
}
