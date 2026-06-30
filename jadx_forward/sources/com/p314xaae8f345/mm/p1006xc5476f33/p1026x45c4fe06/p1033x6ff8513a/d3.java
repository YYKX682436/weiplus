package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class d3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 f157691a;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var) {
        this.f157691a = j3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        java.lang.Long l17;
        java.lang.Long l18;
        ik1.b0 b0Var = (ik1.b0) objArr[0];
        if (objArr.length >= 3) {
            l17 = (java.lang.Long) objArr[1];
            l18 = (java.lang.Long) objArr[2];
        } else {
            l17 = null;
            l18 = null;
        }
        if (!r6Var.m()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        }
        if (!r6Var.A()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_PERMISSION_DENIED;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.a(r6Var)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_SYMLINK;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (b0Var != null) {
            if (l17 == null || l18 == null) {
                b0Var.f373357a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.d(r6Var, 0L, -1L);
            } else {
                if (l18.longValue() == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                    l18 = java.lang.Long.valueOf(r6Var.C() - l17.longValue());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a17 = this.f157691a.a(l17.longValue(), l18.longValue(), r6Var.C());
                if (a17 != j1Var) {
                    return a17;
                }
                b0Var.f373357a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.d(r6Var, l17.longValue(), l18.longValue());
            }
        }
        return j1Var;
    }
}
