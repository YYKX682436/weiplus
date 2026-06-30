package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes11.dex */
public class d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300400d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f300401e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f300402f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300403g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f300404h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f300405i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f300406m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f300407n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f300408o = "";

    /* renamed from: p, reason: collision with root package name */
    public long f300409p = 0;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j f300410q = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d dVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d) fVar;
        return n51.f.a(this.f300400d, dVar.f300400d) && n51.f.a(java.lang.Boolean.valueOf(this.f300401e), java.lang.Boolean.valueOf(dVar.f300401e)) && n51.f.a(java.lang.Boolean.valueOf(this.f300402f), java.lang.Boolean.valueOf(dVar.f300402f)) && n51.f.a(this.f300403g, dVar.f300403g) && n51.f.a(java.lang.Long.valueOf(this.f300404h), java.lang.Long.valueOf(dVar.f300404h)) && n51.f.a(java.lang.Integer.valueOf(this.f300405i), java.lang.Integer.valueOf(dVar.f300405i)) && n51.f.a(java.lang.Integer.valueOf(this.f300406m), java.lang.Integer.valueOf(dVar.f300406m)) && n51.f.a(java.lang.Boolean.valueOf(this.f300407n), java.lang.Boolean.valueOf(dVar.f300407n)) && n51.f.a(this.f300408o, dVar.f300408o) && n51.f.a(java.lang.Long.valueOf(this.f300409p), java.lang.Long.valueOf(dVar.f300409p)) && n51.f.a(this.f300410q, dVar.f300410q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300400d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f300401e);
            fVar.a(3, this.f300402f);
            java.lang.String str2 = this.f300403g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f300404h);
            fVar.e(6, this.f300405i);
            fVar.e(7, this.f300406m);
            fVar.a(8, this.f300407n);
            java.lang.String str3 = this.f300408o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.h(10, this.f300409p);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar = this.f300410q;
            if (jVar != null) {
                fVar.i(11, jVar.mo75928xcd1e8d8());
                this.f300410q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f300400d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.a(2, this.f300401e) + b36.f.a(3, this.f300402f);
            java.lang.String str5 = this.f300403g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            int h17 = j17 + b36.f.h(5, this.f300404h) + b36.f.e(6, this.f300405i) + b36.f.e(7, this.f300406m) + b36.f.a(8, this.f300407n);
            java.lang.String str6 = this.f300408o;
            if (str6 != null) {
                h17 += b36.f.j(9, str6);
            }
            int h18 = h17 + b36.f.h(10, this.f300409p);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar2 = this.f300410q;
            return jVar2 != null ? h18 + b36.f.i(11, jVar2.mo75928xcd1e8d8()) : h18;
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
                this.f300400d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f300401e = aVar2.c(intValue);
                return 0;
            case 3:
                this.f300402f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f300403g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f300404h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f300405i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f300406m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f300407n = aVar2.c(intValue);
                return 0;
            case 9:
                this.f300408o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f300409p = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();
                    if (bArr != null && bArr.length > 0) {
                        jVar3.mo11468x92b714fd(bArr);
                    }
                    this.f300410q = jVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
