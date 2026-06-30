package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaEvaluateWording */
/* loaded from: classes2.dex */
public class C19809x8dbeec1f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: star_num */
    public int f39048x4e736819;

    /* renamed from: wording */
    public java.lang.String f39049x5ae4fc98;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f m77318xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f c19809x8dbeec1f = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f39048x4e736819), java.lang.Integer.valueOf(c19809x8dbeec1f.f39048x4e736819)) && n51.f.a(this.f39049x5ae4fc98, c19809x8dbeec1f.f39049x5ae4fc98);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f39048x4e736819);
            java.lang.String str = this.f39049x5ae4fc98;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f39048x4e736819) + 0;
            java.lang.String str2 = this.f39049x5ae4fc98;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f c19809x8dbeec1f = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c19809x8dbeec1f.f39048x4e736819 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c19809x8dbeec1f.f39049x5ae4fc98 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setStar_num */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f m77319xc506069b(int i17) {
        this.f39048x4e736819 = i17;
        return this;
    }

    /* renamed from: setWording */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f m77320xc2385d6(java.lang.String str) {
        this.f39049x5ae4fc98 = str;
        return this;
    }
}
