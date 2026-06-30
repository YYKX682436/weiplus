package bw5;

/* loaded from: classes2.dex */
public class gb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lb0 f109312d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.mb0 f109313e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v70 f109314f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.xa0 f109315g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109316h = new boolean[5];

    static {
        new bw5.gb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.gb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gb0)) {
            return false;
        }
        bw5.gb0 gb0Var = (bw5.gb0) fVar;
        return n51.f.a(this.f109312d, gb0Var.f109312d) && n51.f.a(this.f109313e, gb0Var.f109313e) && n51.f.a(this.f109314f, gb0Var.f109314f) && n51.f.a(this.f109315g, gb0Var.f109315g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109316h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.lb0 lb0Var = this.f109312d;
            if (lb0Var != null && zArr[1]) {
                fVar.i(1, lb0Var.mo75928xcd1e8d8());
                this.f109312d.mo75956x3d5d1f78(fVar);
            }
            bw5.mb0 mb0Var = this.f109313e;
            if (mb0Var != null && zArr[2]) {
                fVar.i(2, mb0Var.mo75928xcd1e8d8());
                this.f109313e.mo75956x3d5d1f78(fVar);
            }
            bw5.v70 v70Var = this.f109314f;
            if (v70Var != null && zArr[3]) {
                fVar.i(3, v70Var.mo75928xcd1e8d8());
                this.f109314f.mo75956x3d5d1f78(fVar);
            }
            bw5.xa0 xa0Var = this.f109315g;
            if (xa0Var != null && zArr[4]) {
                fVar.i(4, xa0Var.mo75928xcd1e8d8());
                this.f109315g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.lb0 lb0Var2 = this.f109312d;
            if (lb0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, lb0Var2.mo75928xcd1e8d8());
            }
            bw5.mb0 mb0Var2 = this.f109313e;
            if (mb0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, mb0Var2.mo75928xcd1e8d8());
            }
            bw5.v70 v70Var2 = this.f109314f;
            if (v70Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, v70Var2.mo75928xcd1e8d8());
            }
            bw5.xa0 xa0Var2 = this.f109315g;
            return (xa0Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, xa0Var2.mo75928xcd1e8d8());
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
                bw5.lb0 lb0Var3 = new bw5.lb0();
                if (bArr != null && bArr.length > 0) {
                    lb0Var3.mo11468x92b714fd(bArr);
                }
                this.f109312d = lb0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.mb0 mb0Var3 = new bw5.mb0();
                if (bArr2 != null && bArr2.length > 0) {
                    mb0Var3.mo11468x92b714fd(bArr2);
                }
                this.f109313e = mb0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.v70 v70Var3 = new bw5.v70();
                if (bArr3 != null && bArr3.length > 0) {
                    v70Var3.mo11468x92b714fd(bArr3);
                }
                this.f109314f = v70Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            bw5.xa0 xa0Var3 = new bw5.xa0();
            if (bArr4 != null && bArr4.length > 0) {
                xa0Var3.mo11468x92b714fd(bArr4);
            }
            this.f109315g = xa0Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
