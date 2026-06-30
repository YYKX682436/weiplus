package bw5;

/* loaded from: classes2.dex */
public class tb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33348d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33349e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33350f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33351g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33352h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33353i;

    /* renamed from: m, reason: collision with root package name */
    public int f33354m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f33355n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f33356o;

    /* renamed from: p, reason: collision with root package name */
    public int f33357p;

    /* renamed from: q, reason: collision with root package name */
    public int f33358q;

    /* renamed from: r, reason: collision with root package name */
    public int f33359r;

    /* renamed from: s, reason: collision with root package name */
    public int f33360s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33361t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.xa0 f33362u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.g60 f33363v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f33364w = new boolean[18];

    static {
        new bw5.tb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tb0 parseFrom(byte[] bArr) {
        return (bw5.tb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tb0)) {
            return false;
        }
        bw5.tb0 tb0Var = (bw5.tb0) fVar;
        return n51.f.a(this.f33348d, tb0Var.f33348d) && n51.f.a(this.f33349e, tb0Var.f33349e) && n51.f.a(this.f33350f, tb0Var.f33350f) && n51.f.a(this.f33351g, tb0Var.f33351g) && n51.f.a(this.f33352h, tb0Var.f33352h) && n51.f.a(this.f33353i, tb0Var.f33353i) && n51.f.a(java.lang.Integer.valueOf(this.f33354m), java.lang.Integer.valueOf(tb0Var.f33354m)) && n51.f.a(this.f33355n, tb0Var.f33355n) && n51.f.a(java.lang.Boolean.valueOf(this.f33356o), java.lang.Boolean.valueOf(tb0Var.f33356o)) && n51.f.a(java.lang.Integer.valueOf(this.f33357p), java.lang.Integer.valueOf(tb0Var.f33357p)) && n51.f.a(java.lang.Integer.valueOf(this.f33358q), java.lang.Integer.valueOf(tb0Var.f33358q)) && n51.f.a(java.lang.Integer.valueOf(this.f33359r), java.lang.Integer.valueOf(tb0Var.f33359r)) && n51.f.a(java.lang.Integer.valueOf(this.f33360s), java.lang.Integer.valueOf(tb0Var.f33360s)) && n51.f.a(java.lang.Boolean.valueOf(this.f33361t), java.lang.Boolean.valueOf(tb0Var.f33361t)) && n51.f.a(this.f33362u, tb0Var.f33362u) && n51.f.a(this.f33363v, tb0Var.f33363v);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33364w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33348d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33349e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33350f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f33351g;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f33352h;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f33353i;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33354m);
            }
            java.lang.String str7 = this.f33355n;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            if (zArr[10]) {
                fVar.a(10, this.f33356o);
            }
            if (zArr[11]) {
                fVar.e(11, this.f33357p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f33358q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f33359r);
            }
            if (zArr[14]) {
                fVar.e(14, this.f33360s);
            }
            if (zArr[15]) {
                fVar.a(15, this.f33361t);
            }
            bw5.xa0 xa0Var = this.f33362u;
            if (xa0Var != null && zArr[16]) {
                fVar.i(16, xa0Var.computeSize());
                this.f33362u.writeFields(fVar);
            }
            bw5.g60 g60Var = this.f33363v;
            if (g60Var != null && zArr[17]) {
                fVar.i(17, g60Var.computeSize());
                this.f33363v.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f33348d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            java.lang.String str9 = this.f33349e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f33350f;
            if (str10 != null && zArr[3]) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f33351g;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f33352h;
            if (str12 != null && zArr[6]) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f33353i;
            if (str13 != null && zArr[7]) {
                i18 += b36.f.j(7, str13);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f33354m);
            }
            java.lang.String str14 = this.f33355n;
            if (str14 != null && zArr[9]) {
                i18 += b36.f.j(9, str14);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f33356o);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f33357p);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f33358q);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f33359r);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f33360s);
            }
            if (zArr[15]) {
                i18 += b36.f.a(15, this.f33361t);
            }
            bw5.xa0 xa0Var2 = this.f33362u;
            if (xa0Var2 != null && zArr[16]) {
                i18 += b36.f.i(16, xa0Var2.computeSize());
            }
            bw5.g60 g60Var2 = this.f33363v;
            return (g60Var2 == null || !zArr[17]) ? i18 : i18 + b36.f.i(17, g60Var2.computeSize());
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
                this.f33348d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33349e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33350f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                this.f33351g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33352h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33353i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33354m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33355n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33356o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33357p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33358q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33359r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33360s = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f33361t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr != null && bArr.length > 0) {
                        xa0Var3.parseFrom(bArr);
                    }
                    this.f33362u = xa0Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.g60 g60Var3 = new bw5.g60();
                    if (bArr2 != null && bArr2.length > 0) {
                        g60Var3.parseFrom(bArr2);
                    }
                    this.f33363v = g60Var3;
                }
                zArr[17] = true;
                return 0;
        }
    }
}
