package r45;

/* loaded from: classes9.dex */
public class s extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public int f466873f;

    /* renamed from: g, reason: collision with root package name */
    public int f466874g;

    /* renamed from: h, reason: collision with root package name */
    public int f466875h;

    /* renamed from: i, reason: collision with root package name */
    public long f466876i;

    /* renamed from: m, reason: collision with root package name */
    public long f466877m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f466878n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f466879o;

    /* renamed from: p, reason: collision with root package name */
    public int f466880p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tw4 f466881q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f466883s;

    /* renamed from: d, reason: collision with root package name */
    public int f466871d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466872e = "请求不成功，请稍候再试";

    /* renamed from: r, reason: collision with root package name */
    public boolean f466882r = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s)) {
            return false;
        }
        r45.s sVar = (r45.s) fVar;
        return n51.f.a(this.f76492x92037252, sVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466871d), java.lang.Integer.valueOf(sVar.f466871d)) && n51.f.a(this.f466872e, sVar.f466872e) && n51.f.a(java.lang.Integer.valueOf(this.f466873f), java.lang.Integer.valueOf(sVar.f466873f)) && n51.f.a(java.lang.Integer.valueOf(this.f466874g), java.lang.Integer.valueOf(sVar.f466874g)) && n51.f.a(java.lang.Integer.valueOf(this.f466875h), java.lang.Integer.valueOf(sVar.f466875h)) && n51.f.a(java.lang.Long.valueOf(this.f466876i), java.lang.Long.valueOf(sVar.f466876i)) && n51.f.a(java.lang.Long.valueOf(this.f466877m), java.lang.Long.valueOf(sVar.f466877m)) && n51.f.a(this.f466878n, sVar.f466878n) && n51.f.a(this.f466879o, sVar.f466879o) && n51.f.a(java.lang.Integer.valueOf(this.f466880p), java.lang.Integer.valueOf(sVar.f466880p)) && n51.f.a(this.f466881q, sVar.f466881q) && n51.f.a(java.lang.Boolean.valueOf(this.f466882r), java.lang.Boolean.valueOf(sVar.f466882r)) && n51.f.a(this.f466883s, sVar.f466883s);
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
            fVar.e(2, this.f466871d);
            java.lang.String str = this.f466872e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f466873f);
            fVar.e(5, this.f466874g);
            fVar.e(6, this.f466875h);
            fVar.h(7, this.f466876i);
            fVar.h(8, this.f466877m);
            java.lang.String str2 = this.f466878n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f466879o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f466880p);
            r45.tw4 tw4Var = this.f466881q;
            if (tw4Var != null) {
                fVar.i(12, tw4Var.mo75928xcd1e8d8());
                this.f466881q.mo75956x3d5d1f78(fVar);
            }
            fVar.a(13, this.f466882r);
            java.lang.String str4 = this.f466883s;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f466871d);
            java.lang.String str5 = this.f466872e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f466873f) + b36.f.e(5, this.f466874g) + b36.f.e(6, this.f466875h) + b36.f.h(7, this.f466876i) + b36.f.h(8, this.f466877m);
            java.lang.String str6 = this.f466878n;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            java.lang.String str7 = this.f466879o;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            int e18 = e17 + b36.f.e(11, this.f466880p);
            r45.tw4 tw4Var2 = this.f466881q;
            if (tw4Var2 != null) {
                e18 += b36.f.i(12, tw4Var2.mo75928xcd1e8d8());
            }
            int a17 = e18 + b36.f.a(13, this.f466882r);
            java.lang.String str8 = this.f466883s;
            return str8 != null ? a17 + b36.f.j(14, str8) : a17;
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
        r45.s sVar = (r45.s) objArr[1];
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
                    sVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                sVar.f466871d = aVar2.g(intValue);
                return 0;
            case 3:
                sVar.f466872e = aVar2.k(intValue);
                return 0;
            case 4:
                sVar.f466873f = aVar2.g(intValue);
                return 0;
            case 5:
                sVar.f466874g = aVar2.g(intValue);
                return 0;
            case 6:
                sVar.f466875h = aVar2.g(intValue);
                return 0;
            case 7:
                sVar.f466876i = aVar2.i(intValue);
                return 0;
            case 8:
                sVar.f466877m = aVar2.i(intValue);
                return 0;
            case 9:
                sVar.f466878n = aVar2.k(intValue);
                return 0;
            case 10:
                sVar.f466879o = aVar2.k(intValue);
                return 0;
            case 11:
                sVar.f466880p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr2);
                    }
                    sVar.f466881q = tw4Var3;
                }
                return 0;
            case 13:
                sVar.f466882r = aVar2.c(intValue);
                return 0;
            case 14:
                sVar.f466883s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
