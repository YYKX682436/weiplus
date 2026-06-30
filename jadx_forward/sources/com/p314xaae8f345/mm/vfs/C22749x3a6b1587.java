package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.FileSchemeResolver */
/* loaded from: classes12.dex */
public class C22749x3a6b1587 extends com.p314xaae8f345.mm.vfs.AbstractC22766xe7748d96 {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.vfs.n2 f39815x681a0c0c = new com.p314xaae8f345.mm.vfs.n2(null);

    public C22749x3a6b1587(com.p314xaae8f345.mm.vfs.m2 m2Var) {
    }

    @Override // com.p314xaae8f345.mm.vfs.s5
    public android.util.Pair a(com.p314xaae8f345.mm.vfs.m5 m5Var, com.p314xaae8f345.mm.vfs.z7 z7Var) {
        java.lang.String str = z7Var.f294812f;
        if (str == null) {
            str = "";
        }
        return ((com.p314xaae8f345.mm.vfs.r5) m5Var).e(str, null);
    }

    @Override // com.p314xaae8f345.mm.vfs.AbstractC22766xe7748d96, com.p314xaae8f345.mm.vfs.s5
    public com.p314xaae8f345.mm.vfs.z7 c(com.p314xaae8f345.mm.vfs.m5 m5Var, com.p314xaae8f345.mm.vfs.z7 z7Var) {
        java.lang.String[] strArr = new java.lang.String[1];
        android.util.Pair e17 = ((com.p314xaae8f345.mm.vfs.r5) m5Var).e(z7Var.f294812f, strArr);
        if (e17 == null || strArr[0] == null) {
            return null;
        }
        return new com.p314xaae8f345.mm.vfs.z7("wcf", strArr[0], (java.lang.String) e17.second, null, null);
    }
}
