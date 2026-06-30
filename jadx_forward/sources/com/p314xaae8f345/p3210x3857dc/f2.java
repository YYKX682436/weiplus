package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static by5.u0 f301814a;

    public static void a(java.lang.String str, com.p314xaae8f345.p3210x3857dc.c2 c2Var, by5.u0 u0Var) {
        if (!c2Var.f301765j) {
            by5.c4.f(str, "plugin onPreExecute, savePath:" + c2Var.f301760e);
        } else {
            f301814a = u0Var;
            by5.c4.f(str, "runtime onPreExecute, savePath:" + c2Var.f301760e);
        }
    }

    public static void b(com.p314xaae8f345.p3210x3857dc.b2 b2Var, java.lang.Integer[] numArr) {
        int intValue = numArr[1].intValue() > 0 ? (int) ((numArr[0].intValue() * 100.0d) / numArr[1].intValue()) : 0;
        if (b2Var != null) {
            b2Var.b(intValue);
        }
    }

    public static void c(com.p314xaae8f345.p3210x3857dc.c2 c2Var, com.p314xaae8f345.p3210x3857dc.b2 b2Var, java.lang.String str, java.lang.Integer num) {
        if (c2Var.f301765j) {
            f301814a = null;
            by5.c4.f(str, "runtime onPostExecute result:" + num);
        } else {
            by5.c4.f(str, "plugin onPostExecute result:" + num);
        }
        if (num.intValue() == 0) {
            if (b2Var != null) {
                b2Var.d(c2Var);
            }
        } else if (b2Var != null) {
            b2Var.c(c2Var);
        }
    }
}
