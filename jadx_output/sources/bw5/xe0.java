package bw5;

/* loaded from: classes9.dex */
public class xe0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35074d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35075e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35076f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35077g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35078h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35079i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35080m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f35081n = new boolean[9];

    static {
        new bw5.xe0();
    }

    public java.lang.String b() {
        return this.f35081n[8] ? this.f35080m : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xe0)) {
            return false;
        }
        bw5.xe0 xe0Var = (bw5.xe0) fVar;
        return n51.f.a(this.BaseResponse, xe0Var.BaseResponse) && n51.f.a(this.f35074d, xe0Var.f35074d) && n51.f.a(this.f35075e, xe0Var.f35075e) && n51.f.a(this.f35076f, xe0Var.f35076f) && n51.f.a(this.f35077g, xe0Var.f35077g) && n51.f.a(this.f35078h, xe0Var.f35078h) && n51.f.a(this.f35079i, xe0Var.f35079i) && n51.f.a(this.f35080m, xe0Var.f35080m);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f35081n[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xe0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35081n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f35074d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f35075e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f35076f;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f35077g;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f35078h;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f35079i;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f35080m;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            java.lang.String str8 = this.f35074d;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f35075e;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f35076f;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f35077g;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f35078h;
            if (str12 != null && zArr[6]) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f35079i;
            if (str13 != null && zArr[7]) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f35080m;
            return (str14 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str14);
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
                this.f35074d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35075e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35076f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35077g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35078h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35079i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35080m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.xe0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f35081n[1] = true;
        return this;
    }
}
