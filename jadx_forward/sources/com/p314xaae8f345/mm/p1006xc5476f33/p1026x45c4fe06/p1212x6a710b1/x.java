package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f172141d;

    /* renamed from: e, reason: collision with root package name */
    public int f172142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 f172143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f172144g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f172145h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f172146i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172147m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172148n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 y3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String[] strArr, int i17, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f172143f = y3Var;
        this.f172144g = lVar;
        this.f172145h = strArr;
        this.f172146i = i17;
        this.f172147m = str;
        this.f172148n = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.x(this.f172143f, this.f172144g, this.f172145h, this.f172146i, this.f172147m, this.f172148n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 y3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f172142e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f172144g;
            java.lang.String[] strArr = this.f172145h;
            int i18 = this.f172146i;
            java.lang.String str = this.f172147m;
            java.lang.String str2 = this.f172148n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 y3Var2 = this.f172143f;
            this.f172141d = y3Var2;
            this.f172142e = 1;
            obj = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y.c(lVar, strArr, i18, str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
            y3Var = y3Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3) this.f172141d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        y3Var.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4) obj);
        return jz5.f0.f384359a;
    }
}
