package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes8.dex */
public class m extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m f297904m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m();

    /* renamed from: d, reason: collision with root package name */
    public long f297905d;

    /* renamed from: e, reason: collision with root package name */
    public long f297906e;

    /* renamed from: g, reason: collision with root package name */
    public int f297908g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297909h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f297907f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f297910i = new boolean[6];

    public java.lang.String b() {
        return this.f297910i[5] ? this.f297909h : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f297905d), java.lang.Long.valueOf(mVar.f297905d)) && n51.f.a(java.lang.Long.valueOf(this.f297906e), java.lang.Long.valueOf(mVar.f297906e)) && n51.f.a(this.f297907f, mVar.f297907f) && n51.f.a(java.lang.Integer.valueOf(this.f297908g), java.lang.Integer.valueOf(mVar.f297908g)) && n51.f.a(this.f297909h, mVar.f297909h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297907f;
        boolean[] zArr = this.f297910i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f297905d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f297906e);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f297908g);
            }
            java.lang.String str = this.f297909h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f297905d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f297906e);
            }
            int g17 = h17 + b36.f.g(3, 8, linkedList);
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f297908g);
            }
            java.lang.String str2 = this.f297909h;
            return (str2 == null || !zArr[5]) ? g17 : g17 + b36.f.j(5, str2);
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
            this.f297905d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f297906e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f297908g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f297909h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l lVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l();
            if (bArr != null && bArr.length > 0) {
                lVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(lVar);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m) super.mo11468x92b714fd(bArr);
    }
}
