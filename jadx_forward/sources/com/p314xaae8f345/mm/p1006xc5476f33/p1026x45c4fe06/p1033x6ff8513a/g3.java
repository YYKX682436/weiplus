package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class g3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i3 {
    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var) {
        super(j3Var, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (r6Var.y()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_IS_DIRECTORY;
        }
        if (!r6Var.m()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        }
        int m49613x15fc5fb6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11701xe5477acf.m49613x15fc5fb6(r6Var.u());
        if (m49613x15fc5fb6 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "unlink err %d, %s", java.lang.Integer.valueOf(m49613x15fc5fb6), r6Var.u());
        }
        return m49613x15fc5fb6 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
    }
}
