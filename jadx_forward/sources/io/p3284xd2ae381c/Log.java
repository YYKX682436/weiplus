package io.p3284xd2ae381c;

/* loaded from: classes15.dex */
public class Log {

    /* renamed from: ASSERT */
    public static int f70424x73a36746 = 7;

    /* renamed from: DEBUG */
    public static int f70425x3de9e33 = 3;

    /* renamed from: ERROR */
    public static int f70426x3f2d9e8 = 6;

    /* renamed from: INFO */
    public static int f70427x225cae = 4;

    /* renamed from: VERBOSE */
    public static int f70428x3fb90562 = 2;

    /* renamed from: WARN */
    public static int f70429x288a86 = 5;

    /* renamed from: logDelegate */
    private static io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 f70430x988c60e9 = null;

    /* renamed from: logLevel */
    private static int f70431x76f472a0 = 3;

    /* renamed from: io.flutter.Log$Delegate */
    /* loaded from: classes15.dex */
    public interface InterfaceC28535x34b041a5 {
        void d(java.lang.String str, java.lang.String str2);

        void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void e(java.lang.String str, java.lang.String str2);

        void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void i(java.lang.String str, java.lang.String str2);

        void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        /* renamed from: println */
        void mo9531xed3dc8ef(int i17, java.lang.String str, java.lang.String str2);

        void v(java.lang.String str, java.lang.String str2);

        void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void w(java.lang.String str, java.lang.String str2);

        void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void wtf(java.lang.String str, java.lang.String str2);

        void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5;
        if (f70431x76f472a0 <= 3 && (interfaceC28535x34b041a5 = f70430x988c60e9) != null) {
            interfaceC28535x34b041a5.d(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5 = f70430x988c60e9;
        if (interfaceC28535x34b041a5 != null) {
            interfaceC28535x34b041a5.e(str, str2);
        }
    }

    /* renamed from: getStackTraceString */
    public static java.lang.String m136959x2d915d84(java.lang.Throwable th6) {
        return android.util.Log.getStackTraceString(th6);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5;
        if (f70431x76f472a0 <= 4 && (interfaceC28535x34b041a5 = f70430x988c60e9) != null) {
            interfaceC28535x34b041a5.i(str, str2);
        }
    }

    /* renamed from: println */
    public static void m136960xed3dc8ef(int i17, java.lang.String str, java.lang.String str2) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5;
        if (f70431x76f472a0 <= i17 && (interfaceC28535x34b041a5 = f70430x988c60e9) != null) {
            interfaceC28535x34b041a5.mo9531xed3dc8ef(i17, str, str2);
        }
    }

    /* renamed from: setLogDelegate */
    public static void m136961x8c81b27(io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5) {
        f70430x988c60e9 = interfaceC28535x34b041a5;
    }

    /* renamed from: setLogLevel */
    public static void m136962xed871122(int i17) {
        f70431x76f472a0 = i17;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5;
        if (f70431x76f472a0 <= 2 && (interfaceC28535x34b041a5 = f70430x988c60e9) != null) {
            interfaceC28535x34b041a5.v(str, str2);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5 = f70430x988c60e9;
        if (interfaceC28535x34b041a5 != null) {
            interfaceC28535x34b041a5.w(str, str2);
        }
    }

    public static void wtf(java.lang.String str, java.lang.String str2) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5 = f70430x988c60e9;
        if (interfaceC28535x34b041a5 != null) {
            interfaceC28535x34b041a5.wtf(str, str2);
        } else {
            android.util.Log.wtf(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5 = f70430x988c60e9;
        if (interfaceC28535x34b041a5 != null) {
            interfaceC28535x34b041a5.e(str, str2, th6);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5 = f70430x988c60e9;
        if (interfaceC28535x34b041a5 != null) {
            interfaceC28535x34b041a5.w(str, str2, th6);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5;
        if (f70431x76f472a0 <= 3 && (interfaceC28535x34b041a5 = f70430x988c60e9) != null) {
            interfaceC28535x34b041a5.d(str, str2, th6);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5;
        if (f70431x76f472a0 <= 4 && (interfaceC28535x34b041a5 = f70430x988c60e9) != null) {
            interfaceC28535x34b041a5.i(str, str2, th6);
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5;
        if (f70431x76f472a0 <= 2 && (interfaceC28535x34b041a5 = f70430x988c60e9) != null) {
            interfaceC28535x34b041a5.v(str, str2, th6);
        }
    }

    public static void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.p3284xd2ae381c.Log.InterfaceC28535x34b041a5 interfaceC28535x34b041a5 = f70430x988c60e9;
        if (interfaceC28535x34b041a5 != null) {
            interfaceC28535x34b041a5.wtf(str, str2, th6);
        } else {
            android.util.Log.wtf(str, str2, th6);
        }
    }
}
