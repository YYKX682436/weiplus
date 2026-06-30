package bw5;

/* loaded from: classes2.dex */
public class u6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33742d;

    /* renamed from: e, reason: collision with root package name */
    public int f33743e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33744f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33745g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33746h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f33747i = new boolean[7];

    static {
        new bw5.u6();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u6)) {
            return false;
        }
        bw5.u6 u6Var = (bw5.u6) fVar;
        return n51.f.a(this.BaseRequest, u6Var.BaseRequest) && n51.f.a(this.f33742d, u6Var.f33742d) && n51.f.a(java.lang.Integer.valueOf(this.f33743e), java.lang.Integer.valueOf(u6Var.f33743e)) && n51.f.a(this.f33744f, u6Var.f33744f) && n51.f.a(this.f33745g, u6Var.f33745g) && n51.f.a(this.f33746h, u6Var.f33746h);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f33747i[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33747i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f33742d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33743e);
            }
            com.tencent.mm.protobuf.g gVar = this.f33744f;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f33745g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f33746h;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            java.lang.String str4 = this.f33742d;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33743e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f33744f;
            if (gVar2 != null && zArr[4]) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str5 = this.f33745g;
            if (str5 != null && zArr[5]) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f33746h;
            return (str6 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str6);
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
                this.f33742d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33743e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33744f = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33745g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33746h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.u6) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f33747i[1] = true;
        return this;
    }
}
