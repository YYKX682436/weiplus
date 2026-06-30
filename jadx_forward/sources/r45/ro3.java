package r45;

/* loaded from: classes12.dex */
public class ro3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f466586d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466587e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466588f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466589g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466590h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466591i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466592m;

    /* renamed from: n, reason: collision with root package name */
    public int f466593n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f466594o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f466595p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ro3)) {
            return false;
        }
        r45.ro3 ro3Var = (r45.ro3) fVar;
        return n51.f.a(this.f76494x2de60e5e, ro3Var.f76494x2de60e5e) && n51.f.a(this.f466586d, ro3Var.f466586d) && n51.f.a(this.f466587e, ro3Var.f466587e) && n51.f.a(this.f466588f, ro3Var.f466588f) && n51.f.a(this.f466589g, ro3Var.f466589g) && n51.f.a(this.f466590h, ro3Var.f466590h) && n51.f.a(this.f466591i, ro3Var.f466591i) && n51.f.a(this.f466592m, ro3Var.f466592m) && n51.f.a(java.lang.Integer.valueOf(this.f466593n), java.lang.Integer.valueOf(ro3Var.f466593n)) && n51.f.a(this.f466594o, ro3Var.f466594o) && n51.f.a(this.f466595p, ro3Var.f466595p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f466586d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f466586d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f466587e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f466588f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f466589g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f466590h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f466591i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f466592m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f466593n);
            java.lang.String str7 = this.f466594o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f466595p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var2 = this.f466586d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f466587e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f466588f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f466589g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f466590h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f466591i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f466592m;
            if (str14 != null) {
                i18 += b36.f.j(8, str14);
            }
            int e17 = i18 + b36.f.e(9, this.f466593n);
            java.lang.String str15 = this.f466594o;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f466595p;
            return str16 != null ? e17 + b36.f.j(11, str16) : e17;
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
        r45.ro3 ro3Var = (r45.ro3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    ro3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    ro3Var.f466586d = cu5Var3;
                }
                return 0;
            case 3:
                ro3Var.f466587e = aVar2.k(intValue);
                return 0;
            case 4:
                ro3Var.f466588f = aVar2.k(intValue);
                return 0;
            case 5:
                ro3Var.f466589g = aVar2.k(intValue);
                return 0;
            case 6:
                ro3Var.f466590h = aVar2.k(intValue);
                return 0;
            case 7:
                ro3Var.f466591i = aVar2.k(intValue);
                return 0;
            case 8:
                ro3Var.f466592m = aVar2.k(intValue);
                return 0;
            case 9:
                ro3Var.f466593n = aVar2.g(intValue);
                return 0;
            case 10:
                ro3Var.f466594o = aVar2.k(intValue);
                return 0;
            case 11:
                ro3Var.f466595p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
