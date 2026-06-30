package r45;

/* loaded from: classes4.dex */
public class ef4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f454924d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454925e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454926f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454927g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454928h;

    /* renamed from: i, reason: collision with root package name */
    public int f454929i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef4)) {
            return false;
        }
        r45.ef4 ef4Var = (r45.ef4) fVar;
        return n51.f.a(this.f76492x92037252, ef4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f454924d), java.lang.Integer.valueOf(ef4Var.f454924d)) && n51.f.a(this.f454925e, ef4Var.f454925e) && n51.f.a(this.f454926f, ef4Var.f454926f) && n51.f.a(this.f454927g, ef4Var.f454927g) && n51.f.a(this.f454928h, ef4Var.f454928h) && n51.f.a(java.lang.Integer.valueOf(this.f454929i), java.lang.Integer.valueOf(ef4Var.f454929i));
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
            fVar.e(2, this.f454924d);
            java.lang.String str = this.f454925e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f454926f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f454927g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f454928h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f454929i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f454924d);
            java.lang.String str5 = this.f454925e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f454926f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f454927g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f454928h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            return i18 + b36.f.e(7, this.f454929i);
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
        r45.ef4 ef4Var = (r45.ef4) objArr[1];
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
                    ef4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ef4Var.f454924d = aVar2.g(intValue);
                return 0;
            case 3:
                ef4Var.f454925e = aVar2.k(intValue);
                return 0;
            case 4:
                ef4Var.f454926f = aVar2.k(intValue);
                return 0;
            case 5:
                ef4Var.f454927g = aVar2.k(intValue);
                return 0;
            case 6:
                ef4Var.f454928h = aVar2.k(intValue);
                return 0;
            case 7:
                ef4Var.f454929i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
