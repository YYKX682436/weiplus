package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* loaded from: classes2.dex */
public class Lbs extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: latitude */
    public float f36750xaa2bac6c;

    /* renamed from: longitude */
    public float f36751x83009af;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs m64158xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f36751x83009af), java.lang.Float.valueOf(lbs.f36751x83009af)) && n51.f.a(java.lang.Float.valueOf(this.f36750xaa2bac6c), java.lang.Float.valueOf(lbs.f36750xaa2bac6c));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f36751x83009af);
            fVar.d(2, this.f36750xaa2bac6c);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f36751x83009af) + 0 + b36.f.d(2, this.f36750xaa2bac6c);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lbs.f36751x83009af = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        lbs.f36750xaa2bac6c = aVar2.f(intValue);
        return 0;
    }

    /* renamed from: setLatitude */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs m64159x20be4aee(float f17) {
        this.f36750xaa2bac6c = f17;
        return this;
    }

    /* renamed from: setLongitude */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs m64160x63f13b6d(float f17) {
        this.f36751x83009af = f17;
        return this;
    }
}
