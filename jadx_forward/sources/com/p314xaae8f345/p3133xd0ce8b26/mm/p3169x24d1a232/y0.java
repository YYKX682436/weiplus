package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class y0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y0 f301509i = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f301511e;

    /* renamed from: f, reason: collision with root package name */
    public int f301512f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d4 f301513g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f301510d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f301514h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y0 y0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y0) fVar;
        return n51.f.a(this.f301510d, y0Var.f301510d) && n51.f.a(java.lang.Boolean.valueOf(this.f301511e), java.lang.Boolean.valueOf(y0Var.f301511e)) && n51.f.a(java.lang.Integer.valueOf(this.f301512f), java.lang.Integer.valueOf(y0Var.f301512f)) && n51.f.a(this.f301513g, y0Var.f301513g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f301510d;
        boolean[] zArr = this.f301514h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.a(2, this.f301511e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301512f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d4 d4Var = this.f301513g;
            if (d4Var != null && zArr[4]) {
                fVar.i(4, d4Var.mo75928xcd1e8d8());
                this.f301513g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.a(2, this.f301511e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f301512f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d4 d4Var2 = this.f301513g;
            return (d4Var2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, d4Var2.mo75928xcd1e8d8());
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
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x0 x0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x0();
                if (bArr != null && bArr.length > 0) {
                    x0Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(x0Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f301511e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f301512f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d4 d4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d4();
            if (bArr2 != null && bArr2.length > 0) {
                d4Var3.mo11468x92b714fd(bArr2);
            }
            this.f301513g = d4Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y0) super.mo11468x92b714fd(bArr);
    }
}
