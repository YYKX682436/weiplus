package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class s2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 f157853a;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var) {
        this.f157853a = j3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = (com.p314xaae8f345.mm.vfs.r6) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        if (r6Var.y()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_ALREADY_EXISTS;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.a(r6Var)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_SYMLINK;
        }
        if (this.f157853a.f157760f > 0 && this.f157853a.c() + r6Var2.C() > this.f157853a.f157760f) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
        if (!booleanValue) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.k1.a(r6Var2.o(), r6Var.o(), false) ? j1Var : j1Var2;
        }
        android.util.Pair a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i1.a(r6Var2.o(), r6Var.o());
        if (((java.lang.Boolean) a17.first).booleanValue()) {
            return j1Var;
        }
        android.system.ErrnoException errnoException = (android.system.ErrnoException) a17.second;
        if (errnoException == null) {
            return j1Var2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.FileMove", errnoException, "handleFileMoveErrnoException", new java.lang.Object[0]);
        return errnoException.errno == android.system.OsConstants.ENAMETOOLONG ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_NAME_TOO_LONG : j1Var2;
    }
}
