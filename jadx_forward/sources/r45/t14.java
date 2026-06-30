package r45;

/* loaded from: classes2.dex */
public class t14 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467591d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467592e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467593f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467594g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467595h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467596i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t14)) {
            return false;
        }
        r45.t14 t14Var = (r45.t14) fVar;
        return n51.f.a(this.f76492x92037252, t14Var.f76492x92037252) && n51.f.a(this.f467591d, t14Var.f467591d) && n51.f.a(this.f467592e, t14Var.f467592e) && n51.f.a(this.f467593f, t14Var.f467593f) && n51.f.a(this.f467594g, t14Var.f467594g) && n51.f.a(this.f467595h, t14Var.f467595h) && n51.f.a(this.f467596i, t14Var.f467596i);
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
            java.lang.String str = this.f467591d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f467592e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f467593f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f467594g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f467595h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f467596i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f467591d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f467592e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f467593f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f467594g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f467595h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f467596i;
            return str12 != null ? i18 + b36.f.j(7, str12) : i18;
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
        r45.t14 t14Var = (r45.t14) objArr[1];
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
                    t14Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                t14Var.f467591d = aVar2.k(intValue);
                return 0;
            case 3:
                t14Var.f467592e = aVar2.k(intValue);
                return 0;
            case 4:
                t14Var.f467593f = aVar2.k(intValue);
                return 0;
            case 5:
                t14Var.f467594g = aVar2.k(intValue);
                return 0;
            case 6:
                t14Var.f467595h = aVar2.k(intValue);
                return 0;
            case 7:
                t14Var.f467596i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
