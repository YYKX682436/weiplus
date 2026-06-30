package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.FeedBack */
/* loaded from: classes2.dex */
public class C19779xf861c3c5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: jumpurl_prefix */
    public java.lang.String f38903xd876d210;

    /* renamed from: title */
    public java.lang.String f38904x6942258;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5 m76021xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5 c19779xf861c3c5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5) fVar;
        return n51.f.a(this.f38904x6942258, c19779xf861c3c5.f38904x6942258) && n51.f.a(this.f38903xd876d210, c19779xf861c3c5.f38903xd876d210);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f38904x6942258;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f38903xd876d210;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f38904x6942258;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f38903xd876d210;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5 c19779xf861c3c5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c19779xf861c3c5.f38904x6942258 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c19779xf861c3c5.f38903xd876d210 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setJumpurl_prefix */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5 m76022x8f050712(java.lang.String str) {
        this.f38903xd876d210 = str;
        return this;
    }

    /* renamed from: setTitle */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19779xf861c3c5 m76023x53bfe316(java.lang.String str) {
        this.f38904x6942258 = str;
        return this;
    }
}
