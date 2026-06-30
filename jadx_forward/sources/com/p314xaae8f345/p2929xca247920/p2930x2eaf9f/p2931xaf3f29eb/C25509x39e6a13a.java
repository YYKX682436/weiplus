package com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb;

/* renamed from: com.tencent.shadow.core.common.LoggerFactory */
/* loaded from: classes16.dex */
public final class C25509x39e6a13a {

    /* renamed from: sILoggerFactory */
    private static volatile com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91 f46646xffb5dac4;

    /* renamed from: getILoggerFactory */
    public static com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91 m94645xcc762067() {
        return f46646xffb5dac4;
    }

    /* renamed from: getLogger */
    public static com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 m94646x23af1886(java.lang.Class<?> cls) {
        return m94645xcc762067().mo46974x23af1886(cls.getSimpleName());
    }

    /* renamed from: getNativeLogFunc */
    public static long m94648x98af045b() {
        return m94645xcc762067().mo46975x98af045b();
    }

    /* renamed from: init */
    public static void m94649x316510(boolean z17) {
        m94645xcc762067().mo46976x316510(z17);
    }

    /* renamed from: setILoggerFactory */
    public static void m94650x946c8873(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91 interfaceC25498xa2251f91) {
        f46646xffb5dac4 = interfaceC25498xa2251f91;
    }

    /* renamed from: getLogger */
    public static com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 m94647x23af1886(java.lang.String str) {
        return m94645xcc762067().mo46974x23af1886(str);
    }
}
