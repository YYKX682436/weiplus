package bw5;

/* loaded from: classes8.dex */
public class le0 extends r45.mr5 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29765e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f29764d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f29766f = new boolean[4];

    static {
        new bw5.le0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.le0)) {
            return false;
        }
        bw5.le0 le0Var = (bw5.le0) fVar;
        return n51.f.a(this.BaseRequest, le0Var.BaseRequest) && n51.f.a(this.f29764d, le0Var.f29764d) && n51.f.a(this.f29765e, le0Var.f29765e);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f29766f[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.le0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29764d;
        boolean[] zArr = this.f29766f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f29765e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f29765e;
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
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f29765e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ke0 ke0Var = new bw5.ke0();
            if (bArr2 != null && bArr2.length > 0) {
                ke0Var.parseFrom(bArr2);
            }
            linkedList.add(ke0Var);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.le0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f29766f[1] = true;
        return this;
    }
}
