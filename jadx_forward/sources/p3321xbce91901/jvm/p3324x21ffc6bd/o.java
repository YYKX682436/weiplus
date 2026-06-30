package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes12.dex */
public abstract class o {
    public static boolean a(java.lang.Float f17, float f18) {
        return f17 != null && f17.floatValue() == f18;
    }

    public static boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(str + " must not be null");
        l(illegalStateException, p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName());
        throw illegalStateException;
    }

    public static void d(java.lang.Object obj) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException();
        l(nullPointerException, p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName());
        throw nullPointerException;
    }

    public static void e(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str);
        l(nullPointerException, p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName());
        throw nullPointerException;
    }

    public static void f(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str + " must not be null");
        l(nullPointerException, p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName());
        throw nullPointerException;
    }

    public static void g(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(k(str));
        l(nullPointerException, p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName());
        throw nullPointerException;
    }

    public static void h(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException(k(str));
        l(illegalArgumentException, p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName());
        throw illegalArgumentException;
    }

    public static int i(int i17, int i18) {
        if (i17 < i18) {
            return -1;
        }
        return i17 == i18 ? 0 : 1;
    }

    public static int j(long j17, long j18) {
        if (j17 < j18) {
            return -1;
        }
        return j17 == j18 ? 0 : 1;
    }

    public static java.lang.String k(java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.String name = p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName();
        int i17 = 0;
        while (!stackTrace[i17].getClassName().equals(name)) {
            i17++;
        }
        while (stackTrace[i17].getClassName().equals(name)) {
            i17++;
        }
        java.lang.StackTraceElement stackTraceElement = stackTrace[i17];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static java.lang.Throwable l(java.lang.Throwable th6, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = th6.getStackTrace();
        int length = stackTrace.length;
        int i17 = -1;
        for (int i18 = 0; i18 < length; i18++) {
            if (str.equals(stackTrace[i18].getClassName())) {
                i17 = i18;
            }
        }
        th6.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i17 + 1, length));
        return th6;
    }

    public static java.lang.String m(java.lang.String str, java.lang.Object obj) {
        return str + obj;
    }

    public static void n() {
        jz5.e eVar = new jz5.e();
        l(eVar, p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName());
        throw eVar;
    }

    public static void o(java.lang.String str) {
        jz5.e0 e0Var = new jz5.e0("lateinit property " + str + " has not been initialized");
        l(e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.o.class.getName());
        throw e0Var;
    }
}
