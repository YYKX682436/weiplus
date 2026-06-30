package r45;

/* loaded from: classes8.dex */
public class ov6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464093d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464094e;

    /* renamed from: f, reason: collision with root package name */
    public int f464095f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f464096g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f464097h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464098i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464099m;

    /* renamed from: n, reason: collision with root package name */
    public int f464100n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464101o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f464102p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ov6)) {
            return false;
        }
        r45.ov6 ov6Var = (r45.ov6) fVar;
        return n51.f.a(this.f464093d, ov6Var.f464093d) && n51.f.a(this.f464094e, ov6Var.f464094e) && n51.f.a(java.lang.Integer.valueOf(this.f464095f), java.lang.Integer.valueOf(ov6Var.f464095f)) && n51.f.a(this.f464096g, ov6Var.f464096g) && n51.f.a(java.lang.Integer.valueOf(this.f464097h), java.lang.Integer.valueOf(ov6Var.f464097h)) && n51.f.a(this.f464098i, ov6Var.f464098i) && n51.f.a(this.f464099m, ov6Var.f464099m) && n51.f.a(java.lang.Integer.valueOf(this.f464100n), java.lang.Integer.valueOf(ov6Var.f464100n)) && n51.f.a(this.f464101o, ov6Var.f464101o) && n51.f.a(this.f464102p, ov6Var.f464102p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464096g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464093d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464094e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f464095f);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f464097h);
            java.lang.String str3 = this.f464098i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f464099m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f464100n);
            java.lang.String str5 = this.f464101o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f464102p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f464093d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f464094e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f464095f) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f464097h);
            java.lang.String str9 = this.f464098i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f464099m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f464100n);
            java.lang.String str11 = this.f464101o;
            if (str11 != null) {
                e18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f464102p;
            return str12 != null ? e18 + b36.f.j(10, str12) : e18;
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
        r45.ov6 ov6Var = (r45.ov6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ov6Var.f464093d = aVar2.k(intValue);
                return 0;
            case 2:
                ov6Var.f464094e = aVar2.k(intValue);
                return 0;
            case 3:
                ov6Var.f464095f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.pv6 pv6Var = new r45.pv6();
                    if (bArr2 != null && bArr2.length > 0) {
                        pv6Var.mo11468x92b714fd(bArr2);
                    }
                    ov6Var.f464096g.add(pv6Var);
                }
                return 0;
            case 5:
                ov6Var.f464097h = aVar2.g(intValue);
                return 0;
            case 6:
                ov6Var.f464098i = aVar2.k(intValue);
                return 0;
            case 7:
                ov6Var.f464099m = aVar2.k(intValue);
                return 0;
            case 8:
                ov6Var.f464100n = aVar2.g(intValue);
                return 0;
            case 9:
                ov6Var.f464101o = aVar2.k(intValue);
                return 0;
            case 10:
                ov6Var.f464102p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
