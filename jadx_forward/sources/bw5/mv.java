package bw5;

/* loaded from: classes2.dex */
public class mv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111923d;

    /* renamed from: e, reason: collision with root package name */
    public int f111924e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111925f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111926g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111927h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111928i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.bf f111929m;

    /* renamed from: n, reason: collision with root package name */
    public long f111930n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f111931o = new boolean[9];

    static {
        new bw5.mv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mv mo11468x92b714fd(byte[] bArr) {
        return (bw5.mv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mv)) {
            return false;
        }
        bw5.mv mvVar = (bw5.mv) fVar;
        return n51.f.a(this.f111923d, mvVar.f111923d) && n51.f.a(java.lang.Integer.valueOf(this.f111924e), java.lang.Integer.valueOf(mvVar.f111924e)) && n51.f.a(this.f111925f, mvVar.f111925f) && n51.f.a(this.f111926g, mvVar.f111926g) && n51.f.a(this.f111927h, mvVar.f111927h) && n51.f.a(this.f111928i, mvVar.f111928i) && n51.f.a(this.f111929m, mvVar.f111929m) && n51.f.a(java.lang.Long.valueOf(this.f111930n), java.lang.Long.valueOf(mvVar.f111930n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111931o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111923d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111924e);
            }
            java.lang.String str2 = this.f111925f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f111926g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111927h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            java.lang.String str4 = this.f111928i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.bf bfVar = this.f111929m;
            if (bfVar != null && zArr[7]) {
                fVar.i(7, bfVar.mo75928xcd1e8d8());
                this.f111929m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.h(8, this.f111930n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f111923d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111924e);
            }
            java.lang.String str6 = this.f111925f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f111926g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111927h;
            if (gVar2 != null && zArr[5]) {
                i18 += b36.f.b(5, gVar2);
            }
            java.lang.String str8 = this.f111928i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            bw5.bf bfVar2 = this.f111929m;
            if (bfVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, bfVar2.mo75928xcd1e8d8());
            }
            return zArr[8] ? i18 + b36.f.h(8, this.f111930n) : i18;
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
                this.f111923d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111924e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111925f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111926g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111927h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111928i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.bf bfVar3 = new bw5.bf();
                    if (bArr != null && bArr.length > 0) {
                        bfVar3.mo11468x92b714fd(bArr);
                    }
                    this.f111929m = bfVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f111930n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
