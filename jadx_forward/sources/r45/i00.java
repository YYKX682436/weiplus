package r45;

/* loaded from: classes7.dex */
public class i00 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.bc7 f458136d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f458137e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458138f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458139g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f458140h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458141i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458142m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458143n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f458144o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i00)) {
            return false;
        }
        r45.i00 i00Var = (r45.i00) fVar;
        return n51.f.a(this.f76492x92037252, i00Var.f76492x92037252) && n51.f.a(this.f458136d, i00Var.f458136d) && n51.f.a(java.lang.Boolean.valueOf(this.f458137e), java.lang.Boolean.valueOf(i00Var.f458137e)) && n51.f.a(this.f458138f, i00Var.f458138f) && n51.f.a(this.f458139g, i00Var.f458139g) && n51.f.a(java.lang.Boolean.valueOf(this.f458140h), java.lang.Boolean.valueOf(i00Var.f458140h)) && n51.f.a(this.f458141i, i00Var.f458141i) && n51.f.a(this.f458142m, i00Var.f458142m) && n51.f.a(this.f458143n, i00Var.f458143n) && n51.f.a(this.f458144o, i00Var.f458144o);
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
            r45.bc7 bc7Var = this.f458136d;
            if (bc7Var != null) {
                fVar.i(2, bc7Var.mo75928xcd1e8d8());
                this.f458136d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(3, this.f458137e);
            java.lang.String str = this.f458138f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f458139g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f458140h);
            java.lang.String str3 = this.f458141i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f458142m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f458143n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f458144o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.bc7 bc7Var2 = this.f458136d;
            if (bc7Var2 != null) {
                i18 += b36.f.i(2, bc7Var2.mo75928xcd1e8d8());
            }
            int a17 = i18 + b36.f.a(3, this.f458137e);
            java.lang.String str7 = this.f458138f;
            if (str7 != null) {
                a17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f458139g;
            if (str8 != null) {
                a17 += b36.f.j(5, str8);
            }
            int a18 = a17 + b36.f.a(6, this.f458140h);
            java.lang.String str9 = this.f458141i;
            if (str9 != null) {
                a18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f458142m;
            if (str10 != null) {
                a18 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f458143n;
            if (str11 != null) {
                a18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f458144o;
            return str12 != null ? a18 + b36.f.j(10, str12) : a18;
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
        r45.i00 i00Var = (r45.i00) objArr[1];
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
                    i00Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.bc7 bc7Var3 = new r45.bc7();
                    if (bArr2 != null && bArr2.length > 0) {
                        bc7Var3.mo11468x92b714fd(bArr2);
                    }
                    i00Var.f458136d = bc7Var3;
                }
                return 0;
            case 3:
                i00Var.f458137e = aVar2.c(intValue);
                return 0;
            case 4:
                i00Var.f458138f = aVar2.k(intValue);
                return 0;
            case 5:
                i00Var.f458139g = aVar2.k(intValue);
                return 0;
            case 6:
                i00Var.f458140h = aVar2.c(intValue);
                return 0;
            case 7:
                i00Var.f458141i = aVar2.k(intValue);
                return 0;
            case 8:
                i00Var.f458142m = aVar2.k(intValue);
                return 0;
            case 9:
                i00Var.f458143n = aVar2.k(intValue);
                return 0;
            case 10:
                i00Var.f458144o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
