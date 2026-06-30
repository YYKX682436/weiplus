package com.p314xaae8f345.mm.ui;

/* loaded from: classes15.dex */
public abstract class yk {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.xk f294127a = new com.p314xaae8f345.mm.ui.wk();

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.ui.xk xkVar = f294127a;
        if (xkVar != null) {
            xkVar.d(str, str2, objArr);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.ui.xk xkVar = f294127a;
        if (xkVar != null) {
            xkVar.e(str, str2, objArr);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.ui.xk xkVar = f294127a;
        if (xkVar != null) {
            xkVar.i(str, str2, objArr);
        }
    }

    public static void d(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        if (f294127a != null) {
            if (objArr != null) {
                str2 = java.lang.String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f294127a.e(str, str2 + "  " + android.util.Log.getStackTraceString(th6), new java.lang.Object[0]);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.ui.xk xkVar = f294127a;
        if (xkVar != null) {
            xkVar.v(str, str2, objArr);
        }
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.ui.xk xkVar = f294127a;
        if (xkVar != null) {
            xkVar.w(str, str2, objArr);
        }
    }
}
