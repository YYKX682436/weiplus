package com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590;

/* renamed from: com.tencent.tav.decoder.logger.Logger */
/* loaded from: classes16.dex */
public class C25798x87fce1b0 {

    /* renamed from: NO_LOG */
    public static final int f48371x899f97a6 = Integer.MAX_VALUE;

    /* renamed from: level */
    private static int f48372x6219b84 = 3;

    /* renamed from: logProxy */
    private static com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b f48373x7732a18a = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.DefaultLogProxy();

    /* renamed from: com.tencent.tav.decoder.logger.Logger$DefaultLogProxy */
    /* loaded from: classes16.dex */
    public static class DefaultLogProxy implements com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b {
        private DefaultLogProxy() {
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b
        public void d(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b
        public void e(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b
        public void i(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b
        public void v(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b
        public void w(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b
        public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.tav.decoder.logger.Logger$LogLevel */
    /* loaded from: classes6.dex */
    public @interface LogLevel {
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b interfaceC25797x225a3b = f48373x7732a18a;
        if (interfaceC25797x225a3b == null || f48372x6219b84 > 3) {
            return;
        }
        interfaceC25797x225a3b.d(str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b interfaceC25797x225a3b = f48373x7732a18a;
        if (interfaceC25797x225a3b == null || f48372x6219b84 > 6) {
            return;
        }
        interfaceC25797x225a3b.e(str, str2);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b interfaceC25797x225a3b = f48373x7732a18a;
        if (interfaceC25797x225a3b == null || f48372x6219b84 > 4) {
            return;
        }
        interfaceC25797x225a3b.i(str, str2);
    }

    /* renamed from: setLevel */
    public static void m97811x534d5c42(int i17) {
        f48372x6219b84 = i17;
    }

    /* renamed from: setLogProxy */
    public static void m97812xedc5400c(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b interfaceC25797x225a3b) {
        f48373x7732a18a = interfaceC25797x225a3b;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b interfaceC25797x225a3b = f48373x7732a18a;
        if (interfaceC25797x225a3b == null || f48372x6219b84 > 2) {
            return;
        }
        interfaceC25797x225a3b.v(str, str2);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b interfaceC25797x225a3b = f48373x7732a18a;
        if (interfaceC25797x225a3b == null || f48372x6219b84 > 5) {
            return;
        }
        interfaceC25797x225a3b.w(str, str2);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f48373x7732a18a == null || f48372x6219b84 > 3) {
            return;
        }
        d(str, new java.util.Formatter().format(str2, objArr).toString());
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        e(str, new java.util.Formatter().format(str2, objArr).toString());
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f48373x7732a18a == null || f48372x6219b84 > 4) {
            return;
        }
        i(str, new java.util.Formatter().format(str2, objArr).toString());
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.InterfaceC25797x225a3b interfaceC25797x225a3b = f48373x7732a18a;
        if (interfaceC25797x225a3b == null || f48372x6219b84 > 6) {
            return;
        }
        interfaceC25797x225a3b.e(str, str2, th6);
    }
}
