package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class i4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.logging.Logger f45191a = java.util.logging.Logger.getLogger(com.google.protobuf.i4.class.getName());

    public static java.lang.String a(com.google.protobuf.d4 d4Var, com.google.protobuf.r3 r3Var, java.lang.String str) {
        if (r3Var != null) {
            java.lang.String str2 = r3Var.f45467e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length());
            sb6.append(str2);
            sb6.append('.');
            sb6.append(str);
            return sb6.toString();
        }
        java.lang.String g17 = d4Var.f45004d.g();
        if (g17.isEmpty()) {
            return str;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(g17.length() + 1 + java.lang.String.valueOf(str).length());
        sb7.append(g17);
        sb7.append('.');
        sb7.append(str);
        return sb7.toString();
    }
}
