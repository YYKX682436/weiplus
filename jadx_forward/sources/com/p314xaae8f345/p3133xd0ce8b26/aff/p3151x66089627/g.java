package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f298547d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f298548e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298549f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f298550g = new java.util.LinkedList();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298547d), java.lang.Long.valueOf(gVar.f298547d)) && n51.f.a(this.f298548e, gVar.f298548e) && n51.f.a(this.f298549f, gVar.f298549f) && n51.f.a(this.f298550g, gVar.f298550g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f298550g;
        java.util.LinkedList linkedList2 = this.f298548e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f298547d);
            fVar.g(2, 8, linkedList2);
            java.lang.String str = this.f298549f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f298547d) + 0 + b36.f.g(2, 8, linkedList2);
            java.lang.String str2 = this.f298549f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            this.f298547d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0 i0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0();
                if (bArr != null && bArr.length > 0) {
                    i0Var.mo11468x92b714fd(bArr);
                }
                linkedList2.add(i0Var);
            }
            return 0;
        }
        if (intValue == 3) {
            this.f298549f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g1 g1Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g1();
            if (bArr2 != null && bArr2.length > 0) {
                g1Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(g1Var);
        }
        return 0;
    }
}
