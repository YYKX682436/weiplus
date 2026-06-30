package bw5;

/* loaded from: classes2.dex */
public class k1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110733e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f110734f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f110735g = new boolean[4];

    static {
        new bw5.k1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.k1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k1)) {
            return false;
        }
        bw5.k1 k1Var = (bw5.k1) fVar;
        return n51.f.a(this.f110732d, k1Var.f110732d) && n51.f.a(this.f110733e, k1Var.f110733e) && n51.f.a(this.f110734f, k1Var.f110734f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110735g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110732d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110733e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.am amVar = this.f110734f;
            if (amVar != null && zArr[3]) {
                fVar.i(3, amVar.mo75928xcd1e8d8());
                this.f110734f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f110732d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f110733e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.am amVar2 = this.f110734f;
            return (amVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, amVar2.mo75928xcd1e8d8());
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
            this.f110732d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110733e = aVar2.k(intValue);
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
            bw5.am amVar3 = new bw5.am();
            if (bArr != null && bArr.length > 0) {
                amVar3.mo11468x92b714fd(bArr);
            }
            this.f110734f = amVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
