package r45;

/* loaded from: classes4.dex */
public class ny extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463273d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463274e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f463275f;

    /* renamed from: g, reason: collision with root package name */
    public int f463276g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463277h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ny)) {
            return false;
        }
        r45.ny nyVar = (r45.ny) fVar;
        return n51.f.a(this.f76494x2de60e5e, nyVar.f76494x2de60e5e) && n51.f.a(this.f463273d, nyVar.f463273d) && n51.f.a(this.f463274e, nyVar.f463274e) && n51.f.a(java.lang.Boolean.valueOf(this.f463275f), java.lang.Boolean.valueOf(nyVar.f463275f)) && n51.f.a(java.lang.Integer.valueOf(this.f463276g), java.lang.Integer.valueOf(nyVar.f463276g)) && n51.f.a(this.f463277h, nyVar.f463277h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f463273d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f463274e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f463275f);
            fVar.e(5, this.f463276g);
            java.lang.String str3 = this.f463277h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f463273d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f463274e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int a17 = i18 + b36.f.a(4, this.f463275f) + b36.f.e(5, this.f463276g);
            java.lang.String str6 = this.f463277h;
            return str6 != null ? a17 + b36.f.j(6, str6) : a17;
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
        r45.ny nyVar = (r45.ny) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    nyVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                nyVar.f463273d = aVar2.k(intValue);
                return 0;
            case 3:
                nyVar.f463274e = aVar2.k(intValue);
                return 0;
            case 4:
                nyVar.f463275f = aVar2.c(intValue);
                return 0;
            case 5:
                nyVar.f463276g = aVar2.g(intValue);
                return 0;
            case 6:
                nyVar.f463277h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
