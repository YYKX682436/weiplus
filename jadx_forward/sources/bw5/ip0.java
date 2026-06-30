package bw5;

/* loaded from: classes2.dex */
public class ip0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110196d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ja0 f110197e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110198f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.v40 f110199g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110200h = new boolean[5];

    static {
        new bw5.ip0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ip0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ip0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ip0)) {
            return false;
        }
        bw5.ip0 ip0Var = (bw5.ip0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110196d), java.lang.Integer.valueOf(ip0Var.f110196d)) && n51.f.a(this.f110197e, ip0Var.f110197e) && n51.f.a(this.f110198f, ip0Var.f110198f) && n51.f.a(this.f110199g, ip0Var.f110199g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ip0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110200h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110196d);
            }
            bw5.ja0 ja0Var = this.f110197e;
            if (ja0Var != null && zArr[2]) {
                fVar.i(2, ja0Var.mo75928xcd1e8d8());
                this.f110197e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f110198f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.v40 v40Var = this.f110199g;
            if (v40Var != null && zArr[4]) {
                fVar.i(4, v40Var.mo75928xcd1e8d8());
                this.f110199g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110196d) : 0;
            bw5.ja0 ja0Var2 = this.f110197e;
            if (ja0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, ja0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f110198f;
            if (gVar2 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            bw5.v40 v40Var2 = this.f110199g;
            return (v40Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, v40Var2.mo75928xcd1e8d8());
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
            this.f110196d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ja0 ja0Var3 = new bw5.ja0();
                if (bArr != null && bArr.length > 0) {
                    ja0Var3.mo11468x92b714fd(bArr);
                }
                this.f110197e = ja0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110198f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.v40 v40Var3 = new bw5.v40();
            if (bArr2 != null && bArr2.length > 0) {
                v40Var3.mo11468x92b714fd(bArr2);
            }
            this.f110199g = v40Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
