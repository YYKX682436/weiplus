package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

/* renamed from: org.chromium.base.metrics.UmaRecorderHolder */
/* loaded from: classes16.dex */
public class C29417x9a369913 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73552x7118e671 = false;

    /* renamed from: sNativeInitialized */
    private static boolean f73553x5b65ae0a;

    /* renamed from: sRecorder */
    private static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88 f73554x6ef4ea51 = new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88();

    /* renamed from: sSetUpNativeUmaRecorder */
    private static boolean f73555xfef62746 = true;

    private C29417x9a369913() {
    }

    public static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 get() {
        return f73554x6ef4ea51;
    }

    /* renamed from: onLibraryLoaded */
    public static void m152955xbb736d01() {
        if (f73555xfef62746) {
            f73553x5b65ae0a = true;
            f73554x6ef4ea51.m152899xa7687c07(new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0());
        }
    }

    /* renamed from: resetForTesting */
    public static void m152956x2c3fdbb6() {
        if (f73553x5b65ae0a) {
            return;
        }
        f73554x6ef4ea51 = new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29404x6d2eeb88();
    }

    /* renamed from: setNonNativeDelegate */
    public static void m152957x4f5e2aa7(org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 interfaceC29416x7559a087) {
        f73554x6ef4ea51.m152899xa7687c07(interfaceC29416x7559a087);
    }

    /* renamed from: setUpNativeUmaRecorder */
    public static void m152958x7b65a2f3(boolean z17) {
        f73555xfef62746 = z17;
    }
}
