package bw5;

/* loaded from: classes2.dex */
public class eg extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26891d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26892e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26893f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26894g;

    /* renamed from: h, reason: collision with root package name */
    public long f26895h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26896i;

    /* renamed from: m, reason: collision with root package name */
    public int f26897m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26898n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f26899o = new boolean[9];

    static {
        new bw5.eg();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.eg parseFrom(byte[] bArr) {
        return (bw5.eg) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.eg)) {
            return false;
        }
        bw5.eg egVar = (bw5.eg) fVar;
        return n51.f.a(this.f26891d, egVar.f26891d) && n51.f.a(this.f26892e, egVar.f26892e) && n51.f.a(this.f26893f, egVar.f26893f) && n51.f.a(this.f26894g, egVar.f26894g) && n51.f.a(java.lang.Long.valueOf(this.f26895h), java.lang.Long.valueOf(egVar.f26895h)) && n51.f.a(this.f26896i, egVar.f26896i) && n51.f.a(java.lang.Integer.valueOf(this.f26897m), java.lang.Integer.valueOf(egVar.f26897m)) && n51.f.a(this.f26898n, egVar.f26898n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.eg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26899o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26891d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26892e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26893f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f26894g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.h(5, this.f26895h);
            }
            java.lang.String str5 = this.f26896i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f26897m);
            }
            java.lang.String str6 = this.f26898n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f26891d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f26892e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f26893f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f26894g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f26895h);
            }
            java.lang.String str11 = this.f26896i;
            if (str11 != null && zArr[6]) {
                i18 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f26897m);
            }
            java.lang.String str12 = this.f26898n;
            return (str12 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str12);
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
                this.f26891d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26892e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26893f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26894g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26895h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26896i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26897m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26898n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
