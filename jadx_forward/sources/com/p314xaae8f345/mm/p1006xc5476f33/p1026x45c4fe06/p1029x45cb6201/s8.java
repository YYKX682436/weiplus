package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

@j95.b
/* loaded from: classes7.dex */
public class s8 extends i95.w {
    public final void Ai(java.lang.String str, com.p314xaae8f345.mm.vfs.b7 b7Var) {
        com.p314xaae8f345.mm.vfs.r6[] I;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y() || (I = r6Var.I(b7Var)) == null || I.length <= 0) {
            return;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : I) {
            com.p314xaae8f345.mm.vfs.w6.f(r6Var2.u());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaJsCacheStorage", "clear file:%s", r6Var2.m82467xfb82e301());
        }
    }

    public void wi(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q8 q8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q8(this, str);
        Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.b(), q8Var);
        Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.d(), q8Var);
    }
}
