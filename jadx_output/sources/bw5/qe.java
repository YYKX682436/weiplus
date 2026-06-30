package bw5;

/* loaded from: classes2.dex */
public class qe extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sc f32056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32057e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f32058f = new boolean[4];

    static {
        new bw5.qe();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qe)) {
            return false;
        }
        bw5.qe qeVar = (bw5.qe) fVar;
        return n51.f.a(this.BaseRequest, qeVar.BaseRequest) && n51.f.a(this.f32056d, qeVar.f32056d) && n51.f.a(this.f32057e, qeVar.f32057e);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f32058f[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qe();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32058f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            bw5.sc scVar = this.f32056d;
            if (scVar != null && zArr[2]) {
                fVar.i(2, scVar.computeSize());
                this.f32056d.writeFields(fVar);
            }
            java.lang.String str = this.f32057e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            bw5.sc scVar2 = this.f32056d;
            if (scVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, scVar2.computeSize());
            }
            java.lang.String str2 = this.f32057e;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
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
            this.f32057e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.sc scVar3 = new bw5.sc();
            if (bArr2 != null && bArr2.length > 0) {
                scVar3.parseFrom(bArr2);
            }
            this.f32056d = scVar3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.qe) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f32058f[1] = true;
        return this;
    }
}
