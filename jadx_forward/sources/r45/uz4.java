package r45;

/* loaded from: classes11.dex */
public class uz4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469289d;

    /* renamed from: e, reason: collision with root package name */
    public int f469290e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vz4 f469291f;

    /* renamed from: g, reason: collision with root package name */
    public int f469292g;

    /* renamed from: h, reason: collision with root package name */
    public r45.wz4 f469293h;

    /* renamed from: i, reason: collision with root package name */
    public int f469294i;

    /* renamed from: m, reason: collision with root package name */
    public int f469295m;

    /* renamed from: n, reason: collision with root package name */
    public int f469296n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469297o;

    /* renamed from: p, reason: collision with root package name */
    public int f469298p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uz4)) {
            return false;
        }
        r45.uz4 uz4Var = (r45.uz4) fVar;
        return n51.f.a(this.f469289d, uz4Var.f469289d) && n51.f.a(java.lang.Integer.valueOf(this.f469290e), java.lang.Integer.valueOf(uz4Var.f469290e)) && n51.f.a(this.f469291f, uz4Var.f469291f) && n51.f.a(java.lang.Integer.valueOf(this.f469292g), java.lang.Integer.valueOf(uz4Var.f469292g)) && n51.f.a(this.f469293h, uz4Var.f469293h) && n51.f.a(java.lang.Integer.valueOf(this.f469294i), java.lang.Integer.valueOf(uz4Var.f469294i)) && n51.f.a(java.lang.Integer.valueOf(this.f469295m), java.lang.Integer.valueOf(uz4Var.f469295m)) && n51.f.a(java.lang.Integer.valueOf(this.f469296n), java.lang.Integer.valueOf(uz4Var.f469296n)) && n51.f.a(this.f469297o, uz4Var.f469297o) && n51.f.a(java.lang.Integer.valueOf(this.f469298p), java.lang.Integer.valueOf(uz4Var.f469298p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469289d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f469290e);
            r45.vz4 vz4Var = this.f469291f;
            if (vz4Var != null) {
                fVar.i(3, vz4Var.mo75928xcd1e8d8());
                this.f469291f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f469292g);
            r45.wz4 wz4Var = this.f469293h;
            if (wz4Var != null) {
                fVar.i(5, wz4Var.mo75928xcd1e8d8());
                this.f469293h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f469294i);
            fVar.e(8, this.f469295m);
            fVar.e(9, this.f469296n);
            java.lang.String str2 = this.f469297o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.e(11, this.f469298p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f469289d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f469290e);
            r45.vz4 vz4Var2 = this.f469291f;
            if (vz4Var2 != null) {
                j17 += b36.f.i(3, vz4Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(4, this.f469292g);
            r45.wz4 wz4Var2 = this.f469293h;
            if (wz4Var2 != null) {
                e17 += b36.f.i(5, wz4Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(7, this.f469294i) + b36.f.e(8, this.f469295m) + b36.f.e(9, this.f469296n);
            java.lang.String str4 = this.f469297o;
            if (str4 != null) {
                e18 += b36.f.j(10, str4);
            }
            return e18 + b36.f.e(11, this.f469298p);
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
        r45.uz4 uz4Var = (r45.uz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uz4Var.f469289d = aVar2.k(intValue);
                return 0;
            case 2:
                uz4Var.f469290e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.vz4 vz4Var3 = new r45.vz4();
                    if (bArr != null && bArr.length > 0) {
                        vz4Var3.mo11468x92b714fd(bArr);
                    }
                    uz4Var.f469291f = vz4Var3;
                }
                return 0;
            case 4:
                uz4Var.f469292g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.wz4 wz4Var3 = new r45.wz4();
                    if (bArr2 != null && bArr2.length > 0) {
                        wz4Var3.mo11468x92b714fd(bArr2);
                    }
                    uz4Var.f469293h = wz4Var3;
                }
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                uz4Var.f469294i = aVar2.g(intValue);
                return 0;
            case 8:
                uz4Var.f469295m = aVar2.g(intValue);
                return 0;
            case 9:
                uz4Var.f469296n = aVar2.g(intValue);
                return 0;
            case 10:
                uz4Var.f469297o = aVar2.k(intValue);
                return 0;
            case 11:
                uz4Var.f469298p = aVar2.g(intValue);
                return 0;
        }
    }
}
