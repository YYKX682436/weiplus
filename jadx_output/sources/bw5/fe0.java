package bw5;

/* loaded from: classes7.dex */
public class fe0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27245d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27246e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.zd0 f27247f;

    /* renamed from: g, reason: collision with root package name */
    public int f27248g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27249h = new boolean[6];

    static {
        new bw5.fe0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fe0)) {
            return false;
        }
        bw5.fe0 fe0Var = (bw5.fe0) fVar;
        return n51.f.a(this.BaseResponse, fe0Var.BaseResponse) && n51.f.a(this.f27245d, fe0Var.f27245d) && n51.f.a(this.f27246e, fe0Var.f27246e) && n51.f.a(this.f27247f, fe0Var.f27247f) && n51.f.a(java.lang.Integer.valueOf(this.f27248g), java.lang.Integer.valueOf(fe0Var.f27248g));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f27249h[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fe0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27249h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f27245d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f27246e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.zd0 zd0Var = this.f27247f;
            if (zd0Var != null && zArr[4]) {
                fVar.i(4, zd0Var.computeSize());
                this.f27247f.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27248g);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            java.lang.String str2 = this.f27245d;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27246e;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.zd0 zd0Var2 = this.f27247f;
            if (zd0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, zd0Var2.computeSize());
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f27248g) : i18;
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
            this.f27245d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27246e = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f27248g = aVar2.g(intValue);
            zArr[5] = true;
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
            this.f27247f = zd0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.fe0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f27249h[1] = true;
        return this;
    }
}
