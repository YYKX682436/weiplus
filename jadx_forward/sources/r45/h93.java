package r45;

/* loaded from: classes2.dex */
public class h93 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457488d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457489e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457490f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f457491g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f457492h;

    /* renamed from: i, reason: collision with root package name */
    public long f457493i;

    /* renamed from: m, reason: collision with root package name */
    public long f457494m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f457495n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h93)) {
            return false;
        }
        r45.h93 h93Var = (r45.h93) fVar;
        return n51.f.a(this.f76492x92037252, h93Var.f76492x92037252) && n51.f.a(this.f457488d, h93Var.f457488d) && n51.f.a(this.f457489e, h93Var.f457489e) && n51.f.a(this.f457490f, h93Var.f457490f) && n51.f.a(java.lang.Boolean.valueOf(this.f457491g), java.lang.Boolean.valueOf(h93Var.f457491g)) && n51.f.a(java.lang.Boolean.valueOf(this.f457492h), java.lang.Boolean.valueOf(h93Var.f457492h)) && n51.f.a(java.lang.Long.valueOf(this.f457493i), java.lang.Long.valueOf(h93Var.f457493i)) && n51.f.a(java.lang.Long.valueOf(this.f457494m), java.lang.Long.valueOf(h93Var.f457494m)) && n51.f.a(java.lang.Boolean.valueOf(this.f457495n), java.lang.Boolean.valueOf(h93Var.f457495n));
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
            java.lang.String str = this.f457488d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457489e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457490f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.a(5, this.f457491g);
            fVar.a(6, this.f457492h);
            fVar.h(7, this.f457493i);
            fVar.h(8, this.f457494m);
            fVar.a(9, this.f457495n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f457488d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f457489e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f457490f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.a(5, this.f457491g) + b36.f.a(6, this.f457492h) + b36.f.h(7, this.f457493i) + b36.f.h(8, this.f457494m) + b36.f.a(9, this.f457495n);
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
        r45.h93 h93Var = (r45.h93) objArr[1];
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
                    h93Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                h93Var.f457488d = aVar2.k(intValue);
                return 0;
            case 3:
                h93Var.f457489e = aVar2.k(intValue);
                return 0;
            case 4:
                h93Var.f457490f = aVar2.k(intValue);
                return 0;
            case 5:
                h93Var.f457491g = aVar2.c(intValue);
                return 0;
            case 6:
                h93Var.f457492h = aVar2.c(intValue);
                return 0;
            case 7:
                h93Var.f457493i = aVar2.i(intValue);
                return 0;
            case 8:
                h93Var.f457494m = aVar2.i(intValue);
                return 0;
            case 9:
                h93Var.f457495n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
