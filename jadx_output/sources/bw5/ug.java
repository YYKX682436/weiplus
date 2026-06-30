package bw5;

/* loaded from: classes7.dex */
public class ug extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.hz f33885d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33886e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33887f = new boolean[4];

    static {
        new bw5.ug();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ug)) {
            return false;
        }
        bw5.ug ugVar = (bw5.ug) fVar;
        return n51.f.a(this.BaseRequest, ugVar.BaseRequest) && n51.f.a(this.f33885d, ugVar.f33885d) && n51.f.a(this.f33886e, ugVar.f33886e);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f33887f[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ug();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33887f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            bw5.hz hzVar = this.f33885d;
            if (hzVar != null && zArr[2]) {
                fVar.i(2, hzVar.computeSize());
                this.f33885d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f33886e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            bw5.hz hzVar2 = this.f33885d;
            if (hzVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, hzVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f33886e;
            return (gVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.b(3, gVar2);
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
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f33886e = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.hz hzVar3 = new bw5.hz();
            if (bArr2 != null && bArr2.length > 0) {
                hzVar3.parseFrom(bArr2);
            }
            this.f33885d = hzVar3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ug) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f33887f[1] = true;
        return this;
    }
}
