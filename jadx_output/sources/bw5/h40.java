package bw5;

/* loaded from: classes2.dex */
public class h40 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28074d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28075e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.m40 f28076f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28077g = new boolean[5];

    static {
        new bw5.h40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h40 parseFrom(byte[] bArr) {
        return (bw5.h40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h40)) {
            return false;
        }
        bw5.h40 h40Var = (bw5.h40) fVar;
        return n51.f.a(this.BaseResponse, h40Var.BaseResponse) && n51.f.a(this.f28074d, h40Var.f28074d) && n51.f.a(this.f28075e, h40Var.f28075e) && n51.f.a(this.f28076f, h40Var.f28076f);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f28077g[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28077g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f28074d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f28075e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.m40 m40Var = this.f28076f;
            if (m40Var != null && zArr[4]) {
                fVar.i(4, m40Var.computeSize());
                this.f28076f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            java.lang.String str3 = this.f28074d;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f28075e;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.m40 m40Var2 = this.f28076f;
            return (m40Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, m40Var2.computeSize());
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
            this.f28074d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28075e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.m40 m40Var3 = new bw5.m40();
            if (bArr2 != null && bArr2.length > 0) {
                m40Var3.parseFrom(bArr2);
            }
            this.f28076f = m40Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f28077g[1] = true;
        return this;
    }
}
