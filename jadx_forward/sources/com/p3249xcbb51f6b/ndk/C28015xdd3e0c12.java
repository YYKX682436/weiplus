package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.FitNativeEvent */
/* loaded from: classes9.dex */
public class C28015xdd3e0c12 {

    /* renamed from: eventLogger */
    private static com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.Logger f63082xfa2578ca;

    /* renamed from: com.tenpay.ndk.FitNativeEvent$Logger */
    /* loaded from: classes9.dex */
    public interface Logger {
        /* renamed from: onLog */
        void mo121648x64f5ce5(int i17, java.lang.String str);
    }

    private C28015xdd3e0c12() {
    }

    /* renamed from: getListener */
    public static com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.Logger m121816xcc17022a() {
        return f63082xfa2578ca;
    }

    /* renamed from: onNativeEvent */
    private static void m121817x83813164(int i17, java.lang.String str) {
        com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.Logger logger = f63082xfa2578ca;
        if (logger != null) {
            logger.mo121648x64f5ce5(i17, str);
        }
    }

    /* renamed from: setListener */
    public static void m121818xc6cf6336(com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.Logger logger) {
        f63082xfa2578ca = logger;
    }
}
