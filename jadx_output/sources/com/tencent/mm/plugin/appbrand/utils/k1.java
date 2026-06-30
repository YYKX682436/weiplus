package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class k1 {
    public static final boolean a(l75.k0 k0Var, java.lang.String tableName) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        return k0Var.A(tableName, "DROP TABLE IF EXISTS " + tableName + ';');
    }

    public static final boolean b(l75.k0 k0Var, java.lang.String tableName) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        android.database.Cursor B = k0Var.B("SELECT 1 FROM sqlite_master WHERE type='table' AND name='" + tableName + "';", null);
        if (B == null) {
            return false;
        }
        boolean moveToNext = B.moveToNext();
        B.close();
        return moveToNext;
    }
}
