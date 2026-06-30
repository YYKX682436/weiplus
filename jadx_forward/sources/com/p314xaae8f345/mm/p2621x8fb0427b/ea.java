package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes8.dex */
public class ea extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f275418d;

    /* renamed from: e, reason: collision with root package name */
    public long f275419e;

    /* renamed from: f, reason: collision with root package name */
    public int f275420f;

    /* renamed from: g, reason: collision with root package name */
    public int f275421g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f275422h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2621x8fb0427b.ea)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ea eaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ea) fVar;
        return n51.f.a(this.f275418d, eaVar.f275418d) && n51.f.a(java.lang.Long.valueOf(this.f275419e), java.lang.Long.valueOf(eaVar.f275419e)) && n51.f.a(java.lang.Integer.valueOf(this.f275420f), java.lang.Integer.valueOf(eaVar.f275420f)) && n51.f.a(java.lang.Integer.valueOf(this.f275421g), java.lang.Integer.valueOf(eaVar.f275421g)) && n51.f.a(this.f275422h, eaVar.f275422h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f275422h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f275418d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f275419e);
            fVar.e(3, this.f275420f);
            fVar.e(4, this.f275421g);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f275418d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f275419e) + b36.f.e(3, this.f275420f) + b36.f.e(4, this.f275421g) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.p314xaae8f345.mm.p2621x8fb0427b.ea eaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ea) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eaVar.f275418d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            eaVar.f275419e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            eaVar.f275420f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            eaVar.f275421g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2621x8fb0427b.t7 t7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t7();
            if (bArr2 != null && bArr2.length > 0) {
                t7Var.mo11468x92b714fd(bArr2);
            }
            eaVar.f275422h.add(t7Var);
        }
        return 0;
    }
}
