package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes4.dex */
public class k0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300535d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f300536e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f300537f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300538g;

    /* renamed from: h, reason: collision with root package name */
    public long f300539h;

    /* renamed from: i, reason: collision with root package name */
    public int f300540i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f300541m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f300542n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public long f300543o;

    /* renamed from: p, reason: collision with root package name */
    public long f300544p;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0 k0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0) fVar;
        return n51.f.a(this.f300535d, k0Var.f300535d) && n51.f.a(java.lang.Boolean.valueOf(this.f300536e), java.lang.Boolean.valueOf(k0Var.f300536e)) && n51.f.a(java.lang.Boolean.valueOf(this.f300537f), java.lang.Boolean.valueOf(k0Var.f300537f)) && n51.f.a(this.f300538g, k0Var.f300538g) && n51.f.a(java.lang.Long.valueOf(this.f300539h), java.lang.Long.valueOf(k0Var.f300539h)) && n51.f.a(java.lang.Integer.valueOf(this.f300540i), java.lang.Integer.valueOf(k0Var.f300540i)) && n51.f.a(java.lang.Boolean.valueOf(this.f300541m), java.lang.Boolean.valueOf(k0Var.f300541m)) && n51.f.a(this.f300542n, k0Var.f300542n) && n51.f.a(java.lang.Long.valueOf(this.f300543o), java.lang.Long.valueOf(k0Var.f300543o)) && n51.f.a(java.lang.Long.valueOf(this.f300544p), java.lang.Long.valueOf(k0Var.f300544p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300542n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300535d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f300536e);
            fVar.a(3, this.f300537f);
            java.lang.String str2 = this.f300538g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f300539h);
            fVar.e(6, this.f300540i);
            fVar.a(7, this.f300541m);
            fVar.g(8, 8, linkedList);
            fVar.h(9, this.f300543o);
            fVar.h(10, this.f300544p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f300535d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.a(2, this.f300536e) + b36.f.a(3, this.f300537f);
            java.lang.String str4 = this.f300538g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.h(5, this.f300539h) + b36.f.e(6, this.f300540i) + b36.f.a(7, this.f300541m) + b36.f.g(8, 8, linkedList) + b36.f.h(9, this.f300543o) + b36.f.h(10, this.f300544p);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f300535d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f300536e = aVar2.c(intValue);
                return 0;
            case 3:
                this.f300537f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f300538g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f300539h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f300540i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f300541m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j0 j0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j0();
                    if (bArr != null && bArr.length > 0) {
                        j0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(j0Var);
                }
                return 0;
            case 9:
                this.f300543o = aVar2.i(intValue);
                return 0;
            case 10:
                this.f300544p = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
