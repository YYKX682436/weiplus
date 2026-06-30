package c02;

/* loaded from: classes2.dex */
public class s extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public c02.t f37624d;

    /* renamed from: e, reason: collision with root package name */
    public c02.k f37625e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.s)) {
            return false;
        }
        c02.s sVar = (c02.s) fVar;
        return n51.f.a(this.BaseResponse, sVar.BaseResponse) && n51.f.a(this.f37624d, sVar.f37624d) && n51.f.a(this.f37625e, sVar.f37625e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            c02.t tVar = this.f37624d;
            if (tVar != null) {
                fVar.i(2, tVar.computeSize());
                this.f37624d.writeFields(fVar);
            }
            c02.k kVar = this.f37625e;
            if (kVar != null) {
                fVar.i(3, kVar.computeSize());
                this.f37625e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            c02.t tVar2 = this.f37624d;
            if (tVar2 != null) {
                i18 += b36.f.i(2, tVar2.computeSize());
            }
            c02.k kVar2 = this.f37625e;
            return kVar2 != null ? i18 + b36.f.i(3, kVar2.computeSize()) : i18;
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
        c02.s sVar = (c02.s) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                sVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                c02.t tVar3 = new c02.t();
                if (bArr2 != null && bArr2.length > 0) {
                    tVar3.parseFrom(bArr2);
                }
                sVar.f37624d = tVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            c02.k kVar3 = new c02.k();
            if (bArr3 != null && bArr3.length > 0) {
                kVar3.parseFrom(bArr3);
            }
            sVar.f37625e = kVar3;
        }
        return 0;
    }
}
