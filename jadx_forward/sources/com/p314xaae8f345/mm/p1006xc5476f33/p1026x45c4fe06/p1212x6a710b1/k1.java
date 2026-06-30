package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class k1 {
    public static final boolean a(l75.k0 k0Var, java.lang.String tableName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        return k0Var.A(tableName, "DROP TABLE IF EXISTS " + tableName + ';');
    }

    public static final boolean b(l75.k0 k0Var, java.lang.String tableName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        android.database.Cursor B = k0Var.B("SELECT 1 FROM sqlite_master WHERE type='table' AND name='" + tableName + "';", null);
        if (B == null) {
            return false;
        }
        boolean moveToNext = B.moveToNext();
        B.close();
        return moveToNext;
    }
}
