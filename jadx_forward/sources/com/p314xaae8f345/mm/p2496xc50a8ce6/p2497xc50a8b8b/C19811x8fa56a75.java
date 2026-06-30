package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaLikeList */
/* loaded from: classes2.dex */
public class C19811x8fa56a75 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: like_list */
    public java.util.LinkedList<r45.fe7> f39051xf63be046 = new java.util.LinkedList<>();

    /* renamed from: total_like_cnt */
    public int f39052x967f5c;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75 m77323xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75 c19811x8fa56a75 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75) fVar;
        return n51.f.a(this.f39051xf63be046, c19811x8fa56a75.f39051xf63be046) && n51.f.a(java.lang.Integer.valueOf(this.f39052x967f5c), java.lang.Integer.valueOf(c19811x8fa56a75.f39052x967f5c));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f39051xf63be046);
            fVar.e(2, this.f39052x967f5c);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f39051xf63be046) + 0 + b36.f.e(2, this.f39052x967f5c);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f39051xf63be046.clear();
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75 c19811x8fa56a75 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            c19811x8fa56a75.f39052x967f5c = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.fe7 fe7Var = new r45.fe7();
            if (bArr2 != null && bArr2.length > 0) {
                fe7Var.mo11468x92b714fd(bArr2);
            }
            c19811x8fa56a75.f39051xf63be046.add(fe7Var);
        }
        return 0;
    }

    /* renamed from: setLike_list */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75 m77324x51fd1204(java.util.LinkedList<r45.fe7> linkedList) {
        this.f39051xf63be046 = linkedList;
        return this;
    }

    /* renamed from: setTotal_like_cnt */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19811x8fa56a75 m77325xb724b45e(int i17) {
        this.f39052x967f5c = i17;
        return this;
    }
}
