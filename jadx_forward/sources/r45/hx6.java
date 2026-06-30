package r45;

/* loaded from: classes8.dex */
public class hx6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458076d;

    /* renamed from: e, reason: collision with root package name */
    public long f458077e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f458078f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458079g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458080h;

    /* renamed from: i, reason: collision with root package name */
    public int f458081i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hx6)) {
            return false;
        }
        r45.hx6 hx6Var = (r45.hx6) fVar;
        return n51.f.a(this.f76494x2de60e5e, hx6Var.f76494x2de60e5e) && n51.f.a(this.f458076d, hx6Var.f458076d) && n51.f.a(java.lang.Long.valueOf(this.f458077e), java.lang.Long.valueOf(hx6Var.f458077e)) && n51.f.a(this.f458078f, hx6Var.f458078f) && n51.f.a(this.f458079g, hx6Var.f458079g) && n51.f.a(this.f458080h, hx6Var.f458080h) && n51.f.a(java.lang.Integer.valueOf(this.f458081i), java.lang.Integer.valueOf(hx6Var.f458081i));
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
            java.lang.String str = this.f458076d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f458077e);
            r45.cu5 cu5Var = this.f458078f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f458078f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f458079g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f458080h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f458081i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f458076d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int h17 = i18 + b36.f.h(3, this.f458077e);
            r45.cu5 cu5Var2 = this.f458078f;
            if (cu5Var2 != null) {
                h17 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f458079g;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f458080h;
            if (str6 != null) {
                h17 += b36.f.j(6, str6);
            }
            return h17 + b36.f.e(7, this.f458081i);
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
        r45.hx6 hx6Var = (r45.hx6) objArr[1];
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
                    hx6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                hx6Var.f458076d = aVar2.k(intValue);
                return 0;
            case 3:
                hx6Var.f458077e = aVar2.i(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    hx6Var.f458078f = cu5Var3;
                }
                return 0;
            case 5:
                hx6Var.f458079g = aVar2.k(intValue);
                return 0;
            case 6:
                hx6Var.f458080h = aVar2.k(intValue);
                return 0;
            case 7:
                hx6Var.f458081i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
