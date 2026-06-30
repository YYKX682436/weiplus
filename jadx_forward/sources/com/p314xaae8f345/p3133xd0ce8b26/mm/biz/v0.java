package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class v0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300226d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f300228f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f300227e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f300229g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v0 v0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v0) fVar;
        return n51.f.a(this.f300226d, v0Var.f300226d) && n51.f.a(this.f300227e, v0Var.f300227e) && n51.f.a(java.lang.Boolean.valueOf(this.f300228f), java.lang.Boolean.valueOf(v0Var.f300228f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300227e;
        boolean[] zArr = this.f300229g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300226d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.a(3, this.f300228f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f300226d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            return zArr[3] ? g17 + b36.f.a(3, this.f300228f) : g17;
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
            this.f300226d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f300228f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x0 x0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x0();
            if (bArr != null && bArr.length > 0) {
                x0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(x0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
