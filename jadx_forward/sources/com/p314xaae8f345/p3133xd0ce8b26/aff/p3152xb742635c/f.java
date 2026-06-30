package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f f298799i = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298800d;

    /* renamed from: f, reason: collision with root package name */
    public int f298802f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f298803g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f298801e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f298804h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f fVar2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f) fVar;
        return n51.f.a(this.f298800d, fVar2.f298800d) && n51.f.a(this.f298801e, fVar2.f298801e) && n51.f.a(java.lang.Integer.valueOf(this.f298802f), java.lang.Integer.valueOf(fVar2.f298802f)) && n51.f.a(this.f298803g, fVar2.f298803g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f298801e;
        boolean[] zArr = this.f298804h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298800d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f298802f);
            }
            java.lang.String str2 = this.f298803g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f298800d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f298802f);
            }
            java.lang.String str4 = this.f298803g;
            return (str4 == null || !zArr[4]) ? g17 : g17 + b36.f.j(4, str4);
        }
        if (i17 == 2) {
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f298800d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f298802f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f298803g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.u uVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.u();
            if (bArr != null && bArr.length > 0) {
                uVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(uVar);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.f) super.mo11468x92b714fd(bArr);
    }
}
