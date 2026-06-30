package m53;

/* loaded from: classes8.dex */
public class m5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405439d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405440e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405441f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405442g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405443h;

    /* renamed from: i, reason: collision with root package name */
    public m53.p3 f405444i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405445m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.m5)) {
            return false;
        }
        m53.m5 m5Var = (m53.m5) fVar;
        return n51.f.a(this.f405439d, m5Var.f405439d) && n51.f.a(this.f405440e, m5Var.f405440e) && n51.f.a(this.f405441f, m5Var.f405441f) && n51.f.a(this.f405442g, m5Var.f405442g) && n51.f.a(this.f405443h, m5Var.f405443h) && n51.f.a(this.f405444i, m5Var.f405444i) && n51.f.a(this.f405445m, m5Var.f405445m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405439d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405440e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405441f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405442g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f405443h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            m53.p3 p3Var = this.f405444i;
            if (p3Var != null) {
                fVar.i(6, p3Var.mo75928xcd1e8d8());
                this.f405444i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f405445m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f405439d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f405440e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f405441f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f405442g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f405443h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            m53.p3 p3Var2 = this.f405444i;
            if (p3Var2 != null) {
                j17 += b36.f.i(6, p3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f405445m;
            return str12 != null ? j17 + b36.f.j(7, str12) : j17;
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
        m53.m5 m5Var = (m53.m5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m5Var.f405439d = aVar2.k(intValue);
                return 0;
            case 2:
                m5Var.f405440e = aVar2.k(intValue);
                return 0;
            case 3:
                m5Var.f405441f = aVar2.k(intValue);
                return 0;
            case 4:
                m5Var.f405442g = aVar2.k(intValue);
                return 0;
            case 5:
                m5Var.f405443h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.p3 p3Var3 = new m53.p3();
                    if (bArr != null && bArr.length > 0) {
                        p3Var3.mo11468x92b714fd(bArr);
                    }
                    m5Var.f405444i = p3Var3;
                }
                return 0;
            case 7:
                m5Var.f405445m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
