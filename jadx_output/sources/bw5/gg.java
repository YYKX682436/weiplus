package bw5;

/* loaded from: classes2.dex */
public class gg extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sc f27834d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27835e;

    /* renamed from: f, reason: collision with root package name */
    public float f27836f;

    /* renamed from: g, reason: collision with root package name */
    public float f27837g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27838h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f27839i = new boolean[7];

    static {
        new bw5.gg();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gg)) {
            return false;
        }
        bw5.gg ggVar = (bw5.gg) fVar;
        return n51.f.a(this.BaseRequest, ggVar.BaseRequest) && n51.f.a(this.f27834d, ggVar.f27834d) && n51.f.a(this.f27835e, ggVar.f27835e) && n51.f.a(java.lang.Float.valueOf(this.f27836f), java.lang.Float.valueOf(ggVar.f27836f)) && n51.f.a(java.lang.Float.valueOf(this.f27837g), java.lang.Float.valueOf(ggVar.f27837g)) && n51.f.a(this.f27838h, ggVar.f27838h);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f27839i[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27839i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            bw5.sc scVar = this.f27834d;
            if (scVar != null && zArr[2]) {
                fVar.i(2, scVar.computeSize());
                this.f27834d.writeFields(fVar);
            }
            java.lang.String str = this.f27835e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.d(4, this.f27836f);
            }
            if (zArr[5]) {
                fVar.d(5, this.f27837g);
            }
            com.tencent.mm.protobuf.g gVar = this.f27838h;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            bw5.sc scVar2 = this.f27834d;
            if (scVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, scVar2.computeSize());
            }
            java.lang.String str2 = this.f27835e;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f27836f);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f27837g);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27838h;
            return (gVar2 == null || !zArr[6]) ? i18 : i18 + b36.f.b(6, gVar2);
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
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sc scVar3 = new bw5.sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.parseFrom(bArr2);
                    }
                    this.f27834d = scVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f27835e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27836f = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27837g = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27838h = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.gg) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f27839i[1] = true;
        return this;
    }
}
