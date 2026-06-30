package bw5;

/* loaded from: classes2.dex */
public class ku extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f111079d;

    /* renamed from: e, reason: collision with root package name */
    public int f111080e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f111081f;

    /* renamed from: g, reason: collision with root package name */
    public int f111082g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111083h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.ru f111084i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f111085m = new boolean[7];

    static {
        new bw5.ku();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ku mo11468x92b714fd(byte[] bArr) {
        return (bw5.ku) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ku)) {
            return false;
        }
        bw5.ku kuVar = (bw5.ku) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f111079d), java.lang.Boolean.valueOf(kuVar.f111079d)) && n51.f.a(java.lang.Integer.valueOf(this.f111080e), java.lang.Integer.valueOf(kuVar.f111080e)) && n51.f.a(java.lang.Boolean.valueOf(this.f111081f), java.lang.Boolean.valueOf(kuVar.f111081f)) && n51.f.a(java.lang.Integer.valueOf(this.f111082g), java.lang.Integer.valueOf(kuVar.f111082g)) && n51.f.a(this.f111083h, kuVar.f111083h) && n51.f.a(this.f111084i, kuVar.f111084i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ku();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111085m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f111079d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111080e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f111081f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111082g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111083h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            bw5.ru ruVar = this.f111084i;
            if (ruVar != null && zArr[6]) {
                fVar.i(6, ruVar.mo75928xcd1e8d8());
                this.f111084i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f111079d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f111080e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f111081f);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f111082g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111083h;
            if (gVar2 != null && zArr[5]) {
                a17 += b36.f.b(5, gVar2);
            }
            bw5.ru ruVar2 = this.f111084i;
            return (ruVar2 == null || !zArr[6]) ? a17 : a17 + b36.f.i(6, ruVar2.mo75928xcd1e8d8());
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
                this.f111079d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111080e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111081f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111082g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111083h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ru ruVar3 = new bw5.ru();
                    if (bArr != null && bArr.length > 0) {
                        ruVar3.mo11468x92b714fd(bArr);
                    }
                    this.f111084i = ruVar3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
