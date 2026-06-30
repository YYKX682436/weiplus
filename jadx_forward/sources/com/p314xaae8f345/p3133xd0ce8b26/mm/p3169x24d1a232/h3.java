package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class h3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h3 f301020g = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h3();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h f301021d = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f301022e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i3 f301023f = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i3();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h3 h3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h3) fVar;
        return n51.f.a(this.f301021d, h3Var.f301021d) && n51.f.a(this.f301022e, h3Var.f301022e) && n51.f.a(this.f301023f, h3Var.f301023f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar = this.f301021d;
            if (hVar != null) {
                fVar.i(1, hVar.mo75928xcd1e8d8());
                this.f301021d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f301022e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i3 i3Var = this.f301023f;
            if (i3Var != null) {
                fVar.i(3, i3Var.mo75928xcd1e8d8());
                this.f301023f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar2 = this.f301021d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f301022e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i3 i3Var2 = this.f301023f;
            return i3Var2 != null ? i18 + b36.f.i(3, i3Var2.mo75928xcd1e8d8()) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h();
                if (bArr != null && bArr.length > 0) {
                    hVar3.mo11468x92b714fd(bArr);
                }
                this.f301021d = hVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f301022e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i3 i3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i3();
            if (bArr2 != null && bArr2.length > 0) {
                i3Var3.mo11468x92b714fd(bArr2);
            }
            this.f301023f = i3Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h3) super.mo11468x92b714fd(bArr);
    }
}
