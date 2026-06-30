package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class m0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 f297434r = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297435d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f297436e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f297437f = "";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f297438g = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_INITED;

    /* renamed from: h, reason: collision with root package name */
    public long f297439h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f297440i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f297441m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f297442n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f297443o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 f297444p = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_UNKNOWN;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f297445q = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 m0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0) fVar;
        return n51.f.a(this.f297435d, m0Var.f297435d) && n51.f.a(java.lang.Long.valueOf(this.f297436e), java.lang.Long.valueOf(m0Var.f297436e)) && n51.f.a(this.f297437f, m0Var.f297437f) && n51.f.a(this.f297438g, m0Var.f297438g) && n51.f.a(java.lang.Long.valueOf(this.f297439h), java.lang.Long.valueOf(m0Var.f297439h)) && n51.f.a(java.lang.Long.valueOf(this.f297440i), java.lang.Long.valueOf(m0Var.f297440i)) && n51.f.a(java.lang.Long.valueOf(this.f297441m), java.lang.Long.valueOf(m0Var.f297441m)) && n51.f.a(java.lang.Long.valueOf(this.f297442n), java.lang.Long.valueOf(m0Var.f297442n)) && n51.f.a(java.lang.Long.valueOf(this.f297443o), java.lang.Long.valueOf(m0Var.f297443o)) && n51.f.a(this.f297444p, m0Var.f297444p) && n51.f.a(this.f297445q, m0Var.f297445q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297435d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f297436e);
            java.lang.String str2 = this.f297437f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f297438g;
            if (n0Var != null) {
                fVar.e(4, n0Var.f297461d);
            }
            fVar.h(5, this.f297439h);
            fVar.h(6, this.f297440i);
            fVar.h(7, this.f297441m);
            fVar.h(8, this.f297442n);
            fVar.h(9, this.f297443o);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var = this.f297444p;
            if (o0Var != null) {
                fVar.e(10, o0Var.f297470d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f297445q;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f297435d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f297436e);
            java.lang.String str4 = this.f297437f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var2 = this.f297438g;
            if (n0Var2 != null) {
                j17 += b36.f.e(4, n0Var2.f297461d);
            }
            int h17 = j17 + b36.f.h(5, this.f297439h) + b36.f.h(6, this.f297440i) + b36.f.h(7, this.f297441m) + b36.f.h(8, this.f297442n) + b36.f.h(9, this.f297443o);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var2 = this.f297444p;
            if (o0Var2 != null) {
                h17 += b36.f.e(10, o0Var2.f297470d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f297445q;
            return gVar2 != null ? h17 + b36.f.b(11, gVar2) : h17;
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
        switch (intValue) {
            case 1:
                this.f297435d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f297436e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f297437f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f297438g = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.a(aVar2.g(intValue));
                return 0;
            case 5:
                this.f297439h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f297440i = aVar2.i(intValue);
                return 0;
            case 7:
                this.f297441m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f297442n = aVar2.i(intValue);
                return 0;
            case 9:
                this.f297443o = aVar2.i(intValue);
                return 0;
            case 10:
                this.f297444p = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.a(aVar2.g(intValue));
                return 0;
            case 11:
                this.f297445q = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0) super.mo11468x92b714fd(bArr);
    }
}
