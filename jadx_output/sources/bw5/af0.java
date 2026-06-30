package bw5;

/* loaded from: classes8.dex */
public class af0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f25176d;

    /* renamed from: e, reason: collision with root package name */
    public int f25177e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25178f;

    /* renamed from: g, reason: collision with root package name */
    public int f25179g;

    /* renamed from: h, reason: collision with root package name */
    public int f25180h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25181i = new boolean[7];

    static {
        new bw5.af0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.af0)) {
            return false;
        }
        bw5.af0 af0Var = (bw5.af0) fVar;
        return n51.f.a(this.BaseRequest, af0Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f25176d), java.lang.Long.valueOf(af0Var.f25176d)) && n51.f.a(java.lang.Integer.valueOf(this.f25177e), java.lang.Integer.valueOf(af0Var.f25177e)) && n51.f.a(this.f25178f, af0Var.f25178f) && n51.f.a(java.lang.Integer.valueOf(this.f25179g), java.lang.Integer.valueOf(af0Var.f25179g)) && n51.f.a(java.lang.Integer.valueOf(this.f25180h), java.lang.Integer.valueOf(af0Var.f25180h));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f25181i[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.af0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25181i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25176d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25177e);
            }
            java.lang.String str = this.f25178f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25179g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25180h);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f25176d);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25177e);
            }
            java.lang.String str2 = this.f25178f;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f25179g);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f25180h) : i18;
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
                this.f25176d = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25177e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25178f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25179g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25180h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.af0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f25181i[1] = true;
        return this;
    }
}
