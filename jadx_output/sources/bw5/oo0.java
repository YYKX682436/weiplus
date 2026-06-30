package bw5;

/* loaded from: classes2.dex */
public class oo0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f31174d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f31175e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31176f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31177g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31178h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.en0 f31179i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f31180m = new boolean[8];

    static {
        new bw5.oo0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oo0)) {
            return false;
        }
        bw5.oo0 oo0Var = (bw5.oo0) fVar;
        return n51.f.a(this.BaseRequest, oo0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f31174d), java.lang.Integer.valueOf(oo0Var.f31174d)) && n51.f.a(this.f31175e, oo0Var.f31175e) && n51.f.a(this.f31176f, oo0Var.f31176f) && n51.f.a(this.f31177g, oo0Var.f31177g) && n51.f.a(this.f31178h, oo0Var.f31178h) && n51.f.a(this.f31179i, oo0Var.f31179i);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f31180m[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oo0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31180m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31174d);
            }
            com.tencent.mm.protobuf.g gVar = this.f31175e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f31176f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f31177g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f31178h;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            bw5.en0 en0Var = this.f31179i;
            if (en0Var != null && zArr[7]) {
                fVar.i(7, en0Var.computeSize());
                this.f31179i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f31174d);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f31175e;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f31176f;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f31177g;
            if (str5 != null && zArr[5]) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f31178h;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            bw5.en0 en0Var2 = this.f31179i;
            return (en0Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, en0Var2.computeSize());
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
                this.f31174d = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31175e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31176f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31177g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31178h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.en0 en0Var3 = new bw5.en0();
                    if (bArr2 != null && bArr2.length > 0) {
                        en0Var3.parseFrom(bArr2);
                    }
                    this.f31179i = en0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.oo0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f31180m[1] = true;
        return this;
    }
}
