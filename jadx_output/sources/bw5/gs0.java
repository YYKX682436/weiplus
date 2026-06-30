package bw5;

/* loaded from: classes2.dex */
public class gs0 extends r45.js5 {

    /* renamed from: o, reason: collision with root package name */
    public static final bw5.gs0 f27986o = new bw5.gs0();

    /* renamed from: d, reason: collision with root package name */
    public int f27987d;

    /* renamed from: e, reason: collision with root package name */
    public int f27988e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27989f;

    /* renamed from: g, reason: collision with root package name */
    public int f27990g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27991h;

    /* renamed from: i, reason: collision with root package name */
    public int f27992i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27993m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27994n = new boolean[9];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gs0)) {
            return false;
        }
        bw5.gs0 gs0Var = (bw5.gs0) fVar;
        return n51.f.a(this.BaseResponse, gs0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f27987d), java.lang.Integer.valueOf(gs0Var.f27987d)) && n51.f.a(java.lang.Integer.valueOf(this.f27988e), java.lang.Integer.valueOf(gs0Var.f27988e)) && n51.f.a(this.f27989f, gs0Var.f27989f) && n51.f.a(java.lang.Integer.valueOf(this.f27990g), java.lang.Integer.valueOf(gs0Var.f27990g)) && n51.f.a(this.f27991h, gs0Var.f27991h) && n51.f.a(java.lang.Integer.valueOf(this.f27992i), java.lang.Integer.valueOf(gs0Var.f27992i)) && n51.f.a(java.lang.Boolean.valueOf(this.f27993m), java.lang.Boolean.valueOf(gs0Var.f27993m));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f27994n[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gs0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27994n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27987d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27988e);
            }
            java.lang.String str = this.f27989f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27990g);
            }
            com.tencent.mm.protobuf.g gVar = this.f27991h;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f27992i);
            }
            if (zArr[8]) {
                fVar.a(8, this.f27993m);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f27987d);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27988e);
            }
            java.lang.String str2 = this.f27989f;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f27990g);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27991h;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f27992i);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f27993m) : i18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    this.BaseResponse = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f27987d = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27988e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27989f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27990g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27991h = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27992i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27993m = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.gs0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f27994n[1] = true;
        return this;
    }
}
