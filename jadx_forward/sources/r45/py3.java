package r45;

/* loaded from: classes9.dex */
public class py3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465005d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465006e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465007f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465008g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465009h;

    /* renamed from: i, reason: collision with root package name */
    public r45.p35 f465010i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.py3)) {
            return false;
        }
        r45.py3 py3Var = (r45.py3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465005d), java.lang.Integer.valueOf(py3Var.f465005d)) && n51.f.a(this.f465006e, py3Var.f465006e) && n51.f.a(this.f465007f, py3Var.f465007f) && n51.f.a(this.f465008g, py3Var.f465008g) && n51.f.a(this.f465009h, py3Var.f465009h) && n51.f.a(this.f465010i, py3Var.f465010i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465005d);
            java.lang.String str = this.f465006e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f465007f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f465008g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f465009h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.p35 p35Var = this.f465010i;
            if (p35Var != null) {
                fVar.i(6, p35Var.mo75928xcd1e8d8());
                this.f465010i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465005d) + 0;
            java.lang.String str5 = this.f465006e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f465007f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f465008g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f465009h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            r45.p35 p35Var2 = this.f465010i;
            return p35Var2 != null ? e17 + b36.f.i(6, p35Var2.mo75928xcd1e8d8()) : e17;
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
        r45.py3 py3Var = (r45.py3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                py3Var.f465005d = aVar2.g(intValue);
                return 0;
            case 2:
                py3Var.f465006e = aVar2.k(intValue);
                return 0;
            case 3:
                py3Var.f465007f = aVar2.k(intValue);
                return 0;
            case 4:
                py3Var.f465008g = aVar2.k(intValue);
                return 0;
            case 5:
                py3Var.f465009h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.p35 p35Var3 = new r45.p35();
                    if (bArr != null && bArr.length > 0) {
                        p35Var3.mo11468x92b714fd(bArr);
                    }
                    py3Var.f465010i = p35Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
