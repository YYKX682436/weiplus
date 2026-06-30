package c02;

/* loaded from: classes4.dex */
public class p extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f37615d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f37616e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f37617f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.p)) {
            return false;
        }
        c02.p pVar = (c02.p) fVar;
        return n51.f.a(this.BaseRequest, pVar.BaseRequest) && n51.f.a(this.f37615d, pVar.f37615d) && n51.f.a(this.f37616e, pVar.f37616e) && n51.f.a(this.f37617f, pVar.f37617f);
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
            java.lang.String str = this.f37615d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f37616e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f37617f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f37615d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f37616e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f37617f;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        c02.p pVar = (c02.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                pVar.f37615d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                pVar.f37616e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            pVar.f37617f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            pVar.BaseRequest = heVar3;
        }
        return 0;
    }
}
