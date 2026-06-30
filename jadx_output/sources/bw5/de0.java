package bw5;

/* loaded from: classes7.dex */
public class de0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26465d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26466e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.zd0 f26467f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26468g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26469h = new boolean[7];

    static {
        new bw5.de0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.de0)) {
            return false;
        }
        bw5.de0 de0Var = (bw5.de0) fVar;
        return n51.f.a(this.BaseResponse, de0Var.BaseResponse) && n51.f.a(this.f26465d, de0Var.f26465d) && n51.f.a(this.f26466e, de0Var.f26466e) && n51.f.a(this.f26467f, de0Var.f26467f) && n51.f.a(this.f26468g, de0Var.f26468g);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f26469h[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.de0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26469h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f26465d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f26466e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.zd0 zd0Var = this.f26467f;
            if (zd0Var != null && zArr[4]) {
                fVar.i(4, zd0Var.computeSize());
                this.f26467f.writeFields(fVar);
            }
            java.lang.String str2 = this.f26468g;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            java.lang.String str3 = this.f26465d;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26466e;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.zd0 zd0Var2 = this.f26467f;
            if (zd0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, zd0Var2.computeSize());
            }
            java.lang.String str4 = this.f26468g;
            return (str4 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str4);
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
        if (intValue == 1) {
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
        }
        if (intValue == 2) {
            this.f26465d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26466e = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 6) {
                return -1;
            }
            this.f26468g = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.zd0 zd0Var3 = new bw5.zd0();
            if (bArr2 != null && bArr2.length > 0) {
                zd0Var3.parseFrom(bArr2);
            }
            this.f26467f = zd0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.de0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f26469h[1] = true;
        return this;
    }
}
