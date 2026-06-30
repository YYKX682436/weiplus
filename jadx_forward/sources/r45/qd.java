package r45;

/* loaded from: classes9.dex */
public class qd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465371d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465372e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465373f;

    /* renamed from: g, reason: collision with root package name */
    public int f465374g;

    /* renamed from: h, reason: collision with root package name */
    public int f465375h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f465376i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465377m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465378n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465379o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465380p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465381q;

    /* renamed from: r, reason: collision with root package name */
    public long f465382r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd)) {
            return false;
        }
        r45.qd qdVar = (r45.qd) fVar;
        return n51.f.a(this.f465371d, qdVar.f465371d) && n51.f.a(this.f465372e, qdVar.f465372e) && n51.f.a(this.f465373f, qdVar.f465373f) && n51.f.a(java.lang.Integer.valueOf(this.f465374g), java.lang.Integer.valueOf(qdVar.f465374g)) && n51.f.a(java.lang.Integer.valueOf(this.f465375h), java.lang.Integer.valueOf(qdVar.f465375h)) && n51.f.a(this.f465376i, qdVar.f465376i) && n51.f.a(this.f465377m, qdVar.f465377m) && n51.f.a(this.f465378n, qdVar.f465378n) && n51.f.a(this.f465379o, qdVar.f465379o) && n51.f.a(this.f465380p, qdVar.f465380p) && n51.f.a(this.f465381q, qdVar.f465381q) && n51.f.a(java.lang.Long.valueOf(this.f465382r), java.lang.Long.valueOf(qdVar.f465382r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465376i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465371d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465372e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465373f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f465374g);
            fVar.e(5, this.f465375h);
            fVar.g(6, 8, linkedList);
            java.lang.String str4 = this.f465377m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f465378n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f465379o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f465380p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f465381q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.h(12, this.f465382r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f465371d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f465372e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f465373f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int e17 = j17 + b36.f.e(4, this.f465374g) + b36.f.e(5, this.f465375h) + b36.f.g(6, 8, linkedList);
            java.lang.String str12 = this.f465377m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f465378n;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f465379o;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f465380p;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f465381q;
            if (str16 != null) {
                e17 += b36.f.j(11, str16);
            }
            return e17 + b36.f.h(12, this.f465382r);
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
        r45.qd qdVar = (r45.qd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qdVar.f465371d = aVar2.k(intValue);
                return 0;
            case 2:
                qdVar.f465372e = aVar2.k(intValue);
                return 0;
            case 3:
                qdVar.f465373f = aVar2.k(intValue);
                return 0;
            case 4:
                qdVar.f465374g = aVar2.g(intValue);
                return 0;
            case 5:
                qdVar.f465375h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.dl0 dl0Var = new r45.dl0();
                    if (bArr2 != null && bArr2.length > 0) {
                        dl0Var.mo11468x92b714fd(bArr2);
                    }
                    qdVar.f465376i.add(dl0Var);
                }
                return 0;
            case 7:
                qdVar.f465377m = aVar2.k(intValue);
                return 0;
            case 8:
                qdVar.f465378n = aVar2.k(intValue);
                return 0;
            case 9:
                qdVar.f465379o = aVar2.k(intValue);
                return 0;
            case 10:
                qdVar.f465380p = aVar2.k(intValue);
                return 0;
            case 11:
                qdVar.f465381q = aVar2.k(intValue);
                return 0;
            case 12:
                qdVar.f465382r = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
