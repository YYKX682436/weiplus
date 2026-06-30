package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class b0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297616d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f297617e = new boolean[2];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0) && n51.f.a(this.f297616d, ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0) fVar).f297616d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f297617e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297616d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f297616d;
            if (str2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.j(1, str2);
        }
        if (i17 == 2) {
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
        if (intValue != 1) {
            return -1;
        }
        this.f297616d = aVar2.k(intValue);
        zArr[1] = true;
        return 0;
    }
}
