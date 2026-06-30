package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes9.dex */
public class s extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s f298660g = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s();

    /* renamed from: d, reason: collision with root package name */
    public boolean f298661d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g f298662e = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298663f = "";

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f298661d), java.lang.Boolean.valueOf(sVar.f298661d)) && n51.f.a(this.f298662e, sVar.f298662e) && n51.f.a(this.f298663f, sVar.f298663f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f298661d);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g gVar = this.f298662e;
            if (gVar != null) {
                fVar.i(2, gVar.mo75928xcd1e8d8());
                this.f298662e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f298663f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f298661d) + 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g gVar2 = this.f298662e;
            if (gVar2 != null) {
                a17 += b36.f.i(2, gVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f298663f;
            return str2 != null ? a17 + b36.f.j(3, str2) : a17;
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
        if (intValue == 1) {
            this.f298661d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f298663f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g gVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g();
            if (bArr != null && bArr.length > 0) {
                gVar3.mo11468x92b714fd(bArr);
            }
            this.f298662e = gVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.s) super.mo11468x92b714fd(bArr);
    }
}
