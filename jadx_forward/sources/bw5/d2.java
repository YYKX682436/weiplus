package bw5;

/* loaded from: classes11.dex */
public class d2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107814e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107815f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o50 f107816g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.v70 f107817h;

    /* renamed from: i, reason: collision with root package name */
    public int f107818i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.e2 f107819m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f107820n = new boolean[8];

    static {
        new bw5.d2();
    }

    public bw5.o50 b() {
        return this.f107820n[4] ? this.f107816g : new bw5.o50();
    }

    public bw5.v70 c() {
        return this.f107820n[5] ? this.f107817h : new bw5.v70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d2)) {
            return false;
        }
        bw5.d2 d2Var = (bw5.d2) fVar;
        return n51.f.a(this.f107813d, d2Var.f107813d) && n51.f.a(this.f107814e, d2Var.f107814e) && n51.f.a(this.f107815f, d2Var.f107815f) && n51.f.a(this.f107816g, d2Var.f107816g) && n51.f.a(this.f107817h, d2Var.f107817h) && n51.f.a(java.lang.Integer.valueOf(this.f107818i), java.lang.Integer.valueOf(d2Var.f107818i)) && n51.f.a(this.f107819m, d2Var.f107819m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.d2 mo11468x92b714fd(byte[] bArr) {
        return (bw5.d2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.d2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107820n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107813d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107814e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107815f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.o50 o50Var = this.f107816g;
            if (o50Var != null && zArr[4]) {
                fVar.i(4, o50Var.mo75928xcd1e8d8());
                this.f107816g.mo75956x3d5d1f78(fVar);
            }
            bw5.v70 v70Var = this.f107817h;
            if (v70Var != null && zArr[5]) {
                fVar.i(5, v70Var.mo75928xcd1e8d8());
                this.f107817h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107818i);
            }
            bw5.e2 e2Var = this.f107819m;
            if (e2Var != null && zArr[7]) {
                fVar.i(7, e2Var.mo75928xcd1e8d8());
                this.f107819m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f107813d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f107814e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107815f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.o50 o50Var2 = this.f107816g;
            if (o50Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, o50Var2.mo75928xcd1e8d8());
            }
            bw5.v70 v70Var2 = this.f107817h;
            if (v70Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, v70Var2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f107818i);
            }
            bw5.e2 e2Var2 = this.f107819m;
            return (e2Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, e2Var2.mo75928xcd1e8d8());
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
        switch (intValue) {
            case 1:
                this.f107813d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107814e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107815f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.o50 o50Var3 = new bw5.o50();
                    if (bArr != null && bArr.length > 0) {
                        o50Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107816g = o50Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f107817h = v70Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f107818i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.e2 e2Var3 = new bw5.e2();
                    if (bArr3 != null && bArr3.length > 0) {
                        e2Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f107819m = e2Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public java.lang.String v() {
        return this.f107820n[2] ? this.f107814e : "";
    }
}
