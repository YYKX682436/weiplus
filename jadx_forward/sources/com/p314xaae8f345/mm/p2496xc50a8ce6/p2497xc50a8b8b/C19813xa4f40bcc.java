package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaRelateBrandList */
/* loaded from: classes2.dex */
public class C19813xa4f40bcc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: brand_info_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19812xa4f2bfdc> f39057xc2b98ad7 = new java.util.LinkedList<>();

    /* renamed from: brand_register_title */
    public java.lang.String f39058xd348b174;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc m77331xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc c19813xa4f40bcc = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc) fVar;
        return n51.f.a(this.f39058xd348b174, c19813xa4f40bcc.f39058xd348b174) && n51.f.a(this.f39057xc2b98ad7, c19813xa4f40bcc.f39057xc2b98ad7);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f39058xd348b174;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f39057xc2b98ad7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f39058xd348b174;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f39057xc2b98ad7);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f39057xc2b98ad7.clear();
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc c19813xa4f40bcc = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c19813xa4f40bcc.f39058xd348b174 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19812xa4f2bfdc c19812xa4f2bfdc = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19812xa4f2bfdc();
            if (bArr2 != null && bArr2.length > 0) {
                c19812xa4f2bfdc.mo11468x92b714fd(bArr2);
            }
            c19813xa4f40bcc.f39057xc2b98ad7.add(c19812xa4f2bfdc);
        }
        return 0;
    }

    /* renamed from: setBrand_info_list */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc m77332xddf1f615(java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19812xa4f2bfdc> linkedList) {
        this.f39057xc2b98ad7 = linkedList;
        return this;
    }

    /* renamed from: setBrand_register_title */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19813xa4f40bcc m77333xfb679cf6(java.lang.String str) {
        this.f39058xd348b174 = str;
        return this;
    }
}
