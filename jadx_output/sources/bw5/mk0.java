package bw5;

/* loaded from: classes2.dex */
public class mk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30269e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30270f;

    /* renamed from: g, reason: collision with root package name */
    public long f30271g;

    /* renamed from: h, reason: collision with root package name */
    public long f30272h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30273i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30274m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f30275n = new boolean[8];

    static {
        new bw5.mk0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mk0 parseFrom(byte[] bArr) {
        return (bw5.mk0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mk0)) {
            return false;
        }
        bw5.mk0 mk0Var = (bw5.mk0) fVar;
        return n51.f.a(this.f30268d, mk0Var.f30268d) && n51.f.a(this.f30269e, mk0Var.f30269e) && n51.f.a(this.f30270f, mk0Var.f30270f) && n51.f.a(java.lang.Long.valueOf(this.f30271g), java.lang.Long.valueOf(mk0Var.f30271g)) && n51.f.a(java.lang.Long.valueOf(this.f30272h), java.lang.Long.valueOf(mk0Var.f30272h)) && n51.f.a(this.f30273i, mk0Var.f30273i) && n51.f.a(this.f30274m, mk0Var.f30274m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30275n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30268d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30269e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30270f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.h(4, this.f30271g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f30272h);
            }
            java.lang.String str4 = this.f30273i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f30274m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f30268d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f30269e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f30270f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f30271g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f30272h);
            }
            java.lang.String str9 = this.f30273i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f30274m;
            return (str10 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str10);
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
                this.f30268d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30269e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30270f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30271g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30272h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30273i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30274m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
