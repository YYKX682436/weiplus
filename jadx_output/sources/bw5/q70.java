package bw5;

/* loaded from: classes4.dex */
public class q70 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lc0 f31988d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.h90 f31989e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f31990f = new boolean[4];

    static {
        new bw5.q70();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q70)) {
            return false;
        }
        bw5.q70 q70Var = (bw5.q70) fVar;
        return n51.f.a(this.BaseResponse, q70Var.BaseResponse) && n51.f.a(this.f31988d, q70Var.f31988d) && n51.f.a(this.f31989e, q70Var.f31989e);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f31990f[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31990f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            bw5.lc0 lc0Var = this.f31988d;
            if (lc0Var != null && zArr[2]) {
                fVar.i(2, lc0Var.computeSize());
                this.f31988d.writeFields(fVar);
            }
            bw5.h90 h90Var = this.f31989e;
            if (h90Var != null && zArr[3]) {
                fVar.i(3, h90Var.computeSize());
                this.f31989e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            bw5.lc0 lc0Var2 = this.f31988d;
            if (lc0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, lc0Var2.computeSize());
            }
            bw5.h90 h90Var2 = this.f31989e;
            return (h90Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, h90Var2.computeSize());
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
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.lc0 lc0Var3 = new bw5.lc0();
                if (bArr2 != null && bArr2.length > 0) {
                    lc0Var3.parseFrom(bArr2);
                }
                this.f31988d = lc0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.h90 h90Var3 = new bw5.h90();
            if (bArr3 != null && bArr3.length > 0) {
                h90Var3.parseFrom(bArr3);
            }
            this.f31989e = h90Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.q70) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f31990f[1] = true;
        return this;
    }
}
