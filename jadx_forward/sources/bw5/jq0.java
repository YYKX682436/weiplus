package bw5;

/* loaded from: classes11.dex */
public class jq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.dr0 f110642d;

    /* renamed from: e, reason: collision with root package name */
    public int f110643e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.lp0 f110644f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.eq0 f110645g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.lq0 f110646h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110647i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f110648m = new boolean[7];

    static {
        new bw5.jq0();
    }

    public bw5.lp0 b() {
        return this.f110648m[3] ? this.f110644f : new bw5.lp0();
    }

    public bw5.dr0 c() {
        return this.f110648m[1] ? this.f110642d : new bw5.dr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jq0)) {
            return false;
        }
        bw5.jq0 jq0Var = (bw5.jq0) fVar;
        return n51.f.a(this.f110642d, jq0Var.f110642d) && n51.f.a(java.lang.Integer.valueOf(this.f110643e), java.lang.Integer.valueOf(jq0Var.f110643e)) && n51.f.a(this.f110644f, jq0Var.f110644f) && n51.f.a(this.f110645g, jq0Var.f110645g) && n51.f.a(this.f110646h, jq0Var.f110646h) && n51.f.a(this.f110647i, jq0Var.f110647i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110648m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.dr0 dr0Var = this.f110642d;
            if (dr0Var != null && zArr[1]) {
                fVar.i(1, dr0Var.mo75928xcd1e8d8());
                this.f110642d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110643e);
            }
            bw5.lp0 lp0Var = this.f110644f;
            if (lp0Var != null && zArr[3]) {
                fVar.i(3, lp0Var.mo75928xcd1e8d8());
                this.f110644f.mo75956x3d5d1f78(fVar);
            }
            bw5.eq0 eq0Var = this.f110645g;
            if (eq0Var != null && zArr[4]) {
                fVar.e(4, eq0Var.f108558d);
            }
            bw5.lq0 lq0Var = this.f110646h;
            if (lq0Var != null && zArr[5]) {
                fVar.e(5, lq0Var.f111463d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f110647i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.dr0 dr0Var2 = this.f110642d;
            if (dr0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dr0Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f110643e);
            }
            bw5.lp0 lp0Var2 = this.f110644f;
            if (lp0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, lp0Var2.mo75928xcd1e8d8());
            }
            bw5.eq0 eq0Var2 = this.f110645g;
            if (eq0Var2 != null && zArr[4]) {
                i18 += b36.f.e(4, eq0Var2.f108558d);
            }
            bw5.lq0 lq0Var2 = this.f110646h;
            if (lq0Var2 != null && zArr[5]) {
                i18 += b36.f.e(5, lq0Var2.f111463d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f110647i;
            return (gVar2 == null || !zArr[6]) ? i18 : i18 + b36.f.b(6, gVar2);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.dr0 dr0Var3 = new bw5.dr0();
                    if (bArr != null && bArr.length > 0) {
                        dr0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f110642d = dr0Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f110643e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.lp0 lp0Var3 = new bw5.lp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lp0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f110644f = lp0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f110645g = bw5.eq0.a(aVar2.g(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f110646h = bw5.lq0.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f110647i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.jq0) super.mo11468x92b714fd(bArr);
    }
}
