package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaRelateWeAppList */
/* loaded from: classes2.dex */
public class C19815xef6d42b8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: weapp_info_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8> f39063xb391b0e3 = new java.util.LinkedList<>();

    /* renamed from: weapp_register_title */
    public java.lang.String f39064x961272e8;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8 m77339xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8 c19815xef6d42b8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8) fVar;
        return n51.f.a(this.f39064x961272e8, c19815xef6d42b8.f39064x961272e8) && n51.f.a(this.f39063xb391b0e3, c19815xef6d42b8.f39063xb391b0e3);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f39064x961272e8;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f39063xb391b0e3);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f39064x961272e8;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f39063xb391b0e3);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f39063xb391b0e3.clear();
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8 c19815xef6d42b8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c19815xef6d42b8.f39064x961272e8 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8 c19814xef6bf6c8 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8();
            if (bArr2 != null && bArr2.length > 0) {
                c19814xef6bf6c8.mo11468x92b714fd(bArr2);
            }
            c19815xef6d42b8.f39063xb391b0e3.add(c19814xef6bf6c8);
        }
        return 0;
    }

    /* renamed from: setWeapp_info_list */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8 m77340xceca1c21(java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8> linkedList) {
        this.f39063xb391b0e3 = linkedList;
        return this;
    }

    /* renamed from: setWeapp_register_title */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19815xef6d42b8 m77341xbe315e6a(java.lang.String str) {
        this.f39064x961272e8 = str;
        return this;
    }
}
