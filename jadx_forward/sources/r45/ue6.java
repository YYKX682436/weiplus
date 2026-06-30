package r45;

/* loaded from: classes4.dex */
public class ue6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468837d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468838e;

    /* renamed from: f, reason: collision with root package name */
    public int f468839f;

    /* renamed from: g, reason: collision with root package name */
    public long f468840g;

    /* renamed from: h, reason: collision with root package name */
    public long f468841h;

    /* renamed from: i, reason: collision with root package name */
    public int f468842i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue6)) {
            return false;
        }
        r45.ue6 ue6Var = (r45.ue6) fVar;
        return n51.f.a(this.f76494x2de60e5e, ue6Var.f76494x2de60e5e) && n51.f.a(this.f468837d, ue6Var.f468837d) && n51.f.a(this.f468838e, ue6Var.f468838e) && n51.f.a(java.lang.Integer.valueOf(this.f468839f), java.lang.Integer.valueOf(ue6Var.f468839f)) && n51.f.a(java.lang.Long.valueOf(this.f468840g), java.lang.Long.valueOf(ue6Var.f468840g)) && n51.f.a(java.lang.Long.valueOf(this.f468841h), java.lang.Long.valueOf(ue6Var.f468841h)) && n51.f.a(java.lang.Integer.valueOf(this.f468842i), java.lang.Integer.valueOf(ue6Var.f468842i));
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
            java.lang.String str = this.f468837d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468838e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f468839f);
            fVar.h(5, this.f468840g);
            fVar.h(6, this.f468841h);
            fVar.e(7, this.f468842i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f468837d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f468838e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f468839f) + b36.f.h(5, this.f468840g) + b36.f.h(6, this.f468841h) + b36.f.e(7, this.f468842i);
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
        r45.ue6 ue6Var = (r45.ue6) objArr[1];
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
                    ue6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ue6Var.f468837d = aVar2.k(intValue);
                return 0;
            case 3:
                ue6Var.f468838e = aVar2.k(intValue);
                return 0;
            case 4:
                ue6Var.f468839f = aVar2.g(intValue);
                return 0;
            case 5:
                ue6Var.f468840g = aVar2.i(intValue);
                return 0;
            case 6:
                ue6Var.f468841h = aVar2.i(intValue);
                return 0;
            case 7:
                ue6Var.f468842i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
