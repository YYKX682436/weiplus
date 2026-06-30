package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e f298528i = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f298529d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f298530e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f298531f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f298532g = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 f298533h = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e eVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e) fVar;
        return n51.f.a(this.f298529d, eVar.f298529d) && n51.f.a(java.lang.Integer.valueOf(this.f298530e), java.lang.Integer.valueOf(eVar.f298530e)) && n51.f.a(java.lang.Integer.valueOf(this.f298531f), java.lang.Integer.valueOf(eVar.f298531f)) && n51.f.a(java.lang.Integer.valueOf(this.f298532g), java.lang.Integer.valueOf(eVar.f298532g)) && n51.f.a(this.f298533h, eVar.f298533h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f298529d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f298530e);
            fVar.e(3, this.f298531f);
            fVar.e(4, this.f298532g);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var = this.f298533h;
            if (u0Var != null) {
                fVar.i(5, u0Var.mo75928xcd1e8d8());
                this.f298533h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f298530e) + b36.f.e(3, this.f298531f) + b36.f.e(4, this.f298532g);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var2 = this.f298533h;
            return u0Var2 != null ? g17 + b36.f.i(5, u0Var2.mo75928xcd1e8d8()) : g17;
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0 i0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0();
                if (bArr != null && bArr.length > 0) {
                    i0Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(i0Var);
            }
            return 0;
        }
        if (intValue == 2) {
            this.f298530e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f298531f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f298532g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();
            if (bArr2 != null && bArr2.length > 0) {
                u0Var3.mo11468x92b714fd(bArr2);
            }
            this.f298533h = u0Var3;
        }
        return 0;
    }
}
