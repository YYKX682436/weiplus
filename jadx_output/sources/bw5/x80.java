package bw5;

/* loaded from: classes2.dex */
public class x80 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f35001d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35002e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35003f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35004g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35005h = new boolean[6];

    static {
        new bw5.x80();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x80)) {
            return false;
        }
        bw5.x80 x80Var = (bw5.x80) fVar;
        return n51.f.a(this.BaseRequest, x80Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f35001d), java.lang.Integer.valueOf(x80Var.f35001d)) && n51.f.a(this.f35002e, x80Var.f35002e) && n51.f.a(this.f35003f, x80Var.f35003f) && n51.f.a(this.f35004g, x80Var.f35004g);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f35005h[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.x80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35005h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35001d);
            }
            java.lang.String str = this.f35002e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f35003f;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f35004g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f35001d);
            }
            java.lang.String str3 = this.f35002e;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35003f;
            if (gVar2 != null && zArr[4]) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str4 = this.f35004g;
            return (str4 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str4);
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
            this.f35001d = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35002e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f35003f = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f35004g = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.x80) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f35005h[1] = true;
        return this;
    }
}
