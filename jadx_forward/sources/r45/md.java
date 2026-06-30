package r45;

/* loaded from: classes8.dex */
public class md extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461902d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461903e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461904f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f461905g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461906h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461907i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461908m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.md)) {
            return false;
        }
        r45.md mdVar = (r45.md) fVar;
        return n51.f.a(this.f461902d, mdVar.f461902d) && n51.f.a(this.f461903e, mdVar.f461903e) && n51.f.a(this.f461904f, mdVar.f461904f) && n51.f.a(java.lang.Boolean.valueOf(this.f461905g), java.lang.Boolean.valueOf(mdVar.f461905g)) && n51.f.a(this.f461906h, mdVar.f461906h) && n51.f.a(this.f461907i, mdVar.f461907i) && n51.f.a(this.f461908m, mdVar.f461908m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461902d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461903e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461904f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f461905g);
            java.lang.String str4 = this.f461906h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f461907i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f461908m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f461902d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f461903e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f461904f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int a17 = j17 + b36.f.a(4, this.f461905g);
            java.lang.String str10 = this.f461906h;
            if (str10 != null) {
                a17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f461907i;
            if (str11 != null) {
                a17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f461908m;
            return str12 != null ? a17 + b36.f.j(7, str12) : a17;
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
        r45.md mdVar = (r45.md) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mdVar.f461902d = aVar2.k(intValue);
                return 0;
            case 2:
                mdVar.f461903e = aVar2.k(intValue);
                return 0;
            case 3:
                mdVar.f461904f = aVar2.k(intValue);
                return 0;
            case 4:
                mdVar.f461905g = aVar2.c(intValue);
                return 0;
            case 5:
                mdVar.f461906h = aVar2.k(intValue);
                return 0;
            case 6:
                mdVar.f461907i = aVar2.k(intValue);
                return 0;
            case 7:
                mdVar.f461908m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
