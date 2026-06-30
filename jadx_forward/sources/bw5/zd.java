package bw5;

/* loaded from: classes2.dex */
public class zd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f117472d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117473e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117474f;

    /* renamed from: g, reason: collision with root package name */
    public double f117475g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117476h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f117477i = new boolean[6];

    static {
        new bw5.zd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zd mo11468x92b714fd(byte[] bArr) {
        return (bw5.zd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zd)) {
            return false;
        }
        bw5.zd zdVar = (bw5.zd) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f117472d), java.lang.Long.valueOf(zdVar.f117472d)) && n51.f.a(this.f117473e, zdVar.f117473e) && n51.f.a(this.f117474f, zdVar.f117474f) && n51.f.a(java.lang.Double.valueOf(this.f117475g), java.lang.Double.valueOf(zdVar.f117475g)) && n51.f.a(this.f117476h, zdVar.f117476h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117477i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f117472d);
            }
            java.lang.String str = this.f117473e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f117474f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.c(4, this.f117475g);
            }
            java.lang.String str3 = this.f117476h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f117472d) : 0;
            java.lang.String str4 = this.f117473e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f117474f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.c(4, this.f117475g);
            }
            java.lang.String str6 = this.f117476h;
            return (str6 == null || !zArr[5]) ? h17 : h17 + b36.f.j(5, str6);
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
            this.f117472d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117473e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117474f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f117475g = aVar2.e(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f117476h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
