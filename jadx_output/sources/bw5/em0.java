package bw5;

/* loaded from: classes2.dex */
public class em0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f26954d;

    /* renamed from: e, reason: collision with root package name */
    public long f26955e;

    /* renamed from: f, reason: collision with root package name */
    public long f26956f;

    /* renamed from: g, reason: collision with root package name */
    public int f26957g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f26958h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f26959i = new boolean[7];

    static {
        new bw5.em0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.em0)) {
            return false;
        }
        bw5.em0 em0Var = (bw5.em0) fVar;
        return n51.f.a(this.BaseRequest, em0Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f26954d), java.lang.Long.valueOf(em0Var.f26954d)) && n51.f.a(java.lang.Long.valueOf(this.f26955e), java.lang.Long.valueOf(em0Var.f26955e)) && n51.f.a(java.lang.Long.valueOf(this.f26956f), java.lang.Long.valueOf(em0Var.f26956f)) && n51.f.a(java.lang.Integer.valueOf(this.f26957g), java.lang.Integer.valueOf(em0Var.f26957g)) && n51.f.a(this.f26958h, em0Var.f26958h);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f26959i[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.em0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26958h;
        int i18 = 0;
        boolean[] zArr = this.f26959i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f26954d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f26955e);
            }
            if (zArr[4]) {
                fVar.h(4, this.f26956f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26957g);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f26954d);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f26955e);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f26956f);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f26957g);
            }
            return i18 + b36.f.g(6, 8, linkedList);
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
                this.f26954d = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26955e = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26956f = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26957g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.rm0 rm0Var = new bw5.rm0();
                    if (bArr2 != null && bArr2.length > 0) {
                        rm0Var.parseFrom(bArr2);
                    }
                    linkedList.add(rm0Var);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.em0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f26959i[1] = true;
        return this;
    }
}
