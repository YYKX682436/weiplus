package bw5;

/* loaded from: classes2.dex */
public class yn0 extends r45.js5 {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.yn0 f35585g = new bw5.yn0();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35587e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f35586d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35588f = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yn0)) {
            return false;
        }
        bw5.yn0 yn0Var = (bw5.yn0) fVar;
        return n51.f.a(this.BaseResponse, yn0Var.BaseResponse) && n51.f.a(this.f35586d, yn0Var.f35586d) && n51.f.a(this.f35587e, yn0Var.f35587e);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f35588f[1] ? this.BaseResponse : new r45.ie();
    }

    public java.lang.String getText() {
        return this.f35588f[3] ? this.f35587e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35586d;
        boolean[] zArr = this.f35588f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            java.lang.String str = this.f35587e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList);
            java.lang.String str2 = this.f35587e;
            return (str2 == null || !zArr[3]) ? g17 : g17 + b36.f.j(3, str2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                linkedList.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f35587e = aVar2.k(intValue);
            zArr[3] = true;
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
        return (bw5.yn0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f35588f[1] = true;
        return this;
    }
}
