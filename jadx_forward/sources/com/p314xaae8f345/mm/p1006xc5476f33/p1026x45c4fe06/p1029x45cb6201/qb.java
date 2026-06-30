package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class qb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac f157456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar, java.lang.String str) {
        super(0);
        this.f157456d = acVar;
        this.f157457e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = this.f157456d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f156980f;
        java.lang.String str = this.f157457e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3) concurrentHashMap.get(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = x3Var != null ? x3Var.f157576d : null;
        if (y8Var != null) {
            return y8Var;
        }
        for (java.util.Map.Entry entry : acVar.f156980f.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3) entry.getValue();
            if (r26.i0.A(str2, str, false, 2, null)) {
                return x3Var2.f157576d;
            }
        }
        return null;
    }
}
