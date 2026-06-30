package bw5;

/* loaded from: classes4.dex */
public class i6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.h6 f110007e;

    /* renamed from: f, reason: collision with root package name */
    public long f110008f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.g6 f110010h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f110006d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f110009g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110011i = new boolean[6];

    static {
        new bw5.i6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i6 mo11468x92b714fd(byte[] bArr) {
        return (bw5.i6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i6)) {
            return false;
        }
        bw5.i6 i6Var = (bw5.i6) fVar;
        return n51.f.a(this.f110006d, i6Var.f110006d) && n51.f.a(this.f110007e, i6Var.f110007e) && n51.f.a(java.lang.Long.valueOf(this.f110008f), java.lang.Long.valueOf(i6Var.f110008f)) && n51.f.a(this.f110009g, i6Var.f110009g) && n51.f.a(this.f110010h, i6Var.f110010h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.i6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110009g;
        java.util.LinkedList linkedList2 = this.f110006d;
        boolean[] zArr = this.f110011i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            bw5.h6 h6Var = this.f110007e;
            if (h6Var != null && zArr[2]) {
                fVar.i(2, h6Var.mo75928xcd1e8d8());
                this.f110007e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f110008f);
            }
            fVar.g(4, 8, linkedList);
            bw5.g6 g6Var = this.f110010h;
            if (g6Var != null && zArr[5]) {
                fVar.i(5, g6Var.mo75928xcd1e8d8());
                this.f110010h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList2) + 0;
            bw5.h6 h6Var2 = this.f110007e;
            if (h6Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, h6Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                g17 += b36.f.h(3, this.f110008f);
            }
            int g18 = g17 + b36.f.g(4, 8, linkedList);
            bw5.g6 g6Var2 = this.f110010h;
            return (g6Var2 == null || !zArr[5]) ? g18 : g18 + b36.f.i(5, g6Var2.mo75928xcd1e8d8());
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
            linkedList2.add(aVar2.k(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.h6 h6Var3 = new bw5.h6();
                if (bArr != null && bArr.length > 0) {
                    h6Var3.mo11468x92b714fd(bArr);
                }
                this.f110007e = h6Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110008f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.e9 e9Var = new bw5.e9();
                if (bArr2 != null && bArr2.length > 0) {
                    e9Var.mo11468x92b714fd(bArr2);
                }
                linkedList.add(e9Var);
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.g6 g6Var3 = new bw5.g6();
            if (bArr3 != null && bArr3.length > 0) {
                g6Var3.mo11468x92b714fd(bArr3);
            }
            this.f110010h = g6Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
