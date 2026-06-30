package bw5;

/* loaded from: classes2.dex */
public class tl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115034d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115035e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115036f;

    /* renamed from: g, reason: collision with root package name */
    public int f115037g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f115038h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f115039i = new boolean[6];

    static {
        new bw5.tl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tl mo11468x92b714fd(byte[] bArr) {
        return (bw5.tl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tl)) {
            return false;
        }
        bw5.tl tlVar = (bw5.tl) fVar;
        return n51.f.a(this.f115034d, tlVar.f115034d) && n51.f.a(this.f115035e, tlVar.f115035e) && n51.f.a(this.f115036f, tlVar.f115036f) && n51.f.a(java.lang.Integer.valueOf(this.f115037g), java.lang.Integer.valueOf(tlVar.f115037g)) && n51.f.a(java.lang.Boolean.valueOf(this.f115038h), java.lang.Boolean.valueOf(tlVar.f115038h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115039i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115034d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115035e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f115036f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115037g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f115038h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f115034d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f115035e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f115036f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f115037g);
            }
            return zArr[5] ? i18 + b36.f.a(5, this.f115038h) : i18;
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
            this.f115034d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115035e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115036f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f115037g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f115038h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
