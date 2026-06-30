package bw5;

/* loaded from: classes9.dex */
public class df0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26476e;

    /* renamed from: f, reason: collision with root package name */
    public int f26477f;

    /* renamed from: g, reason: collision with root package name */
    public int f26478g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26479h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26480i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f26481m = new boolean[8];

    static {
        new bw5.df0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.df0)) {
            return false;
        }
        bw5.df0 df0Var = (bw5.df0) fVar;
        return n51.f.a(this.BaseResponse, df0Var.BaseResponse) && n51.f.a(this.f26475d, df0Var.f26475d) && n51.f.a(this.f26476e, df0Var.f26476e) && n51.f.a(java.lang.Integer.valueOf(this.f26477f), java.lang.Integer.valueOf(df0Var.f26477f)) && n51.f.a(java.lang.Integer.valueOf(this.f26478g), java.lang.Integer.valueOf(df0Var.f26478g)) && n51.f.a(this.f26479h, df0Var.f26479h) && n51.f.a(this.f26480i, df0Var.f26480i);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f26481m[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.df0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26481m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f26475d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f26476e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f26477f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26478g);
            }
            java.lang.String str3 = this.f26479h;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f26480i;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            java.lang.String str5 = this.f26475d;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f26476e;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f26477f);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f26478g);
            }
            java.lang.String str7 = this.f26479h;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f26480i;
            return (str8 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str8);
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
                this.f26475d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26476e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26477f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26478g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26479h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26480i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.df0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f26481m[1] = true;
        return this;
    }
}
