package bw5;

/* loaded from: classes7.dex */
public class za extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: o, reason: collision with root package name */
    public static final bw5.za f117440o = new bw5.za();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117442e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.f5 f117443f;

    /* renamed from: g, reason: collision with root package name */
    public int f117444g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117445h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f117446i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ge0 f117447m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f117448n = new boolean[8];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.za mo11468x92b714fd(byte[] bArr) {
        return (bw5.za) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.za)) {
            return false;
        }
        bw5.za zaVar = (bw5.za) fVar;
        return n51.f.a(this.f117441d, zaVar.f117441d) && n51.f.a(this.f117442e, zaVar.f117442e) && n51.f.a(this.f117443f, zaVar.f117443f) && n51.f.a(java.lang.Integer.valueOf(this.f117444g), java.lang.Integer.valueOf(zaVar.f117444g)) && n51.f.a(this.f117445h, zaVar.f117445h) && n51.f.a(this.f117446i, zaVar.f117446i) && n51.f.a(this.f117447m, zaVar.f117447m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.za();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.f5 f5Var;
        int i18 = 0;
        boolean[] zArr = this.f117448n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117441d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f117442e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.f5 f5Var2 = this.f117443f;
            if (f5Var2 != null && zArr[3]) {
                fVar.e(3, f5Var2.f108689d);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117444g);
            }
            java.lang.String str3 = this.f117445h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f117446i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.ge0 ge0Var = this.f117447m;
            if (ge0Var != null && zArr[7]) {
                fVar.i(7, ge0Var.mo75928xcd1e8d8());
                this.f117447m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f117441d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f117442e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            bw5.f5 f5Var3 = this.f117443f;
            if (f5Var3 != null && zArr[3]) {
                i18 += b36.f.e(3, f5Var3.f108689d);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f117444g);
            }
            java.lang.String str7 = this.f117445h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f117446i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            bw5.ge0 ge0Var2 = this.f117447m;
            return (ge0Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, ge0Var2.mo75928xcd1e8d8());
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
                this.f117441d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117442e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                switch (aVar2.g(intValue)) {
                    case 0:
                        f5Var = bw5.f5.UnknownPlatform;
                        break;
                    case 1:
                        f5Var = bw5.f5.iOS;
                        break;
                    case 2:
                        f5Var = bw5.f5.Android;
                        break;
                    case 3:
                        f5Var = bw5.f5.OHOS;
                        break;
                    case 4:
                        f5Var = bw5.f5.Mac;
                        break;
                    case 5:
                        f5Var = bw5.f5.Windows;
                        break;
                    case 6:
                        f5Var = bw5.f5.Linux;
                        break;
                    case 7:
                        f5Var = bw5.f5.OHOS_PC;
                        break;
                    default:
                        f5Var = null;
                        break;
                }
                this.f117443f = f5Var;
                zArr[3] = true;
                return 0;
            case 4:
                this.f117444g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117445h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117446i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ge0 ge0Var3 = new bw5.ge0();
                    if (bArr != null && bArr.length > 0) {
                        ge0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f117447m = ge0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
