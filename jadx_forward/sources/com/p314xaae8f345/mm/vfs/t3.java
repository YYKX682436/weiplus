package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class t3 implements com.p314xaae8f345.mm.vfs.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f294716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.q2 f294717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.q2 f294718c;

    public t3(com.p314xaae8f345.mm.vfs.u3 u3Var, boolean[] zArr, com.p314xaae8f345.mm.vfs.q2 q2Var, com.p314xaae8f345.mm.vfs.q2 q2Var2) {
        this.f294716a = zArr;
        this.f294717b = q2Var;
        this.f294718c = q2Var2;
    }

    @Override // com.p314xaae8f345.mm.vfs.b8
    /* renamed from: accept */
    public boolean mo82370xab27b508(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
        boolean[] zArr = this.f294716a;
        try {
            com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294717b;
            java.lang.String str = x1Var.f294764a;
            boolean t17 = q2Var.t(str, this.f294718c, str);
            zArr[0] = t17;
            return true ^ t17;
        } catch (java.io.IOException unused) {
            zArr[0] = false;
            return true;
        }
    }
}
