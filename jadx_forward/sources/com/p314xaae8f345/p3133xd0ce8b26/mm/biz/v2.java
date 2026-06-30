package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class v2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300232d;

    /* renamed from: e, reason: collision with root package name */
    public int f300233e;

    /* renamed from: f, reason: collision with root package name */
    public int f300234f;

    /* renamed from: h, reason: collision with root package name */
    public int f300236h;

    /* renamed from: i, reason: collision with root package name */
    public int f300237i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f300235g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f300238m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2 v2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300232d), java.lang.Integer.valueOf(v2Var.f300232d)) && n51.f.a(java.lang.Integer.valueOf(this.f300233e), java.lang.Integer.valueOf(v2Var.f300233e)) && n51.f.a(java.lang.Integer.valueOf(this.f300234f), java.lang.Integer.valueOf(v2Var.f300234f)) && n51.f.a(this.f300235g, v2Var.f300235g) && n51.f.a(java.lang.Integer.valueOf(this.f300236h), java.lang.Integer.valueOf(v2Var.f300236h)) && n51.f.a(java.lang.Integer.valueOf(this.f300237i), java.lang.Integer.valueOf(v2Var.f300237i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300235g;
        boolean[] zArr = this.f300238m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f300232d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f300233e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f300234f);
            }
            fVar.g(4, 8, linkedList);
            if (zArr[5]) {
                fVar.e(5, this.f300236h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f300237i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f300232d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f300233e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f300234f);
            }
            int g17 = e17 + b36.f.g(4, 8, linkedList);
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f300236h);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f300237i) : g17;
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
                this.f300232d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300233e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300234f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w2 w2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w2();
                    if (bArr != null && bArr.length > 0) {
                        w2Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(w2Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f300236h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300237i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
