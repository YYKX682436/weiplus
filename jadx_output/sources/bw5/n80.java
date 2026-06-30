package bw5;

/* loaded from: classes2.dex */
public class n80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30545d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30546e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30547f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30548g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30549h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30550i;

    /* renamed from: m, reason: collision with root package name */
    public int f30551m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30552n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30553o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f30554p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f30555q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.mc0 f30556r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f30557s = new boolean[13];

    static {
        new bw5.n80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n80 parseFrom(byte[] bArr) {
        return (bw5.n80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n80)) {
            return false;
        }
        bw5.n80 n80Var = (bw5.n80) fVar;
        return n51.f.a(this.f30545d, n80Var.f30545d) && n51.f.a(this.f30546e, n80Var.f30546e) && n51.f.a(this.f30547f, n80Var.f30547f) && n51.f.a(this.f30548g, n80Var.f30548g) && n51.f.a(this.f30549h, n80Var.f30549h) && n51.f.a(this.f30550i, n80Var.f30550i) && n51.f.a(java.lang.Integer.valueOf(this.f30551m), java.lang.Integer.valueOf(n80Var.f30551m)) && n51.f.a(this.f30552n, n80Var.f30552n) && n51.f.a(this.f30553o, n80Var.f30553o) && n51.f.a(this.f30554p, n80Var.f30554p) && n51.f.a(this.f30555q, n80Var.f30555q) && n51.f.a(this.f30556r, n80Var.f30556r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30557s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30545d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30546e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30547f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f30548g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f30549h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f30550i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            if (zArr[10]) {
                fVar.e(10, this.f30551m);
            }
            java.lang.String str7 = this.f30552n;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f30553o;
            if (str8 != null && zArr[7]) {
                fVar.j(7, str8);
            }
            java.lang.String str9 = this.f30554p;
            if (str9 != null && zArr[8]) {
                fVar.j(8, str9);
            }
            java.lang.String str10 = this.f30555q;
            if (str10 != null && zArr[9]) {
                fVar.j(9, str10);
            }
            bw5.mc0 mc0Var = this.f30556r;
            if (mc0Var == null || !zArr[12]) {
                return 0;
            }
            fVar.i(12, mc0Var.computeSize());
            this.f30556r.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f30545d;
            int j17 = (str11 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str11);
            java.lang.String str12 = this.f30546e;
            if (str12 != null && zArr[2]) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f30547f;
            if (str13 != null && zArr[3]) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f30548g;
            if (str14 != null && zArr[4]) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f30549h;
            if (str15 != null && zArr[5]) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f30550i;
            if (str16 != null && zArr[6]) {
                j17 += b36.f.j(6, str16);
            }
            if (zArr[10]) {
                j17 += b36.f.e(10, this.f30551m);
            }
            java.lang.String str17 = this.f30552n;
            if (str17 != null && zArr[11]) {
                j17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f30553o;
            if (str18 != null && zArr[7]) {
                j17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f30554p;
            if (str19 != null && zArr[8]) {
                j17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f30555q;
            if (str20 != null && zArr[9]) {
                j17 += b36.f.j(9, str20);
            }
            bw5.mc0 mc0Var2 = this.f30556r;
            return (mc0Var2 == null || !zArr[12]) ? j17 : j17 + b36.f.i(12, mc0Var2.computeSize());
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
        switch (intValue) {
            case 1:
                this.f30545d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30546e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30547f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30548g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30549h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30550i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30553o = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30554p = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30555q = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30551m = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f30552n = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.parseFrom(bArr);
                    }
                    this.f30556r = mc0Var3;
                }
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
