package bw5;

/* loaded from: classes2.dex */
public class dc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107955d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107956e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107957f;

    /* renamed from: g, reason: collision with root package name */
    public int f107958g;

    /* renamed from: h, reason: collision with root package name */
    public long f107959h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107960i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f107961m = new boolean[7];

    static {
        new bw5.dc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dc mo11468x92b714fd(byte[] bArr) {
        return (bw5.dc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dc)) {
            return false;
        }
        bw5.dc dcVar = (bw5.dc) fVar;
        return n51.f.a(this.f107955d, dcVar.f107955d) && n51.f.a(this.f107956e, dcVar.f107956e) && n51.f.a(this.f107957f, dcVar.f107957f) && n51.f.a(java.lang.Integer.valueOf(this.f107958g), java.lang.Integer.valueOf(dcVar.f107958g)) && n51.f.a(java.lang.Long.valueOf(this.f107959h), java.lang.Long.valueOf(dcVar.f107959h)) && n51.f.a(this.f107960i, dcVar.f107960i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107961m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107955d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107956e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f107957f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107958g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f107959h);
            }
            java.lang.String str4 = this.f107960i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f107955d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f107956e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f107957f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f107958g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f107959h);
            }
            java.lang.String str8 = this.f107960i;
            return (str8 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str8);
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
                this.f107955d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107956e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107957f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107958g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107959h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107960i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
