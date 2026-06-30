package r45;

/* loaded from: classes2.dex */
public class r13 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465950d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kv0 f465951e;

    /* renamed from: f, reason: collision with root package name */
    public int f465952f;

    /* renamed from: g, reason: collision with root package name */
    public int f465953g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465954h;

    /* renamed from: i, reason: collision with root package name */
    public int f465955i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465956m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465957n;

    /* renamed from: o, reason: collision with root package name */
    public long f465958o;

    /* renamed from: p, reason: collision with root package name */
    public r45.y13 f465959p;

    /* renamed from: q, reason: collision with root package name */
    public int f465960q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f465961r;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 9037;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderuserpageheader";
        lVar.f152197a = this;
        lVar.f152198b = new r45.s13();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r13)) {
            return false;
        }
        r45.r13 r13Var = (r45.r13) fVar;
        return n51.f.a(this.f76494x2de60e5e, r13Var.f76494x2de60e5e) && n51.f.a(this.f465950d, r13Var.f465950d) && n51.f.a(this.f465951e, r13Var.f465951e) && n51.f.a(java.lang.Integer.valueOf(this.f465952f), java.lang.Integer.valueOf(r13Var.f465952f)) && n51.f.a(java.lang.Integer.valueOf(this.f465953g), java.lang.Integer.valueOf(r13Var.f465953g)) && n51.f.a(this.f465954h, r13Var.f465954h) && n51.f.a(java.lang.Integer.valueOf(this.f465955i), java.lang.Integer.valueOf(r13Var.f465955i)) && n51.f.a(this.f465956m, r13Var.f465956m) && n51.f.a(this.f465957n, r13Var.f465957n) && n51.f.a(java.lang.Long.valueOf(this.f465958o), java.lang.Long.valueOf(r13Var.f465958o)) && n51.f.a(this.f465959p, r13Var.f465959p) && n51.f.a(java.lang.Integer.valueOf(this.f465960q), java.lang.Integer.valueOf(r13Var.f465960q)) && n51.f.a(this.f465961r, r13Var.f465961r);
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
            java.lang.String str = this.f465950d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.kv0 kv0Var = this.f465951e;
            if (kv0Var != null) {
                fVar.i(3, kv0Var.mo75928xcd1e8d8());
                this.f465951e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f465952f);
            fVar.e(5, this.f465953g);
            java.lang.String str2 = this.f465954h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f465955i);
            java.lang.String str3 = this.f465956m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f465957n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.h(10, this.f465958o);
            r45.y13 y13Var = this.f465959p;
            if (y13Var != null) {
                fVar.i(11, y13Var.mo75928xcd1e8d8());
                this.f465959p.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f465960q);
            java.lang.String str5 = this.f465961r;
            if (str5 == null) {
                return 0;
            }
            fVar.j(13, str5);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f465950d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            r45.kv0 kv0Var2 = this.f465951e;
            if (kv0Var2 != null) {
                i18 += b36.f.i(3, kv0Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f465952f) + b36.f.e(5, this.f465953g);
            java.lang.String str7 = this.f465954h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f465955i);
            java.lang.String str8 = this.f465956m;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f465957n;
            if (str9 != null) {
                e18 += b36.f.j(9, str9);
            }
            int h17 = e18 + b36.f.h(10, this.f465958o);
            r45.y13 y13Var2 = this.f465959p;
            if (y13Var2 != null) {
                h17 += b36.f.i(11, y13Var2.mo75928xcd1e8d8());
            }
            int e19 = h17 + b36.f.e(12, this.f465960q);
            java.lang.String str10 = this.f465961r;
            return str10 != null ? e19 + b36.f.j(13, str10) : e19;
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
        r45.r13 r13Var = (r45.r13) objArr[1];
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
                    r13Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                r13Var.f465950d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    r13Var.f465951e = kv0Var3;
                }
                return 0;
            case 4:
                r13Var.f465952f = aVar2.g(intValue);
                return 0;
            case 5:
                r13Var.f465953g = aVar2.g(intValue);
                return 0;
            case 6:
                r13Var.f465954h = aVar2.k(intValue);
                return 0;
            case 7:
                r13Var.f465955i = aVar2.g(intValue);
                return 0;
            case 8:
                r13Var.f465956m = aVar2.k(intValue);
                return 0;
            case 9:
                r13Var.f465957n = aVar2.k(intValue);
                return 0;
            case 10:
                r13Var.f465958o = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.y13 y13Var3 = new r45.y13();
                    if (bArr3 != null && bArr3.length > 0) {
                        y13Var3.mo11468x92b714fd(bArr3);
                    }
                    r13Var.f465959p = y13Var3;
                }
                return 0;
            case 12:
                r13Var.f465960q = aVar2.g(intValue);
                return 0;
            case 13:
                r13Var.f465961r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
