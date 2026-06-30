package bw5;

/* loaded from: classes2.dex */
public class od0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yr f112598d;

    /* renamed from: e, reason: collision with root package name */
    public int f112599e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112600f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f112601g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f112602h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f112603i = new boolean[6];

    static {
        new bw5.od0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.od0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.od0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.od0)) {
            return false;
        }
        bw5.od0 od0Var = (bw5.od0) fVar;
        return n51.f.a(this.f112598d, od0Var.f112598d) && n51.f.a(java.lang.Integer.valueOf(this.f112599e), java.lang.Integer.valueOf(od0Var.f112599e)) && n51.f.a(java.lang.Boolean.valueOf(this.f112600f), java.lang.Boolean.valueOf(od0Var.f112600f)) && n51.f.a(java.lang.Boolean.valueOf(this.f112601g), java.lang.Boolean.valueOf(od0Var.f112601g)) && n51.f.a(java.lang.Boolean.valueOf(this.f112602h), java.lang.Boolean.valueOf(od0Var.f112602h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.od0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112603i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yr yrVar = this.f112598d;
            if (yrVar != null && zArr[1]) {
                fVar.i(1, yrVar.mo75928xcd1e8d8());
                this.f112598d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112599e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f112600f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f112601g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f112602h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.yr yrVar2 = this.f112598d;
            if (yrVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, yrVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f112599e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f112600f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f112601g);
            }
            return zArr[5] ? i18 + b36.f.a(5, this.f112602h) : i18;
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
                bw5.yr yrVar3 = new bw5.yr();
                if (bArr != null && bArr.length > 0) {
                    yrVar3.mo11468x92b714fd(bArr);
                }
                this.f112598d = yrVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f112599e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112600f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f112601g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f112602h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
