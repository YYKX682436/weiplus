package bw5;

/* loaded from: classes4.dex */
public class ik0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110157d;

    /* renamed from: f, reason: collision with root package name */
    public int f110159f;

    /* renamed from: g, reason: collision with root package name */
    public int f110160g;

    /* renamed from: h, reason: collision with root package name */
    public int f110161h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f110158e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110162i = new boolean[6];

    static {
        new bw5.ik0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ik0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ik0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ik0)) {
            return false;
        }
        bw5.ik0 ik0Var = (bw5.ik0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110157d), java.lang.Integer.valueOf(ik0Var.f110157d)) && n51.f.a(this.f110158e, ik0Var.f110158e) && n51.f.a(java.lang.Integer.valueOf(this.f110159f), java.lang.Integer.valueOf(ik0Var.f110159f)) && n51.f.a(java.lang.Integer.valueOf(this.f110160g), java.lang.Integer.valueOf(ik0Var.f110160g)) && n51.f.a(java.lang.Integer.valueOf(this.f110161h), java.lang.Integer.valueOf(ik0Var.f110161h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ik0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110158e;
        boolean[] zArr = this.f110162i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110157d);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f110159f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f110160g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110161h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f110157d) : 0) + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f110159f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f110160g);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f110161h) : e17;
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
            this.f110157d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f110159f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f110160g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f110161h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.zj0 zj0Var = new bw5.zj0();
            if (bArr != null && bArr.length > 0) {
                zj0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(zj0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
