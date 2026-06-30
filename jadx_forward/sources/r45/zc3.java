package r45;

/* loaded from: classes2.dex */
public class zc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f473436d;

    /* renamed from: e, reason: collision with root package name */
    public int f473437e;

    /* renamed from: f, reason: collision with root package name */
    public int f473438f;

    /* renamed from: g, reason: collision with root package name */
    public int f473439g;

    /* renamed from: h, reason: collision with root package name */
    public int f473440h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473441i;

    /* renamed from: m, reason: collision with root package name */
    public int f473442m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zc3)) {
            return false;
        }
        r45.zc3 zc3Var = (r45.zc3) fVar;
        return n51.f.a(this.f76492x92037252, zc3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f473436d), java.lang.Integer.valueOf(zc3Var.f473436d)) && n51.f.a(java.lang.Integer.valueOf(this.f473437e), java.lang.Integer.valueOf(zc3Var.f473437e)) && n51.f.a(java.lang.Integer.valueOf(this.f473438f), java.lang.Integer.valueOf(zc3Var.f473438f)) && n51.f.a(java.lang.Integer.valueOf(this.f473439g), java.lang.Integer.valueOf(zc3Var.f473439g)) && n51.f.a(java.lang.Integer.valueOf(this.f473440h), java.lang.Integer.valueOf(zc3Var.f473440h)) && n51.f.a(this.f473441i, zc3Var.f473441i) && n51.f.a(java.lang.Integer.valueOf(this.f473442m), java.lang.Integer.valueOf(zc3Var.f473442m));
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
            fVar.e(2, this.f473436d);
            fVar.e(3, this.f473437e);
            fVar.e(4, this.f473438f);
            fVar.e(5, this.f473439g);
            fVar.e(6, this.f473440h);
            java.lang.String str = this.f473441i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f473442m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f473436d) + b36.f.e(3, this.f473437e) + b36.f.e(4, this.f473438f) + b36.f.e(5, this.f473439g) + b36.f.e(6, this.f473440h);
            java.lang.String str2 = this.f473441i;
            if (str2 != null) {
                i18 += b36.f.j(7, str2);
            }
            return i18 + b36.f.e(8, this.f473442m);
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
        r45.zc3 zc3Var = (r45.zc3) objArr[1];
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
                    zc3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                zc3Var.f473436d = aVar2.g(intValue);
                return 0;
            case 3:
                zc3Var.f473437e = aVar2.g(intValue);
                return 0;
            case 4:
                zc3Var.f473438f = aVar2.g(intValue);
                return 0;
            case 5:
                zc3Var.f473439g = aVar2.g(intValue);
                return 0;
            case 6:
                zc3Var.f473440h = aVar2.g(intValue);
                return 0;
            case 7:
                zc3Var.f473441i = aVar2.k(intValue);
                return 0;
            case 8:
                zc3Var.f473442m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
