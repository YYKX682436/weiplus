package m53;

/* loaded from: classes8.dex */
public class k4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405375d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405376e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405377f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405378g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405379h;

    /* renamed from: i, reason: collision with root package name */
    public m53.h f405380i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f405381m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f405382n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.k4)) {
            return false;
        }
        m53.k4 k4Var = (m53.k4) fVar;
        return n51.f.a(this.f405375d, k4Var.f405375d) && n51.f.a(this.f405376e, k4Var.f405376e) && n51.f.a(this.f405377f, k4Var.f405377f) && n51.f.a(this.f405378g, k4Var.f405378g) && n51.f.a(this.f405379h, k4Var.f405379h) && n51.f.a(this.f405380i, k4Var.f405380i) && n51.f.a(this.f405381m, k4Var.f405381m) && n51.f.a(this.f405382n, k4Var.f405382n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405381m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405375d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405376e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405377f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405378g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f405379h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            m53.h hVar = this.f405380i;
            if (hVar != null) {
                fVar.i(6, hVar.mo75928xcd1e8d8());
                this.f405380i.mo75956x3d5d1f78(fVar);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str6 = this.f405382n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f405375d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f405376e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f405377f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f405378g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f405379h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            m53.h hVar2 = this.f405380i;
            if (hVar2 != null) {
                j17 += b36.f.i(6, hVar2.mo75928xcd1e8d8());
            }
            int g17 = j17 + b36.f.g(7, 8, linkedList);
            java.lang.String str12 = this.f405382n;
            return str12 != null ? g17 + b36.f.j(8, str12) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        m53.k4 k4Var = (m53.k4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k4Var.f405375d = aVar2.k(intValue);
                return 0;
            case 2:
                k4Var.f405376e = aVar2.k(intValue);
                return 0;
            case 3:
                k4Var.f405377f = aVar2.k(intValue);
                return 0;
            case 4:
                k4Var.f405378g = aVar2.k(intValue);
                return 0;
            case 5:
                k4Var.f405379h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.h hVar3 = new m53.h();
                    if (bArr2 != null && bArr2.length > 0) {
                        hVar3.mo11468x92b714fd(bArr2);
                    }
                    k4Var.f405380i = hVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    m53.m0 m0Var = new m53.m0();
                    if (bArr3 != null && bArr3.length > 0) {
                        m0Var.mo11468x92b714fd(bArr3);
                    }
                    k4Var.f405381m.add(m0Var);
                }
                return 0;
            case 8:
                k4Var.f405382n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
