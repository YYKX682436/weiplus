package r45;

/* loaded from: classes4.dex */
public class y45 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472314d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472315e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472316f;

    /* renamed from: g, reason: collision with root package name */
    public int f472317g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472318h;

    /* renamed from: i, reason: collision with root package name */
    public int f472319i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y45)) {
            return false;
        }
        r45.y45 y45Var = (r45.y45) fVar;
        return n51.f.a(this.f76492x92037252, y45Var.f76492x92037252) && n51.f.a(this.f472314d, y45Var.f472314d) && n51.f.a(this.f472315e, y45Var.f472315e) && n51.f.a(this.f472316f, y45Var.f472316f) && n51.f.a(java.lang.Integer.valueOf(this.f472317g), java.lang.Integer.valueOf(y45Var.f472317g)) && n51.f.a(this.f472318h, y45Var.f472318h) && n51.f.a(java.lang.Integer.valueOf(this.f472319i), java.lang.Integer.valueOf(y45Var.f472319i));
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
            java.lang.String str = this.f472314d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f472315e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f472316f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(6, this.f472317g);
            java.lang.String str4 = this.f472318h;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f472319i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f472314d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f472315e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f472316f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(6, this.f472317g);
            java.lang.String str8 = this.f472318h;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.e(9, this.f472319i);
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
        r45.y45 y45Var = (r45.y45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                y45Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            y45Var.f472314d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            y45Var.f472315e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            y45Var.f472316f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 6) {
            y45Var.f472317g = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 8) {
            y45Var.f472318h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 9) {
            return -1;
        }
        y45Var.f472319i = aVar2.g(intValue);
        return 0;
    }
}
