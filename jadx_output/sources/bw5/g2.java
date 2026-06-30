package bw5;

/* loaded from: classes8.dex */
public class g2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.xa0 f27641d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f27642e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27643f = new boolean[4];

    static {
        new bw5.g2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g2 parseFrom(byte[] bArr) {
        return (bw5.g2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g2)) {
            return false;
        }
        bw5.g2 g2Var = (bw5.g2) fVar;
        return n51.f.a(this.BaseResponse, g2Var.BaseResponse) && n51.f.a(this.f27641d, g2Var.f27641d) && n51.f.a(this.f27642e, g2Var.f27642e);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f27643f[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27642e;
        boolean[] zArr = this.f27643f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            bw5.xa0 xa0Var = this.f27641d;
            if (xa0Var != null && zArr[2]) {
                fVar.i(2, xa0Var.computeSize());
                this.f27641d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            bw5.xa0 xa0Var2 = this.f27641d;
            if (xa0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, xa0Var2.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                bw5.xa0 xa0Var3 = new bw5.xa0();
                if (bArr2 != null && bArr2.length > 0) {
                    xa0Var3.parseFrom(bArr2);
                }
                this.f27641d = xa0Var3;
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
            bw5.oi0 oi0Var = new bw5.oi0();
            if (bArr3 != null && bArr3.length > 0) {
                oi0Var.parseFrom(bArr3);
            }
            linkedList.add(oi0Var);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f27643f[1] = true;
        return this;
    }
}
