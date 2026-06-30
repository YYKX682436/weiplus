package r45;

/* loaded from: classes12.dex */
public class l57 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460693d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460694e;

    /* renamed from: f, reason: collision with root package name */
    public int f460695f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460696g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460697h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460698i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460699m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460700n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f460701o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l57)) {
            return false;
        }
        r45.l57 l57Var = (r45.l57) fVar;
        return n51.f.a(this.f460693d, l57Var.f460693d) && n51.f.a(this.f460694e, l57Var.f460694e) && n51.f.a(java.lang.Integer.valueOf(this.f460695f), java.lang.Integer.valueOf(l57Var.f460695f)) && n51.f.a(this.f460696g, l57Var.f460696g) && n51.f.a(this.f460697h, l57Var.f460697h) && n51.f.a(this.f460698i, l57Var.f460698i) && n51.f.a(this.f460699m, l57Var.f460699m) && n51.f.a(this.f460700n, l57Var.f460700n) && n51.f.a(this.f460701o, l57Var.f460701o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460693d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460694e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f460695f);
            java.lang.String str3 = this.f460696g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f460697h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f460698i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f460699m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f460700n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f460701o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f460693d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f460694e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            int e17 = j17 + b36.f.e(3, this.f460695f);
            java.lang.String str11 = this.f460696g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f460697h;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f460698i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f460699m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f460700n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f460701o;
            return str16 != null ? e17 + b36.f.j(9, str16) : e17;
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
        r45.l57 l57Var = (r45.l57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l57Var.f460693d = aVar2.k(intValue);
                return 0;
            case 2:
                l57Var.f460694e = aVar2.k(intValue);
                return 0;
            case 3:
                l57Var.f460695f = aVar2.g(intValue);
                return 0;
            case 4:
                l57Var.f460696g = aVar2.k(intValue);
                return 0;
            case 5:
                l57Var.f460697h = aVar2.k(intValue);
                return 0;
            case 6:
                l57Var.f460698i = aVar2.k(intValue);
                return 0;
            case 7:
                l57Var.f460699m = aVar2.k(intValue);
                return 0;
            case 8:
                l57Var.f460700n = aVar2.k(intValue);
                return 0;
            case 9:
                l57Var.f460701o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
