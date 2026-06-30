package bw5;

/* loaded from: classes9.dex */
public class s10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114282d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f114283e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114284f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114285g;

    /* renamed from: h, reason: collision with root package name */
    public int f114286h;

    /* renamed from: i, reason: collision with root package name */
    public int f114287i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f114289n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f114290o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f114291p;

    /* renamed from: q, reason: collision with root package name */
    public int f114292q;

    /* renamed from: r, reason: collision with root package name */
    public int f114293r;

    /* renamed from: s, reason: collision with root package name */
    public long f114294s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f114295t;

    /* renamed from: u, reason: collision with root package name */
    public int f114296u;

    /* renamed from: v, reason: collision with root package name */
    public r45.cu5 f114297v;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f114288m = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f114298w = new boolean[18];

    static {
        new bw5.s10();
    }

    public java.lang.String b() {
        return this.f114298w[11] ? this.f114291p : "";
    }

    public java.lang.String c() {
        return this.f114298w[15] ? this.f114295t : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s10)) {
            return false;
        }
        bw5.s10 s10Var = (bw5.s10) fVar;
        return n51.f.a(this.f76492x92037252, s10Var.f76492x92037252) && n51.f.a(this.f114282d, s10Var.f114282d) && n51.f.a(this.f114283e, s10Var.f114283e) && n51.f.a(this.f114284f, s10Var.f114284f) && n51.f.a(this.f114285g, s10Var.f114285g) && n51.f.a(java.lang.Integer.valueOf(this.f114286h), java.lang.Integer.valueOf(s10Var.f114286h)) && n51.f.a(java.lang.Integer.valueOf(this.f114287i), java.lang.Integer.valueOf(s10Var.f114287i)) && n51.f.a(this.f114288m, s10Var.f114288m) && n51.f.a(this.f114289n, s10Var.f114289n) && n51.f.a(this.f114290o, s10Var.f114290o) && n51.f.a(this.f114291p, s10Var.f114291p) && n51.f.a(java.lang.Integer.valueOf(this.f114292q), java.lang.Integer.valueOf(s10Var.f114292q)) && n51.f.a(java.lang.Integer.valueOf(this.f114293r), java.lang.Integer.valueOf(s10Var.f114293r)) && n51.f.a(java.lang.Long.valueOf(this.f114294s), java.lang.Long.valueOf(s10Var.f114294s)) && n51.f.a(this.f114295t, s10Var.f114295t) && n51.f.a(java.lang.Integer.valueOf(this.f114296u), java.lang.Integer.valueOf(s10Var.f114296u)) && n51.f.a(this.f114297v, s10Var.f114297v);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f114298w[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114288m;
        int i18 = 0;
        boolean[] zArr = this.f114298w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f114282d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f114283e;
            if (cu5Var != null && zArr[3]) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f114283e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f114284f;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f114285g;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114286h);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114287i);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str4 = this.f114289n;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f114290o;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f114291p;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            if (zArr[12]) {
                fVar.e(12, this.f114292q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f114293r);
            }
            if (zArr[14]) {
                fVar.h(14, this.f114294s);
            }
            java.lang.String str7 = this.f114295t;
            if (str7 != null && zArr[15]) {
                fVar.j(15, str7);
            }
            if (zArr[16]) {
                fVar.e(16, this.f114296u);
            }
            r45.cu5 cu5Var2 = this.f114297v;
            if (cu5Var2 != null && zArr[17]) {
                fVar.i(17, cu5Var2.mo75928xcd1e8d8());
                this.f114297v.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0;
            }
            java.lang.String str8 = this.f114282d;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            r45.cu5 cu5Var3 = this.f114283e;
            if (cu5Var3 != null && zArr[3]) {
                i18 += b36.f.i(3, cu5Var3.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f114284f;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f114285g;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f114286h);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f114287i);
            }
            int g17 = i18 + b36.f.g(8, 8, linkedList);
            java.lang.String str11 = this.f114289n;
            if (str11 != null && zArr[9]) {
                g17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f114290o;
            if (str12 != null && zArr[10]) {
                g17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f114291p;
            if (str13 != null && zArr[11]) {
                g17 += b36.f.j(11, str13);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f114292q);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f114293r);
            }
            if (zArr[14]) {
                g17 += b36.f.h(14, this.f114294s);
            }
            java.lang.String str14 = this.f114295t;
            if (str14 != null && zArr[15]) {
                g17 += b36.f.j(15, str14);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f114296u);
            }
            r45.cu5 cu5Var4 = this.f114297v;
            return (cu5Var4 == null || !zArr[17]) ? g17 : g17 + b36.f.i(17, cu5Var4.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76492x92037252 = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f114282d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f114283e = cu5Var5;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f114284f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114285g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114286h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114287i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.f4 f4Var = new bw5.f4();
                    if (bArr3 != null && bArr3.length > 0) {
                        f4Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(f4Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f114289n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114290o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114291p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114292q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114293r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114294s = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f114295t = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f114296u = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    this.f114297v = cu5Var6;
                }
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.s10) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f114298w[1] = true;
        return this;
    }
}
