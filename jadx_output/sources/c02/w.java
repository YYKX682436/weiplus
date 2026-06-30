package c02;

/* loaded from: classes4.dex */
public class w extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f37636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f37637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f37638f;

    /* renamed from: g, reason: collision with root package name */
    public int f37639g;

    /* renamed from: h, reason: collision with root package name */
    public int f37640h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.w)) {
            return false;
        }
        c02.w wVar = (c02.w) fVar;
        return n51.f.a(this.BaseRequest, wVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f37636d), java.lang.Integer.valueOf(wVar.f37636d)) && n51.f.a(this.f37637e, wVar.f37637e) && n51.f.a(this.f37638f, wVar.f37638f) && n51.f.a(java.lang.Integer.valueOf(this.f37639g), java.lang.Integer.valueOf(wVar.f37639g)) && n51.f.a(java.lang.Integer.valueOf(this.f37640h), java.lang.Integer.valueOf(wVar.f37640h));
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
            fVar.e(2, this.f37636d);
            java.lang.String str = this.f37637e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f37638f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f37639g);
            fVar.e(6, this.f37640h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f37636d);
            java.lang.String str3 = this.f37637e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f37638f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f37639g) + b36.f.e(6, this.f37640h);
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
        c02.w wVar = (c02.w) objArr[1];
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
                    wVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wVar.f37636d = aVar2.g(intValue);
                return 0;
            case 3:
                wVar.f37637e = aVar2.k(intValue);
                return 0;
            case 4:
                wVar.f37638f = aVar2.k(intValue);
                return 0;
            case 5:
                wVar.f37639g = aVar2.g(intValue);
                return 0;
            case 6:
                wVar.f37640h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
