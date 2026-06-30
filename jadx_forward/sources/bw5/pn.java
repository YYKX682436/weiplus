package bw5;

/* loaded from: classes2.dex */
public class pn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f113286d;

    /* renamed from: e, reason: collision with root package name */
    public int f113287e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f113288f;

    /* renamed from: g, reason: collision with root package name */
    public int f113289g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113290h;

    /* renamed from: i, reason: collision with root package name */
    public int f113291i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.tn f113292m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f113293n = new boolean[8];

    static {
        new bw5.pn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pn mo11468x92b714fd(byte[] bArr) {
        return (bw5.pn) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pn)) {
            return false;
        }
        bw5.pn pnVar = (bw5.pn) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f113286d), java.lang.Boolean.valueOf(pnVar.f113286d)) && n51.f.a(java.lang.Integer.valueOf(this.f113287e), java.lang.Integer.valueOf(pnVar.f113287e)) && n51.f.a(java.lang.Boolean.valueOf(this.f113288f), java.lang.Boolean.valueOf(pnVar.f113288f)) && n51.f.a(java.lang.Integer.valueOf(this.f113289g), java.lang.Integer.valueOf(pnVar.f113289g)) && n51.f.a(this.f113290h, pnVar.f113290h) && n51.f.a(java.lang.Integer.valueOf(this.f113291i), java.lang.Integer.valueOf(pnVar.f113291i)) && n51.f.a(this.f113292m, pnVar.f113292m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113293n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f113286d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113287e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f113288f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113289g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113290h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113291i);
            }
            bw5.tn tnVar = this.f113292m;
            if (tnVar != null && zArr[7]) {
                fVar.i(7, tnVar.mo75928xcd1e8d8());
                this.f113292m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f113286d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f113287e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f113288f);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f113289g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f113290h;
            if (gVar2 != null && zArr[5]) {
                a17 += b36.f.b(5, gVar2);
            }
            if (zArr[6]) {
                a17 += b36.f.e(6, this.f113291i);
            }
            bw5.tn tnVar2 = this.f113292m;
            return (tnVar2 == null || !zArr[7]) ? a17 : a17 + b36.f.i(7, tnVar2.mo75928xcd1e8d8());
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
                this.f113286d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113287e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113288f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113289g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113290h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113291i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.tn tnVar3 = new bw5.tn();
                    if (bArr != null && bArr.length > 0) {
                        tnVar3.mo11468x92b714fd(bArr);
                    }
                    this.f113292m = tnVar3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
