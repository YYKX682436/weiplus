package bw5;

/* loaded from: classes11.dex */
public class jr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fp0 f110653d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.kr0 f110654e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ir0 f110655f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f110656g = new boolean[4];

    static {
        new bw5.jr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jr0)) {
            return false;
        }
        bw5.jr0 jr0Var = (bw5.jr0) fVar;
        return n51.f.a(this.f110653d, jr0Var.f110653d) && n51.f.a(this.f110654e, jr0Var.f110654e) && n51.f.a(this.f110655f, jr0Var.f110655f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110656g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fp0 fp0Var = this.f110653d;
            if (fp0Var != null && zArr[1]) {
                fVar.e(1, fp0Var.f108968d);
            }
            bw5.kr0 kr0Var = this.f110654e;
            if (kr0Var != null && zArr[2]) {
                fVar.i(2, kr0Var.mo75928xcd1e8d8());
                this.f110654e.mo75956x3d5d1f78(fVar);
            }
            bw5.ir0 ir0Var = this.f110655f;
            if (ir0Var != null && zArr[3]) {
                fVar.i(3, ir0Var.mo75928xcd1e8d8());
                this.f110655f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fp0 fp0Var2 = this.f110653d;
            if (fp0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, fp0Var2.f108968d);
            }
            bw5.kr0 kr0Var2 = this.f110654e;
            if (kr0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, kr0Var2.mo75928xcd1e8d8());
            }
            bw5.ir0 ir0Var2 = this.f110655f;
            return (ir0Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, ir0Var2.mo75928xcd1e8d8());
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
            this.f110653d = bw5.fp0.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.kr0 kr0Var3 = new bw5.kr0();
                if (bArr != null && bArr.length > 0) {
                    kr0Var3.mo11468x92b714fd(bArr);
                }
                this.f110654e = kr0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ir0 ir0Var3 = new bw5.ir0();
            if (bArr2 != null && bArr2.length > 0) {
                ir0Var3.mo11468x92b714fd(bArr2);
            }
            this.f110655f = ir0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.jr0) super.mo11468x92b714fd(bArr);
    }
}
