package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class k6 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6 f163436a;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6 n6Var) {
        this.f163436a = n6Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String[] strArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6 n6Var = this.f163436a;
        if (n6Var.f163484g != i17) {
            return false;
        }
        if (n6Var.f163485h.isEmpty()) {
            return true;
        }
        synchronized (this.f163436a.f163487m) {
            strArr = (java.lang.String[]) this.f163436a.f163485h.toArray(new java.lang.String[0]);
        }
        for (java.lang.String str : strArr) {
            try {
                com.p314xaae8f345.mm.vfs.w6.h(str);
            } catch (java.lang.Exception unused) {
            }
        }
        return true;
    }
}
