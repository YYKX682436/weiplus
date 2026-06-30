package bw5;

/* loaded from: classes2.dex */
public class cg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107611d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.jq f107612e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107613f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107614g = new boolean[4];

    static {
        new bw5.cg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cg0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.cg0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cg0)) {
            return false;
        }
        bw5.cg0 cg0Var = (bw5.cg0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107611d), java.lang.Integer.valueOf(cg0Var.f107611d)) && n51.f.a(this.f107612e, cg0Var.f107612e) && n51.f.a(this.f107613f, cg0Var.f107613f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107614g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107611d);
            }
            bw5.jq jqVar = this.f107612e;
            if (jqVar != null && zArr[2]) {
                fVar.i(2, jqVar.mo75928xcd1e8d8());
                this.f107612e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f107613f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107611d) : 0;
            bw5.jq jqVar2 = this.f107612e;
            if (jqVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, jqVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f107613f;
            return (str2 == null || !zArr[3]) ? e17 : e17 + b36.f.j(3, str2);
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
            this.f107611d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f107613f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.jq jqVar3 = new bw5.jq();
            if (bArr != null && bArr.length > 0) {
                jqVar3.mo11468x92b714fd(bArr);
            }
            this.f107612e = jqVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
