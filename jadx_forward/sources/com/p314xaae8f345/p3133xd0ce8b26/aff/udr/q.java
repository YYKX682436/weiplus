package com.p314xaae8f345.p3133xd0ce8b26.aff.udr;

/* loaded from: classes7.dex */
public class q extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299080d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f299081e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f299082f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f299083g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q) super.mo11468x92b714fd(bArr);
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q c(java.lang.String str) {
        this.f299080d = str;
        this.f299083g[1] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q) fVar;
        return n51.f.a(this.f299080d, qVar.f299080d) && n51.f.a(this.f299081e, qVar.f299081e) && n51.f.a(this.f299082f, qVar.f299082f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299083g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299080d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, this.f299081e);
            fVar.g(3, 8, this.f299082f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f299080d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return i18 + b36.f.g(2, 1, this.f299081e) + b36.f.g(3, 8, this.f299082f);
        }
        if (i17 == 2) {
            this.f299081e.clear();
            this.f299082f.clear();
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
            this.f299080d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299081e.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
            if (bArr != null && bArr.length > 0) {
                vVar.mo11468x92b714fd(bArr);
            }
            this.f299082f.add(vVar);
        }
        zArr[3] = true;
        return 0;
    }
}
