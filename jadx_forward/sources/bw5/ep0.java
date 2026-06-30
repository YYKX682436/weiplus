package bw5;

/* loaded from: classes11.dex */
public class ep0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108518d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108519e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108520f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108521g;

    /* renamed from: h, reason: collision with root package name */
    public int f108522h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108523i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108524m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.hr0 f108525n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f108526o = new boolean[9];

    static {
        new bw5.ep0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ep0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ep0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ep0)) {
            return false;
        }
        bw5.ep0 ep0Var = (bw5.ep0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108518d), java.lang.Integer.valueOf(ep0Var.f108518d)) && n51.f.a(this.f108519e, ep0Var.f108519e) && n51.f.a(this.f108520f, ep0Var.f108520f) && n51.f.a(this.f108521g, ep0Var.f108521g) && n51.f.a(java.lang.Integer.valueOf(this.f108522h), java.lang.Integer.valueOf(ep0Var.f108522h)) && n51.f.a(this.f108523i, ep0Var.f108523i) && n51.f.a(this.f108524m, ep0Var.f108524m) && n51.f.a(this.f108525n, ep0Var.f108525n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ep0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108526o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108518d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108519e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f108520f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f108521g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108522h);
            }
            java.lang.String str3 = this.f108523i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f108524m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.hr0 hr0Var = this.f108525n;
            if (hr0Var != null && zArr[8]) {
                fVar.e(8, hr0Var.f109871d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108518d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108519e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str5 = this.f108520f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f108521g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f108522h);
            }
            java.lang.String str7 = this.f108523i;
            if (str7 != null && zArr[6]) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f108524m;
            if (str8 != null && zArr[7]) {
                e17 += b36.f.j(7, str8);
            }
            bw5.hr0 hr0Var2 = this.f108525n;
            return (hr0Var2 == null || !zArr[8]) ? e17 : e17 + b36.f.e(8, hr0Var2.f109871d);
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
                this.f108518d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108519e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108520f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108521g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108522h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108523i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108524m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                int g17 = aVar2.g(intValue);
                this.f108525n = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.hr0.TingWCCoinConsumeModeShowPanel : bw5.hr0.TingWCCoinConsumeModeDirect : bw5.hr0.TingWCCoinConsumeModeUnknown;
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
