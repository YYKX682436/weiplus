package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes9.dex */
public class i0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298587d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f298588e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298589f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f298590g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f298591h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f298592i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f298593m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f298594n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f298595o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f298596p = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0 i0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0) fVar;
        return n51.f.a(this.f298587d, i0Var.f298587d) && n51.f.a(java.lang.Integer.valueOf(this.f298588e), java.lang.Integer.valueOf(i0Var.f298588e)) && n51.f.a(this.f298589f, i0Var.f298589f) && n51.f.a(this.f298590g, i0Var.f298590g) && n51.f.a(java.lang.Integer.valueOf(this.f298591h), java.lang.Integer.valueOf(i0Var.f298591h)) && n51.f.a(this.f298592i, i0Var.f298592i) && n51.f.a(java.lang.Integer.valueOf(this.f298593m), java.lang.Integer.valueOf(i0Var.f298593m)) && n51.f.a(java.lang.Integer.valueOf(this.f298594n), java.lang.Integer.valueOf(i0Var.f298594n)) && n51.f.a(java.lang.Integer.valueOf(this.f298595o), java.lang.Integer.valueOf(i0Var.f298595o)) && n51.f.a(this.f298596p, i0Var.f298596p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f298592i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298587d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f298588e);
            java.lang.String str2 = this.f298589f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f298590g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f298591h);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f298593m);
            fVar.e(8, this.f298594n);
            fVar.e(9, this.f298595o);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f298596p;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f298587d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f298588e);
            java.lang.String str5 = this.f298589f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f298590g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            int e17 = j17 + b36.f.e(5, this.f298591h) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f298593m) + b36.f.e(8, this.f298594n) + b36.f.e(9, this.f298595o);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f298596p;
            return gVar2 != null ? e17 + b36.f.b(10, gVar2) : e17;
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
                this.f298587d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f298588e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f298589f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f298590g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f298591h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.v();
                    if (bArr != null && bArr.length > 0) {
                        vVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(vVar);
                }
                return 0;
            case 7:
                this.f298593m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f298594n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f298595o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f298596p = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
