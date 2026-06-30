package bo1;

/* loaded from: classes2.dex */
public class b extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f22978d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f22979e;

    /* renamed from: f, reason: collision with root package name */
    public int f22980f;

    /* renamed from: g, reason: collision with root package name */
    public int f22981g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f22982h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.b)) {
            return false;
        }
        bo1.b bVar = (bo1.b) fVar;
        return n51.f.a(this.BaseResponse, bVar.BaseResponse) && n51.f.a(this.f22978d, bVar.f22978d) && n51.f.a(this.f22979e, bVar.f22979e) && n51.f.a(java.lang.Integer.valueOf(this.f22980f), java.lang.Integer.valueOf(bVar.f22980f)) && n51.f.a(java.lang.Integer.valueOf(this.f22981g), java.lang.Integer.valueOf(bVar.f22981g)) && n51.f.a(this.f22982h, bVar.f22982h);
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
            java.lang.String str = this.f22978d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f22979e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f22980f);
            fVar.e(5, this.f22981g);
            java.lang.String str3 = this.f22982h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f22978d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f22979e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f22980f) + b36.f.e(5, this.f22981g);
            java.lang.String str6 = this.f22982h;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        bo1.b bVar = (bo1.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    bVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                bVar.f22978d = aVar2.k(intValue);
                return 0;
            case 3:
                bVar.f22979e = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f22980f = aVar2.g(intValue);
                return 0;
            case 5:
                bVar.f22981g = aVar2.g(intValue);
                return 0;
            case 6:
                bVar.f22982h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
