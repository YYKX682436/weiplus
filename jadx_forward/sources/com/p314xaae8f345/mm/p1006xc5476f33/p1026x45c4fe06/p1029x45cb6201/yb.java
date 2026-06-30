package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class yb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac f157610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar, java.lang.String str) {
        super(0);
        this.f157610d = acVar;
        this.f157611e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = this.f157610d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f156980f;
        java.lang.String str = this.f157611e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3) concurrentHashMap.get(str);
        if (x3Var != null) {
            return x3Var;
        }
        java.lang.String[] strArr = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(str)};
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var2 = null;
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.String str2 = strArr[i17];
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str) && (x3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3) acVar.f156980f.get(str2)) != null) {
                break;
            }
        }
        return x3Var2;
    }
}
