package bw5;

/* loaded from: classes2.dex */
public class e90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108330d;

    /* renamed from: e, reason: collision with root package name */
    public int f108331e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.d90 f108332f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108333g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f108334h = new boolean[5];

    static {
        new bw5.e90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.e90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e90)) {
            return false;
        }
        bw5.e90 e90Var = (bw5.e90) fVar;
        return n51.f.a(this.f108330d, e90Var.f108330d) && n51.f.a(java.lang.Integer.valueOf(this.f108331e), java.lang.Integer.valueOf(e90Var.f108331e)) && n51.f.a(this.f108332f, e90Var.f108332f) && n51.f.a(this.f108333g, e90Var.f108333g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108334h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108330d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108331e);
            }
            bw5.d90 d90Var = this.f108332f;
            if (d90Var != null && zArr[3]) {
                fVar.i(3, d90Var.mo75928xcd1e8d8());
                this.f108332f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f108333g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108330d;
            if (gVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f108331e);
            }
            bw5.d90 d90Var2 = this.f108332f;
            if (d90Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, d90Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f108333g;
            return (str2 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str2);
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
            this.f108330d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108331e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f108333g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.d90 d90Var3 = new bw5.d90();
            if (bArr != null && bArr.length > 0) {
                d90Var3.mo11468x92b714fd(bArr);
            }
            this.f108332f = d90Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
