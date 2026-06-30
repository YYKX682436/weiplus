package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class g3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g3 f299612i = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g3();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u f299613d;

    /* renamed from: f, reason: collision with root package name */
    public long f299615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f299616g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f299614e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f299617h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g3 g3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g3) fVar;
        return n51.f.a(this.f299613d, g3Var.f299613d) && n51.f.a(this.f299614e, g3Var.f299614e) && n51.f.a(java.lang.Long.valueOf(this.f299615f), java.lang.Long.valueOf(g3Var.f299615f)) && n51.f.a(java.lang.Boolean.valueOf(this.f299616g), java.lang.Boolean.valueOf(g3Var.f299616g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299614e;
        boolean[] zArr = this.f299617h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u uVar = this.f299613d;
            if (uVar != null && zArr[1]) {
                fVar.i(1, uVar.mo75928xcd1e8d8());
                this.f299613d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.h(3, this.f299615f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f299616g);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u uVar2 = this.f299613d;
            if (uVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, uVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.h(3, this.f299615f);
            }
            return zArr[4] ? g17 + b36.f.a(4, this.f299616g) : g17;
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
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u uVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u();
                if (bArr != null && bArr.length > 0) {
                    uVar3.mo11468x92b714fd(bArr);
                }
                this.f299613d = uVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f299615f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f299616g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3 f3Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f3();
            if (bArr2 != null && bArr2.length > 0) {
                f3Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(f3Var);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g3) super.mo11468x92b714fd(bArr);
    }
}
