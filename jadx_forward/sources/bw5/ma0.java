package bw5;

/* loaded from: classes2.dex */
public class ma0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f111679d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.u90 f111680e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f111681f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f111682g = new boolean[4];

    static {
        new bw5.ma0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ma0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ma0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ma0)) {
            return false;
        }
        bw5.ma0 ma0Var = (bw5.ma0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111679d), java.lang.Integer.valueOf(ma0Var.f111679d)) && n51.f.a(this.f111680e, ma0Var.f111680e) && n51.f.a(this.f111681f, ma0Var.f111681f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ma0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111681f;
        boolean[] zArr = this.f111682g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111679d);
            }
            bw5.u90 u90Var = this.f111680e;
            if (u90Var != null && zArr[2]) {
                fVar.i(2, u90Var.mo75928xcd1e8d8());
                this.f111680e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f111679d) : 0;
            bw5.u90 u90Var2 = this.f111680e;
            if (u90Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, u90Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.g(3, 8, linkedList);
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
            this.f111679d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.u90 u90Var3 = new bw5.u90();
                if (bArr != null && bArr.length > 0) {
                    u90Var3.mo11468x92b714fd(bArr);
                }
                this.f111680e = u90Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.ca0 ca0Var = new bw5.ca0();
            if (bArr2 != null && bArr2.length > 0) {
                ca0Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(ca0Var);
        }
        zArr[3] = true;
        return 0;
    }
}
