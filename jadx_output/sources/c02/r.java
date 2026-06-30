package c02;

/* loaded from: classes4.dex */
public class r extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f37622d;

    /* renamed from: e, reason: collision with root package name */
    public c02.v f37623e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.r)) {
            return false;
        }
        c02.r rVar = (c02.r) fVar;
        return n51.f.a(this.BaseRequest, rVar.BaseRequest) && n51.f.a(this.f37622d, rVar.f37622d) && n51.f.a(this.f37623e, rVar.f37623e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f37622d;
            if (str != null) {
                fVar.j(2, str);
            }
            c02.v vVar = this.f37623e;
            if (vVar != null) {
                fVar.i(3, vVar.computeSize());
                this.f37623e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f37622d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            c02.v vVar2 = this.f37623e;
            return vVar2 != null ? i18 + b36.f.i(3, vVar2.computeSize()) : i18;
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
        c02.r rVar = (c02.r) objArr[1];
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
                rVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rVar.f37622d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            c02.v vVar3 = new c02.v();
            if (bArr2 != null && bArr2.length > 0) {
                vVar3.parseFrom(bArr2);
            }
            rVar.f37623e = vVar3;
        }
        return 0;
    }
}
