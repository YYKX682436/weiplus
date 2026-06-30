package c02;

/* loaded from: classes4.dex */
public class q extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public c02.e f37618d;

    /* renamed from: e, reason: collision with root package name */
    public int f37619e;

    /* renamed from: f, reason: collision with root package name */
    public int f37620f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f37621g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.q)) {
            return false;
        }
        c02.q qVar = (c02.q) fVar;
        return n51.f.a(this.BaseResponse, qVar.BaseResponse) && n51.f.a(this.f37618d, qVar.f37618d) && n51.f.a(java.lang.Integer.valueOf(this.f37619e), java.lang.Integer.valueOf(qVar.f37619e)) && n51.f.a(java.lang.Integer.valueOf(this.f37620f), java.lang.Integer.valueOf(qVar.f37620f)) && n51.f.a(this.f37621g, qVar.f37621g);
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
            c02.e eVar = this.f37618d;
            if (eVar != null) {
                fVar.i(2, eVar.computeSize());
                this.f37618d.writeFields(fVar);
            }
            fVar.e(3, this.f37619e);
            fVar.e(4, this.f37620f);
            java.lang.String str = this.f37621g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            c02.e eVar2 = this.f37618d;
            if (eVar2 != null) {
                i18 += b36.f.i(2, eVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f37619e) + b36.f.e(4, this.f37620f);
            java.lang.String str2 = this.f37621g;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        c02.q qVar = (c02.q) objArr[1];
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
                qVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                qVar.f37619e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                qVar.f37620f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            qVar.f37621g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            c02.e eVar3 = new c02.e();
            if (bArr2 != null && bArr2.length > 0) {
                eVar3.parseFrom(bArr2);
            }
            qVar.f37618d = eVar3;
        }
        return 0;
    }
}
