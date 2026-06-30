package r45;

/* loaded from: classes7.dex */
public class it6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458852d;

    /* renamed from: e, reason: collision with root package name */
    public int f458853e;

    /* renamed from: f, reason: collision with root package name */
    public int f458854f;

    /* renamed from: g, reason: collision with root package name */
    public int f458855g;

    /* renamed from: h, reason: collision with root package name */
    public int f458856h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458857i;

    /* renamed from: m, reason: collision with root package name */
    public int f458858m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458859n;

    /* renamed from: o, reason: collision with root package name */
    public int f458860o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.it6)) {
            return false;
        }
        r45.it6 it6Var = (r45.it6) fVar;
        return n51.f.a(this.f76494x2de60e5e, it6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f458852d), java.lang.Integer.valueOf(it6Var.f458852d)) && n51.f.a(java.lang.Integer.valueOf(this.f458853e), java.lang.Integer.valueOf(it6Var.f458853e)) && n51.f.a(java.lang.Integer.valueOf(this.f458854f), java.lang.Integer.valueOf(it6Var.f458854f)) && n51.f.a(java.lang.Integer.valueOf(this.f458855g), java.lang.Integer.valueOf(it6Var.f458855g)) && n51.f.a(java.lang.Integer.valueOf(this.f458856h), java.lang.Integer.valueOf(it6Var.f458856h)) && n51.f.a(this.f458857i, it6Var.f458857i) && n51.f.a(java.lang.Integer.valueOf(this.f458858m), java.lang.Integer.valueOf(it6Var.f458858m)) && n51.f.a(this.f458859n, it6Var.f458859n) && n51.f.a(java.lang.Integer.valueOf(this.f458860o), java.lang.Integer.valueOf(it6Var.f458860o));
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
            fVar.e(2, this.f458852d);
            fVar.e(3, this.f458853e);
            fVar.e(4, this.f458854f);
            fVar.e(5, this.f458855g);
            fVar.e(6, this.f458856h);
            java.lang.String str = this.f458857i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f458858m);
            java.lang.String str2 = this.f458859n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(11, this.f458860o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f458852d) + b36.f.e(3, this.f458853e) + b36.f.e(4, this.f458854f) + b36.f.e(5, this.f458855g) + b36.f.e(6, this.f458856h);
            java.lang.String str3 = this.f458857i;
            if (str3 != null) {
                i18 += b36.f.j(7, str3);
            }
            int e17 = i18 + b36.f.e(8, this.f458858m);
            java.lang.String str4 = this.f458859n;
            if (str4 != null) {
                e17 += b36.f.j(9, str4);
            }
            return e17 + b36.f.e(11, this.f458860o);
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
        r45.it6 it6Var = (r45.it6) objArr[1];
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
                    it6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                it6Var.f458852d = aVar2.g(intValue);
                return 0;
            case 3:
                it6Var.f458853e = aVar2.g(intValue);
                return 0;
            case 4:
                it6Var.f458854f = aVar2.g(intValue);
                return 0;
            case 5:
                it6Var.f458855g = aVar2.g(intValue);
                return 0;
            case 6:
                it6Var.f458856h = aVar2.g(intValue);
                return 0;
            case 7:
                it6Var.f458857i = aVar2.k(intValue);
                return 0;
            case 8:
                it6Var.f458858m = aVar2.g(intValue);
                return 0;
            case 9:
                it6Var.f458859n = aVar2.k(intValue);
                return 0;
            case 10:
            default:
                return -1;
            case 11:
                it6Var.f458860o = aVar2.g(intValue);
                return 0;
        }
    }
}
