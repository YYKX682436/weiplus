package bw5;

/* loaded from: classes4.dex */
public class ie0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f28562d;

    /* renamed from: e, reason: collision with root package name */
    public int f28563e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28564f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28565g = new boolean[5];

    static {
        new bw5.ie0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ie0)) {
            return false;
        }
        bw5.ie0 ie0Var = (bw5.ie0) fVar;
        return n51.f.a(this.BaseRequest, ie0Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f28562d), java.lang.Long.valueOf(ie0Var.f28562d)) && n51.f.a(java.lang.Integer.valueOf(this.f28563e), java.lang.Integer.valueOf(ie0Var.f28563e)) && n51.f.a(this.f28564f, ie0Var.f28564f);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f28565g[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ie0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28565g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f28562d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28563e);
            }
            java.lang.String str = this.f28564f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f28562d);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f28563e);
            }
            java.lang.String str2 = this.f28564f;
            return (str2 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str2);
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
                this.f28562d = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f28563e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f28564f = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
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

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ie0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f28565g[1] = true;
        return this;
    }
}
