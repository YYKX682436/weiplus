package bw5;

/* loaded from: classes2.dex */
public class uj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f115463d;

    /* renamed from: e, reason: collision with root package name */
    public float f115464e;

    /* renamed from: f, reason: collision with root package name */
    public int f115465f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115466g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115467h;

    /* renamed from: i, reason: collision with root package name */
    public int f115468i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f115469m = new boolean[7];

    static {
        new bw5.uj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uj)) {
            return false;
        }
        bw5.uj ujVar = (bw5.uj) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f115463d), java.lang.Float.valueOf(ujVar.f115463d)) && n51.f.a(java.lang.Float.valueOf(this.f115464e), java.lang.Float.valueOf(ujVar.f115464e)) && n51.f.a(java.lang.Integer.valueOf(this.f115465f), java.lang.Integer.valueOf(ujVar.f115465f)) && n51.f.a(this.f115466g, ujVar.f115466g) && n51.f.a(this.f115467h, ujVar.f115467h) && n51.f.a(java.lang.Integer.valueOf(this.f115468i), java.lang.Integer.valueOf(ujVar.f115468i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.uj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115469m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f115463d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f115464e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115465f);
            }
            java.lang.String str = this.f115466g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f115467h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115468i);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f115463d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f115464e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f115465f);
            }
            java.lang.String str3 = this.f115466g;
            if (str3 != null && zArr[4]) {
                d17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f115467h;
            if (str4 != null && zArr[5]) {
                d17 += b36.f.j(5, str4);
            }
            return zArr[6] ? d17 + b36.f.e(6, this.f115468i) : d17;
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
                this.f115463d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115464e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115465f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115466g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115467h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115468i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.uj) super.mo11468x92b714fd(bArr);
    }
}
