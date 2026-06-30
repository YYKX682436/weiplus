package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes11.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i f300483r = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u f300484d = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u();

    /* renamed from: e, reason: collision with root package name */
    public boolean f300485e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f300486f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f300487g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f300488h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f300489i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f300490m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f300491n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f300492o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d f300493p = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d();

    /* renamed from: q, reason: collision with root package name */
    public boolean f300494q = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i iVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i) fVar;
        return n51.f.a(this.f300484d, iVar.f300484d) && n51.f.a(java.lang.Boolean.valueOf(this.f300485e), java.lang.Boolean.valueOf(iVar.f300485e)) && n51.f.a(java.lang.Boolean.valueOf(this.f300486f), java.lang.Boolean.valueOf(iVar.f300486f)) && n51.f.a(java.lang.Integer.valueOf(this.f300487g), java.lang.Integer.valueOf(iVar.f300487g)) && n51.f.a(java.lang.Integer.valueOf(this.f300488h), java.lang.Integer.valueOf(iVar.f300488h)) && n51.f.a(java.lang.Long.valueOf(this.f300489i), java.lang.Long.valueOf(iVar.f300489i)) && n51.f.a(java.lang.Boolean.valueOf(this.f300490m), java.lang.Boolean.valueOf(iVar.f300490m)) && n51.f.a(java.lang.Boolean.valueOf(this.f300491n), java.lang.Boolean.valueOf(iVar.f300491n)) && n51.f.a(java.lang.Integer.valueOf(this.f300492o), java.lang.Integer.valueOf(iVar.f300492o)) && n51.f.a(this.f300493p, iVar.f300493p) && n51.f.a(java.lang.Boolean.valueOf(this.f300494q), java.lang.Boolean.valueOf(iVar.f300494q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u uVar = this.f300484d;
            if (uVar != null) {
                fVar.i(1, uVar.mo75928xcd1e8d8());
                this.f300484d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f300485e);
            fVar.a(3, this.f300486f);
            fVar.e(4, this.f300487g);
            fVar.e(5, this.f300488h);
            fVar.h(6, this.f300489i);
            fVar.a(7, this.f300490m);
            fVar.a(8, this.f300491n);
            fVar.e(9, this.f300492o);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d dVar = this.f300493p;
            if (dVar != null) {
                fVar.i(10, dVar.mo75928xcd1e8d8());
                this.f300493p.mo75956x3d5d1f78(fVar);
            }
            fVar.a(11, this.f300494q);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u uVar2 = this.f300484d;
            int i18 = (uVar2 != null ? 0 + b36.f.i(1, uVar2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f300485e) + b36.f.a(3, this.f300486f) + b36.f.e(4, this.f300487g) + b36.f.e(5, this.f300488h) + b36.f.h(6, this.f300489i) + b36.f.a(7, this.f300490m) + b36.f.a(8, this.f300491n) + b36.f.e(9, this.f300492o);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d dVar2 = this.f300493p;
            if (dVar2 != null) {
                i18 += b36.f.i(10, dVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.a(11, this.f300494q);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u uVar3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.mo11468x92b714fd(bArr);
                    }
                    this.f300484d = uVar3;
                }
                return 0;
            case 2:
                this.f300485e = aVar2.c(intValue);
                return 0;
            case 3:
                this.f300486f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f300487g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f300488h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f300489i = aVar2.i(intValue);
                return 0;
            case 7:
                this.f300490m = aVar2.c(intValue);
                return 0;
            case 8:
                this.f300491n = aVar2.c(intValue);
                return 0;
            case 9:
                this.f300492o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d dVar3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f300493p = dVar3;
                }
                return 0;
            case 11:
                this.f300494q = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.i) super.mo11468x92b714fd(bArr);
    }
}
