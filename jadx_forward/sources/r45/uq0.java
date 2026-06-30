package r45;

/* loaded from: classes9.dex */
public class uq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469097d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f469098e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f469099f;

    /* renamed from: g, reason: collision with root package name */
    public long f469100g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469101h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469102i;

    /* renamed from: m, reason: collision with root package name */
    public long f469103m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469104n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uq0)) {
            return false;
        }
        r45.uq0 uq0Var = (r45.uq0) fVar;
        return n51.f.a(this.f469097d, uq0Var.f469097d) && n51.f.a(this.f469098e, uq0Var.f469098e) && n51.f.a(java.lang.Long.valueOf(this.f469099f), java.lang.Long.valueOf(uq0Var.f469099f)) && n51.f.a(java.lang.Long.valueOf(this.f469100g), java.lang.Long.valueOf(uq0Var.f469100g)) && n51.f.a(this.f469101h, uq0Var.f469101h) && n51.f.a(this.f469102i, uq0Var.f469102i) && n51.f.a(java.lang.Long.valueOf(this.f469103m), java.lang.Long.valueOf(uq0Var.f469103m)) && n51.f.a(this.f469104n, uq0Var.f469104n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469097d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f469098e);
            fVar.h(3, this.f469099f);
            fVar.h(4, this.f469100g);
            java.lang.String str2 = this.f469101h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f469102i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f469103m);
            java.lang.String str4 = this.f469104n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f469097d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.g(2, 8, this.f469098e) + b36.f.h(3, this.f469099f) + b36.f.h(4, this.f469100g);
            java.lang.String str6 = this.f469101h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f469102i;
            if (str7 != null) {
                j17 += b36.f.j(6, str7);
            }
            int h17 = j17 + b36.f.h(7, this.f469103m);
            java.lang.String str8 = this.f469104n;
            return str8 != null ? h17 + b36.f.j(8, str8) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469098e.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.uq0 uq0Var = (r45.uq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uq0Var.f469097d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.vq0 vq0Var = new r45.vq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        vq0Var.mo11468x92b714fd(bArr2);
                    }
                    uq0Var.f469098e.add(vq0Var);
                }
                return 0;
            case 3:
                uq0Var.f469099f = aVar2.i(intValue);
                return 0;
            case 4:
                uq0Var.f469100g = aVar2.i(intValue);
                return 0;
            case 5:
                uq0Var.f469101h = aVar2.k(intValue);
                return 0;
            case 6:
                uq0Var.f469102i = aVar2.k(intValue);
                return 0;
            case 7:
                uq0Var.f469103m = aVar2.i(intValue);
                return 0;
            case 8:
                uq0Var.f469104n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
