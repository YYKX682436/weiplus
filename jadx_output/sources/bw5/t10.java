package bw5;

/* loaded from: classes4.dex */
public class t10 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33212d;

    /* renamed from: e, reason: collision with root package name */
    public int f33213e;

    /* renamed from: f, reason: collision with root package name */
    public int f33214f;

    /* renamed from: g, reason: collision with root package name */
    public int f33215g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33216h = new boolean[6];

    static {
        new bw5.t10();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t10)) {
            return false;
        }
        bw5.t10 t10Var = (bw5.t10) fVar;
        return n51.f.a(this.BaseRequest, t10Var.BaseRequest) && n51.f.a(this.f33212d, t10Var.f33212d) && n51.f.a(java.lang.Integer.valueOf(this.f33213e), java.lang.Integer.valueOf(t10Var.f33213e)) && n51.f.a(java.lang.Integer.valueOf(this.f33214f), java.lang.Integer.valueOf(t10Var.f33214f)) && n51.f.a(java.lang.Integer.valueOf(this.f33215g), java.lang.Integer.valueOf(t10Var.f33215g));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f33216h[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33216h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f33212d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33213e);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33214f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33215g);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            java.lang.String str2 = this.f33212d;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33213e);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f33214f);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f33215g) : i18;
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
            this.f33212d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33213e = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f33214f = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f33215g = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.t10) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f33216h[1] = true;
        return this;
    }
}
