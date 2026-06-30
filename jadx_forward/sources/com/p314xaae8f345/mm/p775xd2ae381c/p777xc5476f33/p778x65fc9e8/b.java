package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes10.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f149466d;

    /* renamed from: e, reason: collision with root package name */
    public long f149467e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149468f;

    /* renamed from: g, reason: collision with root package name */
    public int f149469g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f149470h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f149471i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f149472m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f149473n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b)) {
            return false;
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b bVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f149466d), java.lang.Long.valueOf(bVar.f149466d)) && n51.f.a(java.lang.Long.valueOf(this.f149467e), java.lang.Long.valueOf(bVar.f149467e)) && n51.f.a(this.f149468f, bVar.f149468f) && n51.f.a(java.lang.Integer.valueOf(this.f149469g), java.lang.Integer.valueOf(bVar.f149469g)) && n51.f.a(this.f149470h, bVar.f149470h) && n51.f.a(this.f149471i, bVar.f149471i) && n51.f.a(this.f149472m, bVar.f149472m) && n51.f.a(this.f149473n, bVar.f149473n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f149471i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f149466d);
            fVar.h(2, this.f149467e);
            java.lang.String str = this.f149468f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f149469g);
            java.lang.String str2 = this.f149470h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str3 = this.f149472m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f149473n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f149466d) + 0 + b36.f.h(2, this.f149467e);
            java.lang.String str5 = this.f149468f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            int e17 = h17 + b36.f.e(4, this.f149469g);
            java.lang.String str6 = this.f149470h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList);
            java.lang.String str7 = this.f149472m;
            if (str7 != null) {
                g17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f149473n;
            return str8 != null ? g17 + b36.f.j(8, str8) : g17;
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
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b bVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f149466d = aVar2.i(intValue);
                return 0;
            case 2:
                bVar.f149467e = aVar2.i(intValue);
                return 0;
            case 3:
                bVar.f149468f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f149469g = aVar2.g(intValue);
                return 0;
            case 5:
                bVar.f149470h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.c cVar = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.c();
                    if (bArr2 != null && bArr2.length > 0) {
                        cVar.mo11468x92b714fd(bArr2);
                    }
                    bVar.f149471i.add(cVar);
                }
                return 0;
            case 7:
                bVar.f149472m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f149473n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
