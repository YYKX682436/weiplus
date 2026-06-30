package bw5;

/* loaded from: classes4.dex */
public class y80 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35399d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.r70 f35400e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35401f;

    /* renamed from: g, reason: collision with root package name */
    public long f35402g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35403h = new boolean[6];

    static {
        new bw5.y80();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y80)) {
            return false;
        }
        bw5.y80 y80Var = (bw5.y80) fVar;
        return n51.f.a(this.BaseResponse, y80Var.BaseResponse) && n51.f.a(this.f35399d, y80Var.f35399d) && n51.f.a(this.f35400e, y80Var.f35400e) && n51.f.a(this.f35401f, y80Var.f35401f) && n51.f.a(java.lang.Long.valueOf(this.f35402g), java.lang.Long.valueOf(y80Var.f35402g));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f35403h[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35403h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f35399d;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            bw5.r70 r70Var = this.f35400e;
            if (r70Var != null && zArr[3]) {
                fVar.i(3, r70Var.computeSize());
                this.f35400e.writeFields(fVar);
            }
            java.lang.String str = this.f35401f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.h(5, this.f35402g);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35399d;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            bw5.r70 r70Var2 = this.f35400e;
            if (r70Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, r70Var2.computeSize());
            }
            java.lang.String str2 = this.f35401f;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            return zArr[5] ? i18 + b36.f.h(5, this.f35402g) : i18;
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
            this.f35399d = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f35401f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f35402g = aVar2.i(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.r70 r70Var3 = new bw5.r70();
            if (bArr2 != null && bArr2.length > 0) {
                r70Var3.parseFrom(bArr2);
            }
            this.f35400e = r70Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.y80) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f35403h[1] = true;
        return this;
    }
}
