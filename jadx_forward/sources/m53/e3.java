package m53;

/* loaded from: classes2.dex */
public class e3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405183d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405185f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405186g;

    /* renamed from: h, reason: collision with root package name */
    public m53.s3 f405187h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405188i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e3)) {
            return false;
        }
        m53.e3 e3Var = (m53.e3) fVar;
        return n51.f.a(this.f405183d, e3Var.f405183d) && n51.f.a(this.f405184e, e3Var.f405184e) && n51.f.a(this.f405185f, e3Var.f405185f) && n51.f.a(this.f405186g, e3Var.f405186g) && n51.f.a(this.f405187h, e3Var.f405187h) && n51.f.a(this.f405188i, e3Var.f405188i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405183d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405184e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405185f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405186g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            m53.s3 s3Var = this.f405187h;
            if (s3Var != null) {
                fVar.i(5, s3Var.mo75928xcd1e8d8());
                this.f405187h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f405188i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f405183d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f405184e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f405185f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f405186g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            m53.s3 s3Var2 = this.f405187h;
            if (s3Var2 != null) {
                j17 += b36.f.i(5, s3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f405188i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        m53.e3 e3Var = (m53.e3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e3Var.f405183d = aVar2.k(intValue);
                return 0;
            case 2:
                e3Var.f405184e = aVar2.k(intValue);
                return 0;
            case 3:
                e3Var.f405185f = aVar2.k(intValue);
                return 0;
            case 4:
                e3Var.f405186g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.s3 s3Var3 = new m53.s3();
                    if (bArr != null && bArr.length > 0) {
                        s3Var3.mo11468x92b714fd(bArr);
                    }
                    e3Var.f405187h = s3Var3;
                }
                return 0;
            case 6:
                e3Var.f405188i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
