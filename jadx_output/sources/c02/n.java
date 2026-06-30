package c02;

/* loaded from: classes2.dex */
public class n extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f37609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f37610e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f37611f;

    /* renamed from: g, reason: collision with root package name */
    public int f37612g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.n)) {
            return false;
        }
        c02.n nVar = (c02.n) fVar;
        return n51.f.a(this.BaseRequest, nVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f37609d), java.lang.Integer.valueOf(nVar.f37609d)) && n51.f.a(this.f37610e, nVar.f37610e) && n51.f.a(this.f37611f, nVar.f37611f) && n51.f.a(java.lang.Integer.valueOf(this.f37612g), java.lang.Integer.valueOf(nVar.f37612g));
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
            fVar.e(2, this.f37609d);
            java.lang.String str = this.f37610e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f37611f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f37612g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f37609d);
            java.lang.String str3 = this.f37610e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f37611f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f37612g);
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
        c02.n nVar = (c02.n) objArr[1];
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
                nVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            nVar.f37609d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            nVar.f37610e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            nVar.f37611f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        nVar.f37612g = aVar2.g(intValue);
        return 0;
    }
}
