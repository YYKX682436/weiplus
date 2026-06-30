package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class e1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f299518e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299519f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t1 f299520g;

    /* renamed from: i, reason: collision with root package name */
    public int f299522i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f299517d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f299521h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f299523m = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1 e1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1) fVar;
        return n51.f.a(this.f299517d, e1Var.f299517d) && n51.f.a(java.lang.Integer.valueOf(this.f299518e), java.lang.Integer.valueOf(e1Var.f299518e)) && n51.f.a(this.f299519f, e1Var.f299519f) && n51.f.a(this.f299520g, e1Var.f299520g) && n51.f.a(this.f299521h, e1Var.f299521h) && n51.f.a(java.lang.Integer.valueOf(this.f299522i), java.lang.Integer.valueOf(e1Var.f299522i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299521h;
        java.util.LinkedList linkedList2 = this.f299517d;
        boolean[] zArr = this.f299523m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            if (zArr[3]) {
                fVar.e(3, this.f299518e);
            }
            java.lang.String str = this.f299519f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t1 t1Var = this.f299520g;
            if (t1Var != null && zArr[5]) {
                fVar.i(5, t1Var.mo75928xcd1e8d8());
                this.f299520g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f299522i);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f299518e);
            }
            java.lang.String str2 = this.f299519f;
            if (str2 != null && zArr[4]) {
                g17 += b36.f.j(4, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t1 t1Var2 = this.f299520g;
            if (t1Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, t1Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(6, 8, linkedList);
            return zArr[7] ? g18 + b36.f.e(7, this.f299522i) : g18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1 d1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1();
                if (bArr != null && bArr.length > 0) {
                    d1Var.mo11468x92b714fd(bArr);
                }
                linkedList2.add(d1Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299518e = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f299519f = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t1 t1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t1();
                if (bArr2 != null && bArr2.length > 0) {
                    t1Var3.mo11468x92b714fd(bArr2);
                }
                this.f299520g = t1Var3;
            }
            zArr[5] = true;
            return 0;
        }
        if (intValue != 6) {
            if (intValue != 7) {
                return -1;
            }
            this.f299522i = aVar2.g(intValue);
            zArr[7] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1 d1Var2 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1();
            if (bArr3 != null && bArr3.length > 0) {
                d1Var2.mo11468x92b714fd(bArr3);
            }
            linkedList.add(d1Var2);
        }
        zArr[6] = true;
        return 0;
    }
}
