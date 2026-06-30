package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0 f157286a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f157287b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f157287b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0) concurrentHashMap.get(str);
        if (c0Var != null) {
            c0Var.f157282b.a(result);
            concurrentHashMap.remove(c0Var.f157281a, c0Var);
        }
    }

    public final void b(t81.c cmd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        java.lang.String str = cmd.f67703x97cc69d6;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f157287b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0) concurrentHashMap.get(cmd.f67703x97cc69d6);
        if (c0Var != null) {
            c0Var.f157282b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Fail_PkgDownloadFail);
            concurrentHashMap.remove(c0Var.f157281a, c0Var);
        }
    }

    public final void c(t81.c cmd) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0 c0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        java.lang.String str = cmd.f67703x97cc69d6;
        if ((str == null || str.length() == 0) || (c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0) f157287b.get(cmd.f67703x97cc69d6)) == null) {
            return;
        }
        cf.d dVar = c0Var.f157283c;
        if (dVar != null) {
            dVar.a();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("latch");
            throw null;
        }
    }
}
