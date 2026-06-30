package bw5;

/* loaded from: classes4.dex */
public class we0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34671d;

    /* renamed from: e, reason: collision with root package name */
    public long f34672e;

    /* renamed from: f, reason: collision with root package name */
    public long f34673f;

    /* renamed from: g, reason: collision with root package name */
    public long f34674g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34675h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34676i = new boolean[7];

    static {
        new bw5.we0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.we0)) {
            return false;
        }
        bw5.we0 we0Var = (bw5.we0) fVar;
        return n51.f.a(this.BaseRequest, we0Var.BaseRequest) && n51.f.a(this.f34671d, we0Var.f34671d) && n51.f.a(java.lang.Long.valueOf(this.f34672e), java.lang.Long.valueOf(we0Var.f34672e)) && n51.f.a(java.lang.Long.valueOf(this.f34673f), java.lang.Long.valueOf(we0Var.f34673f)) && n51.f.a(java.lang.Long.valueOf(this.f34674g), java.lang.Long.valueOf(we0Var.f34674g)) && n51.f.a(this.f34675h, we0Var.f34675h);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f34676i[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.we0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34676i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f34671d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f34672e);
            }
            if (zArr[4]) {
                fVar.h(4, this.f34673f);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34674g);
            }
            java.lang.String str2 = this.f34675h;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            java.lang.String str3 = this.f34671d;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f34672e);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f34673f);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f34674g);
            }
            java.lang.String str4 = this.f34675h;
            return (str4 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str4);
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
                this.f34671d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34672e = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34673f = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34674g = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34675h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.we0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f34676i[1] = true;
        return this;
    }
}
