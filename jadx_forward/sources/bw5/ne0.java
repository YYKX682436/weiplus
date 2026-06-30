package bw5;

/* loaded from: classes9.dex */
public class ne0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f112185d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112186e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112187f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112188g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112189h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112190i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112191m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f112192n = new boolean[8];

    static {
        new bw5.ne0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ne0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ne0) super.mo11468x92b714fd(bArr);
    }

    public bw5.ne0 c(java.lang.String str) {
        this.f112186e = str;
        this.f112192n[2] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ne0)) {
            return false;
        }
        bw5.ne0 ne0Var = (bw5.ne0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f112185d), java.lang.Long.valueOf(ne0Var.f112185d)) && n51.f.a(this.f112186e, ne0Var.f112186e) && n51.f.a(this.f112187f, ne0Var.f112187f) && n51.f.a(this.f112188g, ne0Var.f112188g) && n51.f.a(this.f112189h, ne0Var.f112189h) && n51.f.a(this.f112190i, ne0Var.f112190i) && n51.f.a(this.f112191m, ne0Var.f112191m);
    }

    public bw5.ne0 d(long j17) {
        this.f112185d = j17;
        this.f112192n[1] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ne0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112192n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f112185d);
            }
            java.lang.String str = this.f112186e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f112187f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f112188g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f112189h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f112190i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f112191m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f112185d) : 0;
            java.lang.String str7 = this.f112186e;
            if (str7 != null && zArr[2]) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f112187f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f112188g;
            if (str9 != null && zArr[4]) {
                h17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f112189h;
            if (str10 != null && zArr[5]) {
                h17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f112190i;
            if (str11 != null && zArr[6]) {
                h17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f112191m;
            return (str12 == null || !zArr[7]) ? h17 : h17 + b36.f.j(7, str12);
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
                this.f112185d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112186e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112187f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112188g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112189h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112190i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112191m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
