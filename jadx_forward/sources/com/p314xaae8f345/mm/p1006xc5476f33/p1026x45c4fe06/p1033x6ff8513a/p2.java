package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class p2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3 {
    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        if (!r6Var.m()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        }
        int m49606x16a9a8b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11699xd802b610.m49606x16a9a8b7(r6Var.u(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685) objArr[0]);
        if (m49606x16a9a8b7 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "stat err %d, %s", java.lang.Integer.valueOf(m49606x16a9a8b7), r6Var.u());
        }
        return m49606x16a9a8b7 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
    }
}
