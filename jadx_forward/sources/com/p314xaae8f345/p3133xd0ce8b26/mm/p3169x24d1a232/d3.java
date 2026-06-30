package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class d3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w2 f300908d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f300909e = new boolean[2];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d3) && n51.f.a(this.f300908d, ((com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d3) fVar).f300908d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300909e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w2 w2Var = this.f300908d;
            if (w2Var != null && zArr[1]) {
                fVar.e(1, w2Var.f301461d);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w2 w2Var2 = this.f300908d;
            if (w2Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.e(1, w2Var2.f301461d);
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
        int g17 = aVar2.g(intValue);
        this.f300908d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w2.BOX_TAB_TYPE_MACHINE : com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w2.BOX_TAB_TYPE_RECOMMEND : com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w2.BOX_TAB_TYPE_FOLLOW : com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w2.BOX_TAB_TYPE_NONE;
        zArr[1] = true;
        return 0;
    }
}
