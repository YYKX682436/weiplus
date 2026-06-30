package r45;

/* loaded from: classes8.dex */
public class yu6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472907d;

    /* renamed from: e, reason: collision with root package name */
    public int f472908e;

    /* renamed from: f, reason: collision with root package name */
    public int f472909f;

    /* renamed from: g, reason: collision with root package name */
    public int f472910g;

    /* renamed from: h, reason: collision with root package name */
    public long f472911h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472912i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472913m;

    /* renamed from: n, reason: collision with root package name */
    public int f472914n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f472915o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f472916p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f472917q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yu6)) {
            return false;
        }
        r45.yu6 yu6Var = (r45.yu6) fVar;
        return n51.f.a(this.f76492x92037252, yu6Var.f76492x92037252) && n51.f.a(this.f472907d, yu6Var.f472907d) && n51.f.a(java.lang.Integer.valueOf(this.f472908e), java.lang.Integer.valueOf(yu6Var.f472908e)) && n51.f.a(java.lang.Integer.valueOf(this.f472909f), java.lang.Integer.valueOf(yu6Var.f472909f)) && n51.f.a(java.lang.Integer.valueOf(this.f472910g), java.lang.Integer.valueOf(yu6Var.f472910g)) && n51.f.a(java.lang.Long.valueOf(this.f472911h), java.lang.Long.valueOf(yu6Var.f472911h)) && n51.f.a(this.f472912i, yu6Var.f472912i) && n51.f.a(this.f472913m, yu6Var.f472913m) && n51.f.a(java.lang.Integer.valueOf(this.f472914n), java.lang.Integer.valueOf(yu6Var.f472914n)) && n51.f.a(java.lang.Boolean.valueOf(this.f472915o), java.lang.Boolean.valueOf(yu6Var.f472915o)) && n51.f.a(java.lang.Boolean.valueOf(this.f472916p), java.lang.Boolean.valueOf(yu6Var.f472916p)) && n51.f.a(this.f472917q, yu6Var.f472917q);
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
            java.lang.String str = this.f472907d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f472908e);
            fVar.e(4, this.f472909f);
            fVar.e(5, this.f472910g);
            fVar.h(6, this.f472911h);
            java.lang.String str2 = this.f472912i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f472913m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f472914n);
            fVar.a(10, this.f472915o);
            fVar.a(11, this.f472916p);
            java.lang.String str4 = this.f472917q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f472907d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f472908e) + b36.f.e(4, this.f472909f) + b36.f.e(5, this.f472910g) + b36.f.h(6, this.f472911h);
            java.lang.String str6 = this.f472912i;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f472913m;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            int e18 = e17 + b36.f.e(9, this.f472914n) + b36.f.a(10, this.f472915o) + b36.f.a(11, this.f472916p);
            java.lang.String str8 = this.f472917q;
            return str8 != null ? e18 + b36.f.j(12, str8) : e18;
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
        r45.yu6 yu6Var = (r45.yu6) objArr[1];
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
                    yu6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                yu6Var.f472907d = aVar2.k(intValue);
                return 0;
            case 3:
                yu6Var.f472908e = aVar2.g(intValue);
                return 0;
            case 4:
                yu6Var.f472909f = aVar2.g(intValue);
                return 0;
            case 5:
                yu6Var.f472910g = aVar2.g(intValue);
                return 0;
            case 6:
                yu6Var.f472911h = aVar2.i(intValue);
                return 0;
            case 7:
                yu6Var.f472912i = aVar2.k(intValue);
                return 0;
            case 8:
                yu6Var.f472913m = aVar2.k(intValue);
                return 0;
            case 9:
                yu6Var.f472914n = aVar2.g(intValue);
                return 0;
            case 10:
                yu6Var.f472915o = aVar2.c(intValue);
                return 0;
            case 11:
                yu6Var.f472916p = aVar2.c(intValue);
                return 0;
            case 12:
                yu6Var.f472917q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
