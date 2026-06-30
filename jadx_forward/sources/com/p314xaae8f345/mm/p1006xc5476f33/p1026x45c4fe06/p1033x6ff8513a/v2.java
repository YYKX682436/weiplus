package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class v2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f157861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f157862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 f157864d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var, com.p314xaae8f345.mm.vfs.r6 r6Var, ik1.b0 b0Var, java.lang.String str) {
        this.f157864d = j3Var;
        this.f157861a = r6Var;
        this.f157862b = b0Var;
        this.f157863c = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        long C = r6Var.C();
        long C2 = this.f157861a.C();
        r6Var.l();
        android.util.Pair a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i1.a(this.f157861a.o(), r6Var.o());
        if (!((java.lang.Boolean) a17.first).booleanValue()) {
            android.system.ErrnoException errnoException = (android.system.ErrnoException) a17.second;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
            if (errnoException == null) {
                return j1Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.FileMove", errnoException, "handleFileMoveErrnoException", new java.lang.Object[0]);
            return errnoException.errno == android.system.OsConstants.ENAMETOOLONG ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_NAME_TOO_LONG : j1Var;
        }
        ik1.b0 b0Var = this.f157862b;
        if (b0Var != null) {
            b0Var.f373357a = this.f157863c;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 x1Var = this.f157864d.f157761g;
        if (x1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) x1Var).g(this.f157861a.u(), this.f157861a.C() - C2, "LuggageNonFlattenedFileSystem#saveFile");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) this.f157864d.f157761g).g(r6Var.u(), r6Var.C() - C, "LuggageNonFlattenedFileSystem#saveFile");
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }
}
