package r45;

/* loaded from: classes2.dex */
public class ia5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458422d;

    /* renamed from: e, reason: collision with root package name */
    public int f458423e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458424f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458425g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458426h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ia5)) {
            return false;
        }
        r45.ia5 ia5Var = (r45.ia5) fVar;
        return n51.f.a(this.f76494x2de60e5e, ia5Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f458422d), java.lang.Integer.valueOf(ia5Var.f458422d)) && n51.f.a(java.lang.Integer.valueOf(this.f458423e), java.lang.Integer.valueOf(ia5Var.f458423e)) && n51.f.a(this.f458424f, ia5Var.f458424f) && n51.f.a(this.f458425g, ia5Var.f458425g) && n51.f.a(this.f458426h, ia5Var.f458426h);
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
            fVar.e(2, this.f458422d);
            fVar.e(3, this.f458423e);
            java.lang.String str = this.f458424f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f458425g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f458426h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f458422d) + b36.f.e(3, this.f458423e);
            java.lang.String str4 = this.f458424f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f458425g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f458426h;
            return str6 != null ? i18 + b36.f.j(6, str6) : i18;
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
        r45.ia5 ia5Var = (r45.ia5) objArr[1];
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
                    ia5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ia5Var.f458422d = aVar2.g(intValue);
                return 0;
            case 3:
                ia5Var.f458423e = aVar2.g(intValue);
                return 0;
            case 4:
                ia5Var.f458424f = aVar2.k(intValue);
                return 0;
            case 5:
                ia5Var.f458425g = aVar2.k(intValue);
                return 0;
            case 6:
                ia5Var.f458426h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
