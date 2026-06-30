package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes4.dex */
public class d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d f298281i = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298283e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298284f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298285g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f298282d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f298286h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d dVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d) fVar;
        return n51.f.a(this.f298282d, dVar.f298282d) && n51.f.a(this.f298283e, dVar.f298283e) && n51.f.a(this.f298284f, dVar.f298284f) && n51.f.a(java.lang.Boolean.valueOf(this.f298285g), java.lang.Boolean.valueOf(dVar.f298285g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f298282d;
        boolean[] zArr = this.f298286h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList);
            java.lang.String str = this.f298283e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f298284f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f298285g);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList) + 0;
            java.lang.String str3 = this.f298283e;
            if (str3 != null && zArr[2]) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f298284f;
            if (str4 != null && zArr[3]) {
                g17 += b36.f.j(3, str4);
            }
            return zArr[4] ? g17 + b36.f.a(4, this.f298285g) : g17;
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
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298283e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f298284f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f298285g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
