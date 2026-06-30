package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class h6 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f163369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6 f163370b;

    public h6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6 i6Var, java.lang.String[] strArr) {
        this.f163370b = i6Var;
        this.f163369a = strArr;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        int i19 = 0;
        if (this.f163370b.f163385g != i17) {
            return false;
        }
        while (true) {
            java.lang.String[] strArr = this.f163369a;
            if (i19 >= strArr.length) {
                return true;
            }
            try {
                com.p314xaae8f345.mm.vfs.w6.h(strArr[i19]);
            } catch (java.lang.Exception unused) {
            }
            i19++;
        }
    }
}
