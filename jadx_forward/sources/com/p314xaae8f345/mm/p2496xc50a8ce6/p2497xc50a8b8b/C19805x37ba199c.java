package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.ServicePreInfo */
/* loaded from: classes2.dex */
public class C19805x37ba199c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: media_list */
    public java.util.LinkedList<r45.ob5> f38957x739c4819 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19805x37ba199c m77277xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19805x37ba199c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19805x37ba199c) && n51.f.a(this.f38957x739c4819, ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19805x37ba199c) fVar).f38957x739c4819);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f38957x739c4819);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f38957x739c4819) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f38957x739c4819.clear();
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19805x37ba199c c19805x37ba199c = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19805x37ba199c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ob5 ob5Var = new r45.ob5();
            if (bArr2 != null && bArr2.length > 0) {
                ob5Var.mo11468x92b714fd(bArr2);
            }
            c19805x37ba199c.f38957x739c4819.add(ob5Var);
        }
        return 0;
    }

    /* renamed from: setMedia_list */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19805x37ba199c m77278x90014e1b(java.util.LinkedList<r45.ob5> linkedList) {
        this.f38957x739c4819 = linkedList;
        return this;
    }
}
