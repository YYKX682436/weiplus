package bw5;

/* loaded from: classes9.dex */
public class z40 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f35814d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35815e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.y40 f35816f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35817g = new boolean[5];

    static {
        new bw5.z40();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z40)) {
            return false;
        }
        bw5.z40 z40Var = (bw5.z40) fVar;
        return n51.f.a(this.BaseRequest, z40Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f35814d), java.lang.Integer.valueOf(z40Var.f35814d)) && n51.f.a(this.f35815e, z40Var.f35815e) && n51.f.a(this.f35816f, z40Var.f35816f);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f35817g[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35817g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35814d);
            }
            com.tencent.mm.protobuf.g gVar = this.f35815e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.y40 y40Var = this.f35816f;
            if (y40Var != null && zArr[4]) {
                fVar.i(4, y40Var.computeSize());
                this.f35816f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f35814d);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35815e;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.y40 y40Var2 = this.f35816f;
            return (y40Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, y40Var2.computeSize());
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
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                this.BaseRequest = heVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35814d = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35815e = aVar2.d(intValue);
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
            bw5.y40 y40Var3 = new bw5.y40();
            if (bArr2 != null && bArr2.length > 0) {
                y40Var3.parseFrom(bArr2);
            }
            this.f35816f = y40Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.z40) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f35817g[1] = true;
        return this;
    }
}
