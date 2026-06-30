package bw5;

/* loaded from: classes2.dex */
public class qc0 extends r45.js5 {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.qc0 f32040h = new bw5.qc0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32041d;

    /* renamed from: e, reason: collision with root package name */
    public int f32042e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32043f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32044g = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qc0)) {
            return false;
        }
        bw5.qc0 qc0Var = (bw5.qc0) fVar;
        return n51.f.a(this.BaseResponse, qc0Var.BaseResponse) && n51.f.a(this.f32041d, qc0Var.f32041d) && n51.f.a(java.lang.Integer.valueOf(this.f32042e), java.lang.Integer.valueOf(qc0Var.f32042e)) && n51.f.a(this.f32043f, qc0Var.f32043f);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f32044g[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32044g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f32041d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32042e);
            }
            java.lang.String str2 = this.f32043f;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            java.lang.String str3 = this.f32041d;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f32042e);
            }
            java.lang.String str4 = this.f32043f;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f32041d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f32042e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f32043f = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
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

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.qc0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f32044g[1] = true;
        return this;
    }
}
