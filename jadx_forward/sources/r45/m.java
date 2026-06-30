package r45;

/* loaded from: classes9.dex */
public class m extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461549d;

    /* renamed from: e, reason: collision with root package name */
    public long f461550e;

    /* renamed from: g, reason: collision with root package name */
    public int f461552g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461553h;

    /* renamed from: i, reason: collision with root package name */
    public r45.r1 f461554i;

    /* renamed from: m, reason: collision with root package name */
    public long f461555m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461556n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f461557o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f461558p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f461559q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f461560r;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f461551f = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f461561s = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m)) {
            return false;
        }
        r45.m mVar = (r45.m) fVar;
        return n51.f.a(this.f76494x2de60e5e, mVar.f76494x2de60e5e) && n51.f.a(this.f461549d, mVar.f461549d) && n51.f.a(java.lang.Long.valueOf(this.f461550e), java.lang.Long.valueOf(mVar.f461550e)) && n51.f.a(this.f461551f, mVar.f461551f) && n51.f.a(java.lang.Integer.valueOf(this.f461552g), java.lang.Integer.valueOf(mVar.f461552g)) && n51.f.a(this.f461553h, mVar.f461553h) && n51.f.a(this.f461554i, mVar.f461554i) && n51.f.a(java.lang.Long.valueOf(this.f461555m), java.lang.Long.valueOf(mVar.f461555m)) && n51.f.a(this.f461556n, mVar.f461556n) && n51.f.a(this.f461557o, mVar.f461557o) && n51.f.a(this.f461558p, mVar.f461558p) && n51.f.a(this.f461559q, mVar.f461559q) && n51.f.a(java.lang.Boolean.valueOf(this.f461560r), java.lang.Boolean.valueOf(mVar.f461560r)) && n51.f.a(this.f461561s, mVar.f461561s);
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
            java.lang.String str = this.f461549d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f461550e);
            fVar.g(5, 8, this.f461551f);
            fVar.e(7, this.f461552g);
            java.lang.String str2 = this.f461553h;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            r45.r1 r1Var = this.f461554i;
            if (r1Var != null) {
                fVar.i(9, r1Var.mo75928xcd1e8d8());
                this.f461554i.mo75956x3d5d1f78(fVar);
            }
            fVar.h(10, this.f461555m);
            java.lang.String str3 = this.f461556n;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f461557o;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f461558p;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f461559q;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            fVar.a(15, this.f461560r);
            fVar.g(16, 8, this.f461561s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str7 = this.f461549d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int h17 = i18 + b36.f.h(3, this.f461550e) + b36.f.g(5, 8, this.f461551f) + b36.f.e(7, this.f461552g);
            java.lang.String str8 = this.f461553h;
            if (str8 != null) {
                h17 += b36.f.j(8, str8);
            }
            r45.r1 r1Var2 = this.f461554i;
            if (r1Var2 != null) {
                h17 += b36.f.i(9, r1Var2.mo75928xcd1e8d8());
            }
            int h18 = h17 + b36.f.h(10, this.f461555m);
            java.lang.String str9 = this.f461556n;
            if (str9 != null) {
                h18 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f461557o;
            if (str10 != null) {
                h18 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f461558p;
            if (str11 != null) {
                h18 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f461559q;
            if (str12 != null) {
                h18 += b36.f.j(14, str12);
            }
            return h18 + b36.f.a(15, this.f461560r) + b36.f.g(16, 8, this.f461561s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f461551f.clear();
            this.f461561s.clear();
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
        r45.m mVar = (r45.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    mVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                mVar.f461549d = aVar2.k(intValue);
                return 0;
            case 3:
                mVar.f461550e = aVar2.i(intValue);
                return 0;
            case 4:
            case 6:
            default:
                return -1;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.o oVar = new r45.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar.mo11468x92b714fd(bArr3);
                    }
                    mVar.f461551f.add(oVar);
                }
                return 0;
            case 7:
                mVar.f461552g = aVar2.g(intValue);
                return 0;
            case 8:
                mVar.f461553h = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr4 != null && bArr4.length > 0) {
                        r1Var3.mo11468x92b714fd(bArr4);
                    }
                    mVar.f461554i = r1Var3;
                }
                return 0;
            case 10:
                mVar.f461555m = aVar2.i(intValue);
                return 0;
            case 11:
                mVar.f461556n = aVar2.k(intValue);
                return 0;
            case 12:
                mVar.f461557o = aVar2.k(intValue);
                return 0;
            case 13:
                mVar.f461558p = aVar2.k(intValue);
                return 0;
            case 14:
                mVar.f461559q = aVar2.k(intValue);
                return 0;
            case 15:
                mVar.f461560r = aVar2.c(intValue);
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.bc6 bc6Var = new r45.bc6();
                    if (bArr5 != null && bArr5.length > 0) {
                        bc6Var.mo11468x92b714fd(bArr5);
                    }
                    mVar.f461561s.add(bc6Var);
                }
                return 0;
        }
    }
}
