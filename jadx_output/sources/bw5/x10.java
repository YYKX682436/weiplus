package bw5;

/* loaded from: classes2.dex */
public class x10 extends r45.js5 {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.x10 f34907h = new bw5.x10();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34909e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f34910f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f34908d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34911g = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x10)) {
            return false;
        }
        bw5.x10 x10Var = (bw5.x10) fVar;
        return n51.f.a(this.BaseResponse, x10Var.BaseResponse) && n51.f.a(this.f34908d, x10Var.f34908d) && n51.f.a(this.f34909e, x10Var.f34909e) && n51.f.a(this.f34910f, x10Var.f34910f);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f34911g[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.x10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34908d;
        boolean[] zArr = this.f34911g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f34909e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.x7 x7Var = this.f34910f;
            if (x7Var != null && zArr[4]) {
                fVar.i(4, x7Var.computeSize());
                this.f34910f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f34909e;
            if (str2 != null && zArr[3]) {
                g17 += b36.f.j(3, str2);
            }
            bw5.x7 x7Var2 = this.f34910f;
            return (x7Var2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, x7Var2.computeSize());
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
                bw5.w10 w10Var = new bw5.w10();
                if (bArr2 != null && bArr2.length > 0) {
                    w10Var.parseFrom(bArr2);
                }
                linkedList.add(w10Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34909e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr3 != null && bArr3.length > 0) {
                x7Var3.parseFrom(bArr3);
            }
            this.f34910f = x7Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.x10) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f34911g[1] = true;
        return this;
    }
}
