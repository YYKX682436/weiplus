package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList */
/* loaded from: classes2.dex */
public class C19810x7e41e95d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: items */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f> f39050x5fde7c0 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19810x7e41e95d m77321xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19810x7e41e95d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19810x7e41e95d) && n51.f.a(this.f39050x5fde7c0, ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19810x7e41e95d) fVar).f39050x5fde7c0);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f39050x5fde7c0);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f39050x5fde7c0) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f39050x5fde7c0.clear();
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19810x7e41e95d c19810x7e41e95d = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19810x7e41e95d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f c19809x8dbeec1f = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f();
            if (bArr2 != null && bArr2.length > 0) {
                c19809x8dbeec1f.mo11468x92b714fd(bArr2);
            }
            c19810x7e41e95d.f39050x5fde7c0.add(c19809x8dbeec1f);
        }
        return 0;
    }

    /* renamed from: setItems */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19810x7e41e95d m77322x5329a87e(java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19809x8dbeec1f> linkedList) {
        this.f39050x5fde7c0 = linkedList;
        return this;
    }
}
