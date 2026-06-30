package r45;

/* loaded from: classes2.dex */
public class cc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f452973d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j32 f452974e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452975f;

    /* renamed from: g, reason: collision with root package name */
    public int f452976g;

    /* renamed from: h, reason: collision with root package name */
    public int f452977h;

    /* renamed from: i, reason: collision with root package name */
    public int f452978i;

    /* renamed from: m, reason: collision with root package name */
    public int f452979m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cc)) {
            return false;
        }
        r45.cc ccVar = (r45.cc) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f452973d), java.lang.Long.valueOf(ccVar.f452973d)) && n51.f.a(this.f452974e, ccVar.f452974e) && n51.f.a(this.f452975f, ccVar.f452975f) && n51.f.a(java.lang.Integer.valueOf(this.f452976g), java.lang.Integer.valueOf(ccVar.f452976g)) && n51.f.a(java.lang.Integer.valueOf(this.f452977h), java.lang.Integer.valueOf(ccVar.f452977h)) && n51.f.a(java.lang.Integer.valueOf(this.f452978i), java.lang.Integer.valueOf(ccVar.f452978i)) && n51.f.a(java.lang.Integer.valueOf(this.f452979m), java.lang.Integer.valueOf(ccVar.f452979m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f452973d);
            r45.j32 j32Var = this.f452974e;
            if (j32Var != null) {
                fVar.i(2, j32Var.mo75928xcd1e8d8());
                this.f452974e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f452975f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f452976g);
            fVar.e(5, this.f452977h);
            fVar.e(6, this.f452978i);
            fVar.e(7, this.f452979m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f452973d) + 0;
            r45.j32 j32Var2 = this.f452974e;
            if (j32Var2 != null) {
                h17 += b36.f.i(2, j32Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f452975f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.e(4, this.f452976g) + b36.f.e(5, this.f452977h) + b36.f.e(6, this.f452978i) + b36.f.e(7, this.f452979m);
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
        r45.cc ccVar = (r45.cc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ccVar.f452973d = aVar2.i(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr != null && bArr.length > 0) {
                        j32Var3.mo11468x92b714fd(bArr);
                    }
                    ccVar.f452974e = j32Var3;
                }
                return 0;
            case 3:
                ccVar.f452975f = aVar2.k(intValue);
                return 0;
            case 4:
                ccVar.f452976g = aVar2.g(intValue);
                return 0;
            case 5:
                ccVar.f452977h = aVar2.g(intValue);
                return 0;
            case 6:
                ccVar.f452978i = aVar2.g(intValue);
                return 0;
            case 7:
                ccVar.f452979m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
