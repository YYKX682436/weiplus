package bw5;

/* loaded from: classes2.dex */
public class v00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34096d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34097e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.q00 f34098f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34099g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34100h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34101i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34102m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34103n;

    /* renamed from: o, reason: collision with root package name */
    public int f34104o;

    /* renamed from: p, reason: collision with root package name */
    public int f34105p;

    /* renamed from: q, reason: collision with root package name */
    public int f34106q;

    /* renamed from: r, reason: collision with root package name */
    public int f34107r;

    /* renamed from: s, reason: collision with root package name */
    public int f34108s;

    /* renamed from: t, reason: collision with root package name */
    public int f34109t;

    /* renamed from: u, reason: collision with root package name */
    public int f34110u;

    /* renamed from: v, reason: collision with root package name */
    public int f34111v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f34112w = new boolean[19];

    static {
        new bw5.v00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v00 parseFrom(byte[] bArr) {
        return (bw5.v00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v00)) {
            return false;
        }
        bw5.v00 v00Var = (bw5.v00) fVar;
        return n51.f.a(this.f34096d, v00Var.f34096d) && n51.f.a(this.f34097e, v00Var.f34097e) && n51.f.a(this.f34098f, v00Var.f34098f) && n51.f.a(this.f34099g, v00Var.f34099g) && n51.f.a(this.f34100h, v00Var.f34100h) && n51.f.a(this.f34101i, v00Var.f34101i) && n51.f.a(this.f34102m, v00Var.f34102m) && n51.f.a(this.f34103n, v00Var.f34103n) && n51.f.a(java.lang.Integer.valueOf(this.f34104o), java.lang.Integer.valueOf(v00Var.f34104o)) && n51.f.a(java.lang.Integer.valueOf(this.f34105p), java.lang.Integer.valueOf(v00Var.f34105p)) && n51.f.a(java.lang.Integer.valueOf(this.f34106q), java.lang.Integer.valueOf(v00Var.f34106q)) && n51.f.a(java.lang.Integer.valueOf(this.f34107r), java.lang.Integer.valueOf(v00Var.f34107r)) && n51.f.a(java.lang.Integer.valueOf(this.f34108s), java.lang.Integer.valueOf(v00Var.f34108s)) && n51.f.a(java.lang.Integer.valueOf(this.f34109t), java.lang.Integer.valueOf(v00Var.f34109t)) && n51.f.a(java.lang.Integer.valueOf(this.f34110u), java.lang.Integer.valueOf(v00Var.f34110u)) && n51.f.a(java.lang.Integer.valueOf(this.f34111v), java.lang.Integer.valueOf(v00Var.f34111v));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34112w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34096d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34097e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.q00 q00Var = this.f34098f;
            if (q00Var != null && zArr[3]) {
                fVar.i(3, q00Var.computeSize());
                this.f34098f.writeFields(fVar);
            }
            java.lang.String str3 = this.f34099g;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f34100h;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f34101i;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f34102m;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f34103n;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f34104o);
            }
            if (zArr[12]) {
                fVar.e(12, this.f34105p);
            }
            if (zArr[13]) {
                fVar.e(13, this.f34106q);
            }
            if (zArr[14]) {
                fVar.e(14, this.f34107r);
            }
            if (zArr[15]) {
                fVar.e(15, this.f34108s);
            }
            if (zArr[16]) {
                fVar.e(16, this.f34109t);
            }
            if (zArr[17]) {
                fVar.e(17, this.f34110u);
            }
            if (zArr[18]) {
                fVar.e(18, this.f34111v);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f34096d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            java.lang.String str9 = this.f34097e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            bw5.q00 q00Var2 = this.f34098f;
            if (q00Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, q00Var2.computeSize());
            }
            java.lang.String str10 = this.f34099g;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f34100h;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f34101i;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f34102m;
            if (str13 != null && zArr[9]) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f34103n;
            if (str14 != null && zArr[10]) {
                i18 += b36.f.j(10, str14);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f34104o);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f34105p);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f34106q);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f34107r);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f34108s);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f34109t);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f34110u);
            }
            return zArr[18] ? i18 + b36.f.e(18, this.f34111v) : i18;
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
                this.f34096d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34097e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.q00 q00Var3 = new bw5.q00();
                    if (bArr != null && bArr.length > 0) {
                        q00Var3.parseFrom(bArr);
                    }
                    this.f34098f = q00Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
            case 5:
            default:
                return -1;
            case 6:
                this.f34099g = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34100h = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34101i = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34102m = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34103n = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34104o = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34105p = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f34106q = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f34107r = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f34108s = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f34109t = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f34110u = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f34111v = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
        }
    }
}
