package bw5;

/* loaded from: classes8.dex */
public class t5 extends com.tencent.mm.protobuf.f {
    public final boolean[] A = new boolean[27];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33247d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33248e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33249f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33250g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33251h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33252i;

    /* renamed from: m, reason: collision with root package name */
    public int f33253m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.a30 f33254n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.b30 f33255o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33256p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f33257q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f33258r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f33259s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f33260t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f33261u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f33262v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.r5 f33263w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.s5 f33264x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f33265y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f33266z;

    static {
        new bw5.t5();
    }

    public bw5.s5 b() {
        return this.A[22] ? this.f33264x : new bw5.s5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.t5 parseFrom(byte[] bArr) {
        return (bw5.t5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t5)) {
            return false;
        }
        bw5.t5 t5Var = (bw5.t5) fVar;
        return n51.f.a(this.f33247d, t5Var.f33247d) && n51.f.a(this.f33248e, t5Var.f33248e) && n51.f.a(this.f33249f, t5Var.f33249f) && n51.f.a(this.f33250g, t5Var.f33250g) && n51.f.a(this.f33251h, t5Var.f33251h) && n51.f.a(this.f33252i, t5Var.f33252i) && n51.f.a(java.lang.Integer.valueOf(this.f33253m), java.lang.Integer.valueOf(t5Var.f33253m)) && n51.f.a(this.f33254n, t5Var.f33254n) && n51.f.a(this.f33255o, t5Var.f33255o) && n51.f.a(java.lang.Boolean.valueOf(this.f33256p), java.lang.Boolean.valueOf(t5Var.f33256p)) && n51.f.a(this.f33257q, t5Var.f33257q) && n51.f.a(this.f33258r, t5Var.f33258r) && n51.f.a(this.f33259s, t5Var.f33259s) && n51.f.a(this.f33260t, t5Var.f33260t) && n51.f.a(this.f33261u, t5Var.f33261u) && n51.f.a(this.f33262v, t5Var.f33262v) && n51.f.a(this.f33263w, t5Var.f33263w) && n51.f.a(this.f33264x, t5Var.f33264x) && n51.f.a(this.f33265y, t5Var.f33265y) && n51.f.a(this.f33266z, t5Var.f33266z);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33247d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33248e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33249f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f33250g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f33251h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f33252i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33253m);
            }
            bw5.a30 a30Var = this.f33254n;
            if (a30Var != null && zArr[8]) {
                fVar.i(8, a30Var.computeSize());
                this.f33254n.writeFields(fVar);
            }
            bw5.b30 b30Var = this.f33255o;
            if (b30Var != null && zArr[9]) {
                fVar.i(9, b30Var.computeSize());
                this.f33255o.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f33256p);
            }
            java.lang.String str7 = this.f33257q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f33258r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f33259s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f33260t;
            if (str10 != null && zArr[14]) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f33261u;
            if (str11 != null && zArr[15]) {
                fVar.j(15, str11);
            }
            java.lang.String str12 = this.f33262v;
            if (str12 != null && zArr[16]) {
                fVar.j(16, str12);
            }
            bw5.r5 r5Var = this.f33263w;
            if (r5Var != null && zArr[17]) {
                fVar.i(17, r5Var.computeSize());
                this.f33263w.writeFields(fVar);
            }
            bw5.s5 s5Var = this.f33264x;
            if (s5Var != null && zArr[22]) {
                fVar.i(22, s5Var.computeSize());
                this.f33264x.writeFields(fVar);
            }
            java.lang.String str13 = this.f33265y;
            if (str13 != null && zArr[25]) {
                fVar.j(25, str13);
            }
            java.lang.String str14 = this.f33266z;
            if (str14 != null && zArr[26]) {
                fVar.j(26, str14);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str15 = this.f33247d;
            if (str15 != null && zArr[1]) {
                i18 = b36.f.j(1, str15) + 0;
            }
            java.lang.String str16 = this.f33248e;
            if (str16 != null && zArr[2]) {
                i18 += b36.f.j(2, str16);
            }
            java.lang.String str17 = this.f33249f;
            if (str17 != null && zArr[3]) {
                i18 += b36.f.j(3, str17);
            }
            java.lang.String str18 = this.f33250g;
            if (str18 != null && zArr[4]) {
                i18 += b36.f.j(4, str18);
            }
            java.lang.String str19 = this.f33251h;
            if (str19 != null && zArr[5]) {
                i18 += b36.f.j(5, str19);
            }
            java.lang.String str20 = this.f33252i;
            if (str20 != null && zArr[6]) {
                i18 += b36.f.j(6, str20);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33253m);
            }
            bw5.a30 a30Var2 = this.f33254n;
            if (a30Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, a30Var2.computeSize());
            }
            bw5.b30 b30Var2 = this.f33255o;
            if (b30Var2 != null && zArr[9]) {
                i18 += b36.f.i(9, b30Var2.computeSize());
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f33256p);
            }
            java.lang.String str21 = this.f33257q;
            if (str21 != null && zArr[11]) {
                i18 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f33258r;
            if (str22 != null && zArr[12]) {
                i18 += b36.f.j(12, str22);
            }
            java.lang.String str23 = this.f33259s;
            if (str23 != null && zArr[13]) {
                i18 += b36.f.j(13, str23);
            }
            java.lang.String str24 = this.f33260t;
            if (str24 != null && zArr[14]) {
                i18 += b36.f.j(14, str24);
            }
            java.lang.String str25 = this.f33261u;
            if (str25 != null && zArr[15]) {
                i18 += b36.f.j(15, str25);
            }
            java.lang.String str26 = this.f33262v;
            if (str26 != null && zArr[16]) {
                i18 += b36.f.j(16, str26);
            }
            bw5.r5 r5Var2 = this.f33263w;
            if (r5Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, r5Var2.computeSize());
            }
            bw5.s5 s5Var2 = this.f33264x;
            if (s5Var2 != null && zArr[22]) {
                i18 += b36.f.i(22, s5Var2.computeSize());
            }
            java.lang.String str27 = this.f33265y;
            if (str27 != null && zArr[25]) {
                i18 += b36.f.j(25, str27);
            }
            java.lang.String str28 = this.f33266z;
            return (str28 == null || !zArr[26]) ? i18 : i18 + b36.f.j(26, str28);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
        if (intValue == 22) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.s5 s5Var3 = new bw5.s5();
                if (bArr != null && bArr.length > 0) {
                    s5Var3.parseFrom(bArr);
                }
                this.f33264x = s5Var3;
            }
            zArr[22] = true;
            return 0;
        }
        if (intValue == 25) {
            this.f33265y = aVar2.k(intValue);
            zArr[25] = true;
            return 0;
        }
        if (intValue == 26) {
            this.f33266z = aVar2.k(intValue);
            zArr[26] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f33247d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33248e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33249f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33250g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33251h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33252i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33253m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.a30 a30Var3 = new bw5.a30();
                    if (bArr2 != null && bArr2.length > 0) {
                        a30Var3.parseFrom(bArr2);
                    }
                    this.f33254n = a30Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.b30 b30Var3 = new bw5.b30();
                    if (bArr3 != null && bArr3.length > 0) {
                        b30Var3.parseFrom(bArr3);
                    }
                    this.f33255o = b30Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f33256p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33257q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33258r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33259s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33260t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f33261u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f33262v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.r5 r5Var3 = new bw5.r5();
                    if (bArr4 != null && bArr4.length > 0) {
                        r5Var3.parseFrom(bArr4);
                    }
                    this.f33263w = r5Var3;
                }
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }
}
