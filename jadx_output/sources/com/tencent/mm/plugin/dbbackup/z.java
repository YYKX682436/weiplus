package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class z implements com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f96900a;

    public z(com.tencent.mm.plugin.dbbackup.a0 a0Var, int[] iArr) {
        this.f96900a = iArr;
    }

    @Override // com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback
    public java.lang.String preExecute(java.lang.String str) {
        int[] iArr = this.f96900a;
        iArr[0] = iArr[0] + 1;
        return null;
    }
}
