package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.RelievedBuySubInfo */
/* loaded from: classes2.dex */
public class C19803xd910f9e8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: desc */
    public java.lang.String f38953x2efe91;

    /* renamed from: icon */
    public java.lang.String f38954x313c79;

    /* renamed from: sub_type */
    public int f38955x840c71d9;

    /* renamed from: title */
    public java.lang.String f38956x6942258;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8 m77249xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8 c19803xd910f9e8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f38955x840c71d9), java.lang.Integer.valueOf(c19803xd910f9e8.f38955x840c71d9)) && n51.f.a(this.f38956x6942258, c19803xd910f9e8.f38956x6942258) && n51.f.a(this.f38953x2efe91, c19803xd910f9e8.f38953x2efe91) && n51.f.a(this.f38954x313c79, c19803xd910f9e8.f38954x313c79);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f38955x840c71d9);
            java.lang.String str = this.f38956x6942258;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f38953x2efe91;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f38954x313c79;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f38955x840c71d9) + 0;
            java.lang.String str4 = this.f38956x6942258;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f38953x2efe91;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f38954x313c79;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8 c19803xd910f9e8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c19803xd910f9e8.f38955x840c71d9 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            c19803xd910f9e8.f38956x6942258 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c19803xd910f9e8.f38953x2efe91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c19803xd910f9e8.f38954x313c79 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8 m77250x76492e13(java.lang.String str) {
        this.f38953x2efe91 = str;
        return this;
    }

    /* renamed from: setIcon */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8 m77251x764b6bfb(java.lang.String str) {
        this.f38954x313c79 = str;
        return this;
    }

    /* renamed from: setSub_type */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8 m77252xfa9f105b(int i17) {
        this.f38955x840c71d9 = i17;
        return this;
    }

    /* renamed from: setTitle */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19803xd910f9e8 m77253x53bfe316(java.lang.String str) {
        this.f38956x6942258 = str;
        return this;
    }
}
