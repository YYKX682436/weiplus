package bw5;

/* loaded from: classes11.dex */
public class ep0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26985d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26986e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26987f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26988g;

    /* renamed from: h, reason: collision with root package name */
    public int f26989h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26990i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26991m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.hr0 f26992n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f26993o = new boolean[9];

    static {
        new bw5.ep0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ep0 parseFrom(byte[] bArr) {
        return (bw5.ep0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ep0)) {
            return false;
        }
        bw5.ep0 ep0Var = (bw5.ep0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26985d), java.lang.Integer.valueOf(ep0Var.f26985d)) && n51.f.a(this.f26986e, ep0Var.f26986e) && n51.f.a(this.f26987f, ep0Var.f26987f) && n51.f.a(this.f26988g, ep0Var.f26988g) && n51.f.a(java.lang.Integer.valueOf(this.f26989h), java.lang.Integer.valueOf(ep0Var.f26989h)) && n51.f.a(this.f26990i, ep0Var.f26990i) && n51.f.a(this.f26991m, ep0Var.f26991m) && n51.f.a(this.f26992n, ep0Var.f26992n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ep0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26993o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26985d);
            }
            com.tencent.mm.protobuf.g gVar = this.f26986e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f26987f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f26988g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26989h);
            }
            java.lang.String str3 = this.f26990i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f26991m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.hr0 hr0Var = this.f26992n;
            if (hr0Var != null && zArr[8]) {
                fVar.e(8, hr0Var.f28338d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26985d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f26986e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str5 = this.f26987f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f26988g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f26989h);
            }
            java.lang.String str7 = this.f26990i;
            if (str7 != null && zArr[6]) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f26991m;
            if (str8 != null && zArr[7]) {
                e17 += b36.f.j(7, str8);
            }
            bw5.hr0 hr0Var2 = this.f26992n;
            return (hr0Var2 == null || !zArr[8]) ? e17 : e17 + b36.f.e(8, hr0Var2.f28338d);
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
                this.f26985d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26986e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26987f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26988g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26989h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26990i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26991m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                int g17 = aVar2.g(intValue);
                this.f26992n = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.hr0.TingWCCoinConsumeModeShowPanel : bw5.hr0.TingWCCoinConsumeModeDirect : bw5.hr0.TingWCCoinConsumeModeUnknown;
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
