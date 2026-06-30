package bw5;

/* loaded from: classes2.dex */
public class v10 extends r45.js5 {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.v10 f34115h = new bw5.v10();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34116d;

    /* renamed from: f, reason: collision with root package name */
    public int f34118f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34117e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34119g = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v10)) {
            return false;
        }
        bw5.v10 v10Var = (bw5.v10) fVar;
        return n51.f.a(this.BaseResponse, v10Var.BaseResponse) && n51.f.a(this.f34116d, v10Var.f34116d) && n51.f.a(this.f34117e, v10Var.f34117e) && n51.f.a(java.lang.Integer.valueOf(this.f34118f), java.lang.Integer.valueOf(v10Var.f34118f));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f34119g[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34117e;
        boolean[] zArr = this.f34119g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f34116d;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f34118f);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34116d;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            return zArr[4] ? g17 + b36.f.e(4, this.f34118f) : g17;
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
            this.f34116d = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f34118f = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.b20 b20Var = new bw5.b20();
            if (bArr2 != null && bArr2.length > 0) {
                b20Var.parseFrom(bArr2);
            }
            linkedList.add(b20Var);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.v10) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f34119g[1] = true;
        return this;
    }
}
