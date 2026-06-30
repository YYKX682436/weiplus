package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes11.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v f298405m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v();

    /* renamed from: d, reason: collision with root package name */
    public int f298406d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298407e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298408f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.c f298409g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j f298410h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f298411i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v vVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298406d), java.lang.Integer.valueOf(vVar.f298406d)) && n51.f.a(this.f298407e, vVar.f298407e) && n51.f.a(this.f298408f, vVar.f298408f) && n51.f.a(this.f298409g, vVar.f298409g) && n51.f.a(this.f298410h, vVar.f298410h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298411i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f298406d);
            }
            java.lang.String str = this.f298407e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f298408f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.c cVar = this.f298409g;
            if (cVar != null && zArr[4]) {
                fVar.i(4, cVar.mo75928xcd1e8d8());
                this.f298409g.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j jVar = this.f298410h;
            if (jVar != null && zArr[5]) {
                fVar.i(5, jVar.mo75928xcd1e8d8());
                this.f298410h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f298406d) : 0;
            java.lang.String str3 = this.f298407e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f298408f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.c cVar2 = this.f298409g;
            if (cVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, cVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j jVar2 = this.f298410h;
            return (jVar2 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, jVar2.mo75928xcd1e8d8());
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
            this.f298406d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298407e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f298408f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.c cVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.c();
                if (bArr != null && bArr.length > 0) {
                    cVar3.mo11468x92b714fd(bArr);
                }
                this.f298409g = cVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j jVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j();
            if (bArr2 != null && bArr2.length > 0) {
                jVar3.mo11468x92b714fd(bArr2);
            }
            this.f298410h = jVar3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v) super.mo11468x92b714fd(bArr);
    }
}
