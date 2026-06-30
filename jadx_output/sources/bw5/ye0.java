package bw5;

/* loaded from: classes9.dex */
public class ye0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35456d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35457e;

    /* renamed from: f, reason: collision with root package name */
    public long f35458f;

    /* renamed from: g, reason: collision with root package name */
    public long f35459g;

    /* renamed from: h, reason: collision with root package name */
    public int f35460h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35461i = new boolean[7];

    static {
        new bw5.ye0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ye0)) {
            return false;
        }
        bw5.ye0 ye0Var = (bw5.ye0) fVar;
        return n51.f.a(this.BaseRequest, ye0Var.BaseRequest) && n51.f.a(this.f35456d, ye0Var.f35456d) && n51.f.a(this.f35457e, ye0Var.f35457e) && n51.f.a(java.lang.Long.valueOf(this.f35458f), java.lang.Long.valueOf(ye0Var.f35458f)) && n51.f.a(java.lang.Long.valueOf(this.f35459g), java.lang.Long.valueOf(ye0Var.f35459g)) && n51.f.a(java.lang.Integer.valueOf(this.f35460h), java.lang.Integer.valueOf(ye0Var.f35460h));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f35461i[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ye0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35461i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f35456d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f35457e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f35458f);
            }
            if (zArr[5]) {
                fVar.h(5, this.f35459g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35460h);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            java.lang.String str3 = this.f35456d;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f35457e;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f35458f);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f35459g);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f35460h) : i18;
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
        switch (intValue) {
            case 1:
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
            case 2:
                this.f35456d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35457e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35458f = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35459g = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35460h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ye0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f35461i[1] = true;
        return this;
    }
}
