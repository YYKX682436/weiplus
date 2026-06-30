package r45;

/* loaded from: classes8.dex */
public class a10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451153d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451154e;

    /* renamed from: f, reason: collision with root package name */
    public long f451155f;

    /* renamed from: g, reason: collision with root package name */
    public long f451156g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451157h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451158i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451159m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f451160n;

    /* renamed from: o, reason: collision with root package name */
    public r45.tw4 f451161o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f451162p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a10)) {
            return false;
        }
        r45.a10 a10Var = (r45.a10) fVar;
        return n51.f.a(this.f76492x92037252, a10Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f451153d), java.lang.Integer.valueOf(a10Var.f451153d)) && n51.f.a(this.f451154e, a10Var.f451154e) && n51.f.a(java.lang.Long.valueOf(this.f451155f), java.lang.Long.valueOf(a10Var.f451155f)) && n51.f.a(java.lang.Long.valueOf(this.f451156g), java.lang.Long.valueOf(a10Var.f451156g)) && n51.f.a(this.f451157h, a10Var.f451157h) && n51.f.a(this.f451158i, a10Var.f451158i) && n51.f.a(this.f451159m, a10Var.f451159m) && n51.f.a(this.f451160n, a10Var.f451160n) && n51.f.a(this.f451161o, a10Var.f451161o) && n51.f.a(this.f451162p, a10Var.f451162p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451153d);
            java.lang.String str = this.f451154e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f451155f);
            fVar.h(5, this.f451156g);
            java.lang.String str2 = this.f451157h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f451158i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f451159m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f451160n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            r45.tw4 tw4Var = this.f451161o;
            if (tw4Var != null) {
                fVar.i(10, tw4Var.mo75928xcd1e8d8());
                this.f451161o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f451162p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451153d);
            java.lang.String str7 = this.f451154e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int h17 = i18 + b36.f.h(4, this.f451155f) + b36.f.h(5, this.f451156g);
            java.lang.String str8 = this.f451157h;
            if (str8 != null) {
                h17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f451158i;
            if (str9 != null) {
                h17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f451159m;
            if (str10 != null) {
                h17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f451160n;
            if (str11 != null) {
                h17 += b36.f.j(9, str11);
            }
            r45.tw4 tw4Var2 = this.f451161o;
            if (tw4Var2 != null) {
                h17 += b36.f.i(10, tw4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f451162p;
            return str12 != null ? h17 + b36.f.j(11, str12) : h17;
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
        r45.a10 a10Var = (r45.a10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    a10Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                a10Var.f451153d = aVar2.g(intValue);
                return 0;
            case 3:
                a10Var.f451154e = aVar2.k(intValue);
                return 0;
            case 4:
                a10Var.f451155f = aVar2.i(intValue);
                return 0;
            case 5:
                a10Var.f451156g = aVar2.i(intValue);
                return 0;
            case 6:
                a10Var.f451157h = aVar2.k(intValue);
                return 0;
            case 7:
                a10Var.f451158i = aVar2.k(intValue);
                return 0;
            case 8:
                a10Var.f451159m = aVar2.k(intValue);
                return 0;
            case 9:
                a10Var.f451160n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr2);
                    }
                    a10Var.f451161o = tw4Var3;
                }
                return 0;
            case 11:
                a10Var.f451162p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
