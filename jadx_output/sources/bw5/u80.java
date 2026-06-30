package bw5;

/* loaded from: classes4.dex */
public class u80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33797d;

    /* renamed from: e, reason: collision with root package name */
    public long f33798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33799f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33800g;

    /* renamed from: h, reason: collision with root package name */
    public long f33801h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33802i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f33803m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33804n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33805o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f33806p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f33807q = new boolean[14];

    static {
        new bw5.u80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u80 parseFrom(byte[] bArr) {
        return (bw5.u80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u80)) {
            return false;
        }
        bw5.u80 u80Var = (bw5.u80) fVar;
        return n51.f.a(this.f33797d, u80Var.f33797d) && n51.f.a(java.lang.Long.valueOf(this.f33798e), java.lang.Long.valueOf(u80Var.f33798e)) && n51.f.a(this.f33799f, u80Var.f33799f) && n51.f.a(java.lang.Boolean.valueOf(this.f33800g), java.lang.Boolean.valueOf(u80Var.f33800g)) && n51.f.a(java.lang.Long.valueOf(this.f33801h), java.lang.Long.valueOf(u80Var.f33801h)) && n51.f.a(this.f33802i, u80Var.f33802i) && n51.f.a(this.f33803m, u80Var.f33803m) && n51.f.a(java.lang.Boolean.valueOf(this.f33804n), java.lang.Boolean.valueOf(u80Var.f33804n)) && n51.f.a(this.f33805o, u80Var.f33805o) && n51.f.a(this.f33806p, u80Var.f33806p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33807q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33797d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f33798e);
            }
            java.lang.String str2 = this.f33799f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f33800g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f33801h);
            }
            java.lang.String str3 = this.f33802i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f33803m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[11]) {
                fVar.a(11, this.f33804n);
            }
            java.lang.String str5 = this.f33805o;
            if (str5 != null && zArr[12]) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f33806p;
            if (str6 != null && zArr[13]) {
                fVar.j(13, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f33797d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f33798e);
            }
            java.lang.String str8 = this.f33799f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f33800g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f33801h);
            }
            java.lang.String str9 = this.f33802i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f33803m;
            if (str10 != null && zArr[7]) {
                i18 += b36.f.j(7, str10);
            }
            if (zArr[11]) {
                i18 += b36.f.a(11, this.f33804n);
            }
            java.lang.String str11 = this.f33805o;
            if (str11 != null && zArr[12]) {
                i18 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f33806p;
            return (str12 == null || !zArr[13]) ? i18 : i18 + b36.f.j(13, str12);
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
                this.f33797d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33798e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33799f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33800g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33801h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33802i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33803m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                this.f33804n = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33805o = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33806p = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
        }
    }
}
