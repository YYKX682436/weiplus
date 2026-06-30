package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class y6 {
    public static final java.lang.Integer a(r45.me3[] me3VarArr) {
        kotlin.jvm.internal.o.g(me3VarArr, "<this>");
        for (r45.me3 me3Var : me3VarArr) {
            if (me3Var != null) {
                return java.lang.Integer.valueOf(me3Var.f380402h);
            }
        }
        return null;
    }

    public static final long b(r45.me3[] me3VarArr) {
        kotlin.jvm.internal.o.g(me3VarArr, "<this>");
        for (r45.me3 me3Var : me3VarArr) {
            if (me3Var != null) {
                return r2.f380408q & io.flutter.embedding.android.KeyboardMap.kValueMask;
            }
        }
        return 0L;
    }

    public static final java.lang.String c(r45.me3[] me3VarArr) {
        kotlin.jvm.internal.o.g(me3VarArr, "<this>");
        for (r45.me3 me3Var : me3VarArr) {
            if (me3Var != null) {
                return me3Var.f380400f;
            }
        }
        return null;
    }
}
