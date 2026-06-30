package r45;

/* loaded from: classes11.dex */
public class i0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458131f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458132g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458133h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458134i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f458135m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i0)) {
            return false;
        }
        r45.i0 i0Var = (r45.i0) fVar;
        return n51.f.a(this.f458129d, i0Var.f458129d) && n51.f.a(this.f458130e, i0Var.f458130e) && n51.f.a(this.f458131f, i0Var.f458131f) && n51.f.a(this.f458132g, i0Var.f458132g) && n51.f.a(this.f458133h, i0Var.f458133h) && n51.f.a(this.f458134i, i0Var.f458134i) && n51.f.a(this.f458135m, i0Var.f458135m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458135m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458129d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458130e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458131f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f458132g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f458133h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f458134i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.g(7, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f458129d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f458130e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f458131f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f458132g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f458133h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f458134i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.g(7, 1, linkedList);
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
        r45.i0 i0Var = (r45.i0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i0Var.f458129d = aVar2.k(intValue);
                return 0;
            case 2:
                i0Var.f458130e = aVar2.k(intValue);
                return 0;
            case 3:
                i0Var.f458131f = aVar2.k(intValue);
                return 0;
            case 4:
                i0Var.f458132g = aVar2.k(intValue);
                return 0;
            case 5:
                i0Var.f458133h = aVar2.k(intValue);
                return 0;
            case 6:
                i0Var.f458134i = aVar2.k(intValue);
                return 0;
            case 7:
                i0Var.f458135m.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
